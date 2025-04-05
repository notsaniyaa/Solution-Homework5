package proxy;

public class AgentImageUploader {
    private final boolean isLoggedIn;

    public AgentImageUploader(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }

    public void uploadImage(String filename) {
        if (isLoggedIn) {
            System.out.println("[Upload successful]: " + filename);
        } else {
            System.out.println("[Upload denied: login required]");
        }
    }
}

