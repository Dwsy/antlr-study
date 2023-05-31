import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class JSONObject {

    private final Map<String, Object> keyMap = new ConcurrentHashMap<>();

    private final Map<String, JSONObject> objectMap = new HashMap<>();
    private final Map<String, JSONArray> arrMap = new HashMap<>();

    private final static AtomicInteger atomicInteger = new AtomicInteger(0);


    protected JSONObject(JSONParser.ObjContext objCtx) {
        List<JSONParser.PairContext> pair = objCtx.pair();
        long currentTimeMillis = System.currentTimeMillis();
        Stream<JSONParser.PairContext> parallelStream = pair.parallelStream();
        Stream<JSONParser.PairContext> stream = pair.stream();
        stream.forEach(pairCtx -> {
            String key = pairCtx.STRING().getText();
            JSONParser.ValueContext value = pairCtx.value();

            keyMap.put(key.substring(1, key.length() - 1), value);
//            System.out.printf("key: %s\n", key);
        });
//        System.out.println("keyMap.size(): " + keyMap.size());
        System.out.printf("time: %d,(%s)\n", System.currentTimeMillis() - currentTimeMillis, atomicInteger.incrementAndGet());
    }

    public JSONObject getJSONObject(String key) {
        Object o = keyMap.get(key);
        if (o == null) {
            return null;
        }
        if (o instanceof JSONParser.ValueContext value) {
            JSONObject jsonObject;
            jsonObject = objectMap.get(key);
            if (jsonObject != null) {
                return jsonObject;
            }
            JSONParser.ObjContext obj = value.obj();
//            if (obj == null) {
//                return null;
//            }
            jsonObject = new JSONObject(obj);
            objectMap.put(key, jsonObject);
            return jsonObject;
        }


//        JSONParser.ValueContext value = (JSONParser.ValueContext) keyMap.get(key);
//        if (value == null) {
//            return null;
//        }
//
//        JSONObject object = objectMap.get(key);
//        if (object != null) {
//            return object;
//        }
//        JSONObject jsonObject = new JSONObject(value.obj());
//        objectMap.put(key, jsonObject);
//        return jsonObject;

        return null;
    }

    public String getString(String key){
        return getString(key, false);

    }
    public String getString(String key,boolean getBoolean) {
        Object value = keyMap.get(key);
        if (value == null) {
            return null;
        }
        if (value instanceof JSONParser.ValueContext valueContext) {

            List<ParseTree> children = valueContext.children;
            if (children.size() == 1) {
                if (children.get(0) instanceof TerminalNode terminalNode) {
                    String text = terminalNode.getText();
                    if (text.equals("null")) {
                        return null;
                    }
                    if (text.equals("true")) {
                        if (getBoolean)
                            return "true";
                        else return "null";
                    }
                    if (text.equals("false")) {
                        if (getBoolean)
                            return "false";
                        else return "null";
                    }
                    keyMap.put(key, text);
                }
            } else {
                String newValue = valueContext.STRING().getText();
                keyMap.put(key, newValue.substring(1, newValue.length() - 1));
            }


//            ctx.children.size()

        }
        return (String) keyMap.get(key);
    }

    public int getInt(String key) {

        String value = getString(key);
        if (value == null || "".equals(value)) {
            return 0;
        }
        return Integer.parseInt(value);
    }

    public long getLong(String key) {
        String value = getString(key);
        if (value == null || "".equals(value)) {
            return 0L;
        }
        return Long.parseLong(value);
    }

    public double getDouble(String key) {
        String value = getString(key);
        if (value == null || "".equals(value)) {
            return 0.0;
        }
        return Double.parseDouble(value);
    }

    public boolean getBoolean(String key) {
        String value = getString(key,true);
        if (value == null || "".equals(value)) {
            return false;
        }
        return Boolean.parseBoolean(value);
    }

    public JSONArray getJSONArray(String key) {
        Object o = keyMap.get(key);
        if (o == null) {
            return null;
        }
        if (o instanceof JSONParser.ValueContext value) {
            JSONArray jsonArray;
            jsonArray = arrMap.get(key);
            if (jsonArray != null) {
                return jsonArray;
            }
            jsonArray = new JSONArray(value.arr());
            arrMap.put(key, jsonArray);
            return jsonArray;
        }
        return null;
    }

    public void put(String key, Object object) {
        keyMap.put(key, object);
    }

    public static JSONObject parseObject(String text) {
        JSONLexer lexer = new JSONLexer(CharStreams.fromString(text));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JSONParser parser = new JSONParser(tokens);
        JSONParser.ObjContext objCtx = parser.obj();
        return new JSONObject(objCtx);
    }

    public static JSONArray parseArray(String text) {
        if (text == null) {
            return null;
        }
        return JSONArray.parseArray(text);
    }
}

