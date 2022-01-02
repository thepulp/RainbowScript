// Generated from C:/Users/HP/IdeaProjects/EjemploBaseGramatica-Armando\Grammar.g4 by ANTLR 4.9.2


    import java.util.Map;
    import java.util.HashMap;
    import java.util.List;
    import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(GrammarParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(GrammarParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#var_assing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_assing(GrammarParser.Var_assingContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(GrammarParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(GrammarParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#cyclical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCyclical(GrammarParser.CyclicalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#docyclical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocyclical(GrammarParser.DocyclicalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#square}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSquare(GrammarParser.SquareContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#pow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(GrammarParser.PowContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(GrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(GrammarParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(GrammarParser.TermContext ctx);
}