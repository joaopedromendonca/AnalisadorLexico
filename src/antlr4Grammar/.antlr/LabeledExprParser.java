// Generated from /home/jp/unit/compiladores/AnalisadorLexico/src/antlr4Grammar/LabeledExpr.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LabeledExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, INTEGER=2, BOOLEAN=3, STRING=4, BEGIN=5, END=6, WHILE=7, IF=8, 
		THEN=9, ELSE=10, DO=11, READ=12, VAR=13, FALSE=14, TRUE=15, WRITE=16, 
		IDENTIFIER=17, CTE=18, CADEIA=19, OPAD=20, OPMULT=21, OPLOG=22, OPNEG=23, 
		OPREL=24, PVIG=25, PONTO=26, DPONTOS=27, VIG=28, ABPAR=29, FPAR=30, ATRIB=31, 
		WS=32;
	public static final int
		RULE_prog = 0, RULE_decls = 1, RULE_listDecl = 2, RULE_declTip = 3, RULE_listId = 4, 
		RULE_tip = 5, RULE_cmdComp = 6, RULE_listCmd = 7, RULE_cmd = 8, RULE_cmdIf = 9, 
		RULE_cmdWhile = 10, RULE_cmdRead = 11, RULE_cmdWrite = 12, RULE_listW = 13, 
		RULE_elemW = 14, RULE_cmdAtrib = 15, RULE_expr = 16, RULE_exprr = 17, 
		RULE_expra = 18, RULE_exprm = 19, RULE_expraf = 20, RULE_exprrf = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "decls", "listDecl", "declTip", "listId", "tip", "cmdComp", "listCmd", 
			"cmd", "cmdIf", "cmdWhile", "cmdRead", "cmdWrite", "listW", "elemW", 
			"cmdAtrib", "expr", "exprr", "expra", "exprm", "expraf", "exprrf"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", "'INTEGER'", "'BOOLEAN'", "'STRING'", "'BEGIN'", "'END'", 
			"'WHILE'", "'IF'", "'THEN'", "'ELSE'", "'DO'", "'READ'", "'VAR'", "'FALSE'", 
			"'TRUE'", "'WRITE'", null, null, null, null, null, null, "'~'", null, 
			"';'", "'.'", "':'", "','", "'('", "')'", "':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "INTEGER", "BOOLEAN", "STRING", "BEGIN", "END", "WHILE", 
			"IF", "THEN", "ELSE", "DO", "READ", "VAR", "FALSE", "TRUE", "WRITE", 
			"IDENTIFIER", "CTE", "CADEIA", "OPAD", "OPMULT", "OPLOG", "OPNEG", "OPREL", 
			"PVIG", "PONTO", "DPONTOS", "VIG", "ABPAR", "FPAR", "ATRIB", "WS"
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
	public String getGrammarFileName() { return "LabeledExpr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LabeledExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(LabeledExprParser.PROGRAM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LabeledExprParser.IDENTIFIER, 0); }
		public TerminalNode PVIG() { return getToken(LabeledExprParser.PVIG, 0); }
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public CmdCompContext cmdComp() {
			return getRuleContext(CmdCompContext.class,0);
		}
		public TerminalNode PONTO() { return getToken(LabeledExprParser.PONTO, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				match(PROGRAM);
				setState(45);
				match(IDENTIFIER);
				setState(46);
				match(PVIG);
				setState(47);
				decls();
				setState(48);
				cmdComp();
				setState(49);
				match(PONTO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(PROGRAM);
				setState(52);
				match(IDENTIFIER);
				setState(53);
				match(PVIG);
				setState(54);
				cmdComp();
				setState(55);
				match(PONTO);
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

	public static class DeclsContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(LabeledExprParser.VAR, 0); }
		public ListDeclContext listDecl() {
			return getRuleContext(ListDeclContext.class,0);
		}
		public DeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decls; }
	}

	public final DeclsContext decls() throws RecognitionException {
		DeclsContext _localctx = new DeclsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decls);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(VAR);
			setState(60);
			listDecl();
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

	public static class ListDeclContext extends ParserRuleContext {
		public DeclTipContext declTip() {
			return getRuleContext(DeclTipContext.class,0);
		}
		public ListDeclContext listDecl() {
			return getRuleContext(ListDeclContext.class,0);
		}
		public ListDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDecl; }
	}

	public final ListDeclContext listDecl() throws RecognitionException {
		ListDeclContext _localctx = new ListDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_listDecl);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				declTip();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				declTip();
				setState(64);
				listDecl();
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

	public static class DeclTipContext extends ParserRuleContext {
		public ListIdContext listId() {
			return getRuleContext(ListIdContext.class,0);
		}
		public TerminalNode DPONTOS() { return getToken(LabeledExprParser.DPONTOS, 0); }
		public TipContext tip() {
			return getRuleContext(TipContext.class,0);
		}
		public TerminalNode PVIG() { return getToken(LabeledExprParser.PVIG, 0); }
		public DeclTipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declTip; }
	}

	public final DeclTipContext declTip() throws RecognitionException {
		DeclTipContext _localctx = new DeclTipContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declTip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			listId();
			setState(69);
			match(DPONTOS);
			setState(70);
			tip();
			setState(71);
			match(PVIG);
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

	public static class ListIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LabeledExprParser.IDENTIFIER, 0); }
		public TerminalNode VIG() { return getToken(LabeledExprParser.VIG, 0); }
		public ListIdContext listId() {
			return getRuleContext(ListIdContext.class,0);
		}
		public ListIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listId; }
	}

	public final ListIdContext listId() throws RecognitionException {
		ListIdContext _localctx = new ListIdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_listId);
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(IDENTIFIER);
				setState(75);
				match(VIG);
				setState(76);
				listId();
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

	public static class TipContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(LabeledExprParser.INTEGER, 0); }
		public TerminalNode BOOLEAN() { return getToken(LabeledExprParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(LabeledExprParser.STRING, 0); }
		public TipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tip; }
	}

	public final TipContext tip() throws RecognitionException {
		TipContext _localctx = new TipContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tip);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << BOOLEAN) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class CmdCompContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(LabeledExprParser.BEGIN, 0); }
		public ListCmdContext listCmd() {
			return getRuleContext(ListCmdContext.class,0);
		}
		public TerminalNode END() { return getToken(LabeledExprParser.END, 0); }
		public CmdCompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdComp; }
	}

	public final CmdCompContext cmdComp() throws RecognitionException {
		CmdCompContext _localctx = new CmdCompContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdComp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(BEGIN);
			setState(82);
			listCmd();
			setState(83);
			match(END);
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

	public static class ListCmdContext extends ParserRuleContext {
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public TerminalNode PVIG() { return getToken(LabeledExprParser.PVIG, 0); }
		public ListCmdContext listCmd() {
			return getRuleContext(ListCmdContext.class,0);
		}
		public ListCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listCmd; }
	}

	public final ListCmdContext listCmd() throws RecognitionException {
		ListCmdContext _localctx = new ListCmdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_listCmd);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				cmd();
				setState(86);
				match(PVIG);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				cmd();
				setState(89);
				match(PVIG);
				setState(90);
				listCmd();
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

	public static class CmdContext extends ParserRuleContext {
		public CmdIfContext cmdIf() {
			return getRuleContext(CmdIfContext.class,0);
		}
		public CmdWhileContext cmdWhile() {
			return getRuleContext(CmdWhileContext.class,0);
		}
		public CmdReadContext cmdRead() {
			return getRuleContext(CmdReadContext.class,0);
		}
		public CmdWriteContext cmdWrite() {
			return getRuleContext(CmdWriteContext.class,0);
		}
		public CmdAtribContext cmdAtrib() {
			return getRuleContext(CmdAtribContext.class,0);
		}
		public CmdCompContext cmdComp() {
			return getRuleContext(CmdCompContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmd);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				cmdIf();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				cmdWhile();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				cmdRead();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				cmdWrite();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
				cmdAtrib();
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 6);
				{
				setState(99);
				cmdComp();
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

	public static class CmdIfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LabeledExprParser.IF, 0); }
		public ExprrContext exprr() {
			return getRuleContext(ExprrContext.class,0);
		}
		public TerminalNode THEN() { return getToken(LabeledExprParser.THEN, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(LabeledExprParser.ELSE, 0); }
		public CmdIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdIf; }
	}

	public final CmdIfContext cmdIf() throws RecognitionException {
		CmdIfContext _localctx = new CmdIfContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdIf);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(IF);
				setState(103);
				exprr();
				setState(104);
				match(THEN);
				setState(105);
				cmd();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(IF);
				setState(108);
				exprr();
				setState(109);
				match(THEN);
				setState(110);
				cmd();
				setState(111);
				match(ELSE);
				setState(112);
				cmd();
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

	public static class CmdWhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(LabeledExprParser.WHILE, 0); }
		public ExprrContext exprr() {
			return getRuleContext(ExprrContext.class,0);
		}
		public TerminalNode DO() { return getToken(LabeledExprParser.DO, 0); }
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public CmdWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWhile; }
	}

	public final CmdWhileContext cmdWhile() throws RecognitionException {
		CmdWhileContext _localctx = new CmdWhileContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmdWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(WHILE);
			setState(117);
			exprr();
			setState(118);
			match(DO);
			setState(119);
			cmd();
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

	public static class CmdReadContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(LabeledExprParser.READ, 0); }
		public TerminalNode ABPAR() { return getToken(LabeledExprParser.ABPAR, 0); }
		public ListIdContext listId() {
			return getRuleContext(ListIdContext.class,0);
		}
		public TerminalNode FPAR() { return getToken(LabeledExprParser.FPAR, 0); }
		public CmdReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdRead; }
	}

	public final CmdReadContext cmdRead() throws RecognitionException {
		CmdReadContext _localctx = new CmdReadContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cmdRead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(READ);
			setState(122);
			match(ABPAR);
			setState(123);
			listId();
			setState(124);
			match(FPAR);
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

	public static class CmdWriteContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(LabeledExprParser.WRITE, 0); }
		public TerminalNode ABPAR() { return getToken(LabeledExprParser.ABPAR, 0); }
		public ListWContext listW() {
			return getRuleContext(ListWContext.class,0);
		}
		public TerminalNode FPAR() { return getToken(LabeledExprParser.FPAR, 0); }
		public CmdWriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWrite; }
	}

	public final CmdWriteContext cmdWrite() throws RecognitionException {
		CmdWriteContext _localctx = new CmdWriteContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cmdWrite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(WRITE);
			setState(127);
			match(ABPAR);
			setState(128);
			listW();
			setState(129);
			match(FPAR);
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

	public static class ListWContext extends ParserRuleContext {
		public ElemWContext elemW() {
			return getRuleContext(ElemWContext.class,0);
		}
		public TerminalNode VIG() { return getToken(LabeledExprParser.VIG, 0); }
		public ListWContext listW() {
			return getRuleContext(ListWContext.class,0);
		}
		public ListWContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listW; }
	}

	public final ListWContext listW() throws RecognitionException {
		ListWContext _localctx = new ListWContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_listW);
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				elemW();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				elemW();
				setState(133);
				match(VIG);
				setState(134);
				listW();
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

	public static class ElemWContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(LabeledExprParser.CADEIA, 0); }
		public ElemWContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elemW; }
	}

	public final ElemWContext elemW() throws RecognitionException {
		ElemWContext _localctx = new ElemWContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elemW);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FALSE:
			case TRUE:
			case IDENTIFIER:
			case CTE:
			case OPNEG:
			case ABPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				expr();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(CADEIA);
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

	public static class CmdAtribContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LabeledExprParser.IDENTIFIER, 0); }
		public TerminalNode ATRIB() { return getToken(LabeledExprParser.ATRIB, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CmdAtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAtrib; }
	}

	public final CmdAtribContext cmdAtrib() throws RecognitionException {
		CmdAtribContext _localctx = new CmdAtribContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cmdAtrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(IDENTIFIER);
			setState(143);
			match(ATRIB);
			setState(144);
			expr();
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

	public static class ExprContext extends ParserRuleContext {
		public ExpraContext expra() {
			return getRuleContext(ExpraContext.class,0);
		}
		public ExprrContext exprr() {
			return getRuleContext(ExprrContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				expra();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				exprr();
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

	public static class ExprrContext extends ParserRuleContext {
		public ExprrfContext exprrf() {
			return getRuleContext(ExprrfContext.class,0);
		}
		public ExpraContext expra() {
			return getRuleContext(ExpraContext.class,0);
		}
		public TerminalNode OPREL() { return getToken(LabeledExprParser.OPREL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprr; }
	}

	public final ExprrContext exprr() throws RecognitionException {
		ExprrContext _localctx = new ExprrContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exprr);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				exprrf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				expra();
				setState(152);
				match(OPREL);
				setState(153);
				expr();
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

	public static class ExpraContext extends ParserRuleContext {
		public ExprmContext exprm() {
			return getRuleContext(ExprmContext.class,0);
		}
		public TerminalNode OPAD() { return getToken(LabeledExprParser.OPAD, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expra; }
	}

	public final ExpraContext expra() throws RecognitionException {
		ExpraContext _localctx = new ExpraContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expra);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				exprm();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				exprm();
				setState(159);
				match(OPAD);
				setState(160);
				expr();
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

	public static class ExprmContext extends ParserRuleContext {
		public ExprafContext expraf() {
			return getRuleContext(ExprafContext.class,0);
		}
		public TerminalNode OPMULT() { return getToken(LabeledExprParser.OPMULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprm; }
	}

	public final ExprmContext exprm() throws RecognitionException {
		ExprmContext _localctx = new ExprmContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_exprm);
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				expraf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				expraf();
				setState(166);
				match(OPMULT);
				setState(167);
				expr();
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

	public static class ExprafContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LabeledExprParser.IDENTIFIER, 0); }
		public TerminalNode CTE() { return getToken(LabeledExprParser.CTE, 0); }
		public TerminalNode ABPAR() { return getToken(LabeledExprParser.ABPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FPAR() { return getToken(LabeledExprParser.FPAR, 0); }
		public TerminalNode TRUE() { return getToken(LabeledExprParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(LabeledExprParser.FALSE, 0); }
		public TerminalNode OPNEG() { return getToken(LabeledExprParser.OPNEG, 0); }
		public ExprafContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expraf; }
	}

	public final ExprafContext expraf() throws RecognitionException {
		ExprafContext _localctx = new ExprafContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expraf);
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(CTE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				match(ABPAR);
				setState(174);
				expr();
				setState(175);
				match(FPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				match(TRUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(178);
				match(FALSE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(179);
				match(OPNEG);
				setState(180);
				match(IDENTIFIER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(181);
				match(OPNEG);
				setState(182);
				match(CTE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(183);
				match(OPNEG);
				setState(184);
				match(ABPAR);
				setState(185);
				expr();
				setState(186);
				match(FPAR);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(188);
				match(OPNEG);
				setState(189);
				match(TRUE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(190);
				match(OPNEG);
				setState(191);
				match(FALSE);
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

	public static class ExprrfContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LabeledExprParser.IDENTIFIER, 0); }
		public TerminalNode CTE() { return getToken(LabeledExprParser.CTE, 0); }
		public TerminalNode ABPAR() { return getToken(LabeledExprParser.ABPAR, 0); }
		public ExprrContext exprr() {
			return getRuleContext(ExprrContext.class,0);
		}
		public TerminalNode FPAR() { return getToken(LabeledExprParser.FPAR, 0); }
		public TerminalNode TRUE() { return getToken(LabeledExprParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(LabeledExprParser.FALSE, 0); }
		public TerminalNode OPNEG() { return getToken(LabeledExprParser.OPNEG, 0); }
		public ExprrfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprrf; }
	}

	public final ExprrfContext exprrf() throws RecognitionException {
		ExprrfContext _localctx = new ExprrfContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_exprrf);
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(CTE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				match(ABPAR);
				setState(197);
				exprr();
				setState(198);
				match(FPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(200);
				match(TRUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(201);
				match(FALSE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(202);
				match(OPNEG);
				setState(203);
				match(IDENTIFIER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(204);
				match(OPNEG);
				setState(205);
				match(CTE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(206);
				match(OPNEG);
				setState(207);
				match(ABPAR);
				setState(208);
				exprr();
				setState(209);
				match(FPAR);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(211);
				match(OPNEG);
				setState(212);
				match(TRUE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(213);
				match(OPNEG);
				setState(214);
				match(FALSE);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00dc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2<\n\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\5\4E\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6P\n\6\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t_\n\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\ng\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13u\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u008b\n\17\3\20\3\20\5\20\u008f\n"+
		"\20\3\21\3\21\3\21\3\21\3\22\3\22\5\22\u0097\n\22\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u009e\n\23\3\24\3\24\3\24\3\24\3\24\5\24\u00a5\n\24\3\25\3"+
		"\25\3\25\3\25\3\25\5\25\u00ac\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u00c3\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00da\n\27\3\27"+
		"\2\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\3\3\2\4\6\2\u00e7"+
		"\2;\3\2\2\2\4=\3\2\2\2\6D\3\2\2\2\bF\3\2\2\2\nO\3\2\2\2\fQ\3\2\2\2\16"+
		"S\3\2\2\2\20^\3\2\2\2\22f\3\2\2\2\24t\3\2\2\2\26v\3\2\2\2\30{\3\2\2\2"+
		"\32\u0080\3\2\2\2\34\u008a\3\2\2\2\36\u008e\3\2\2\2 \u0090\3\2\2\2\"\u0096"+
		"\3\2\2\2$\u009d\3\2\2\2&\u00a4\3\2\2\2(\u00ab\3\2\2\2*\u00c2\3\2\2\2,"+
		"\u00d9\3\2\2\2./\7\3\2\2/\60\7\23\2\2\60\61\7\33\2\2\61\62\5\4\3\2\62"+
		"\63\5\16\b\2\63\64\7\34\2\2\64<\3\2\2\2\65\66\7\3\2\2\66\67\7\23\2\2\67"+
		"8\7\33\2\289\5\16\b\29:\7\34\2\2:<\3\2\2\2;.\3\2\2\2;\65\3\2\2\2<\3\3"+
		"\2\2\2=>\7\17\2\2>?\5\6\4\2?\5\3\2\2\2@E\5\b\5\2AB\5\b\5\2BC\5\6\4\2C"+
		"E\3\2\2\2D@\3\2\2\2DA\3\2\2\2E\7\3\2\2\2FG\5\n\6\2GH\7\35\2\2HI\5\f\7"+
		"\2IJ\7\33\2\2J\t\3\2\2\2KP\7\23\2\2LM\7\23\2\2MN\7\36\2\2NP\5\n\6\2OK"+
		"\3\2\2\2OL\3\2\2\2P\13\3\2\2\2QR\t\2\2\2R\r\3\2\2\2ST\7\7\2\2TU\5\20\t"+
		"\2UV\7\b\2\2V\17\3\2\2\2WX\5\22\n\2XY\7\33\2\2Y_\3\2\2\2Z[\5\22\n\2[\\"+
		"\7\33\2\2\\]\5\20\t\2]_\3\2\2\2^W\3\2\2\2^Z\3\2\2\2_\21\3\2\2\2`g\5\24"+
		"\13\2ag\5\26\f\2bg\5\30\r\2cg\5\32\16\2dg\5 \21\2eg\5\16\b\2f`\3\2\2\2"+
		"fa\3\2\2\2fb\3\2\2\2fc\3\2\2\2fd\3\2\2\2fe\3\2\2\2g\23\3\2\2\2hi\7\n\2"+
		"\2ij\5$\23\2jk\7\13\2\2kl\5\22\n\2lu\3\2\2\2mn\7\n\2\2no\5$\23\2op\7\13"+
		"\2\2pq\5\22\n\2qr\7\f\2\2rs\5\22\n\2su\3\2\2\2th\3\2\2\2tm\3\2\2\2u\25"+
		"\3\2\2\2vw\7\t\2\2wx\5$\23\2xy\7\r\2\2yz\5\22\n\2z\27\3\2\2\2{|\7\16\2"+
		"\2|}\7\37\2\2}~\5\n\6\2~\177\7 \2\2\177\31\3\2\2\2\u0080\u0081\7\22\2"+
		"\2\u0081\u0082\7\37\2\2\u0082\u0083\5\34\17\2\u0083\u0084\7 \2\2\u0084"+
		"\33\3\2\2\2\u0085\u008b\5\36\20\2\u0086\u0087\5\36\20\2\u0087\u0088\7"+
		"\36\2\2\u0088\u0089\5\34\17\2\u0089\u008b\3\2\2\2\u008a\u0085\3\2\2\2"+
		"\u008a\u0086\3\2\2\2\u008b\35\3\2\2\2\u008c\u008f\5\"\22\2\u008d\u008f"+
		"\7\25\2\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f\37\3\2\2\2\u0090"+
		"\u0091\7\23\2\2\u0091\u0092\7!\2\2\u0092\u0093\5\"\22\2\u0093!\3\2\2\2"+
		"\u0094\u0097\5&\24\2\u0095\u0097\5$\23\2\u0096\u0094\3\2\2\2\u0096\u0095"+
		"\3\2\2\2\u0097#\3\2\2\2\u0098\u009e\5,\27\2\u0099\u009a\5&\24\2\u009a"+
		"\u009b\7\32\2\2\u009b\u009c\5\"\22\2\u009c\u009e\3\2\2\2\u009d\u0098\3"+
		"\2\2\2\u009d\u0099\3\2\2\2\u009e%\3\2\2\2\u009f\u00a5\5(\25\2\u00a0\u00a1"+
		"\5(\25\2\u00a1\u00a2\7\26\2\2\u00a2\u00a3\5\"\22\2\u00a3\u00a5\3\2\2\2"+
		"\u00a4\u009f\3\2\2\2\u00a4\u00a0\3\2\2\2\u00a5\'\3\2\2\2\u00a6\u00ac\5"+
		"*\26\2\u00a7\u00a8\5*\26\2\u00a8\u00a9\7\27\2\2\u00a9\u00aa\5\"\22\2\u00aa"+
		"\u00ac\3\2\2\2\u00ab\u00a6\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ac)\3\2\2\2"+
		"\u00ad\u00c3\7\23\2\2\u00ae\u00c3\7\24\2\2\u00af\u00b0\7\37\2\2\u00b0"+
		"\u00b1\5\"\22\2\u00b1\u00b2\7 \2\2\u00b2\u00c3\3\2\2\2\u00b3\u00c3\7\21"+
		"\2\2\u00b4\u00c3\7\20\2\2\u00b5\u00b6\7\31\2\2\u00b6\u00c3\7\23\2\2\u00b7"+
		"\u00b8\7\31\2\2\u00b8\u00c3\7\24\2\2\u00b9\u00ba\7\31\2\2\u00ba\u00bb"+
		"\7\37\2\2\u00bb\u00bc\5\"\22\2\u00bc\u00bd\7 \2\2\u00bd\u00c3\3\2\2\2"+
		"\u00be\u00bf\7\31\2\2\u00bf\u00c3\7\21\2\2\u00c0\u00c1\7\31\2\2\u00c1"+
		"\u00c3\7\20\2\2\u00c2\u00ad\3\2\2\2\u00c2\u00ae\3\2\2\2\u00c2\u00af\3"+
		"\2\2\2\u00c2\u00b3\3\2\2\2\u00c2\u00b4\3\2\2\2\u00c2\u00b5\3\2\2\2\u00c2"+
		"\u00b7\3\2\2\2\u00c2\u00b9\3\2\2\2\u00c2\u00be\3\2\2\2\u00c2\u00c0\3\2"+
		"\2\2\u00c3+\3\2\2\2\u00c4\u00da\7\23\2\2\u00c5\u00da\7\24\2\2\u00c6\u00c7"+
		"\7\37\2\2\u00c7\u00c8\5$\23\2\u00c8\u00c9\7 \2\2\u00c9\u00da\3\2\2\2\u00ca"+
		"\u00da\7\21\2\2\u00cb\u00da\7\20\2\2\u00cc\u00cd\7\31\2\2\u00cd\u00da"+
		"\7\23\2\2\u00ce\u00cf\7\31\2\2\u00cf\u00da\7\24\2\2\u00d0\u00d1\7\31\2"+
		"\2\u00d1\u00d2\7\37\2\2\u00d2\u00d3\5$\23\2\u00d3\u00d4\7 \2\2\u00d4\u00da"+
		"\3\2\2\2\u00d5\u00d6\7\31\2\2\u00d6\u00da\7\21\2\2\u00d7\u00d8\7\31\2"+
		"\2\u00d8\u00da\7\20\2\2\u00d9\u00c4\3\2\2\2\u00d9\u00c5\3\2\2\2\u00d9"+
		"\u00c6\3\2\2\2\u00d9\u00ca\3\2\2\2\u00d9\u00cb\3\2\2\2\u00d9\u00cc\3\2"+
		"\2\2\u00d9\u00ce\3\2\2\2\u00d9\u00d0\3\2\2\2\u00d9\u00d5\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00da-\3\2\2\2\20;DO^ft\u008a\u008e\u0096\u009d\u00a4\u00ab"+
		"\u00c2\u00d9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}