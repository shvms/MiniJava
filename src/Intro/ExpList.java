package Intro;

public abstract class ExpList {
    public Exp exp;

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

    /**
     * Gets the next ExpList in the ExpList instance.
     * @return Next ExpList
     */
    abstract public ExpList next();
}
