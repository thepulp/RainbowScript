// Generated from C:/Users/HP/IdeaProjects/EjemploBaseGramatica-Armando\Grammar.g4 by ANTLR 4.9.2


    import java.util.Map;
    import java.util.HashMap;
    import java.util.List;
    import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(GrammarParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(GrammarParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(GrammarParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(GrammarParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#var_assing}.
	 * @param ctx the parse tree
	 */
	void enterVar_assing(GrammarParser.Var_assingContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#var_assing}.
	 * @param ctx the parse tree
	 */
	void exitVar_assing(GrammarParser.Var_assingContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(GrammarParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(GrammarParser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(GrammarParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(GrammarParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#cyclical}.
	 * @param ctx the parse tree
	 */
	void enterCyclical(GrammarParser.CyclicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cyclical}.
	 * @param ctx the parse tree
	 */
	void exitCyclical(GrammarParser.CyclicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#docyclical}.
	 * @param ctx the parse tree
	 */
	void enterDocyclical(GrammarParser.DocyclicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#docyclical}.
	 * @param ctx the parse tree
	 */
	void exitDocyclical(GrammarParser.DocyclicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#square}.
	 * @param ctx the parse tree
	 */
	void enterSquare(GrammarParser.SquareContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#square}.
	 * @param ctx the parse tree
	 */
	void exitSquare(GrammarParser.SquareContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#pow}.
	 * @param ctx the parse tree
	 */
	void enterPow(GrammarParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#pow}.
	 * @param ctx the parse tree
	 */
	void exitPow(GrammarParser.PowContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(GrammarParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(GrammarParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(GrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(GrammarParser.TermContext ctx);
}