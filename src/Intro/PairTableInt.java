package Intro;

/**
 * Data structure for interpreted expression return value.
 * Packs both the table and the return value.
 * Sucks that Java does not support Pair natively :(
 */
public class PairTableInt {
    int retVal;
    Table table;

    public PairTableInt(int rv, Table t) {
        retVal = rv;
        table = t;
    }
}
