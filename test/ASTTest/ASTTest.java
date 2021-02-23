package ASTTest;

import AST.MiniJavaParser;
import AST.ParseException;
import AST.PrettyPrintVisitor;
import AST.SimpleNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ASTTest {
    final static String BASE_PATH = "test/TestPrograms";

    private boolean checkParseError(InputStream inputStream) {
        try {
            MiniJavaParser minij = new MiniJavaParser(inputStream);
            SimpleNode n = minij.Program();

            PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
            n.jjtAccept(prettyPrintVisitor, null);
            return true;
        } catch (ParseException e) {
            System.out.println(e.toString());
            return false;
        }
    }

    @Test
    public void testProgramFactorial() throws IOException {
        final String path = BASE_PATH + "/Factorial.minij";

        InputStream inputStream = new FileInputStream(path);
        Assertions.assertTrue(checkParseError(inputStream));
    }

    @Test
    public void testProgramBinarySearch() throws IOException {
        final String path = BASE_PATH + "/BinarySearch.minij";

        InputStream inputStream = new FileInputStream(path);
        Assertions.assertTrue(checkParseError(inputStream));
    }

    @Test
    public void testProgramBubbleSort() throws IOException {
        final String path = BASE_PATH + "/BubbleSort.minij";

        InputStream inputStream = new FileInputStream(path);
        Assertions.assertTrue(checkParseError(inputStream));
    }

    @Test
    public void testProgramTreeVisitor() throws IOException {
        final String path = BASE_PATH + "/TreeVisitor.minij";

        InputStream inputStream = new FileInputStream(path);
        Assertions.assertTrue(checkParseError(inputStream));
    }

    @Test
    public void testProgramQuickSort() throws IOException {
        final String path = BASE_PATH + "/QuickSort.minij";

        InputStream inputStream = new FileInputStream(path);
        Assertions.assertTrue(checkParseError(inputStream));
    }

    @Test
    public void testProgramLinearSearch() throws IOException {
        final String path = BASE_PATH + "/LinearSearch.minij";

        InputStream inputStream = new FileInputStream(path);
        Assertions.assertTrue(checkParseError(inputStream));
    }

    @Test
    public void testProgramLinkedList() throws IOException {
        final String path = BASE_PATH + "/LinkedList.minij";

        InputStream inputStream = new FileInputStream(path);
        Assertions.assertTrue(checkParseError(inputStream));
    }

    @Test
    public void testProgramBinaryTree() throws IOException {
        final String path = BASE_PATH + "/BinaryTree.minij";

        InputStream inputStream = new FileInputStream(path);
        Assertions.assertTrue(checkParseError(inputStream));
    }
}