grammar myparser;

options {
   language = Java;
}

@header {
    // import packages here.
}

@members {
    boolean TRACEON = true;
}

// program:TYPE_VOID MAIN '(' ')' '{' statements '}'
//         {if (TRACEON) System.out.println("VOID MAIN () {statements}");}
//         ;
program: def_function main 
        {if (TRACEON) System.out.println("program: def_function main");}
        ;

main:TYPE_VOID MAIN '(' ')' '{' statements '}'
        {if (TRACEON) System.out.println("main: VOID MAIN () {statements}");}
        ;

def_function: type ID '('(type ID ',')* (type ID)*')' '{'statements'}'{if (TRACEON) System.out.println("def_function: type ID ((type ID)*)");} def_function
            |
        ;
      
//two types of declarations: type ID / type ID = VAl
declarations:type ID declare_postfix ';' { if (TRACEON) System.out.print("declarations: type Identifier "); }
            ;
declare_postfix:
    '=' (arith_expression|CHAR){ if (TRACEON) System.out.println("declare_postfix: = (arith_expresssion | CHAR)"); }
    | 
    ;

// supporting type: decimal and float
type:TYPE_INT { if (TRACEON) System.out.println("type: TYPE_INT"); }
   | TYPE_FLOAT {if (TRACEON) System.out.println("type: TYPE_FLOAT");}
   | TYPE_CHAR {if (TRACEON) System.out.println("type: TYPE_CHAR");}
   | TYPE_VOID {if (TRACEON) System.out.println("type: TYPE_VOID");}
   ;

// supporting function: printf, scanf
print_func: PRTINTF'(' LITERAL (','ID)(','ID)? ')'  ';'{if(TRACEON) System.out.println("print_func : PRINTF (LITERAL (,ID)* ;)");}
          ;
scanf_func: SCANF'(' LITERAL (',''&'ID)(',''&'ID)? ')' ';'{ if(TRACEON) System.out.println("scanf_func : SCANF (LITERAL (,&ID)* ;)");}
          ;

statements: statement statements{ if (TRACEON) System.out.println("statements: statement statements"); }
          |
          ;

//compare values between variables,float or decimal
comapre_val: arith_expression (EQ_OP|LE_OP|GE_OP|NE_OP|LESS_OP|GT_OP|OR_OP|AND_OP) arith_expression { if (TRACEON) System.out.println("compare_val: arith_expression cmp_op arith_exptression");} 
           ;

//arithmetic operations                                  
arith_expression: multExpr( '+' multExpr| '-' multExpr)* { if(TRACEON) System.out.println("arith_expression: multExpr( + multExpr| - multExpr)*");}
                ;

multExpr: signExpr( '*' signExpr| '/' signExpr)* { if(TRACEON) System.out.println("multExpr: signExpr( *signExpr | /signExpr )*");}
		;

signExpr: primaryExpr { if(TRACEON) System.out.println("signExpr: primaryExpr");}
        | '-' primaryExpr { if(TRACEON) System.out.println("signExpr: - primaryExpr");}
		;
		  
primaryExpr: DEC_NUM { if(TRACEON) System.out.println("primaryExpr: DEC_NUM");}
           | FLOAT_NUM { if(TRACEON) System.out.println("primaryExpr: FLOAT_NUM");}
           | ID { if(TRACEON) System.out.println("primaryExpr: ID");}
		   | '(' arith_expression ')' { if(TRACEON) System.out.println("primaryExpr: (arith_expression)");}
           | call_function { if(TRACEON) System.out.println("primaryExpr: call_function ");}
           ;
//statement         
statement: declarations  { if (TRACEON) System.out.println("statement: declarations");} 
         | ID '=' arith_expression ';'  { if (TRACEON) System.out.println("statement: ID = arith_expression ;");} 
         | if_statement { if (TRACEON) System.out.println("statement: if_statement: ");} 
         | for_loop { if (TRACEON) System.out.println("statement: for_loop");} 
         | while_loop { if (TRACEON) System.out.println("statemetn: while_loop");} 
         | BREAK ';'{if (TRACEON) System.out.println("statement: BREAK ;");}
         | CONTINUE ';'{if (TRACEON) System.out.println("statement: CONTINUE ;");}
         | print_func {if (TRACEON) System.out.println("statement: print_func");}
         | scanf_func {if (TRACEON) System.out.println("statement: scanf_func");}
         | return_statement {if (TRACEON) System.out.println("statement: return statement");}
         ;
// support if if-else for-loop while-loop and self-defined function call
if_statement: IF '('comapre_val ')'compound_statement else_statement {if (TRACEON) System.out.println("if_statement: IF '('comapre_val ')'compound_statement ");}
            ;
else_statement: ELSE compound_statement{if (TRACEON) System.out.println("else_statement: ELSE compound_statement");}
              |
              ;
for_loop: FOR '('declarations   comapre_val ';' ID '=' arith_expression')' compound_statement {if (TRACEON) System.out.println("for_loop: FOR ( declarations  comapre_val ; ID = arith_expression) compound_statement");}
        ;

while_loop: WHILE '(' comapre_val')' compound_statement {if (TRACEON) System.out.println("while_loop: WHILE (compare_val) compound_statement");}
          ;
          
call_function: ID '('(ID ',')* (ID)*')'
             ;

compound_statement: '{' statements '}'{if(TRACEON) System.out.println("compound_statement: {statements}");}
                  ;
return_statement: RETURN (arith_expression |) ';' {if(TRACEON) System.out.println("return_statement: RETURN ;");}
                ;

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
TYPE_CONST: 'const';

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
