

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;

public class Json {
    public static void main(String[] args) throws IOException {
        var json="{\"name\":\"name\",\"age\":18}";
        ANTLRInputStream antlrInputStream = new ANTLRInputStream(json);

        JSONLexer lexer = new JSONLexer(antlrInputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        JSONParser parser = new JSONParser(commonTokenStream);
        ParseTree tree = parser.json();
        System.out.println(tree.toStringTree(parser));

    }
}
