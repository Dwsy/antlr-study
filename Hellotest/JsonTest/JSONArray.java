

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JSONArray {
    private List<Object> list = new ArrayList<>();;

    public JSONArray() {
        this.list = new ArrayList<>();
    }
    public JSONArray(List<JSONObject> list) {
        this.list = new ArrayList<>(list.size());
        this.list.addAll(list);
    }

    protected JSONArray(JSONParser.ArrContext arrayCtx) {
        for (JSONParser.ValueContext valueContext : arrayCtx.value()) {
            for (ParseTree child : valueContext.children) {
                if (child instanceof JSONParser.ObjContext objCtx) {
                    list.add(new JSONObject(objCtx));
                }
                if (child instanceof JSONParser.ArrContext arrCtx) {
                    list.add(new JSONArray(arrCtx));
                }
//                if (child instanceof JSONParser.ValueContext valueCtx) {
//                    list.add(valueCtx.getText());
//                }
                if (child instanceof TerminalNode terminalNode) {
                    list.add(terminalNode.getText());
                }
            }
        }
//        this.list = arrayCtx.value()
//                .stream()
//                .map(valueContext -> new JSONObject(valueContext.obj()))
//                .collect(Collectors.toList());
    }

    public static JSONArray parseArray(String text) {
        JSONLexer lexer = new JSONLexer(CharStreams.fromString(text));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JSONParser parser = new JSONParser(tokens);
        JSONParser.ArrContext arrayCtx = parser.arr();
        return new JSONArray(arrayCtx);
    }

    public JSONObject getJSONObject(int index) {
        return (JSONObject) list.get(index);
    }

    public void add(JSONObject jsonObject) {
        list.add(jsonObject);
    }

    @Override
    public String toString() {
        return toJSONString();
    }

    public String toJSONString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        List<String> strList= list.stream().map(Object::toString).collect(Collectors.toList());
//                list.stream().map(JSONObject::toString).collect(Collectors.toList());
        sb.append(String.join(",", strList));
        sb.append("]");
        return sb.toString();
    }
}

