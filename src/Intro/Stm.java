package Intro;

public abstract class Stm {
    /**
     * Finds maximum number of arguments of any `print` statement within any
     * subexpression of a given statement using recursive depth first search approach
     * in the parse tree.
     * @return Maximum number of arguments in `print` statement
     */
    abstract public int maxargs();
}
