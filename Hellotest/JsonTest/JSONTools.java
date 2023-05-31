import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class JSONTools {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        User user = JSONTools.parse("""
                {
                    "name": "张三",
                    "age": 18,
                    "girlfriend":{
                        "name": "王五",
                        "age": 20,
                        "girlfriend":null
                    }
                }""", User.class);

        System.out.println(user);

        System.out.println("--------");
        System.out.println(JSONTools.toJSONString(user));
    }

    public static JSONObject parse(String jsonStr) {
        return new JSONObject(Json.parse(jsonStr));
    }

    public static <C> C parse(String jsonStr, Class<C> clazz) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        JSONObject jsonObject = parse(jsonStr);

        C instance = clazz.getDeclaredConstructor().newInstance();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {

            Class<?> fieldType = fieldHandel(jsonObject, instance, field);

        }

        return instance;
    }

    private static <C> Class<?> fieldHandel(JSONObject jsonObject, C instance, Field field) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> fieldType = field.getType();
        if (fieldType.isPrimitive() || Number.class.isAssignableFrom(fieldType)|| String.class.isAssignableFrom(fieldType)
                || Boolean.class.isAssignableFrom(fieldType) || Character.class.isAssignableFrom(fieldType)) {
            // 字段类型是基本类型或者其对应的包装类
            if (fieldType == String.class) {
                String name = field.getName();
                String value = jsonObject.getString(name);
                field.setAccessible(true);

                try {
                    field.set(instance, value);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            if (fieldType == int.class) {
                String name = field.getName();
                int value = jsonObject.getInt(name);
                field.setAccessible(true);
                try {
                    field.set(instance, value);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            if (fieldType == boolean.class) {
                String name = field.getName();
                boolean value = jsonObject.getBoolean(name);
                field.setAccessible(true);
                try {
                    field.set(instance, value);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        } else {
            // 字段类型是引用类型（类对象）
            if (fieldType instanceof Object) {
                System.out.println("Object.class");

                String name = field.getName();
                JSONObject nestObjectJSONObject;
                try {
                    nestObjectJSONObject = jsonObject.getJSONObject(name);
                }catch (Exception e){
                    System.out.println("没有这个字段");
                    return fieldType;
                }
                Object newNestObj = fieldType.getDeclaredConstructor().newInstance();
                Field[] nestObjDeclaredFields = newNestObj.getClass().getDeclaredFields();
                for (Field nestObjDeclaredField : nestObjDeclaredFields) {
                    fieldHandel(nestObjectJSONObject, newNestObj, nestObjDeclaredField);
                }
                field.setAccessible(true);
                try {
//                    User user = new User();
//                    user.setAge(19);
//                    user.setName("lisi");
                    field.set(instance, newNestObj);
//                    field.set(instance, newNestObj);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        return fieldType;
    }

    public static String toJSONString(Object object) {
        Field[] fields = object.getClass().getDeclaredFields();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        for (Field field : fields) {
            field.setAccessible(true);
            Class<?> fieldType = field.getType();
            if (fieldType == String.class) {
                String name = field.getName();
                String value = null;
                try {
                    value = (String) field.get(object);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                stringBuilder.append("\"").append(name).append("\"").append(":").append("\"").append(value).append("\"").append(",");
            }
            if (fieldType == int.class) {
                String name = field.getName();
                int value = 0;
                try {
                    value = (int) field.get(object);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                stringBuilder.append("\"").append(name).append("\"").append(":").append(value).append(",");
            }
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

}
