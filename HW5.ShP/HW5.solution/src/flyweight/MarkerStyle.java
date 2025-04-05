package flyweight;

public class MarkerStyle {
    private final String icon;
    private final String color;
    private final String labelStyle;

    public MarkerStyle(String icon, String color, String labelStyle) {
        this.icon = icon;
        this.color = color;
        this.labelStyle = labelStyle;
    }

    @Override
    public String toString() {
        return "Icon=" + icon + ", Color=" + color + ", Label=" + labelStyle;
    }
}