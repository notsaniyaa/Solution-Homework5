package proxy;

public class ImageProxy implements Image {
    private final String filename;
    private RealImage realImage;

    public ImageProxy(String filename) {
        this.filename = filename;
    }

    @Override
    public void displayThumbnail() {
        System.out.println("[Displaying cached thumbnail for]: " + filename);
    }

    @Override
    public void displayFullImage() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.displayFullImage();
    }
}

