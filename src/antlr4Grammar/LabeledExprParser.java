package antlr4Grammar;

// Generated from LabeledExpr.g4 by ANTLR 4.9.3
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
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Decls=1, ListDecl=2, DeclTip=3, ListId=4, Tip=5, CmdComp=6, ListCmd=7, 
		Cmd=8, CmdIf=9, CmdWhile=10, CmdRead=11, CmdWrite=12, ListW=13, ElemW=14, 
		CmdAtrib=15, Expr=16, Exprl=17, PROGRAM=18, INTEGER=19, BOOLEAN=20, BEGIN=21, 
		END=22, WHILE=23, IF=24, THEN=25, ELSE=26, DO=27, READ=28, VAR=29, FALSE=30, 
		TRUE=31, WRITE=32, IDENTIFIER=33, CTE=34, STRING=35, OPAD=36, OPMULT=37, 
		OPLOG=38, OPNEG=39, OPREL=40, PVIG=41, PONTO=42, DPONTOS=43, VIG=44, ABPAR=45, 
		FPAR=46, ATRIB=47, WS=48;
	public static final int
		RULE_prog = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "'PROGRAM'", "'INTEGER'", "'BOOLEAN'", 
			"'BEGIN'", "'END'", "'WHILE'", "'IF'", "'THEN'", "'ELSE'", "'DO'", "'READ'", 
			"'VAR'", "'FALSE'", "'TRUE'", "'WRITE'", null, null, null, null, null, 
			null, "'~'", null, "';'", "'.'", "':'", "','", "'('", "')'", "':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Decls", "ListDecl", "DeclTip", "ListId", "Tip", "CmdComp", "ListCmd", 
			"Cmd", "CmdIf", "CmdWhile", "CmdRead", "CmdWrite", "ListW", "ElemW", 
			"CmdAtrib", "Expr", "Exprl", "PROGRAM", "INTEGER", "BOOLEAN", "BEGIN", 
			"END", "WHILE", "IF", "THEN", "ELSE", "DO", "READ", "VAR", "FALSE", "TRUE", 
			"WRITE", "IDENTIFIER", "CTE", "STRING", "OPAD", "OPMULT", "OPLOG", "OPNEG", 
			"OPREL", "PVIG", "PONTO", "DPONTOS", "VIG", "ABPAR", "FPAR", "ATRIB", 
			"WS"
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
		public TerminalNode Decls() { return getToken(LabeledExprParser.Decls, 0); }
		public TerminalNode CmdComp() { return getToken(LabeledExprParser.CmdComp, 0); }
		public TerminalNode PONTO() { return getToken(LabeledExprParser.PONTO, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			setState(13);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2);
				match(PROGRAM);
				setState(3);
				match(IDENTIFIER);
				setState(4);
				match(PVIG);
				setState(5);
				match(Decls);
				setState(6);
				match(CmdComp);
				setState(7);
				match(PONTO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(8);
				match(PROGRAM);
				setState(9);
				match(IDENTIFIER);
				setState(10);
				match(PVIG);
				setState(11);
				match(CmdComp);
				setState(12);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\22\4\2\t\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\20\n\2\3\2\2\2\3\2\2\2\2"+
		"\21\2\17\3\2\2\2\4\5\7\24\2\2\5\6\7#\2\2\6\7\7+\2\2\7\b\7\3\2\2\b\t\7"+
		"\b\2\2\t\20\7,\2\2\n\13\7\24\2\2\13\f\7#\2\2\f\r\7+\2\2\r\16\7\b\2\2\16"+
		"\20\7,\2\2\17\4\3\2\2\2\17\n\3\2\2\2\20\3\3\2\2\2\3\17";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}