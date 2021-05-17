// Generated from D:/msc/fordproggyak/kodok/kotprog\CalculatorParser.g4 by ANTLR 4.9.1

    import java.util.ArrayList;
    import java.util.List;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LF=1, WS=2, POLYNOM=3, NUMBER=4, SHOW=5, X=6, SZAM=7, OPASSIGN=8, OPADD=9, 
		OPMUL=10, OPPWR=11, LPAR=12, RPAR=13, LBRACKET=14, RBRACKET=15, OPLST=16, 
		ID=17, ENDL=18;
	public static final int
		RULE_start = 0, RULE_sor = 1, RULE_deklaracio = 2, RULE_ertekadas = 3, 
		RULE_polinom = 4, RULE_polinomtag = 5, RULE_szamolas = 6, RULE_polinommuvelet = 7, 
		RULE_polinomxertekadas = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "sor", "deklaracio", "ertekadas", "polinom", "polinomtag", "szamolas", 
			"polinommuvelet", "polinomxertekadas"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\n'", null, "'polynom'", "'number'", "'show'", "'x'", null, "'='", 
			null, null, "'^'", "'('", "')'", "'['", "']'", "','", null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LF", "WS", "POLYNOM", "NUMBER", "SHOW", "X", "SZAM", "OPASSIGN", 
			"OPADD", "OPMUL", "OPPWR", "LPAR", "RPAR", "LBRACKET", "RBRACKET", "OPLST", 
			"ID", "ENDL"
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
	public String getGrammarFileName() { return "CalculatorParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    public static void main(String[] args) throws Exception {
	         CalculatorLexer lex = new CalculatorLexer(CharStreams.fromFileName(args[0]));
	         CommonTokenStream tokens = new CommonTokenStream (lex);
	         CalculatorParser parser = new CalculatorParser(tokens);
	         parser.start();
	    }

	public CalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public List<SorContext> sor() {
			return getRuleContexts(SorContext.class);
		}
		public SorContext sor(int i) {
			return getRuleContext(SorContext.class,i);
		}
		public List<TerminalNode> LF() { return getTokens(CalculatorParser.LF); }
		public TerminalNode LF(int i) {
			return getToken(CalculatorParser.LF, i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorParserListener ) ((CalculatorParserListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorParserListener ) ((CalculatorParserListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorParserVisitor ) return ((CalculatorParserVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << POLYNOM) | (1L << NUMBER) | (1L << SHOW) | (1L << ID))) != 0)) {
				{
				{
				setState(18);
				sor();
				setState(19);
				match(LF);
				}
				}
				setState(25);
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

	public static class SorContext extends ParserRuleContext {
		public DeklaracioContext deklaracio() {
			return getRuleContext(DeklaracioContext.class,0);
		}
		public TerminalNode ENDL() { return getToken(CalculatorParser.ENDL, 0); }
		public ErtekadasContext ertekadas() {
			return getRuleContext(ErtekadasContext.class,0);
		}
		public SzamolasContext szamolas() {
			return getRuleContext(SzamolasContext.class,0);
		}
		public SorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorParserListener ) ((CalculatorParserListener)listener).enterSor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorParserListener ) ((CalculatorParserListener)listener).exitSor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorParserVisitor ) return ((CalculatorParserVisitor<? extends T>)visitor).visitSor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SorContext sor() throws RecognitionException {
		SorContext _localctx = new SorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sor);
		try {
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POLYNOM:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				deklaracio();
				setState(27);
				match(ENDL);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				ertekadas();
				setState(30);
				match(ENDL);
				}
				break;
			case SHOW:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				szamolas();
				setState(33);
				match(ENDL);
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

	public static class DeklaracioContext extends ParserRuleContext {
		public TerminalNode POLYNOM() { return getToken(CalculatorParser.POLYNOM, 0); }
		public List<TerminalNode> ID() { return getTokens(CalculatorParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CalculatorParser.ID, i);
		}
		public TerminalNode OPLST() { return getToken(CalculatorParser.OPLST, 0); }
		public TerminalNode NUMBER() { return getToken(CalculatorParser.NUMBER, 0); }
		public DeklaracioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deklaracio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorParserListener ) ((CalculatorParserListener)listener).enterDeklaracio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorParserListener ) ((CalculatorParserListener)listener).exitDeklaracio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorParserVisitor ) return ((CalculatorParserVisitor<? extends T>)visitor).visitDeklaracio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeklaracioContext deklaracio() throws RecognitionException {
		DeklaracioContext _localctx = new DeklaracioContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_deklaracio);
		int _la;
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POLYNOM:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				match(POLYNOM);
				setState(38);
				match(ID);
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPLST) {
					{
					setState(39);
					match(OPLST);
					setState(40);
					match(ID);
					}
				}

				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(NUMBER);
				setState(44);
				match(ID);
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

	public static class ErtekadasContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CalculatorParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CalculatorParser.ID, i);
		}
		public TerminalNode OPASSIGN() { return getToken(CalculatorParser.OPASSIGN, 0); }
		public List<TerminalNode> SZAM() { return getTokens(CalculatorParser.SZAM); }
		public TerminalNode SZAM(int i) {
			return getToken(CalculatorParser.SZAM, i);
		}
		public List<TerminalNode> OPADD() { return getTokens(CalculatorParser.OPADD); }
		public TerminalNode OPADD(int i) {
			return getToken(CalculatorParser.OPADD, i);
		}
		public PolinomContext polinom() {
			return getRuleContext(PolinomContext.class,0);
		}
		public TerminalNode X() { return getToken(CalculatorParser.X, 0); }
		public ErtekadasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ertekadas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorParserListener ) ((CalculatorParserListener)listener).enterErtekadas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorParserListener ) ((CalculatorParserListener)listener).exitErtekadas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorParserVisitor ) return ((CalculatorParserVisitor<? extends T>)visitor).visitErtekadas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErtekadasContext ertekadas() throws RecognitionException {
		ErtekadasContext _localctx = new ErtekadasContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ertekadas);
		int _la;
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				match(ID);
				setState(48);
				match(OPASSIGN);
				setState(49);
				match(SZAM);
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPADD) {
					{
					{
					setState(50);
					match(OPADD);
					setState(51);
					match(SZAM);
					}
					}
					setState(56);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(ID);
				setState(58);
				match(OPASSIGN);
				setState(59);
				polinom();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				match(ID);
				setState(61);
				match(OPASSIGN);
				setState(62);
				match(X);
				setState(63);
				match(OPADD);
				setState(64);
				match(ID);
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

	public static class PolinomContext extends ParserRuleContext {
		public List<PolinomtagContext> polinomtag() {
			return getRuleContexts(PolinomtagContext.class);
		}
		public PolinomtagContext polinomtag(int i) {
			return getRuleContext(PolinomtagContext.class,i);
		}
		public List<TerminalNode> OPADD() { return getTokens(CalculatorParser.OPADD); }
		public TerminalNode OPADD(int i) {
			return getToken(CalculatorParser.OPADD, i);
		}
		public PolinomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_polinom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorParserListener ) ((CalculatorParserListener)listener).enterPolinom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorParserListener ) ((CalculatorParserListener)listener).exitPolinom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorParserVisitor ) return ((CalculatorParserVisitor<? extends T>)visitor).visitPolinom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PolinomContext polinom() throws RecognitionException {
		PolinomContext _localctx = new PolinomContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_polinom);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(67);
					polinomtag();
					setState(68);
					match(OPADD);
					}
					} 
				}
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(75);
			polinomtag();
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

	public static class PolinomtagContext extends ParserRuleContext {
		public TerminalNode X() { return getToken(CalculatorParser.X, 0); }
		public List<TerminalNode> SZAM() { return getTokens(CalculatorParser.SZAM); }
		public TerminalNode SZAM(int i) {
			return getToken(CalculatorParser.SZAM, i);
		}
		public TerminalNode OPPWR() { return getToken(CalculatorParser.OPPWR, 0); }
		public PolinomtagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_polinomtag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorParserListener ) ((CalculatorParserListener)listener).enterPolinomtag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorParserListener ) ((CalculatorParserListener)listener).exitPolinomtag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorParserVisitor ) return ((CalculatorParserVisitor<? extends T>)visitor).visitPolinomtag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PolinomtagContext polinomtag() throws RecognitionException {
		PolinomtagContext _localctx = new PolinomtagContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_polinomtag);
		int _la;
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SZAM) {
					{
					setState(77);
					match(SZAM);
					}
				}

				setState(80);
				match(X);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPPWR) {
					{
					setState(81);
					match(OPPWR);
					setState(82);
					match(SZAM);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(SZAM);
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

	public static class SzamolasContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(CalculatorParser.SHOW, 0); }
		public List<TerminalNode> LPAR() { return getTokens(CalculatorParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(CalculatorParser.LPAR, i);
		}
		public PolinommuveletContext polinommuvelet() {
			return getRuleContext(PolinommuveletContext.class,0);
		}
		public PolinomxertekadasContext polinomxertekadas() {
			return getRuleContext(PolinomxertekadasContext.class,0);
		}
		public List<TerminalNode> RPAR() { return getTokens(CalculatorParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(CalculatorParser.RPAR, i);
		}
		public TerminalNode LBRACKET() { return getToken(CalculatorParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(CalculatorParser.RBRACKET, 0); }
		public SzamolasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_szamolas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorParserListener ) ((CalculatorParserListener)listener).enterSzamolas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorParserListener ) ((CalculatorParserListener)listener).exitSzamolas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorParserVisitor ) return ((CalculatorParserVisitor<? extends T>)visitor).visitSzamolas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SzamolasContext szamolas() throws RecognitionException {
		SzamolasContext _localctx = new SzamolasContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_szamolas);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(SHOW);
				setState(89);
				match(LPAR);
				setState(90);
				polinommuvelet();
				setState(91);
				polinomxertekadas();
				setState(92);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(SHOW);
				setState(95);
				polinommuvelet();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				match(SHOW);
				setState(97);
				match(LPAR);
				setState(98);
				match(LPAR);
				setState(99);
				polinommuvelet();
				setState(100);
				match(RPAR);
				setState(101);
				match(LBRACKET);
				setState(102);
				polinomxertekadas();
				setState(103);
				match(RBRACKET);
				setState(104);
				match(RPAR);
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

	public static class PolinommuveletContext extends ParserRuleContext {
		public List<TerminalNode> LPAR() { return getTokens(CalculatorParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(CalculatorParser.LPAR, i);
		}
		public List<TerminalNode> ID() { return getTokens(CalculatorParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CalculatorParser.ID, i);
		}
		public TerminalNode OPMUL() { return getToken(CalculatorParser.OPMUL, 0); }
		public List<TerminalNode> RPAR() { return getTokens(CalculatorParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(CalculatorParser.RPAR, i);
		}
		public TerminalNode OPADD() { return getToken(CalculatorParser.OPADD, 0); }
		public PolinomxertekadasContext polinomxertekadas() {
			return getRuleContext(PolinomxertekadasContext.class,0);
		}
		public List<PolinomContext> polinom() {
			return getRuleContexts(PolinomContext.class);
		}
		public PolinomContext polinom(int i) {
			return getRuleContext(PolinomContext.class,i);
		}
		public PolinommuveletContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_polinommuvelet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorParserListener ) ((CalculatorParserListener)listener).enterPolinommuvelet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorParserListener ) ((CalculatorParserListener)listener).exitPolinommuvelet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorParserVisitor ) return ((CalculatorParserVisitor<? extends T>)visitor).visitPolinommuvelet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PolinommuveletContext polinommuvelet() throws RecognitionException {
		PolinommuveletContext _localctx = new PolinommuveletContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_polinommuvelet);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(LPAR);
				setState(109);
				match(ID);
				setState(110);
				match(OPMUL);
				setState(111);
				match(ID);
				setState(112);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(LPAR);
				setState(114);
				match(ID);
				setState(115);
				match(OPADD);
				setState(116);
				match(ID);
				setState(117);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				match(LPAR);
				setState(119);
				match(ID);
				setState(120);
				match(OPMUL);
				setState(121);
				polinomxertekadas();
				setState(122);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				match(LPAR);
				setState(125);
				match(ID);
				setState(126);
				match(OPADD);
				setState(127);
				polinomxertekadas();
				setState(128);
				match(RPAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(130);
				match(LPAR);
				setState(131);
				polinom();
				setState(132);
				match(RPAR);
				setState(133);
				match(OPMUL);
				setState(134);
				match(LPAR);
				setState(135);
				polinom();
				setState(136);
				match(RPAR);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(138);
				match(LPAR);
				setState(139);
				polinom();
				setState(140);
				match(RPAR);
				setState(141);
				match(OPADD);
				setState(142);
				match(LPAR);
				setState(143);
				polinom();
				setState(144);
				match(RPAR);
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

	public static class PolinomxertekadasContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(CalculatorParser.LBRACKET, 0); }
		public TerminalNode SZAM() { return getToken(CalculatorParser.SZAM, 0); }
		public TerminalNode RBRACKET() { return getToken(CalculatorParser.RBRACKET, 0); }
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public PolinomxertekadasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_polinomxertekadas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorParserListener ) ((CalculatorParserListener)listener).enterPolinomxertekadas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorParserListener ) ((CalculatorParserListener)listener).exitPolinomxertekadas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorParserVisitor ) return ((CalculatorParserVisitor<? extends T>)visitor).visitPolinomxertekadas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PolinomxertekadasContext polinomxertekadas() throws RecognitionException {
		PolinomxertekadasContext _localctx = new PolinomxertekadasContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_polinomxertekadas);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(LBRACKET);
				setState(149);
				match(SZAM);
				setState(150);
				match(RBRACKET);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(ID);
				setState(152);
				match(LBRACKET);
				setState(153);
				match(SZAM);
				setState(154);
				match(RBRACKET);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24\u00a0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3"+
		"\2\3\2\7\2\30\n\2\f\2\16\2\33\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3&\n\3\3\4\3\4\3\4\3\4\5\4,\n\4\3\4\3\4\5\4\60\n\4\3\5\3\5\3\5\3\5"+
		"\3\5\7\5\67\n\5\f\5\16\5:\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5D\n"+
		"\5\3\6\3\6\3\6\7\6I\n\6\f\6\16\6L\13\6\3\6\3\6\3\7\5\7Q\n\7\3\7\3\7\3"+
		"\7\5\7V\n\7\3\7\5\7Y\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bm\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0095\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\n\u009e\n\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\2"+
		"\2\u00aa\2\31\3\2\2\2\4%\3\2\2\2\6/\3\2\2\2\bC\3\2\2\2\nJ\3\2\2\2\fX\3"+
		"\2\2\2\16l\3\2\2\2\20\u0094\3\2\2\2\22\u009d\3\2\2\2\24\25\5\4\3\2\25"+
		"\26\7\3\2\2\26\30\3\2\2\2\27\24\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31"+
		"\32\3\2\2\2\32\3\3\2\2\2\33\31\3\2\2\2\34\35\5\6\4\2\35\36\7\24\2\2\36"+
		"&\3\2\2\2\37 \5\b\5\2 !\7\24\2\2!&\3\2\2\2\"#\5\16\b\2#$\7\24\2\2$&\3"+
		"\2\2\2%\34\3\2\2\2%\37\3\2\2\2%\"\3\2\2\2&\5\3\2\2\2\'(\7\5\2\2(+\7\23"+
		"\2\2)*\7\22\2\2*,\7\23\2\2+)\3\2\2\2+,\3\2\2\2,\60\3\2\2\2-.\7\6\2\2."+
		"\60\7\23\2\2/\'\3\2\2\2/-\3\2\2\2\60\7\3\2\2\2\61\62\7\23\2\2\62\63\7"+
		"\n\2\2\638\7\t\2\2\64\65\7\13\2\2\65\67\7\t\2\2\66\64\3\2\2\2\67:\3\2"+
		"\2\28\66\3\2\2\289\3\2\2\29D\3\2\2\2:8\3\2\2\2;<\7\23\2\2<=\7\n\2\2=D"+
		"\5\n\6\2>?\7\23\2\2?@\7\n\2\2@A\7\b\2\2AB\7\13\2\2BD\7\23\2\2C\61\3\2"+
		"\2\2C;\3\2\2\2C>\3\2\2\2D\t\3\2\2\2EF\5\f\7\2FG\7\13\2\2GI\3\2\2\2HE\3"+
		"\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MN\5\f\7\2N\13"+
		"\3\2\2\2OQ\7\t\2\2PO\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RU\7\b\2\2ST\7\r\2\2T"+
		"V\7\t\2\2US\3\2\2\2UV\3\2\2\2VY\3\2\2\2WY\7\t\2\2XP\3\2\2\2XW\3\2\2\2"+
		"Y\r\3\2\2\2Z[\7\7\2\2[\\\7\16\2\2\\]\5\20\t\2]^\5\22\n\2^_\7\17\2\2_m"+
		"\3\2\2\2`a\7\7\2\2am\5\20\t\2bc\7\7\2\2cd\7\16\2\2de\7\16\2\2ef\5\20\t"+
		"\2fg\7\17\2\2gh\7\20\2\2hi\5\22\n\2ij\7\21\2\2jk\7\17\2\2km\3\2\2\2lZ"+
		"\3\2\2\2l`\3\2\2\2lb\3\2\2\2m\17\3\2\2\2no\7\16\2\2op\7\23\2\2pq\7\f\2"+
		"\2qr\7\23\2\2r\u0095\7\17\2\2st\7\16\2\2tu\7\23\2\2uv\7\13\2\2vw\7\23"+
		"\2\2w\u0095\7\17\2\2xy\7\16\2\2yz\7\23\2\2z{\7\f\2\2{|\5\22\n\2|}\7\17"+
		"\2\2}\u0095\3\2\2\2~\177\7\16\2\2\177\u0080\7\23\2\2\u0080\u0081\7\13"+
		"\2\2\u0081\u0082\5\22\n\2\u0082\u0083\7\17\2\2\u0083\u0095\3\2\2\2\u0084"+
		"\u0085\7\16\2\2\u0085\u0086\5\n\6\2\u0086\u0087\7\17\2\2\u0087\u0088\7"+
		"\f\2\2\u0088\u0089\7\16\2\2\u0089\u008a\5\n\6\2\u008a\u008b\7\17\2\2\u008b"+
		"\u0095\3\2\2\2\u008c\u008d\7\16\2\2\u008d\u008e\5\n\6\2\u008e\u008f\7"+
		"\17\2\2\u008f\u0090\7\13\2\2\u0090\u0091\7\16\2\2\u0091\u0092\5\n\6\2"+
		"\u0092\u0093\7\17\2\2\u0093\u0095\3\2\2\2\u0094n\3\2\2\2\u0094s\3\2\2"+
		"\2\u0094x\3\2\2\2\u0094~\3\2\2\2\u0094\u0084\3\2\2\2\u0094\u008c\3\2\2"+
		"\2\u0095\21\3\2\2\2\u0096\u0097\7\20\2\2\u0097\u0098\7\t\2\2\u0098\u009e"+
		"\7\21\2\2\u0099\u009a\7\23\2\2\u009a\u009b\7\20\2\2\u009b\u009c\7\t\2"+
		"\2\u009c\u009e\7\21\2\2\u009d\u0096\3\2\2\2\u009d\u0099\3\2\2\2\u009e"+
		"\23\3\2\2\2\17\31%+/8CJPUXl\u0094\u009d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}