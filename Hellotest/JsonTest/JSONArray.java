

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class JSONArray {
    private List<Object> list = new LinkedList<>();


    private final static AtomicInteger atomicInteger = new AtomicInteger(0);

    public JSONArray() {
        this.list = new ArrayList<>();
    }

    public JSONArray(List<JSONObject> list) {
        this.list = new ArrayList<>(list.size());
        this.list.addAll(list);
    }

    protected JSONArray(JSONParser.ArrContext arrayCtx) {
        long currentTimeMillis = System.currentTimeMillis();
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
        System.out.printf("Arr time: %d,(%s)\n", System.currentTimeMillis() - currentTimeMillis, atomicInteger.incrementAndGet());
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

    public void add(Object obj) {
        list.add(obj);
    }

    public String getString(int index) {
        Object o = list.get(index);
        if (o instanceof String) {
            return (String) o;
        } else if (o instanceof JSONParser.ValueContext ctx) {
            String newValue = ctx.STRING().getText();
            String substring = newValue.substring(1, newValue.length() - 1);
            list.set(index, substring);
            return substring;
        }
        return null;
    }

    public int getInt(int index) {
        Object o = list.get(index);
        if (o == null) {
            return 0;
        }
        if (o instanceof String str) {
            int parsedInt = Integer.parseInt(str);
            list.set(index, parsedInt);
            return parsedInt;
        } else if (o instanceof JSONParser.ValueContext ctx) {
            String newValue = ctx.STRING().getText();
            String substring = newValue.substring(1, newValue.length() - 1);
            list.set(index, substring);
            return getInt(index);
        }
        return 0;
    }

    public long getLong(int index) {
        Object o = list.get(index);
        if (o == null) {
            return 0;
        }
        if (o instanceof String str) {
            long parseLong = Long.parseLong(str);
            list.set(index, parseLong);
            return parseLong;
        } else if (o instanceof JSONParser.ValueContext ctx) {
            String newValue = ctx.STRING().getText();
            String substring = newValue.substring(1, newValue.length() - 1);
            list.set(index, substring);
            return getLong(index);
        }
        return 0;
    }

    public double getDouble(int index) {
        Object o = list.get(index);
        if (o == null) {
            return 0.0;
        }
        if (o instanceof String str) {
            double parseDouble = Double.parseDouble(str);
            list.set(index, parseDouble);
            return parseDouble;
        } else if (o instanceof JSONParser.ValueContext ctx) {
            String newValue = ctx.STRING().getText();
            String substring = newValue.substring(1, newValue.length() - 1);
            list.set(index, substring);
            return getDouble(index);
        }
        return 0.0;
    }

    public boolean getBoolean(int index) {
        Object o = list.get(index);
        if (o == null) {
            return false;
        }
        if (o instanceof Boolean b) {
            return b;
        }
        if (o instanceof String str) {
            boolean parseBoolean = Boolean.parseBoolean(str);
            list.set(index, parseBoolean);
            return parseBoolean;
        }
        if (o instanceof JSONParser.ValueContext ctx) {
            String newValue = ctx.STRING().getText();
            String substring = newValue.substring(1, newValue.length() - 1);
            list.set(index, substring);
            return getBoolean(index);
        }

        return false;
    }

    public JSONArray getJSONArray(int index) {

        Object o = list.get(index);
        if (o == null) {
            return null;
        }
        if (o instanceof JSONArray array) {
            return array;
        } else if (o instanceof JSONParser.ValueContext ctx) {
            JSONArray jsonArray = new JSONArray(ctx.arr());
            list.add(index, jsonArray);
            return jsonArray;
        }
        System.out.println("getJSONArray error");
        return null;
    }

    @Override
    public String toString() {
        return toJSONString();
    }

    public String toJSONString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        List<String> strList = list.stream().map(Object::toString).collect(Collectors.toList());
//                list.stream().map(JSONObject::toString).collect(Collectors.toList());
        sb.append(String.join(",", strList));
        sb.append("]");
        return sb.toString();
    }
}

