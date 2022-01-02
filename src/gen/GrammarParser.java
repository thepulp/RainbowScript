// Generated from C:/Users/HP/IdeaProjects/EjemploBaseGramatica-Armando\Grammar.g4 by ANTLR 4.9.2


    import java.util.Map;
    import java.util.HashMap;
    import java.util.List;
    import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, VAR=2, PRINTLN=3, IF=4, ELSE=5, WHILE=6, SQUARE=7, POW=8, DO=9, 
		COMA=10, PLUS=11, MINUS=12, MULTI=13, DIVI=14, AND=15, OR=16, NOT=17, 
		GT=18, LT=19, GEQ=20, LEQ=21, EQ=22, NEQ=23, ASSING=24, BRACKET_OPEN=25, 
		BRACKET_CLOSE=26, PAR_OPEN=27, PAR_CLOSE=28, SEMICOLON=29, BOOLEAN=30, 
		COMILLAS=31, ID=32, CADE=33, NUMBER=34, WS=35;
	public static final int
		RULE_program = 0, RULE_sentence = 1, RULE_var_decl = 2, RULE_var_assing = 3, 
		RULE_println = 4, RULE_conditional = 5, RULE_cyclical = 6, RULE_docyclical = 7, 
		RULE_square = 8, RULE_pow = 9, RULE_expression = 10, RULE_factor = 11, 
		RULE_term = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sentence", "var_decl", "var_assing", "println", "conditional", 
			"cyclical", "docyclical", "square", "pow", "expression", "factor", "term"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'var'", "'println'", "'if'", "'else'", "'while'", 
			"'square'", "'pow'", "'do'", "','", "'+'", "'-'", "'*'", "'/'", "'&&'", 
			"'||'", "'!'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'='", "'{'", 
			"'}'", "'('", "')'", "';'", null, "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "VAR", "PRINTLN", "IF", "ELSE", "WHILE", "SQUARE", "POW", 
			"DO", "COMA", "PLUS", "MINUS", "MULTI", "DIVI", "AND", "OR", "NOT", "GT", 
			"LT", "GEQ", "LEQ", "EQ", "NEQ", "ASSING", "BRACKET_OPEN", "BRACKET_CLOSE", 
			"PAR_OPEN", "PAR_CLOSE", "SEMICOLON", "BOOLEAN", "COMILLAS", "ID", "CADE", 
			"NUMBER", "WS"
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
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    Map<String, Object> sTable = new HashMap<String, Object>();

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public SentenceContext sentence;
		public TerminalNode PROGRAM() { return getToken(GrammarParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(GrammarParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(GrammarParser.BRACKET_CLOSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(PROGRAM);
			setState(27);
			match(ID);
			setState(28);
			match(BRACKET_OPEN);

			                List<ASTNode> body = new ArrayList<ASTNode>();
			                Map<String, Object> sTable = new HashMap<String, Object>();
			            
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINTLN) | (1L << IF) | (1L << WHILE) | (1L << SQUARE) | (1L << POW) | (1L << DO) | (1L << ID))) != 0)) {
				{
				{
				setState(30);
				((ProgramContext)_localctx).sentence = sentence();
				 body.add(((ProgramContext)_localctx).sentence.node); 
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			match(BRACKET_CLOSE);

			    for(ASTNode n : body)
			    {
			        n.execute(sTable);
			    }

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

	public static class SentenceContext extends ParserRuleContext {
		public ASTNode node;
		public Var_declContext var_decl;
		public Var_assingContext var_assing;
		public PrintlnContext println;
		public ConditionalContext conditional;
		public CyclicalContext cyclical;
		public DocyclicalContext docyclical;
		public SquareContext square;
		public PowContext pow;
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Var_assingContext var_assing() {
			return getRuleContext(Var_assingContext.class,0);
		}
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public CyclicalContext cyclical() {
			return getRuleContext(CyclicalContext.class,0);
		}
		public DocyclicalContext docyclical() {
			return getRuleContext(DocyclicalContext.class,0);
		}
		public SquareContext square() {
			return getRuleContext(SquareContext.class,0);
		}
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				((SentenceContext)_localctx).var_decl = var_decl();
				   ((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).var_decl._var;     
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				((SentenceContext)_localctx).var_assing = var_assing();
				   ((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).var_assing._var;   
				}
				break;
			case PRINTLN:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				((SentenceContext)_localctx).println = println();
				 ((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).println.node;        
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				((SentenceContext)_localctx).conditional = conditional();
				 ((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).conditional.node;    
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(53);
				((SentenceContext)_localctx).cyclical = cyclical();
				 ((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).cyclical.node;       
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 6);
				{
				setState(56);
				((SentenceContext)_localctx).docyclical = docyclical();
				 ((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).docyclical.node;     
				}
				break;
			case SQUARE:
				enterOuterAlt(_localctx, 7);
				{
				setState(59);
				((SentenceContext)_localctx).square = square();
				 ((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).square.node;         
				}
				break;
			case POW:
				enterOuterAlt(_localctx, 8);
				{
				setState(62);
				((SentenceContext)_localctx).pow = pow();
				 ((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).pow.node;            
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

	public static class Var_declContext extends ParserRuleContext {
		public ASTNode _var;
		public Token ID;
		public TerminalNode VAR() { return getToken(GrammarParser.VAR, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVar_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(VAR);
			setState(68);
			((Var_declContext)_localctx).ID = match(ID);
			setState(69);
			match(SEMICOLON);

			        ((Var_declContext)_localctx)._var =  new VarDecl((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null));
			    
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

	public static class Var_assingContext extends ParserRuleContext {
		public ASTNode _var;
		public Token ID;
		public ExpressionContext expression;
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode ASSING() { return getToken(GrammarParser.ASSING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public Var_assingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVar_assing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVar_assing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVar_assing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_assingContext var_assing() throws RecognitionException {
		Var_assingContext _localctx = new Var_assingContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_assing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			((Var_assingContext)_localctx).ID = match(ID);
			setState(73);
			match(ASSING);
			setState(74);
			((Var_assingContext)_localctx).expression = expression();
			setState(75);
			match(SEMICOLON);

			        ((Var_assingContext)_localctx)._var =  new VarAssing((((Var_assingContext)_localctx).ID!=null?((Var_assingContext)_localctx).ID.getText():null), ((Var_assingContext)_localctx).expression.node);
			    
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

	public static class PrintlnContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public TerminalNode PRINTLN() { return getToken(GrammarParser.PRINTLN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPrintln(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPrintln(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_println);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(PRINTLN);
			setState(79);
			((PrintlnContext)_localctx).expression = expression();
			setState(80);
			match(SEMICOLON);

			        ((PrintlnContext)_localctx).node =  new Println(((PrintlnContext)_localctx).expression.node);
			    
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

	public static class ConditionalContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public SentenceContext s1;
		public SentenceContext s2;
		public TerminalNode IF() { return getToken(GrammarParser.IF, 0); }
		public TerminalNode PAR_OPEN() { return getToken(GrammarParser.PAR_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(GrammarParser.PAR_CLOSE, 0); }
		public List<TerminalNode> BRACKET_OPEN() { return getTokens(GrammarParser.BRACKET_OPEN); }
		public TerminalNode BRACKET_OPEN(int i) {
			return getToken(GrammarParser.BRACKET_OPEN, i);
		}
		public List<TerminalNode> BRACKET_CLOSE() { return getTokens(GrammarParser.BRACKET_CLOSE); }
		public TerminalNode BRACKET_CLOSE(int i) {
			return getToken(GrammarParser.BRACKET_CLOSE, i);
		}
		public TerminalNode ELSE() { return getToken(GrammarParser.ELSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(IF);
			setState(84);
			match(PAR_OPEN);
			setState(85);
			((ConditionalContext)_localctx).expression = expression();
			setState(86);
			match(PAR_CLOSE);

			                        List<ASTNode> body = new ArrayList<ASTNode>();
			                        List<ASTNode> bodyElse = new ArrayList<ASTNode>();
			                        ((ConditionalContext)_localctx).node =  new If(((ConditionalContext)_localctx).expression.node, body, bodyElse);
			                    
			setState(88);
			match(BRACKET_OPEN);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINTLN) | (1L << IF) | (1L << WHILE) | (1L << SQUARE) | (1L << POW) | (1L << DO) | (1L << ID))) != 0)) {
				{
				{
				setState(89);
				((ConditionalContext)_localctx).s1 = sentence();
				 body.add(((ConditionalContext)_localctx).s1.node); 
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			match(BRACKET_CLOSE);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(98);
				match(ELSE);
				setState(99);
				match(BRACKET_OPEN);
				{
				setState(100);
				((ConditionalContext)_localctx).s2 = sentence();
				 bodyElse.add(((ConditionalContext)_localctx).s2.node); 
				}
				setState(103);
				match(BRACKET_CLOSE);
				}
			}

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

	public static class CyclicalContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public SentenceContext s1;
		public TerminalNode WHILE() { return getToken(GrammarParser.WHILE, 0); }
		public TerminalNode PAR_OPEN() { return getToken(GrammarParser.PAR_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(GrammarParser.PAR_CLOSE, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(GrammarParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(GrammarParser.BRACKET_CLOSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public CyclicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cyclical; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCyclical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCyclical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCyclical(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CyclicalContext cyclical() throws RecognitionException {
		CyclicalContext _localctx = new CyclicalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cyclical);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(WHILE);
			setState(108);
			match(PAR_OPEN);
			setState(109);
			((CyclicalContext)_localctx).expression = expression();
			setState(110);
			match(PAR_CLOSE);

			                        List<ASTNode> body = new ArrayList<ASTNode>();
			                        ((CyclicalContext)_localctx).node =  new While(((CyclicalContext)_localctx).expression.node, body);
			                    
			setState(112);
			match(BRACKET_OPEN);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINTLN) | (1L << IF) | (1L << WHILE) | (1L << SQUARE) | (1L << POW) | (1L << DO) | (1L << ID))) != 0)) {
				{
				{
				setState(113);
				((CyclicalContext)_localctx).s1 = sentence();
				 body.add(((CyclicalContext)_localctx).s1.node); 
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			match(BRACKET_CLOSE);
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

	public static class DocyclicalContext extends ParserRuleContext {
		public ASTNode node;
		public SentenceContext s1;
		public ExpressionContext expression;
		public TerminalNode DO() { return getToken(GrammarParser.DO, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(GrammarParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(GrammarParser.BRACKET_CLOSE, 0); }
		public TerminalNode WHILE() { return getToken(GrammarParser.WHILE, 0); }
		public TerminalNode PAR_OPEN() { return getToken(GrammarParser.PAR_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(GrammarParser.PAR_CLOSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public DocyclicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_docyclical; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDocyclical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDocyclical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDocyclical(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocyclicalContext docyclical() throws RecognitionException {
		DocyclicalContext _localctx = new DocyclicalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_docyclical);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(DO);
			setState(124);
			match(BRACKET_OPEN);

			                        List<ASTNode> body = new ArrayList<ASTNode>();

			                    
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINTLN) | (1L << IF) | (1L << WHILE) | (1L << SQUARE) | (1L << POW) | (1L << DO) | (1L << ID))) != 0)) {
				{
				{
				setState(126);
				((DocyclicalContext)_localctx).s1 = sentence();
				 body.add(((DocyclicalContext)_localctx).s1.node); 
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			match(BRACKET_CLOSE);
			setState(135);
			match(WHILE);
			setState(136);
			match(PAR_OPEN);
			setState(137);
			((DocyclicalContext)_localctx).expression = expression();
			setState(138);
			match(PAR_CLOSE);
			      ((DocyclicalContext)_localctx).node =  new DoRepeat(((DocyclicalContext)_localctx).expression.node, body);
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

	public static class SquareContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public TerminalNode SQUARE() { return getToken(GrammarParser.SQUARE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public SquareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_square; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSquare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSquare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSquare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SquareContext square() throws RecognitionException {
		SquareContext _localctx = new SquareContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_square);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(SQUARE);
			setState(142);
			((SquareContext)_localctx).expression = expression();
			setState(143);
			match(SEMICOLON);

			                        ((SquareContext)_localctx).node =  new Cuadrado(((SquareContext)_localctx).expression.node);
			                    
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

	public static class PowContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public TerminalNode POW() { return getToken(GrammarParser.POW, 0); }
		public TerminalNode PAR_OPEN() { return getToken(GrammarParser.PAR_OPEN, 0); }
		public TerminalNode COMA() { return getToken(GrammarParser.COMA, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(GrammarParser.PAR_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowContext pow() throws RecognitionException {
		PowContext _localctx = new PowContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(POW);
			setState(147);
			match(PAR_OPEN);
			setState(148);
			((PowContext)_localctx).e1 = expression();
			 ((PowContext)_localctx).node =  ((PowContext)_localctx).e1.node; 
			setState(150);
			match(COMA);
			setState(151);
			((PowContext)_localctx).e2 = expression();
			 ((PowContext)_localctx).node =  new Exponencial(_localctx.node, ((PowContext)_localctx).e2.node);  
			setState(153);
			match(PAR_CLOSE);
			setState(154);
			match(SEMICOLON);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public FactorContext t1;
		public FactorContext t2;
		public FactorContext factor;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(GrammarParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(GrammarParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(GrammarParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(GrammarParser.MINUS, i);
		}
		public List<TerminalNode> GT() { return getTokens(GrammarParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(GrammarParser.GT, i);
		}
		public List<TerminalNode> LT() { return getTokens(GrammarParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(GrammarParser.LT, i);
		}
		public List<TerminalNode> AND() { return getTokens(GrammarParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(GrammarParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(GrammarParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(GrammarParser.OR, i);
		}
		public List<TerminalNode> GEQ() { return getTokens(GrammarParser.GEQ); }
		public TerminalNode GEQ(int i) {
			return getToken(GrammarParser.GEQ, i);
		}
		public List<TerminalNode> LEQ() { return getTokens(GrammarParser.LEQ); }
		public TerminalNode LEQ(int i) {
			return getToken(GrammarParser.LEQ, i);
		}
		public List<TerminalNode> EQ() { return getTokens(GrammarParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(GrammarParser.EQ, i);
		}
		public TerminalNode NOT() { return getToken(GrammarParser.NOT, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression);
		int _la;
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAR_OPEN:
			case BOOLEAN:
			case COMILLAS:
			case ID:
			case CADE:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				((ExpressionContext)_localctx).t1 = factor();
				    ((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).t1.node;   
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << AND) | (1L << OR) | (1L << GT) | (1L << LT) | (1L << GEQ) | (1L << LEQ) | (1L << EQ))) != 0)) {
					{
					setState(194);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PLUS:
						{
						setState(158);
						match(PLUS);
						setState(159);
						((ExpressionContext)_localctx).t2 = factor();
						     ((ExpressionContext)_localctx).node =  new Addition(_localctx.node, ((ExpressionContext)_localctx).t2.node);    
						}
						break;
					case MINUS:
						{
						setState(162);
						match(MINUS);
						setState(163);
						((ExpressionContext)_localctx).t2 = factor();
						   ((ExpressionContext)_localctx).node =  new Minus(_localctx.node, ((ExpressionContext)_localctx).t2.node);         
						}
						break;
					case GT:
						{
						setState(166);
						match(GT);
						setState(167);
						((ExpressionContext)_localctx).t2 = factor();
						    ((ExpressionContext)_localctx).node =  new MayorQue(_localctx.node, ((ExpressionContext)_localctx).t2.node);     
						}
						break;
					case LT:
						{
						setState(170);
						match(LT);
						setState(171);
						((ExpressionContext)_localctx).t2 = factor();
						    ((ExpressionContext)_localctx).node =  new MenorQue(_localctx.node, ((ExpressionContext)_localctx).t2.node);     
						}
						break;
					case AND:
						{
						setState(174);
						match(AND);
						setState(175);
						((ExpressionContext)_localctx).t2 = factor();
						    ((ExpressionContext)_localctx).node =  new And(_localctx.node, ((ExpressionContext)_localctx).t2.node);          
						}
						break;
					case OR:
						{
						setState(178);
						match(OR);
						setState(179);
						((ExpressionContext)_localctx).t2 = factor();
						    ((ExpressionContext)_localctx).node =  new Or(_localctx.node, ((ExpressionContext)_localctx).t2.node);           
						}
						break;
					case GEQ:
						{
						setState(182);
						match(GEQ);
						setState(183);
						((ExpressionContext)_localctx).t2 = factor();
						    ((ExpressionContext)_localctx).node =  new MayorIgualQue(_localctx.node, ((ExpressionContext)_localctx).t2.node);
						}
						break;
					case LEQ:
						{
						setState(186);
						match(LEQ);
						setState(187);
						((ExpressionContext)_localctx).t2 = factor();
						    ((ExpressionContext)_localctx).node =  new MenorIgualQue(_localctx.node, ((ExpressionContext)_localctx).t2.node);
						}
						break;
					case EQ:
						{
						setState(190);
						match(EQ);
						setState(191);
						((ExpressionContext)_localctx).t2 = factor();
						    ((ExpressionContext)_localctx).node =  new Igual(_localctx.node, ((ExpressionContext)_localctx).t2.node);        
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(NOT);
				setState(200);
				((ExpressionContext)_localctx).factor = factor();
				 ((ExpressionContext)_localctx).node =  new Not(((ExpressionContext)_localctx).factor.node); 
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

	public static class FactorContext extends ParserRuleContext {
		public ASTNode node;
		public TermContext t1;
		public TermContext t2;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> MULTI() { return getTokens(GrammarParser.MULTI); }
		public TerminalNode MULTI(int i) {
			return getToken(GrammarParser.MULTI, i);
		}
		public List<TerminalNode> DIVI() { return getTokens(GrammarParser.DIVI); }
		public TerminalNode DIVI(int i) {
			return getToken(GrammarParser.DIVI, i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			((FactorContext)_localctx).t1 = term();
			  ((FactorContext)_localctx).node =  ((FactorContext)_localctx).t1._term;  
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTI || _la==DIVI) {
				{
				setState(215);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULTI:
					{
					setState(207);
					match(MULTI);
					setState(208);
					((FactorContext)_localctx).t2 = term();
					  ((FactorContext)_localctx).node =  new Multiplication(_localctx.node, ((FactorContext)_localctx).t2._term);   
					}
					break;
				case DIVI:
					{
					setState(211);
					match(DIVI);
					setState(212);
					((FactorContext)_localctx).t2 = term();
					  ((FactorContext)_localctx).node =  new Divi(_localctx.node, ((FactorContext)_localctx).t2._term);             
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class TermContext extends ParserRuleContext {
		public ASTNode _term;
		public Token NUMBER;
		public Token ID;
		public Token CADE;
		public Token BOOLEAN;
		public ExpressionContext expression;
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode CADE() { return getToken(GrammarParser.CADE, 0); }
		public TerminalNode BOOLEAN() { return getToken(GrammarParser.BOOLEAN, 0); }
		public TerminalNode PAR_OPEN() { return getToken(GrammarParser.PAR_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(GrammarParser.PAR_CLOSE, 0); }
		public List<TerminalNode> COMILLAS() { return getTokens(GrammarParser.COMILLAS); }
		public TerminalNode COMILLAS(int i) {
			return getToken(GrammarParser.COMILLAS, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_term);
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				((TermContext)_localctx).NUMBER = match(NUMBER);
				   ((TermContext)_localctx)._term =  new Constant(Integer.parseInt((((TermContext)_localctx).NUMBER!=null?((TermContext)_localctx).NUMBER.getText():null)));  
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				((TermContext)_localctx).ID = match(ID);
				   ((TermContext)_localctx)._term =  new VarRef((((TermContext)_localctx).ID!=null?((TermContext)_localctx).ID.getText():null));  
				}
				break;
			case CADE:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				((TermContext)_localctx).CADE = match(CADE);
				   ((TermContext)_localctx)._term =  new Constant((((TermContext)_localctx).CADE!=null?((TermContext)_localctx).CADE.getText():null));  
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(226);
				((TermContext)_localctx).BOOLEAN = match(BOOLEAN);
				   ((TermContext)_localctx)._term =  new Constant(Boolean.parseBoolean((((TermContext)_localctx).BOOLEAN!=null?((TermContext)_localctx).BOOLEAN.getText():null))); 
				}
				break;
			case PAR_OPEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(228);
				match(PAR_OPEN);
				setState(229);
				((TermContext)_localctx).expression = expression();
				   ((TermContext)_localctx)._term =  ((TermContext)_localctx).expression.node;  
				setState(231);
				match(PAR_CLOSE);
				}
				break;
			case COMILLAS:
				enterOuterAlt(_localctx, 6);
				{
				setState(233);
				match(COMILLAS);
				setState(234);
				((TermContext)_localctx).expression = expression();
				   ((TermContext)_localctx)._term =  ((TermContext)_localctx).expression.node;  
				setState(236);
				match(COMILLAS);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00f3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2$\n\2\f\2"+
		"\16\2\'\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3D\n\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\7\7_\n\7\f\7\16\7b\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7l\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bw\n\b\f\b\16\b"+
		"z\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0084\n\t\f\t\16\t\u0087\13"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00c5\n\f\f\f\16\f\u00c8"+
		"\13\f\3\f\3\f\3\f\3\f\5\f\u00ce\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\7\r\u00da\n\r\f\r\16\r\u00dd\13\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00f1"+
		"\n\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\2\2\u0102\2\34\3"+
		"\2\2\2\4C\3\2\2\2\6E\3\2\2\2\bJ\3\2\2\2\nP\3\2\2\2\fU\3\2\2\2\16m\3\2"+
		"\2\2\20}\3\2\2\2\22\u008f\3\2\2\2\24\u0094\3\2\2\2\26\u00cd\3\2\2\2\30"+
		"\u00cf\3\2\2\2\32\u00f0\3\2\2\2\34\35\7\3\2\2\35\36\7\"\2\2\36\37\7\33"+
		"\2\2\37%\b\2\1\2 !\5\4\3\2!\"\b\2\1\2\"$\3\2\2\2# \3\2\2\2$\'\3\2\2\2"+
		"%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2()\7\34\2\2)*\b\2\1\2*\3\3\2"+
		"\2\2+,\5\6\4\2,-\b\3\1\2-D\3\2\2\2./\5\b\5\2/\60\b\3\1\2\60D\3\2\2\2\61"+
		"\62\5\n\6\2\62\63\b\3\1\2\63D\3\2\2\2\64\65\5\f\7\2\65\66\b\3\1\2\66D"+
		"\3\2\2\2\678\5\16\b\289\b\3\1\29D\3\2\2\2:;\5\20\t\2;<\b\3\1\2<D\3\2\2"+
		"\2=>\5\22\n\2>?\b\3\1\2?D\3\2\2\2@A\5\24\13\2AB\b\3\1\2BD\3\2\2\2C+\3"+
		"\2\2\2C.\3\2\2\2C\61\3\2\2\2C\64\3\2\2\2C\67\3\2\2\2C:\3\2\2\2C=\3\2\2"+
		"\2C@\3\2\2\2D\5\3\2\2\2EF\7\4\2\2FG\7\"\2\2GH\7\37\2\2HI\b\4\1\2I\7\3"+
		"\2\2\2JK\7\"\2\2KL\7\32\2\2LM\5\26\f\2MN\7\37\2\2NO\b\5\1\2O\t\3\2\2\2"+
		"PQ\7\5\2\2QR\5\26\f\2RS\7\37\2\2ST\b\6\1\2T\13\3\2\2\2UV\7\6\2\2VW\7\35"+
		"\2\2WX\5\26\f\2XY\7\36\2\2YZ\b\7\1\2Z`\7\33\2\2[\\\5\4\3\2\\]\b\7\1\2"+
		"]_\3\2\2\2^[\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2"+
		"ck\7\34\2\2de\7\7\2\2ef\7\33\2\2fg\5\4\3\2gh\b\7\1\2hi\3\2\2\2ij\7\34"+
		"\2\2jl\3\2\2\2kd\3\2\2\2kl\3\2\2\2l\r\3\2\2\2mn\7\b\2\2no\7\35\2\2op\5"+
		"\26\f\2pq\7\36\2\2qr\b\b\1\2rx\7\33\2\2st\5\4\3\2tu\b\b\1\2uw\3\2\2\2"+
		"vs\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\7\34\2"+
		"\2|\17\3\2\2\2}~\7\13\2\2~\177\7\33\2\2\177\u0085\b\t\1\2\u0080\u0081"+
		"\5\4\3\2\u0081\u0082\b\t\1\2\u0082\u0084\3\2\2\2\u0083\u0080\3\2\2\2\u0084"+
		"\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7\34\2\2\u0089\u008a\7\b\2\2\u008a"+
		"\u008b\7\35\2\2\u008b\u008c\5\26\f\2\u008c\u008d\7\36\2\2\u008d\u008e"+
		"\b\t\1\2\u008e\21\3\2\2\2\u008f\u0090\7\t\2\2\u0090\u0091\5\26\f\2\u0091"+
		"\u0092\7\37\2\2\u0092\u0093\b\n\1\2\u0093\23\3\2\2\2\u0094\u0095\7\n\2"+
		"\2\u0095\u0096\7\35\2\2\u0096\u0097\5\26\f\2\u0097\u0098\b\13\1\2\u0098"+
		"\u0099\7\f\2\2\u0099\u009a\5\26\f\2\u009a\u009b\b\13\1\2\u009b\u009c\7"+
		"\36\2\2\u009c\u009d\7\37\2\2\u009d\25\3\2\2\2\u009e\u009f\5\30\r\2\u009f"+
		"\u00c6\b\f\1\2\u00a0\u00a1\7\r\2\2\u00a1\u00a2\5\30\r\2\u00a2\u00a3\b"+
		"\f\1\2\u00a3\u00c5\3\2\2\2\u00a4\u00a5\7\16\2\2\u00a5\u00a6\5\30\r\2\u00a6"+
		"\u00a7\b\f\1\2\u00a7\u00c5\3\2\2\2\u00a8\u00a9\7\24\2\2\u00a9\u00aa\5"+
		"\30\r\2\u00aa\u00ab\b\f\1\2\u00ab\u00c5\3\2\2\2\u00ac\u00ad\7\25\2\2\u00ad"+
		"\u00ae\5\30\r\2\u00ae\u00af\b\f\1\2\u00af\u00c5\3\2\2\2\u00b0\u00b1\7"+
		"\21\2\2\u00b1\u00b2\5\30\r\2\u00b2\u00b3\b\f\1\2\u00b3\u00c5\3\2\2\2\u00b4"+
		"\u00b5\7\22\2\2\u00b5\u00b6\5\30\r\2\u00b6\u00b7\b\f\1\2\u00b7\u00c5\3"+
		"\2\2\2\u00b8\u00b9\7\26\2\2\u00b9\u00ba\5\30\r\2\u00ba\u00bb\b\f\1\2\u00bb"+
		"\u00c5\3\2\2\2\u00bc\u00bd\7\27\2\2\u00bd\u00be\5\30\r\2\u00be\u00bf\b"+
		"\f\1\2\u00bf\u00c5\3\2\2\2\u00c0\u00c1\7\30\2\2\u00c1\u00c2\5\30\r\2\u00c2"+
		"\u00c3\b\f\1\2\u00c3\u00c5\3\2\2\2\u00c4\u00a0\3\2\2\2\u00c4\u00a4\3\2"+
		"\2\2\u00c4\u00a8\3\2\2\2\u00c4\u00ac\3\2\2\2\u00c4\u00b0\3\2\2\2\u00c4"+
		"\u00b4\3\2\2\2\u00c4\u00b8\3\2\2\2\u00c4\u00bc\3\2\2\2\u00c4\u00c0\3\2"+
		"\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00ce\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\7\23\2\2\u00ca\u00cb\5"+
		"\30\r\2\u00cb\u00cc\b\f\1\2\u00cc\u00ce\3\2\2\2\u00cd\u009e\3\2\2\2\u00cd"+
		"\u00c9\3\2\2\2\u00ce\27\3\2\2\2\u00cf\u00d0\5\32\16\2\u00d0\u00db\b\r"+
		"\1\2\u00d1\u00d2\7\17\2\2\u00d2\u00d3\5\32\16\2\u00d3\u00d4\b\r\1\2\u00d4"+
		"\u00da\3\2\2\2\u00d5\u00d6\7\20\2\2\u00d6\u00d7\5\32\16\2\u00d7\u00d8"+
		"\b\r\1\2\u00d8\u00da\3\2\2\2\u00d9\u00d1\3\2\2\2\u00d9\u00d5\3\2\2\2\u00da"+
		"\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\31\3\2\2"+
		"\2\u00dd\u00db\3\2\2\2\u00de\u00df\7$\2\2\u00df\u00f1\b\16\1\2\u00e0\u00e1"+
		"\7\"\2\2\u00e1\u00f1\b\16\1\2\u00e2\u00e3\7#\2\2\u00e3\u00f1\b\16\1\2"+
		"\u00e4\u00e5\7 \2\2\u00e5\u00f1\b\16\1\2\u00e6\u00e7\7\35\2\2\u00e7\u00e8"+
		"\5\26\f\2\u00e8\u00e9\b\16\1\2\u00e9\u00ea\7\36\2\2\u00ea\u00f1\3\2\2"+
		"\2\u00eb\u00ec\7!\2\2\u00ec\u00ed\5\26\f\2\u00ed\u00ee\b\16\1\2\u00ee"+
		"\u00ef\7!\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00de\3\2\2\2\u00f0\u00e0\3\2"+
		"\2\2\u00f0\u00e2\3\2\2\2\u00f0\u00e4\3\2\2\2\u00f0\u00e6\3\2\2\2\u00f0"+
		"\u00eb\3\2\2\2\u00f1\33\3\2\2\2\16%C`kx\u0085\u00c4\u00c6\u00cd\u00d9"+
		"\u00db\u00f0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}