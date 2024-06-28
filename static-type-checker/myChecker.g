grammar myChecker;

options {
   language = Java;
}

@header {
    import java.util.HashMap;
}

@members {
    public enum TypeInfo{
        Integer,
        Float,
        Character,
        Void,
        Boolean,
        Unknown,
        Error
    };
    HashMap<String, TypeInfo> symtable = new HashMap<String, TypeInfo>();
    Boolean trace = false;
}

//program starts with any number of 
program: def_function main 
        ;

//main function
main:TYPE_VOID MAIN '(' ')' '{' statements '}'
        ;

def_function: type ID '('(type ID)? (',' type ID)*')' '{'statements'}' def_function
            |
        ;
      
//two types of declarations: type ID , type ID = VAl
declarations:type ID declare_assign ';'{
        if (symtable.containsKey($ID.text)){
            System.out.println("Error! Line " + $ID.getLine() + ":Redeclaired identifier "+ $ID.text);
        }else{
            if($declare_assign.attr_type == TypeInfo.Void){
                symtable.put($ID.text, $type.attr_type);
            }
            if($declare_assign.attr_type != $type.attr_type){
                System.out.println("Error! Line " + $ID.getLine() + ":Type mismatch for the two side operands in an assignment statement." + $type.attr_type.name() + " is expected");
            }else{
                symtable.put($ID.text, $type.attr_type);
                if(trace){System.out.println("Declare variable: " + $ID.text);}
            }
        }
    } 
            ;
//assign value at the time of variable declaration
declare_assign returns[TypeInfo attr_type]
    :'=' 
    (arithExpr {$attr_type = $arithExpr.attr_type;}
    |
     CHAR { $attr_type = TypeInfo.Character;})
    | { $attr_type = TypeInfo.Void;}
    ;

// supporting data type: char, int, float, void
type returns [TypeInfo attr_type]
   : TYPE_INT { $attr_type = TypeInfo.Integer;}
   | TYPE_FLOAT { $attr_type = TypeInfo.Float;}
   | TYPE_CHAR { $attr_type = TypeInfo.Character;}
   | TYPE_VOID { $attr_type = TypeInfo.Void;}
   ;

// supporting function: printf, scanf
print_func: PRTINTF'(' LITERAL(','ID{
                                    if (!symtable.containsKey($ID.text)){
                                        System.out.println("Error! Line " + $ID.getLine() + ": printf param " + $ID.text + " undeclared.");
                                        }
                                    })* ')'  ';'
          ;
scanf_func: SCANF'(' LITERAL (',''&'ID{
                                    if (!symtable.containsKey($ID.text)){
                                        System.out.println("Error! Line " + $ID.getLine() + ": scanf param " + $ID.text + " undeclared.");
                                        }
                                    })* ')' ';'
          ;


statements: statement statements
          |
          ;

expr returns[TypeInfo attr_type]
        : a = cmpExpr {$attr_type = $a.attr_type;}
        (eqOP b = cmpExpr{
                $attr_type = TypeInfo.Boolean;
                if($a.attr_type != $b.attr_type){
                    System.out.println("Error! Line " + $a.start.getLine() + ": Type mismatch for the operator ==, != in an expression");
                    $attr_type = TypeInfo.Error;
                }
            }
        )*
        ;
cmpExpr returns[TypeInfo attr_type]
        : a = arithExpr {$attr_type = $a.attr_type;}
        (cmpOp b = arithExpr{
                $attr_type = TypeInfo.Boolean;
                if($a.attr_type != $b.attr_type){
                    System.out.println("Error! Line " + $a.start.getLine() + ": Type mismatch for the operator >, >=, <, <=, in an expression");
                    $attr_type = TypeInfo.Error;
                }
            }
        )*
        ;

cmpOp
    : LE_OP 
    | GE_OP 
    | LESS_OP
    | GT_OP
    ;
eqOP
    :EQ_OP 
    |NE_OP 
    ;
 
// Supporting arithmetic expression + - * /                            
arithExpr returns [TypeInfo attr_type]
                : a = multExpr{ $attr_type = $a.attr_type; 
                if(trace){System.out.println("a = "+ $a.attr_type);};}
                ( '+' b = multExpr {if(trace){System.out.println("b = "+ $b.attr_type);};
                        if( $a.attr_type != $b.attr_type){
                            System.out.println("Error! Line " + $a.start.getLine() + ":Type mismatch for the operator + in an expression. ");
                            $attr_type = TypeInfo.Error;
                        }
                    }
                | '-' c = multExpr{
                        if( $a.attr_type != $c.attr_type){
                            System.out.println("Error! Line " + $a.start.getLine() + ":Type mismatch for the operator - in an expression. ");
                            $attr_type = TypeInfo.Error;
                        }
                    }
                )* 
                ;


multExpr returns [TypeInfo attr_type]
        : a = signExpr { $attr_type = $a.attr_type;
        if(trace){System.out.println("mult_expr " + $attr_type);}}
        ( '*' b = signExpr{ 
                if ($a.attr_type != $b.attr_type){
                    System.out.println("Error! Line" + $a.start.getLine() + ":Type mismatch for the operator * in an expression. ");
                    $attr_type = TypeInfo.Error;
                }
            } 
        | '/' c = signExpr{
                if($a.attr_type != $c.attr_type){
                    System.out.println("Error! Line " + $a.start.getLine() + ":Type mismatch for the operator \\ in an expression. ");
                    $attr_type = TypeInfo.Error;
                }
            }
        | '%' d = signExpr{
                if($a.attr_type != $d.attr_type){
                    System.out.println("Error! Line " + $a.start.getLine() + ":Type mismatch for the operator \% in an expression. ");
                    $attr_type = TypeInfo.Error;
                }
            }
        )*
		;

signExpr returns [TypeInfo attr_type]
        : a = primaryExpr { $attr_type = $a.attr_type; if(trace){System.out.println("sign_expr " + $attr_type);}}
        | '-' b = primaryExpr { $attr_type = $b.attr_type;}
		;
	  
primaryExpr returns [TypeInfo attr_type]
            : DEC_NUM { $attr_type = TypeInfo.Integer;if(trace){System.out.println("primary_expr " + $attr_type);}}
           | FLOAT_NUM { $attr_type = TypeInfo.Float;}
           | ID { 
                if(trace){System.out.println("primary_expr " +  symtable.get($ID.text));}
                if(!symtable.containsKey($ID.text)){
                    System.out.println("Variable undeclared!!");
                    $attr_type = TypeInfo.Unknown;
                }else{
                    $attr_type = symtable.get($ID.text);
                }
            }
		   | '(' arithExpr ')' { $attr_type = $arithExpr.attr_type;}
           | call_function { $attr_type = $call_function.attr_type ;}
           ;

//statement         
statement returns [TypeInfo attr_type]
         : declarations   
         | ID '=' arithExpr ';'{
            if(symtable.containsKey($ID.text)){
                $attr_type = symtable.get($ID.text);
            }else{
                System.out.println("Error! Line " + $ID.getLine()+":Undeclaired identifier: " + $ID.text);
            }
         }  
         | if_statement  
         | for_loop  
         | while_loop  
         | BREAK ';'
         | CONTINUE ';'
         | print_func 
         | scanf_func 
         | return_statement 
         ;
    
// support if if-else for-loop while-loop and self-defined function call
if_statement returns[TypeInfo attr_type]
            : IF '('expr { if($expr.attr_type != TypeInfo.Boolean){
                        System.out.println("Error! Line " + $IF.getLine() + ": type error, expect type BOOLEAN in IF condition expression.");};} ')' compound_statement (else_statement)? 
            ;
else_statement: ELSE compound_statement
              ;
for_loop returns[TypeInfo attr_type]
        : FOR '('declarations expr{ if($expr.attr_type != TypeInfo.Boolean){
                        System.out.println("Error! Line " + $FOR.getLine() + ": type error, expect type BOOLEAN in FOR condition expression.");
                    }}';' ID '=' arithExpr')' compound_statement 
        ;

while_loop returns [TypeInfo attr_type]
        : WHILE '(' expr{ if($expr.attr_type != TypeInfo.Boolean){
                        System.out.println("Error! Line " + $WHILE.getLine() + ": type error, expect type BOOLEAN in WHILE condition expression.");
                    }
                }
            ')' compound_statement 
          ;
          
call_function returns [TypeInfo attr_type]
             : a = ID {$attr_type = symtable.get($a.text);}'('(ID ',')* (ID)*')'
             ;

compound_statement: '{' statements '}'
                  ;
return_statement: RETURN (arithExpr |) ';' 
                ;
//cond:'('(options{greedy=false;}:.)*')'

/*       Comments        */
SINGLE_LINE_COMM : '//' (.)* '\n'{skip();};
MULTI_LINE_COMM: '/*'(options{greedy=false;}: .)* '*/'{skip();};

/*      INCLUDE         */
INCLUDE: '#''include';

/*        FUNC         */
PRTINTF: 'printf';
SCANF: 'scanf';
MAIN:'main';

/*       RETURN         */
RETURN: 'return';


/*----------------------*/
/*   Reserved TYPE  */
/*----------------------*/
TYPE_INT : 'int';
TYPE_CHAR : 'char';
TYPE_FLOAT: 'float';
TYPE_VOID: 'void';

/*--------------------------------------------------*/ 
/*   Reserved CONDITIONAL EXECUTION  AND control    */
/*-------------------------------------------------*/
IF: 'if';
ELSE: 'else';
FOR : 'for';
BREAK: 'break';
CONTINUE: 'continue';
WHILE: 'while';



/*----------------------*/
/*       Operators     */
/*----------------------*/

EQ_OP : '==';
LE_OP : '<=';
GE_OP : '>=';
NE_OP : '!=';

PP_OP : '++';
MM_OP : '--'; 
RSHIFT_OP : '<<';
LSHIFT_OP : '>>';
AND_OP: '&&';
OR_OP : '||';

ASSIGN_OP : '=';
LESS_OP: '<';
GT_OP: '>';


/*      Literal        */
LITERAL: '"' (options{greedy=false;}:.)* '"';

CHAR : '\'' ( ESC_SEQ | ~('\'' | '\\') ) '\'';
ESC_SEQ  : '\\' ('b' | 't' | 'n' | 'f' | 'r' | '\'' | '"' | '\\');
DEC_NUM :('0'|('1'..'9')(DIGIT)*);
ID: (LETTER)(LETTER|DIGIT)*;
FLOAT_NUM :(DEC_NUM)'.'(DIGIT)+;


fragment LETTER : 'A'..'Z' | 'a' .. 'z' | '_';
fragment DIGIT : '0'..'9';


NEW_LINE: ('\r')* '\n'{skip();};
WS: (' '|'\t'|'\r')+ {skip();};