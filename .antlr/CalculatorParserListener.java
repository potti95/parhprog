// Generated from D:/msc/fordproggyak/kodok/kotprog\CalculatorParser.g4 by ANTLR 4.9.1

    import java.util.ArrayList;
    import java.util.List;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(CalculatorParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(CalculatorParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#sor}.
	 * @param ctx the parse tree
	 */
	void enterSor(CalculatorParser.SorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#sor}.
	 * @param ctx the parse tree
	 */
	void exitSor(CalculatorParser.SorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#deklaracio}.
	 * @param ctx the parse tree
	 */
	void enterDeklaracio(CalculatorParser.DeklaracioContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#deklaracio}.
	 * @param ctx the parse tree
	 */
	void exitDeklaracio(CalculatorParser.DeklaracioContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#ertekadas}.
	 * @param ctx the parse tree
	 */
	void enterErtekadas(CalculatorParser.ErtekadasContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#ertekadas}.
	 * @param ctx the parse tree
	 */
	void exitErtekadas(CalculatorParser.ErtekadasContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#polinom}.
	 * @param ctx the parse tree
	 */
	void enterPolinom(CalculatorParser.PolinomContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#polinom}.
	 * @param ctx the parse tree
	 */
	void exitPolinom(CalculatorParser.PolinomContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#polinomtag}.
	 * @param ctx the parse tree
	 */
	void enterPolinomtag(CalculatorParser.PolinomtagContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#polinomtag}.
	 * @param ctx the parse tree
	 */
	void exitPolinomtag(CalculatorParser.PolinomtagContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#szamolas}.
	 * @param ctx the parse tree
	 */
	void enterSzamolas(CalculatorParser.SzamolasContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#szamolas}.
	 * @param ctx the parse tree
	 */
	void exitSzamolas(CalculatorParser.SzamolasContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#polinommuvelet}.
	 * @param ctx the parse tree
	 */
	void enterPolinommuvelet(CalculatorParser.PolinommuveletContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#polinommuvelet}.
	 * @param ctx the parse tree
	 */
	void exitPolinommuvelet(CalculatorParser.PolinommuveletContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#polinomxertekadas}.
	 * @param ctx the parse tree
	 */
	void enterPolinomxertekadas(CalculatorParser.PolinomxertekadasContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#polinomxertekadas}.
	 * @param ctx the parse tree
	 */
	void exitPolinomxertekadas(CalculatorParser.PolinomxertekadasContext ctx);
}