package Intro;

/**
 * Table for managing updates in variables/identifiers
 */
public class Table {
    String id;
    int val;
    Table tail;

    public Table(String i, int v, Table t) {
        id = i;
        val = v;
        tail = t;
    }

    /**
     * Updates an identifier value in the table.
     * Does this by adding a new table entry for the identifier.
     * @param key   Identifier
     * @param v     Updated value
     */
    public Table update(String key, int v) {
        return new Table(key, v, this);
    }

    /**
     * Searches for identifier `key` in the table. First one is the
     * updated identifier value.
     * @param key   Identifier to search for in the table
     * @return      Value attached with the identifier
     * @throws IdentifierNotDefinedException    When an identifier is not yet declared
     */
    public int lookup(String key) throws IdentifierNotDefinedException {
        if (key.equals(id))
            return val;

        if (tail == null)
            throw new IdentifierNotDefinedException(key);

        return tail.lookup(key);
    }

    /**
     * Prints the symbol table
     */
    public void printTable() {
        Table curr = this;
        while (curr != null) {
            System.out.println(curr.id + " = " + curr.val);
            curr = curr.tail;
        }
    }
}

class IdentifierNotDefinedException extends Exception {
    public IdentifierNotDefinedException(String id) {
        super("Identifier '" + id + "' not declared.");
    }
}