

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;

public class Json {
    static final String json = """
            {
                "string": "Hello, world!",
                "number": 42,
                "boolean": true,
                "null": null,
                "array": [
                1,
                    {
                        "property1": "value1",
                        "property2": "value2",
                        "object1": {
                            "hello": "world",
                            "property2": "value2"
                        }
                    }
                ],
                "object0": {
                    "property1": "value1",
                    "property2": "value2",
                    "object1": {
                        "hello": "world",
                        "property2": "value2"
                    }
                },
                "unicode": "é",
                "escape": "\\"\\\\/\\\\b\\\\f\\\\n\\\\r\\\\t",
                "url": "https:\\/\\/www.example.com\\/",
                "date": "2023-05-31T12:34:56Z"
            }
            """;

    public static void main(String[] args) throws IOException {

        JSONParser.ObjContext objContext = parse();

        JSONObject root = new JSONObject(objContext);

        StringTest(root, "string");

        ObjetcTest(root);
        ObjetcTest(root);
        ObjetcTest(root);


        JSONArray array = root.getJSONArray("array");
        JSONObject object = array.getJSONObject(1);
        String string = object.getJSONObject("object1").getString("hello");
        System.out.println(string);
    }

    private static JSONObject ObjetcTest(JSONObject root) {
        JSONObject object0 = root.getJSONObject("object0");

        JSONObject object1 = object0.getJSONObject("object1");

        System.out.println(object1.getString("property2"));
        return object1;
    }

    private static void StringTest(JSONObject root, String key) {
        String string = root.getString(key);// Hello, world!
        System.out.println(string);
    }

    public static JSONParser.ObjContext parse() {
        JSONLexer lexer = new JSONLexer(CharStreams.fromString(json));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JSONParser parser = new JSONParser(tokens);
//        ParseTree tree = parser.json();
//        System.out.println(tree.toStringTree(parser));
        return parser.obj();
    }

    static class JsonListener extends JSONBaseListener {
        @Override
        public void enterJson(JSONParser.JsonContext ctx) {
            System.out.println("enterJson");
        }

        @Override
        public void exitJson(JSONParser.JsonContext ctx) {
            System.out.println("exitJson");
        }

        @Override
        public void enterObj(JSONParser.ObjContext ctx) {
            System.out.println("enterObj");
        }

        @Override
        public void exitObj(JSONParser.ObjContext ctx) {
            System.out.println("exitObj");
        }

        @Override
        public void enterPair(JSONParser.PairContext ctx) {
            System.out.println("enterPair");
        }

        @Override
        public void exitPair(JSONParser.PairContext ctx) {
            System.out.println("exitPair");
        }

        @Override
        public void enterArr(JSONParser.ArrContext ctx) {
            super.enterArr(ctx);
        }

        @Override
        public void exitArr(JSONParser.ArrContext ctx) {
            super.exitArr(ctx);
        }

        @Override
        public void enterValue(JSONParser.ValueContext ctx) {
            super.enterValue(ctx);
        }

        @Override
        public void exitValue(JSONParser.ValueContext ctx) {
            super.exitValue(ctx);
        }

        @Override
        public void enterEveryRule(ParserRuleContext ctx) {
            super.enterEveryRule(ctx);
        }

        @Override
        public void exitEveryRule(ParserRuleContext ctx) {
            super.exitEveryRule(ctx);
        }

        @Override
        public void visitTerminal(TerminalNode node) {
            super.visitTerminal(node);
        }

        @Override
        public void visitErrorNode(ErrorNode node) {
            super.visitErrorNode(node);
        }
    }

}
