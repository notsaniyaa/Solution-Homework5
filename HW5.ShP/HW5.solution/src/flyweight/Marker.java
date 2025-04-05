package flyweight;

public class Marker {
    private final int x;
    private final int y;
    private final MarkerStyle style;

    public Marker(int x, int y, MarkerStyle style) {
        this.x = x;
        this.y = y;
        this.style = style;
    }

    public void draw() {
        System.out.println("Drawing marker at (" + x + "," + y + ") with style [" + style + "]");
    }
}