import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) {
        try {
            CharStream cs = fromFileName("tests/2.cpp");  //load the file
            CppLexer lexer = new CppLexer(cs);  //instantiate a lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
            CppParser parser = new CppParser(tokens);  //parse the tokens

            ParseTree tree = parser.s(); // parse the content and get the tree
            Path path = Path.of("html/2.html");
            try (BufferedWriter writer = Files.newBufferedWriter(path)) {
                Visitor visitor = new Visitor();
                writer.write(visitor.visit(tree).toString());
            }
        } catch (IOException | UncheckedIOException e) {
            e.printStackTrace();
        }
    }
}