package utils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Utils {
    public static String stringifyHashMap(Map map) {
        String result = "";
        for (Object name : map.keySet()) {
            String key = name.toString();
            String value = map.get(name).toString();
            result = result + key + " " + value + "\n";
        }

        return result;
    }

    public static String stringifyList(List list) {
        return Arrays.asList(list).toString();
    }
}