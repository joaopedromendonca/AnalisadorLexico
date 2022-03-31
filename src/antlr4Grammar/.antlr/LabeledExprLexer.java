// Generated from /home/jp/unit/compiladores/AnalisadorLexico/src/antlr4Grammar/LabeledExpr.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LabeledExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Decls=1, ListDecl=2, DeclTip=3, ListId=4, Tip=5, CmdComp=6, ListCmd=7, 
		Cmd=8, CmdIf=9, CmdWhile=10, CmdRead=11, CmdWrite=12, ListW=13, ElemW=14, 
		CmdAtrib=15, Expr=16, Exprr=17, Expra=18, Exprm=19, Expraf=20, Exprrf=21, 
		PROGRAM=22, INTEGER=23, BOOLEAN=24, BEGIN=25, END=26, WHILE=27, IF=28, 
		THEN=29, ELSE=30, DO=31, READ=32, VAR=33, FALSE=34, TRUE=35, WRITE=36, 
		IDENTIFIER=37, CTE=38, STRING=39, OPAD=40, OPMULT=41, OPLOG=42, OPNEG=43, 
		OPREL=44, PVIG=45, PONTO=46, DPONTOS=47, VIG=48, ABPAR=49, FPAR=50, ATRIB=51, 
		WS=52;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Decls", "ListDecl", "DeclTip", "ListId", "Tip", "CmdComp", "ListCmd", 
			"Cmd", "CmdIf", "CmdWhile", "CmdRead", "CmdWrite", "ListW", "ElemW", 
			"CmdAtrib", "Expr", "Exprr", "Expra", "Exprm", "Expraf", "Exprrf", "PROGRAM", 
			"INTEGER", "BOOLEAN", "BEGIN", "END", "WHILE", "IF", "THEN", "ELSE", 
			"DO", "READ", "VAR", "FALSE", "TRUE", "WRITE", "IDENTIFIER", "CTE", "STRING", 
			"OPAD", "OPMULT", "OPLOG", "OPNEG", "OPREL", "PVIG", "PONTO", "DPONTOS", 
			"VIG", "ABPAR", "FPAR", "ATRIB", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'PROGRAM'", 
			"'INTEGER'", "'BOOLEAN'", "'BEGIN'", "'END'", "'WHILE'", "'IF'", "'THEN'", 
			"'ELSE'", "'DO'", "'READ'", "'VAR'", "'FALSE'", "'TRUE'", "'WRITE'", 
			null, null, null, null, null, null, "'~'", null, "';'", "'.'", "':'", 
			"','", "'('", "')'", "':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Decls", "ListDecl", "DeclTip", "ListId", "Tip", "CmdComp", "ListCmd", 
			"Cmd", "CmdIf", "CmdWhile", "CmdRead", "CmdWrite", "ListW", "ElemW", 
			"CmdAtrib", "Expr", "Exprr", "Expra", "Exprm", "Expraf", "Exprrf", "PROGRAM", 
			"INTEGER", "BOOLEAN", "BEGIN", "END", "WHILE", "IF", "THEN", "ELSE", 
			"DO", "READ", "VAR", "FALSE", "TRUE", "WRITE", "IDENTIFIER", "CTE", "STRING", 
			"OPAD", "OPMULT", "OPLOG", "OPNEG", "OPREL", "PVIG", "PONTO", "DPONTOS", 
			"VIG", "ABPAR", "FPAR", "ATRIB", "WS"
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


	public LabeledExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LabeledExpr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u01af\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3s\n\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\5\5\177\n\5\3\6\3\6\3\6\5\6\u0084\n\6\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b\u008f\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0097"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a5\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u00bb\n\16\3\17\3\17\5\17\u00bf\n\17\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\5\21\u00c7\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u00ce"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u00d5\n\23\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u00dc\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u00f7\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u0112\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3"+
		"$\3$\3%\3%\3%\3%\3%\3%\3&\3&\7&\u0168\n&\f&\16&\u016b\13&\3\'\6\'\u016e"+
		"\n\'\r\'\16\'\u016f\3\'\3\'\6\'\u0174\n\'\r\'\16\'\u0175\3(\3(\7(\u017a"+
		"\n(\f(\16(\u017d\13(\3(\3(\3)\3)\3*\3*\3+\3+\3+\3+\3+\5+\u018a\n+\3,\3"+
		",\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0198\n-\3.\3.\3/\3/\3\60\3\60\3\61"+
		"\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\65\6\65\u01aa\n\65\r\65\16"+
		"\65\u01ab\3\65\3\65\3\u016f\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\66\3\2\b\4\2C\\c|\5\2\62;C\\c|\3\2\62;\4\2--//\4"+
		"\2,,\61\61\5\2\13\f\17\17\"\"\2\u01dc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\2i\3\2\2\2\3k\3\2\2\2\5r\3\2\2\2\7t\3\2\2\2\t~\3\2\2\2\13\u0083"+
		"\3\2\2\2\r\u0085\3\2\2\2\17\u008e\3\2\2\2\21\u0096\3\2\2\2\23\u00a4\3"+
		"\2\2\2\25\u00a6\3\2\2\2\27\u00ab\3\2\2\2\31\u00b0\3\2\2\2\33\u00ba\3\2"+
		"\2\2\35\u00be\3\2\2\2\37\u00c0\3\2\2\2!\u00c6\3\2\2\2#\u00cd\3\2\2\2%"+
		"\u00d4\3\2\2\2\'\u00db\3\2\2\2)\u00f6\3\2\2\2+\u0111\3\2\2\2-\u0113\3"+
		"\2\2\2/\u011b\3\2\2\2\61\u0123\3\2\2\2\63\u012b\3\2\2\2\65\u0131\3\2\2"+
		"\2\67\u0135\3\2\2\29\u013b\3\2\2\2;\u013e\3\2\2\2=\u0143\3\2\2\2?\u0148"+
		"\3\2\2\2A\u014b\3\2\2\2C\u0150\3\2\2\2E\u0154\3\2\2\2G\u015a\3\2\2\2I"+
		"\u015f\3\2\2\2K\u0165\3\2\2\2M\u016d\3\2\2\2O\u0177\3\2\2\2Q\u0180\3\2"+
		"\2\2S\u0182\3\2\2\2U\u0189\3\2\2\2W\u018b\3\2\2\2Y\u0197\3\2\2\2[\u0199"+
		"\3\2\2\2]\u019b\3\2\2\2_\u019d\3\2\2\2a\u019f\3\2\2\2c\u01a1\3\2\2\2e"+
		"\u01a3\3\2\2\2g\u01a5\3\2\2\2i\u01a9\3\2\2\2kl\5C\"\2lm\5\5\3\2m\4\3\2"+
		"\2\2ns\5\7\4\2op\5\7\4\2pq\5\5\3\2qs\3\2\2\2rn\3\2\2\2ro\3\2\2\2s\6\3"+
		"\2\2\2tu\5\t\5\2uv\5_\60\2vw\5\13\6\2wx\5[.\2x\b\3\2\2\2y\177\5K&\2z{"+
		"\5K&\2{|\5a\61\2|}\5\t\5\2}\177\3\2\2\2~y\3\2\2\2~z\3\2\2\2\177\n\3\2"+
		"\2\2\u0080\u0084\5/\30\2\u0081\u0084\5\61\31\2\u0082\u0084\5O(\2\u0083"+
		"\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\f\3\2\2\2"+
		"\u0085\u0086\5\63\32\2\u0086\u0087\5\17\b\2\u0087\u0088\5\65\33\2\u0088"+
		"\16\3\2\2\2\u0089\u008f\5\21\t\2\u008a\u008b\5\21\t\2\u008b\u008c\5[."+
		"\2\u008c\u008d\5\17\b\2\u008d\u008f\3\2\2\2\u008e\u0089\3\2\2\2\u008e"+
		"\u008a\3\2\2\2\u008f\20\3\2\2\2\u0090\u0097\5\23\n\2\u0091\u0097\5\25"+
		"\13\2\u0092\u0097\5\27\f\2\u0093\u0097\5\31\r\2\u0094\u0097\5\37\20\2"+
		"\u0095\u0097\5\r\7\2\u0096\u0090\3\2\2\2\u0096\u0091\3\2\2\2\u0096\u0092"+
		"\3\2\2\2\u0096\u0093\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097"+
		"\22\3\2\2\2\u0098\u0099\59\35\2\u0099\u009a\5#\22\2\u009a\u009b\5;\36"+
		"\2\u009b\u009c\5\21\t\2\u009c\u00a5\3\2\2\2\u009d\u009e\59\35\2\u009e"+
		"\u009f\5#\22\2\u009f\u00a0\5;\36\2\u00a0\u00a1\5\21\t\2\u00a1\u00a2\5"+
		"=\37\2\u00a2\u00a3\5\21\t\2\u00a3\u00a5\3\2\2\2\u00a4\u0098\3\2\2\2\u00a4"+
		"\u009d\3\2\2\2\u00a5\24\3\2\2\2\u00a6\u00a7\5\67\34\2\u00a7\u00a8\5#\22"+
		"\2\u00a8\u00a9\5? \2\u00a9\u00aa\5\21\t\2\u00aa\26\3\2\2\2\u00ab\u00ac"+
		"\5A!\2\u00ac\u00ad\5c\62\2\u00ad\u00ae\5\t\5\2\u00ae\u00af\5e\63\2\u00af"+
		"\30\3\2\2\2\u00b0\u00b1\5I%\2\u00b1\u00b2\5c\62\2\u00b2\u00b3\5\33\16"+
		"\2\u00b3\u00b4\5e\63\2\u00b4\32\3\2\2\2\u00b5\u00bb\5\35\17\2\u00b6\u00b7"+
		"\5\35\17\2\u00b7\u00b8\5a\61\2\u00b8\u00b9\5\33\16\2\u00b9\u00bb\3\2\2"+
		"\2\u00ba\u00b5\3\2\2\2\u00ba\u00b6\3\2\2\2\u00bb\34\3\2\2\2\u00bc\u00bf"+
		"\5!\21\2\u00bd\u00bf\5O(\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf"+
		"\36\3\2\2\2\u00c0\u00c1\5K&\2\u00c1\u00c2\5g\64\2\u00c2\u00c3\5!\21\2"+
		"\u00c3 \3\2\2\2\u00c4\u00c7\5#\22\2\u00c5\u00c7\5%\23\2\u00c6\u00c4\3"+
		"\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\"\3\2\2\2\u00c8\u00ce\5+\26\2\u00c9\u00ca"+
		"\5%\23\2\u00ca\u00cb\5Y-\2\u00cb\u00cc\5!\21\2\u00cc\u00ce\3\2\2\2\u00cd"+
		"\u00c8\3\2\2\2\u00cd\u00c9\3\2\2\2\u00ce$\3\2\2\2\u00cf\u00d5\5\'\24\2"+
		"\u00d0\u00d1\5\'\24\2\u00d1\u00d2\5Q)\2\u00d2\u00d3\5!\21\2\u00d3\u00d5"+
		"\3\2\2\2\u00d4\u00cf\3\2\2\2\u00d4\u00d0\3\2\2\2\u00d5&\3\2\2\2\u00d6"+
		"\u00dc\5)\25\2\u00d7\u00d8\5)\25\2\u00d8\u00d9\5S*\2\u00d9\u00da\5!\21"+
		"\2\u00da\u00dc\3\2\2\2\u00db\u00d6\3\2\2\2\u00db\u00d7\3\2\2\2\u00dc("+
		"\3\2\2\2\u00dd\u00f7\5K&\2\u00de\u00f7\5M\'\2\u00df\u00e0\5c\62\2\u00e0"+
		"\u00e1\5!\21\2\u00e1\u00e2\5e\63\2\u00e2\u00f7\3\2\2\2\u00e3\u00f7\5G"+
		"$\2\u00e4\u00f7\5E#\2\u00e5\u00e6\5W,\2\u00e6\u00e7\5K&\2\u00e7\u00f7"+
		"\3\2\2\2\u00e8\u00e9\5W,\2\u00e9\u00ea\5M\'\2\u00ea\u00f7\3\2\2\2\u00eb"+
		"\u00ec\5W,\2\u00ec\u00ed\5c\62\2\u00ed\u00ee\5!\21\2\u00ee\u00ef\5e\63"+
		"\2\u00ef\u00f7\3\2\2\2\u00f0\u00f1\5W,\2\u00f1\u00f2\5G$\2\u00f2\u00f7"+
		"\3\2\2\2\u00f3\u00f4\5W,\2\u00f4\u00f5\5E#\2\u00f5\u00f7\3\2\2\2\u00f6"+
		"\u00dd\3\2\2\2\u00f6\u00de\3\2\2\2\u00f6\u00df\3\2\2\2\u00f6\u00e3\3\2"+
		"\2\2\u00f6\u00e4\3\2\2\2\u00f6\u00e5\3\2\2\2\u00f6\u00e8\3\2\2\2\u00f6"+
		"\u00eb\3\2\2\2\u00f6\u00f0\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f7*\3\2\2\2"+
		"\u00f8\u0112\5K&\2\u00f9\u0112\5M\'\2\u00fa\u00fb\5c\62\2\u00fb\u00fc"+
		"\5#\22\2\u00fc\u00fd\5e\63\2\u00fd\u0112\3\2\2\2\u00fe\u0112\5G$\2\u00ff"+
		"\u0112\5E#\2\u0100\u0101\5W,\2\u0101\u0102\5K&\2\u0102\u0112\3\2\2\2\u0103"+
		"\u0104\5W,\2\u0104\u0105\5M\'\2\u0105\u0112\3\2\2\2\u0106\u0107\5W,\2"+
		"\u0107\u0108\5c\62\2\u0108\u0109\5#\22\2\u0109\u010a\5e\63\2\u010a\u0112"+
		"\3\2\2\2\u010b\u010c\5W,\2\u010c\u010d\5G$\2\u010d\u0112\3\2\2\2\u010e"+
		"\u010f\5W,\2\u010f\u0110\5E#\2\u0110\u0112\3\2\2\2\u0111\u00f8\3\2\2\2"+
		"\u0111\u00f9\3\2\2\2\u0111\u00fa\3\2\2\2\u0111\u00fe\3\2\2\2\u0111\u00ff"+
		"\3\2\2\2\u0111\u0100\3\2\2\2\u0111\u0103\3\2\2\2\u0111\u0106\3\2\2\2\u0111"+
		"\u010b\3\2\2\2\u0111\u010e\3\2\2\2\u0112,\3\2\2\2\u0113\u0114\7R\2\2\u0114"+
		"\u0115\7T\2\2\u0115\u0116\7Q\2\2\u0116\u0117\7I\2\2\u0117\u0118\7T\2\2"+
		"\u0118\u0119\7C\2\2\u0119\u011a\7O\2\2\u011a.\3\2\2\2\u011b\u011c\7K\2"+
		"\2\u011c\u011d\7P\2\2\u011d\u011e\7V\2\2\u011e\u011f\7G\2\2\u011f\u0120"+
		"\7I\2\2\u0120\u0121\7G\2\2\u0121\u0122\7T\2\2\u0122\60\3\2\2\2\u0123\u0124"+
		"\7D\2\2\u0124\u0125\7Q\2\2\u0125\u0126\7Q\2\2\u0126\u0127\7N\2\2\u0127"+
		"\u0128\7G\2\2\u0128\u0129\7C\2\2\u0129\u012a\7P\2\2\u012a\62\3\2\2\2\u012b"+
		"\u012c\7D\2\2\u012c\u012d\7G\2\2\u012d\u012e\7I\2\2\u012e\u012f\7K\2\2"+
		"\u012f\u0130\7P\2\2\u0130\64\3\2\2\2\u0131\u0132\7G\2\2\u0132\u0133\7"+
		"P\2\2\u0133\u0134\7F\2\2\u0134\66\3\2\2\2\u0135\u0136\7Y\2\2\u0136\u0137"+
		"\7J\2\2\u0137\u0138\7K\2\2\u0138\u0139\7N\2\2\u0139\u013a\7G\2\2\u013a"+
		"8\3\2\2\2\u013b\u013c\7K\2\2\u013c\u013d\7H\2\2\u013d:\3\2\2\2\u013e\u013f"+
		"\7V\2\2\u013f\u0140\7J\2\2\u0140\u0141\7G\2\2\u0141\u0142\7P\2\2\u0142"+
		"<\3\2\2\2\u0143\u0144\7G\2\2\u0144\u0145\7N\2\2\u0145\u0146\7U\2\2\u0146"+
		"\u0147\7G\2\2\u0147>\3\2\2\2\u0148\u0149\7F\2\2\u0149\u014a\7Q\2\2\u014a"+
		"@\3\2\2\2\u014b\u014c\7T\2\2\u014c\u014d\7G\2\2\u014d\u014e\7C\2\2\u014e"+
		"\u014f\7F\2\2\u014fB\3\2\2\2\u0150\u0151\7X\2\2\u0151\u0152\7C\2\2\u0152"+
		"\u0153\7T\2\2\u0153D\3\2\2\2\u0154\u0155\7H\2\2\u0155\u0156\7C\2\2\u0156"+
		"\u0157\7N\2\2\u0157\u0158\7U\2\2\u0158\u0159\7G\2\2\u0159F\3\2\2\2\u015a"+
		"\u015b\7V\2\2\u015b\u015c\7T\2\2\u015c\u015d\7W\2\2\u015d\u015e\7G\2\2"+
		"\u015eH\3\2\2\2\u015f\u0160\7Y\2\2\u0160\u0161\7T\2\2\u0161\u0162\7K\2"+
		"\2\u0162\u0163\7V\2\2\u0163\u0164\7G\2\2\u0164J\3\2\2\2\u0165\u0169\t"+
		"\2\2\2\u0166\u0168\t\3\2\2\u0167\u0166\3\2\2\2\u0168\u016b\3\2\2\2\u0169"+
		"\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016aL\3\2\2\2\u016b\u0169\3\2\2\2"+
		"\u016c\u016e\t\4\2\2\u016d\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170"+
		"\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0173\7/\2\2\u0172"+
		"\u0174\t\4\2\2\u0173\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0173\3\2"+
		"\2\2\u0175\u0176\3\2\2\2\u0176N\3\2\2\2\u0177\u017b\7$\2\2\u0178\u017a"+
		"\t\3\2\2\u0179\u0178\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b"+
		"\u017c\3\2\2\2\u017c\u017e\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u017f\7$"+
		"\2\2\u017fP\3\2\2\2\u0180\u0181\t\5\2\2\u0181R\3\2\2\2\u0182\u0183\t\6"+
		"\2\2\u0183T\3\2\2\2\u0184\u0185\7Q\2\2\u0185\u018a\7T\2\2\u0186\u0187"+
		"\7C\2\2\u0187\u0188\7P\2\2\u0188\u018a\7F\2\2\u0189\u0184\3\2\2\2\u0189"+
		"\u0186\3\2\2\2\u018aV\3\2\2\2\u018b\u018c\7\u0080\2\2\u018cX\3\2\2\2\u018d"+
		"\u0198\7>\2\2\u018e\u018f\7>\2\2\u018f\u0198\7?\2\2\u0190\u0198\7@\2\2"+
		"\u0191\u0192\7@\2\2\u0192\u0198\7?\2\2\u0193\u0194\7?\2\2\u0194\u0198"+
		"\7?\2\2\u0195\u0196\7>\2\2\u0196\u0198\7@\2\2\u0197\u018d\3\2\2\2\u0197"+
		"\u018e\3\2\2\2\u0197\u0190\3\2\2\2\u0197\u0191\3\2\2\2\u0197\u0193\3\2"+
		"\2\2\u0197\u0195\3\2\2\2\u0198Z\3\2\2\2\u0199\u019a\7=\2\2\u019a\\\3\2"+
		"\2\2\u019b\u019c\7\60\2\2\u019c^\3\2\2\2\u019d\u019e\7<\2\2\u019e`\3\2"+
		"\2\2\u019f\u01a0\7.\2\2\u01a0b\3\2\2\2\u01a1\u01a2\7*\2\2\u01a2d\3\2\2"+
		"\2\u01a3\u01a4\7+\2\2\u01a4f\3\2\2\2\u01a5\u01a6\7<\2\2\u01a6\u01a7\7"+
		"?\2\2\u01a7h\3\2\2\2\u01a8\u01aa\t\7\2\2\u01a9\u01a8\3\2\2\2\u01aa\u01ab"+
		"\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad"+
		"\u01ae\b\65\2\2\u01aej\3\2\2\2\30\2r~\u0083\u008e\u0096\u00a4\u00ba\u00be"+
		"\u00c6\u00cd\u00d4\u00db\u00f6\u0111\u0169\u016f\u0175\u017b\u0189\u0197"+
		"\u01ab\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}