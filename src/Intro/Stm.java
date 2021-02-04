package Intro;

public abstract class Stm {
    /**
     * Finds maximum number of arguments of any `print` statement within any
     * subexpression of a given statement using recursive depth first search approach
     * in the parse tree.
     * @return Maximum number of arguments in `print` statement
     */
    abstract public int maxargs();

    /**
     * Interprets the statement. Recursively traverses the parse tree evaluating each
     * leaf and combining results accordingly.
     * @param t     Symbol table
     * @return      Updated symbol table
     * @throws Exception When identifier not declared, divide by zero or invalid binary operator
     */
    abstract public Table interpStm(Table t) throws Exception;
}
