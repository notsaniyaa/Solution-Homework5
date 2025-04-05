package flyweight;

import java.util.HashMap;
import java.util.Map;

public class MarkerStyleFactory {
    private static final Map<String, MarkerStyle> styles = new HashMap<>();

    public static MarkerStyle getStyle(String icon, String color, String labelStyle) {
        String key = icon + "-" + color + "-" + labelStyle;

        if (!styles.containsKey(key)) {
            System.out.println("[Creating new style]: " + key);
            styles.put(key, new MarkerStyle(icon, color, labelStyle));
        }

        return styles.get(key);
    }

    public static int getStyleCount() {
        return styles.size();
    }
}