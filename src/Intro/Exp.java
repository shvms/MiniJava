package Intro;

public abstract class Exp {
    /**
     * Any expression might contain `print` statement. This method
     * helps in finding the maximum number of arguments supplied to
     * `print` statement inside this `Exp`. Uses recursive version of depth
     * first search on the parse tree.
     * @return Maximum number of arguments of print statement
     */
    abstract public int maxargs();
}
