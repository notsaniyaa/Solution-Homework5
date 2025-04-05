package flyweight;

public class MapRenderer {
    public static void main(String[] args) {
        System.out.println("=== Flyweight Pattern Demo ===\n");

        int totalMarkers = 10000;
        Marker[] markers = new Marker[totalMarkers];

        for (int i = 0; i < totalMarkers; i++) {
            String icon = (i % 3 == 0) ? "hospital" : (i % 3 == 1) ? "restaurant" : "gas";
            String color = (i % 2 == 0) ? "blue" : "red";
            String label = "bold";

            MarkerStyle style = MarkerStyleFactory.getStyle(icon, color, label);
            markers[i] = new Marker(i % 100, i / 100, style);
        }

        for (int i = 0; i < 5; i++) {
            markers[i].draw();
        }

        System.out.println("\nTotal markers created: " + totalMarkers);
        System.out.println("Unique style objects used: " + MarkerStyleFactory.getStyleCount());
    }
}