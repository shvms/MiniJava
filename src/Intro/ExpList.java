package Intro;

public abstract class ExpList {
    /**
     * Finds maximum number of arguments of any `print` statement within any
     * expressions of ExpList. Follows a recursive depth first search approach
     * on the parse tree.
     * @return Maximum number of arguments in `print` statement
     */
    abstract public int maxargs();

    /**
     * Recursive implementation to compute size of the ExpList
     * @return length of ExpList
     */
    abstract public int length();
}
