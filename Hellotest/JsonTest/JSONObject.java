import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

public class JSONObject {

    private final Map<String, Object> keyMap = new ConcurrentHashMap<>();

    private final Map<String, JSONObject> objectMap = new HashMap<>();
    private final Map<String, JSONArray> arrMap = new HashMap<>();


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
        System.out.printf("time: %d\n", System.currentTimeMillis() - currentTimeMillis);
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
            jsonObject = new JSONObject(value.obj());
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

    public String getString(String key) {
        Object value = keyMap.get(key);
        if (value == null) {
            return null;
        }
        if (value instanceof JSONParser.ValueContext ctx) {
            String newValue = ctx.STRING().getText();
            keyMap.put(key, newValue.substring(1, newValue.length() - 1));
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

