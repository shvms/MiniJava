package SemanticAnalysis;

public class DuplicateException extends RuntimeException {
    public DuplicateException(String item) {
        super("'" + item + "' redefined");
    }
}
