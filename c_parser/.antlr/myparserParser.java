// Generated from /home/zhixuan/CD/HW2/myparser.g by ANTLR 4.13.1

    // import packages here.

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class myparserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, SINGLE_LINE_COMM=12, MULTI_LINE_COMM=13, INCLUDE=14, 
		PRTINTF=15, SCANF=16, MAIN=17, RETURN=18, TYPE_INT=19, TYPE_CHAR=20, TYPE_FLOAT=21, 
		TYPE_VOID=22, TYPE_CONST=23, IF=24, ELSE=25, FOR=26, BREAK=27, CONTINUE=28, 
		WHILE=29, EQ_OP=30, LE_OP=31, GE_OP=32, NE_OP=33, PP_OP=34, MM_OP=35, 
		RSHIFT_OP=36, LSHIFT_OP=37, AND_OP=38, OR_OP=39, ASSIGN_OP=40, LESS_OP=41, 
		GT_OP=42, LITERAL=43, CHAR=44, ESC_SEQ=45, DEC_NUM=46, ID=47, FLOAT_NUM=48, 
		NEW_LINE=49, WS=50;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_def_function = 2, RULE_declarations = 3, 
		RULE_declare_postfix = 4, RULE_type = 5, RULE_print_func = 6, RULE_scanf_func = 7, 
		RULE_statements = 8, RULE_comapre_val = 9, RULE_arith_expression = 10, 
		RULE_multExpr = 11, RULE_signExpr = 12, RULE_primaryExpr = 13, RULE_statement = 14, 
		RULE_if_statement = 15, RULE_else_statement = 16, RULE_for_loop = 17, 
		RULE_while_loop = 18, RULE_call_function = 19, RULE_compound_statement = 20, 
		RULE_return_statement = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "def_function", "declarations", "declare_postfix", 
			"type", "print_func", "scanf_func", "statements", "comapre_val", "arith_expression", 
			"multExpr", "signExpr", "primaryExpr", "statement", "if_statement", "else_statement", 
			"for_loop", "while_loop", "call_function", "compound_statement", "return_statement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "','", "';'", "'&'", "'+'", "'-'", 
			"'*'", "'/'", null, null, null, "'printf'", "'scanf'", "'main'", "'return'", 
			"'int'", "'char'", "'float'", "'void'", "'const'", "'if'", "'else'", 
			"'for'", "'break'", "'continue'", "'while'", "'=='", "'<='", "'>='", 
			"'!='", "'++'", "'--'", "'<<'", "'>>'", "'&&'", "'||'", "'='", "'<'", 
			"'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"SINGLE_LINE_COMM", "MULTI_LINE_COMM", "INCLUDE", "PRTINTF", "SCANF", 
			"MAIN", "RETURN", "TYPE_INT", "TYPE_CHAR", "TYPE_FLOAT", "TYPE_VOID", 
			"TYPE_CONST", "IF", "ELSE", "FOR", "BREAK", "CONTINUE", "WHILE", "EQ_OP", 
			"LE_OP", "GE_OP", "NE_OP", "PP_OP", "MM_OP", "RSHIFT_OP", "LSHIFT_OP", 
			"AND_OP", "OR_OP", "ASSIGN_OP", "LESS_OP", "GT_OP", "LITERAL", "CHAR", 
			"ESC_SEQ", "DEC_NUM", "ID", "FLOAT_NUM", "NEW_LINE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "myparser.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    boolean TRACEON = true;

	public myparserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Def_functionContext def_function() {
			return getRuleContext(Def_functionContext.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			def_function();
			setState(45);
			main();
			if (TRACEON) System.out.println("program: def_function main");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public TerminalNode TYPE_VOID() { return getToken(myparserParser.TYPE_VOID, 0); }
		public TerminalNode MAIN() { return getToken(myparserParser.MAIN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(TYPE_VOID);
			setState(49);
			match(MAIN);
			setState(50);
			match(T__0);
			setState(51);
			match(T__1);
			setState(52);
			match(T__2);
			setState(53);
			statements();
			setState(54);
			match(T__3);
			if (TRACEON) System.out.println("main: VOID MAIN () {statements}");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Def_functionContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(myparserParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myparserParser.ID, i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Def_functionContext def_function() {
			return getRuleContext(Def_functionContext.class,0);
		}
		public Def_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_function; }
	}

	public final Def_functionContext def_function() throws RecognitionException {
		Def_functionContext _localctx = new Def_functionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_def_function);
		int _la;
		try {
			int _alt;
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				type();
				setState(58);
				match(ID);
				setState(59);
				match(T__0);
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(60);
						type();
						setState(61);
						match(ID);
						setState(62);
						match(T__4);
						}
						} 
					}
					setState(68);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7864320L) != 0)) {
					{
					{
					setState(69);
					type();
					setState(70);
					match(ID);
					}
					}
					setState(76);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(77);
				match(T__1);
				setState(78);
				match(T__2);
				setState(79);
				statements();
				setState(80);
				match(T__3);
				if (TRACEON) System.out.println("def_function: type ID ((type ID)*)");
				setState(82);
				def_function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationsContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(myparserParser.ID, 0); }
		public Declare_postfixContext declare_postfix() {
			return getRuleContext(Declare_postfixContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			type();
			setState(88);
			match(ID);
			setState(89);
			declare_postfix();
			setState(90);
			match(T__5);
			 if (TRACEON) System.out.print("declarations: type Identifier "); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declare_postfixContext extends ParserRuleContext {
		public TerminalNode ASSIGN_OP() { return getToken(myparserParser.ASSIGN_OP, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode CHAR() { return getToken(myparserParser.CHAR, 0); }
		public Declare_postfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_postfix; }
	}

	public final Declare_postfixContext declare_postfix() throws RecognitionException {
		Declare_postfixContext _localctx = new Declare_postfixContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declare_postfix);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(ASSIGN_OP);
				setState(96);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__8:
				case DEC_NUM:
				case ID:
				case FLOAT_NUM:
					{
					setState(94);
					arith_expression();
					}
					break;
				case CHAR:
					{
					setState(95);
					match(CHAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				 if (TRACEON) System.out.println("declare_postfix: = (arith_expresssion | CHAR)"); 
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TYPE_INT() { return getToken(myparserParser.TYPE_INT, 0); }
		public TerminalNode TYPE_FLOAT() { return getToken(myparserParser.TYPE_FLOAT, 0); }
		public TerminalNode TYPE_CHAR() { return getToken(myparserParser.TYPE_CHAR, 0); }
		public TerminalNode TYPE_VOID() { return getToken(myparserParser.TYPE_VOID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(TYPE_INT);
				 if (TRACEON) System.out.println("type: TYPE_INT"); 
				}
				break;
			case TYPE_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(TYPE_FLOAT);
				if (TRACEON) System.out.println("type: TYPE_FLOAT");
				}
				break;
			case TYPE_CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				match(TYPE_CHAR);
				if (TRACEON) System.out.println("type: TYPE_CHAR");
				}
				break;
			case TYPE_VOID:
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				match(TYPE_VOID);
				if (TRACEON) System.out.println("type: TYPE_VOID");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Print_funcContext extends ParserRuleContext {
		public TerminalNode PRTINTF() { return getToken(myparserParser.PRTINTF, 0); }
		public TerminalNode LITERAL() { return getToken(myparserParser.LITERAL, 0); }
		public List<TerminalNode> ID() { return getTokens(myparserParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myparserParser.ID, i);
		}
		public Print_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_func; }
	}

	public final Print_funcContext print_func() throws RecognitionException {
		Print_funcContext _localctx = new Print_funcContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_print_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(PRTINTF);
			setState(113);
			match(T__0);
			setState(114);
			match(LITERAL);
			{
			setState(115);
			match(T__4);
			setState(116);
			match(ID);
			}
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(118);
				match(T__4);
				setState(119);
				match(ID);
				}
			}

			setState(122);
			match(T__1);
			setState(123);
			match(T__5);
			if(TRACEON) System.out.println("print_func : PRINTF (LITERAL (,ID)* ;)");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Scanf_funcContext extends ParserRuleContext {
		public TerminalNode SCANF() { return getToken(myparserParser.SCANF, 0); }
		public TerminalNode LITERAL() { return getToken(myparserParser.LITERAL, 0); }
		public List<TerminalNode> ID() { return getTokens(myparserParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myparserParser.ID, i);
		}
		public Scanf_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanf_func; }
	}

	public final Scanf_funcContext scanf_func() throws RecognitionException {
		Scanf_funcContext _localctx = new Scanf_funcContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_scanf_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(SCANF);
			setState(127);
			match(T__0);
			setState(128);
			match(LITERAL);
			{
			setState(129);
			match(T__4);
			setState(130);
			match(T__6);
			setState(131);
			match(ID);
			}
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(133);
				match(T__4);
				setState(134);
				match(T__6);
				setState(135);
				match(ID);
				}
			}

			setState(138);
			match(T__1);
			setState(139);
			match(T__5);
			 if(TRACEON) System.out.println("scanf_func : SCANF (LITERAL (,&ID)* ;)");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statements);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRTINTF:
			case SCANF:
			case RETURN:
			case TYPE_INT:
			case TYPE_CHAR:
			case TYPE_FLOAT:
			case TYPE_VOID:
			case IF:
			case FOR:
			case BREAK:
			case CONTINUE:
			case WHILE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				statement();
				setState(143);
				statements();
				 if (TRACEON) System.out.println("statements: statement statements"); 
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Comapre_valContext extends ParserRuleContext {
		public List<Arith_expressionContext> arith_expression() {
			return getRuleContexts(Arith_expressionContext.class);
		}
		public Arith_expressionContext arith_expression(int i) {
			return getRuleContext(Arith_expressionContext.class,i);
		}
		public TerminalNode EQ_OP() { return getToken(myparserParser.EQ_OP, 0); }
		public TerminalNode LE_OP() { return getToken(myparserParser.LE_OP, 0); }
		public TerminalNode GE_OP() { return getToken(myparserParser.GE_OP, 0); }
		public TerminalNode NE_OP() { return getToken(myparserParser.NE_OP, 0); }
		public TerminalNode LESS_OP() { return getToken(myparserParser.LESS_OP, 0); }
		public TerminalNode GT_OP() { return getToken(myparserParser.GT_OP, 0); }
		public TerminalNode OR_OP() { return getToken(myparserParser.OR_OP, 0); }
		public TerminalNode AND_OP() { return getToken(myparserParser.AND_OP, 0); }
		public Comapre_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comapre_val; }
	}

	public final Comapre_valContext comapre_val() throws RecognitionException {
		Comapre_valContext _localctx = new Comapre_valContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comapre_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			arith_expression();
			setState(150);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7437809614848L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(151);
			arith_expression();
			 if (TRACEON) System.out.println("compare_val: arith_expression cmp_op arith_exptression");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Arith_expressionContext extends ParserRuleContext {
		public List<MultExprContext> multExpr() {
			return getRuleContexts(MultExprContext.class);
		}
		public MultExprContext multExpr(int i) {
			return getRuleContext(MultExprContext.class,i);
		}
		public Arith_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_expression; }
	}

	public final Arith_expressionContext arith_expression() throws RecognitionException {
		Arith_expressionContext _localctx = new Arith_expressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arith_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			multExpr();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7 || _la==T__8) {
				{
				setState(159);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__7:
					{
					setState(155);
					match(T__7);
					setState(156);
					multExpr();
					}
					break;
				case T__8:
					{
					setState(157);
					match(T__8);
					setState(158);
					multExpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 if(TRACEON) System.out.println("arith_expression: multExpr( + multExpr| - multExpr)*");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultExprContext extends ParserRuleContext {
		public List<SignExprContext> signExpr() {
			return getRuleContexts(SignExprContext.class);
		}
		public SignExprContext signExpr(int i) {
			return getRuleContext(SignExprContext.class,i);
		}
		public MultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpr; }
	}

	public final MultExprContext multExpr() throws RecognitionException {
		MultExprContext _localctx = new MultExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_multExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			signExpr();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9 || _la==T__10) {
				{
				setState(171);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__9:
					{
					setState(167);
					match(T__9);
					setState(168);
					signExpr();
					}
					break;
				case T__10:
					{
					setState(169);
					match(T__10);
					setState(170);
					signExpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 if(TRACEON) System.out.println("multExpr: signExpr( *signExpr | /signExpr )*");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SignExprContext extends ParserRuleContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public SignExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signExpr; }
	}

	public final SignExprContext signExpr() throws RecognitionException {
		SignExprContext _localctx = new SignExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_signExpr);
		try {
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case DEC_NUM:
			case ID:
			case FLOAT_NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				primaryExpr();
				 if(TRACEON) System.out.println("signExpr: primaryExpr");
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(T__8);
				setState(182);
				primaryExpr();
				 if(TRACEON) System.out.println("signExpr: - primaryExpr");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExprContext extends ParserRuleContext {
		public TerminalNode DEC_NUM() { return getToken(myparserParser.DEC_NUM, 0); }
		public TerminalNode FLOAT_NUM() { return getToken(myparserParser.FLOAT_NUM, 0); }
		public TerminalNode ID() { return getToken(myparserParser.ID, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_primaryExpr);
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(DEC_NUM);
				 if(TRACEON) System.out.println("primaryExpr: DEC_NUM");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(FLOAT_NUM);
				 if(TRACEON) System.out.println("primaryExpr: FLOAT_NUM");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				match(ID);
				 if(TRACEON) System.out.println("primaryExpr: ID");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				match(T__0);
				setState(194);
				arith_expression();
				setState(195);
				match(T__1);
				 if(TRACEON) System.out.println("primaryExpr: (arith_expression)");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(198);
				call_function();
				 if(TRACEON) System.out.println("primaryExpr: call_function ");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public TerminalNode ID() { return getToken(myparserParser.ID, 0); }
		public TerminalNode ASSIGN_OP() { return getToken(myparserParser.ASSIGN_OP, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(myparserParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(myparserParser.CONTINUE, 0); }
		public Print_funcContext print_func() {
			return getRuleContext(Print_funcContext.class,0);
		}
		public Scanf_funcContext scanf_func() {
			return getRuleContext(Scanf_funcContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statement);
		try {
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE_INT:
			case TYPE_CHAR:
			case TYPE_FLOAT:
			case TYPE_VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				declarations();
				 if (TRACEON) System.out.println("statement: declarations");
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(ID);
				setState(207);
				match(ASSIGN_OP);
				setState(208);
				arith_expression();
				setState(209);
				match(T__5);
				 if (TRACEON) System.out.println("statement: ID = arith_expression ;");
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				if_statement();
				 if (TRACEON) System.out.println("statement: if_statement: ");
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(215);
				for_loop();
				 if (TRACEON) System.out.println("statement: for_loop");
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(218);
				while_loop();
				 if (TRACEON) System.out.println("statemetn: while_loop");
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 6);
				{
				setState(221);
				match(BREAK);
				setState(222);
				match(T__5);
				if (TRACEON) System.out.println("statement: BREAK ;");
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 7);
				{
				setState(224);
				match(CONTINUE);
				setState(225);
				match(T__5);
				if (TRACEON) System.out.println("statement: CONTINUE ;");
				}
				break;
			case PRTINTF:
				enterOuterAlt(_localctx, 8);
				{
				setState(227);
				print_func();
				if (TRACEON) System.out.println("statement: print_func");
				}
				break;
			case SCANF:
				enterOuterAlt(_localctx, 9);
				{
				setState(230);
				scanf_func();
				if (TRACEON) System.out.println("statement: scanf_func");
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 10);
				{
				setState(233);
				return_statement();
				if (TRACEON) System.out.println("statement: return statement");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(myparserParser.IF, 0); }
		public Comapre_valContext comapre_val() {
			return getRuleContext(Comapre_valContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(IF);
			setState(239);
			match(T__0);
			setState(240);
			comapre_val();
			setState(241);
			match(T__1);
			setState(242);
			compound_statement();
			setState(243);
			else_statement();
			if (TRACEON) System.out.println("if_statement: IF '('comapre_val ')'compound_statement ");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_statementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(myparserParser.ELSE, 0); }
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_else_statement);
		try {
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(ELSE);
				setState(247);
				compound_statement();
				if (TRACEON) System.out.println("else_statement: ELSE compound_statement");
				}
				break;
			case T__3:
			case PRTINTF:
			case SCANF:
			case RETURN:
			case TYPE_INT:
			case TYPE_CHAR:
			case TYPE_FLOAT:
			case TYPE_VOID:
			case IF:
			case FOR:
			case BREAK:
			case CONTINUE:
			case WHILE:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(myparserParser.FOR, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public Comapre_valContext comapre_val() {
			return getRuleContext(Comapre_valContext.class,0);
		}
		public TerminalNode ID() { return getToken(myparserParser.ID, 0); }
		public TerminalNode ASSIGN_OP() { return getToken(myparserParser.ASSIGN_OP, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(FOR);
			setState(254);
			match(T__0);
			setState(255);
			declarations();
			setState(256);
			comapre_val();
			setState(257);
			match(T__5);
			setState(258);
			match(ID);
			setState(259);
			match(ASSIGN_OP);
			setState(260);
			arith_expression();
			setState(261);
			match(T__1);
			setState(262);
			compound_statement();
			if (TRACEON) System.out.println("for_loop: FOR ( declarations  comapre_val ; ID = arith_expression) compound_statement");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(myparserParser.WHILE, 0); }
		public Comapre_valContext comapre_val() {
			return getRuleContext(Comapre_valContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(WHILE);
			setState(266);
			match(T__0);
			setState(267);
			comapre_val();
			setState(268);
			match(T__1);
			setState(269);
			compound_statement();
			if (TRACEON) System.out.println("while_loop: WHILE (compare_val) compound_statement");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Call_functionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(myparserParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myparserParser.ID, i);
		}
		public Call_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_function; }
	}

	public final Call_functionContext call_function() throws RecognitionException {
		Call_functionContext _localctx = new Call_functionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_call_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(ID);
			setState(273);
			match(T__0);
			setState(278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(274);
					match(ID);
					setState(275);
					match(T__4);
					}
					} 
				}
				setState(280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(281);
				match(ID);
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(287);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Compound_statementContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_compound_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(T__2);
			setState(290);
			statements();
			setState(291);
			match(T__3);
			if(TRACEON) System.out.println("compound_statement: {statements}");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(myparserParser.RETURN, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(RETURN);
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__8:
			case DEC_NUM:
			case ID:
			case FLOAT_NUM:
				{
				setState(295);
				arith_expression();
				}
				break;
			case T__5:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(299);
			match(T__5);
			if(TRACEON) System.out.println("return_statement: RETURN ;");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u00012\u012f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002A\b\u0002\n\u0002\f\u0002D\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002I\b\u0002\n\u0002\f\u0002"+
		"L\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002V\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004a\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004e\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005o\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006y\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u0089\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0094\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u00a0\b\n\n\n\f\n\u00a3\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00ac\b\u000b\n\u000b"+
		"\f\u000b\u00af\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00ba\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u00ca\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00ed\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00fc\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0115\b\u0013"+
		"\n\u0013\f\u0013\u0118\t\u0013\u0001\u0013\u0005\u0013\u011b\b\u0013\n"+
		"\u0013\f\u0013\u011e\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u012a\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0000\u0000\u0016\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*\u0000\u0001\u0003\u0000\u001e"+
		"!&\')*\u0139\u0000,\u0001\u0000\u0000\u0000\u00020\u0001\u0000\u0000\u0000"+
		"\u0004U\u0001\u0000\u0000\u0000\u0006W\u0001\u0000\u0000\u0000\bd\u0001"+
		"\u0000\u0000\u0000\nn\u0001\u0000\u0000\u0000\fp\u0001\u0000\u0000\u0000"+
		"\u000e~\u0001\u0000\u0000\u0000\u0010\u0093\u0001\u0000\u0000\u0000\u0012"+
		"\u0095\u0001\u0000\u0000\u0000\u0014\u009a\u0001\u0000\u0000\u0000\u0016"+
		"\u00a6\u0001\u0000\u0000\u0000\u0018\u00b9\u0001\u0000\u0000\u0000\u001a"+
		"\u00c9\u0001\u0000\u0000\u0000\u001c\u00ec\u0001\u0000\u0000\u0000\u001e"+
		"\u00ee\u0001\u0000\u0000\u0000 \u00fb\u0001\u0000\u0000\u0000\"\u00fd"+
		"\u0001\u0000\u0000\u0000$\u0109\u0001\u0000\u0000\u0000&\u0110\u0001\u0000"+
		"\u0000\u0000(\u0121\u0001\u0000\u0000\u0000*\u0126\u0001\u0000\u0000\u0000"+
		",-\u0003\u0004\u0002\u0000-.\u0003\u0002\u0001\u0000./\u0006\u0000\uffff"+
		"\uffff\u0000/\u0001\u0001\u0000\u0000\u000001\u0005\u0016\u0000\u0000"+
		"12\u0005\u0011\u0000\u000023\u0005\u0001\u0000\u000034\u0005\u0002\u0000"+
		"\u000045\u0005\u0003\u0000\u000056\u0003\u0010\b\u000067\u0005\u0004\u0000"+
		"\u000078\u0006\u0001\uffff\uffff\u00008\u0003\u0001\u0000\u0000\u0000"+
		"9:\u0003\n\u0005\u0000:;\u0005/\u0000\u0000;B\u0005\u0001\u0000\u0000"+
		"<=\u0003\n\u0005\u0000=>\u0005/\u0000\u0000>?\u0005\u0005\u0000\u0000"+
		"?A\u0001\u0000\u0000\u0000@<\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000"+
		"\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CJ\u0001\u0000"+
		"\u0000\u0000DB\u0001\u0000\u0000\u0000EF\u0003\n\u0005\u0000FG\u0005/"+
		"\u0000\u0000GI\u0001\u0000\u0000\u0000HE\u0001\u0000\u0000\u0000IL\u0001"+
		"\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000"+
		"KM\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000MN\u0005\u0002\u0000"+
		"\u0000NO\u0005\u0003\u0000\u0000OP\u0003\u0010\b\u0000PQ\u0005\u0004\u0000"+
		"\u0000QR\u0006\u0002\uffff\uffff\u0000RS\u0003\u0004\u0002\u0000SV\u0001"+
		"\u0000\u0000\u0000TV\u0001\u0000\u0000\u0000U9\u0001\u0000\u0000\u0000"+
		"UT\u0001\u0000\u0000\u0000V\u0005\u0001\u0000\u0000\u0000WX\u0003\n\u0005"+
		"\u0000XY\u0005/\u0000\u0000YZ\u0003\b\u0004\u0000Z[\u0005\u0006\u0000"+
		"\u0000[\\\u0006\u0003\uffff\uffff\u0000\\\u0007\u0001\u0000\u0000\u0000"+
		"]`\u0005(\u0000\u0000^a\u0003\u0014\n\u0000_a\u0005,\u0000\u0000`^\u0001"+
		"\u0000\u0000\u0000`_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000"+
		"be\u0006\u0004\uffff\uffff\u0000ce\u0001\u0000\u0000\u0000d]\u0001\u0000"+
		"\u0000\u0000dc\u0001\u0000\u0000\u0000e\t\u0001\u0000\u0000\u0000fg\u0005"+
		"\u0013\u0000\u0000go\u0006\u0005\uffff\uffff\u0000hi\u0005\u0015\u0000"+
		"\u0000io\u0006\u0005\uffff\uffff\u0000jk\u0005\u0014\u0000\u0000ko\u0006"+
		"\u0005\uffff\uffff\u0000lm\u0005\u0016\u0000\u0000mo\u0006\u0005\uffff"+
		"\uffff\u0000nf\u0001\u0000\u0000\u0000nh\u0001\u0000\u0000\u0000nj\u0001"+
		"\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000o\u000b\u0001\u0000\u0000"+
		"\u0000pq\u0005\u000f\u0000\u0000qr\u0005\u0001\u0000\u0000rs\u0005+\u0000"+
		"\u0000st\u0005\u0005\u0000\u0000tu\u0005/\u0000\u0000ux\u0001\u0000\u0000"+
		"\u0000vw\u0005\u0005\u0000\u0000wy\u0005/\u0000\u0000xv\u0001\u0000\u0000"+
		"\u0000xy\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0005\u0002"+
		"\u0000\u0000{|\u0005\u0006\u0000\u0000|}\u0006\u0006\uffff\uffff\u0000"+
		"}\r\u0001\u0000\u0000\u0000~\u007f\u0005\u0010\u0000\u0000\u007f\u0080"+
		"\u0005\u0001\u0000\u0000\u0080\u0081\u0005+\u0000\u0000\u0081\u0082\u0005"+
		"\u0005\u0000\u0000\u0082\u0083\u0005\u0007\u0000\u0000\u0083\u0084\u0005"+
		"/\u0000\u0000\u0084\u0088\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u0005"+
		"\u0000\u0000\u0086\u0087\u0005\u0007\u0000\u0000\u0087\u0089\u0005/\u0000"+
		"\u0000\u0088\u0085\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008b\u0005\u0002\u0000"+
		"\u0000\u008b\u008c\u0005\u0006\u0000\u0000\u008c\u008d\u0006\u0007\uffff"+
		"\uffff\u0000\u008d\u000f\u0001\u0000\u0000\u0000\u008e\u008f\u0003\u001c"+
		"\u000e\u0000\u008f\u0090\u0003\u0010\b\u0000\u0090\u0091\u0006\b\uffff"+
		"\uffff\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0094\u0001\u0000"+
		"\u0000\u0000\u0093\u008e\u0001\u0000\u0000\u0000\u0093\u0092\u0001\u0000"+
		"\u0000\u0000\u0094\u0011\u0001\u0000\u0000\u0000\u0095\u0096\u0003\u0014"+
		"\n\u0000\u0096\u0097\u0007\u0000\u0000\u0000\u0097\u0098\u0003\u0014\n"+
		"\u0000\u0098\u0099\u0006\t\uffff\uffff\u0000\u0099\u0013\u0001\u0000\u0000"+
		"\u0000\u009a\u00a1\u0003\u0016\u000b\u0000\u009b\u009c\u0005\b\u0000\u0000"+
		"\u009c\u00a0\u0003\u0016\u000b\u0000\u009d\u009e\u0005\t\u0000\u0000\u009e"+
		"\u00a0\u0003\u0016\u000b\u0000\u009f\u009b\u0001\u0000\u0000\u0000\u009f"+
		"\u009d\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1"+
		"\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0006\n\uffff\uffff\u0000\u00a5\u0015\u0001\u0000\u0000\u0000\u00a6"+
		"\u00ad\u0003\u0018\f\u0000\u00a7\u00a8\u0005\n\u0000\u0000\u00a8\u00ac"+
		"\u0003\u0018\f\u0000\u00a9\u00aa\u0005\u000b\u0000\u0000\u00aa\u00ac\u0003"+
		"\u0018\f\u0000\u00ab\u00a7\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b0\u0001\u0000"+
		"\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b1\u0006\u000b"+
		"\uffff\uffff\u0000\u00b1\u0017\u0001\u0000\u0000\u0000\u00b2\u00b3\u0003"+
		"\u001a\r\u0000\u00b3\u00b4\u0006\f\uffff\uffff\u0000\u00b4\u00ba\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u0005\t\u0000\u0000\u00b6\u00b7\u0003\u001a"+
		"\r\u0000\u00b7\u00b8\u0006\f\uffff\uffff\u0000\u00b8\u00ba\u0001\u0000"+
		"\u0000\u0000\u00b9\u00b2\u0001\u0000\u0000\u0000\u00b9\u00b5\u0001\u0000"+
		"\u0000\u0000\u00ba\u0019\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005.\u0000"+
		"\u0000\u00bc\u00ca\u0006\r\uffff\uffff\u0000\u00bd\u00be\u00050\u0000"+
		"\u0000\u00be\u00ca\u0006\r\uffff\uffff\u0000\u00bf\u00c0\u0005/\u0000"+
		"\u0000\u00c0\u00ca\u0006\r\uffff\uffff\u0000\u00c1\u00c2\u0005\u0001\u0000"+
		"\u0000\u00c2\u00c3\u0003\u0014\n\u0000\u00c3\u00c4\u0005\u0002\u0000\u0000"+
		"\u00c4\u00c5\u0006\r\uffff\uffff\u0000\u00c5\u00ca\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c7\u0003&\u0013\u0000\u00c7\u00c8\u0006\r\uffff\uffff\u0000"+
		"\u00c8\u00ca\u0001\u0000\u0000\u0000\u00c9\u00bb\u0001\u0000\u0000\u0000"+
		"\u00c9\u00bd\u0001\u0000\u0000\u0000\u00c9\u00bf\u0001\u0000\u0000\u0000"+
		"\u00c9\u00c1\u0001\u0000\u0000\u0000\u00c9\u00c6\u0001\u0000\u0000\u0000"+
		"\u00ca\u001b\u0001\u0000\u0000\u0000\u00cb\u00cc\u0003\u0006\u0003\u0000"+
		"\u00cc\u00cd\u0006\u000e\uffff\uffff\u0000\u00cd\u00ed\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\u0005/\u0000\u0000\u00cf\u00d0\u0005(\u0000\u0000\u00d0"+
		"\u00d1\u0003\u0014\n\u0000\u00d1\u00d2\u0005\u0006\u0000\u0000\u00d2\u00d3"+
		"\u0006\u000e\uffff\uffff\u0000\u00d3\u00ed\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d5\u0003\u001e\u000f\u0000\u00d5\u00d6\u0006\u000e\uffff\uffff\u0000"+
		"\u00d6\u00ed\u0001\u0000\u0000\u0000\u00d7\u00d8\u0003\"\u0011\u0000\u00d8"+
		"\u00d9\u0006\u000e\uffff\uffff\u0000\u00d9\u00ed\u0001\u0000\u0000\u0000"+
		"\u00da\u00db\u0003$\u0012\u0000\u00db\u00dc\u0006\u000e\uffff\uffff\u0000"+
		"\u00dc\u00ed\u0001\u0000\u0000\u0000\u00dd\u00de\u0005\u001b\u0000\u0000"+
		"\u00de\u00df\u0005\u0006\u0000\u0000\u00df\u00ed\u0006\u000e\uffff\uffff"+
		"\u0000\u00e0\u00e1\u0005\u001c\u0000\u0000\u00e1\u00e2\u0005\u0006\u0000"+
		"\u0000\u00e2\u00ed\u0006\u000e\uffff\uffff\u0000\u00e3\u00e4\u0003\f\u0006"+
		"\u0000\u00e4\u00e5\u0006\u000e\uffff\uffff\u0000\u00e5\u00ed\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e7\u0003\u000e\u0007\u0000\u00e7\u00e8\u0006\u000e"+
		"\uffff\uffff\u0000\u00e8\u00ed\u0001\u0000\u0000\u0000\u00e9\u00ea\u0003"+
		"*\u0015\u0000\u00ea\u00eb\u0006\u000e\uffff\uffff\u0000\u00eb\u00ed\u0001"+
		"\u0000\u0000\u0000\u00ec\u00cb\u0001\u0000\u0000\u0000\u00ec\u00ce\u0001"+
		"\u0000\u0000\u0000\u00ec\u00d4\u0001\u0000\u0000\u0000\u00ec\u00d7\u0001"+
		"\u0000\u0000\u0000\u00ec\u00da\u0001\u0000\u0000\u0000\u00ec\u00dd\u0001"+
		"\u0000\u0000\u0000\u00ec\u00e0\u0001\u0000\u0000\u0000\u00ec\u00e3\u0001"+
		"\u0000\u0000\u0000\u00ec\u00e6\u0001\u0000\u0000\u0000\u00ec\u00e9\u0001"+
		"\u0000\u0000\u0000\u00ed\u001d\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005"+
		"\u0018\u0000\u0000\u00ef\u00f0\u0005\u0001\u0000\u0000\u00f0\u00f1\u0003"+
		"\u0012\t\u0000\u00f1\u00f2\u0005\u0002\u0000\u0000\u00f2\u00f3\u0003("+
		"\u0014\u0000\u00f3\u00f4\u0003 \u0010\u0000\u00f4\u00f5\u0006\u000f\uffff"+
		"\uffff\u0000\u00f5\u001f\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005\u0019"+
		"\u0000\u0000\u00f7\u00f8\u0003(\u0014\u0000\u00f8\u00f9\u0006\u0010\uffff"+
		"\uffff\u0000\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fb\u00f6\u0001\u0000\u0000\u0000\u00fb\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fc!\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005\u001a\u0000"+
		"\u0000\u00fe\u00ff\u0005\u0001\u0000\u0000\u00ff\u0100\u0003\u0006\u0003"+
		"\u0000\u0100\u0101\u0003\u0012\t\u0000\u0101\u0102\u0005\u0006\u0000\u0000"+
		"\u0102\u0103\u0005/\u0000\u0000\u0103\u0104\u0005(\u0000\u0000\u0104\u0105"+
		"\u0003\u0014\n\u0000\u0105\u0106\u0005\u0002\u0000\u0000\u0106\u0107\u0003"+
		"(\u0014\u0000\u0107\u0108\u0006\u0011\uffff\uffff\u0000\u0108#\u0001\u0000"+
		"\u0000\u0000\u0109\u010a\u0005\u001d\u0000\u0000\u010a\u010b\u0005\u0001"+
		"\u0000\u0000\u010b\u010c\u0003\u0012\t\u0000\u010c\u010d\u0005\u0002\u0000"+
		"\u0000\u010d\u010e\u0003(\u0014\u0000\u010e\u010f\u0006\u0012\uffff\uffff"+
		"\u0000\u010f%\u0001\u0000\u0000\u0000\u0110\u0111\u0005/\u0000\u0000\u0111"+
		"\u0116\u0005\u0001\u0000\u0000\u0112\u0113\u0005/\u0000\u0000\u0113\u0115"+
		"\u0005\u0005\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0115\u0118"+
		"\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0116\u0117"+
		"\u0001\u0000\u0000\u0000\u0117\u011c\u0001\u0000\u0000\u0000\u0118\u0116"+
		"\u0001\u0000\u0000\u0000\u0119\u011b\u0005/\u0000\u0000\u011a\u0119\u0001"+
		"\u0000\u0000\u0000\u011b\u011e\u0001\u0000\u0000\u0000\u011c\u011a\u0001"+
		"\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011f\u0001"+
		"\u0000\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011f\u0120\u0005"+
		"\u0002\u0000\u0000\u0120\'\u0001\u0000\u0000\u0000\u0121\u0122\u0005\u0003"+
		"\u0000\u0000\u0122\u0123\u0003\u0010\b\u0000\u0123\u0124\u0005\u0004\u0000"+
		"\u0000\u0124\u0125\u0006\u0014\uffff\uffff\u0000\u0125)\u0001\u0000\u0000"+
		"\u0000\u0126\u0129\u0005\u0012\u0000\u0000\u0127\u012a\u0003\u0014\n\u0000"+
		"\u0128\u012a\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000"+
		"\u0129\u0128\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000"+
		"\u012b\u012c\u0005\u0006\u0000\u0000\u012c\u012d\u0006\u0015\uffff\uffff"+
		"\u0000\u012d+\u0001\u0000\u0000\u0000\u0014BJU`dnx\u0088\u0093\u009f\u00a1"+
		"\u00ab\u00ad\u00b9\u00c9\u00ec\u00fb\u0116\u011c\u0129";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}