// Generated from D:/msc/fordproggyak/kodok/kotprog\CalculatorParser.g4 by ANTLR 4.9.1

    import java.util.ArrayList;
    import java.util.List;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculatorParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(CalculatorParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#sor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSor(CalculatorParser.SorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#deklaracio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeklaracio(CalculatorParser.DeklaracioContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#ertekadas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErtekadas(CalculatorParser.ErtekadasContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#polinom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolinom(CalculatorParser.PolinomContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#polinomtag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolinomtag(CalculatorParser.PolinomtagContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#szamolas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSzamolas(CalculatorParser.SzamolasContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#polinommuvelet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolinommuvelet(CalculatorParser.PolinommuveletContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#polinomxertekadas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolinomxertekadas(CalculatorParser.PolinomxertekadasContext ctx);
}