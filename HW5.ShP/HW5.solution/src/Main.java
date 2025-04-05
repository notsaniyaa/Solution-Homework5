import proxy.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Proxy Pattern Demo ===\n");

        Image image = new ImageProxy("apartment1.jpg");

        image.displayThumbnail();
        image.displayFullImage();

        System.out.println();

        AgentImageUploader agent = new AgentImageUploader(true);
        agent.uploadImage("newHouse.jpg");

        AgentImageUploader guest = new AgentImageUploader(false);
        guest.uploadImage("unauthorized.jpg");
    }
}
