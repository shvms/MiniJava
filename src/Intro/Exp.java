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

    /**
     * Interprets the expression. Recursively traverses the parse tree evaluating each
     * leaf and combining results accordingly.
     * @param t     Symbol table
     * @return      Pair of updated symbol table & return value
     * @throws Exception When identifier not declared, divide by zero or invalid binary operator
     */
    abstract public PairTableInt interpExp(Table t) throws Exception;
}
