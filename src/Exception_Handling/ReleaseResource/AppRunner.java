package Exception_Handling.ReleaseResource;


public class AppRunner {
    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler();
        fileHandler.readFile("example.txt");
    }
}
