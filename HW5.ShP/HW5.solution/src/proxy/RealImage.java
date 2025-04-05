package proxy;

public class RealImage implements Image {
    private final String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFullImage();
    }

    private void loadFullImage() {
        System.out.println("[Loading high-resolution image from disk]: " + filename);
    }

    @Override
    public void displayThumbnail() {
        System.out.println("[Displaying thumbnail for]: " + filename);
    }

    @Override
    public void displayFullImage() {
        System.out.println("[Displaying full-resolution image]: " + filename);
    }
}

