package AdvancedJavaFeatures.DesignPatterns.Singleton;

public class Singleton {
    // The singleton instance to be returned by getInstance()
    private static Singleton instance = null;

    // Constructor is made private to stop creation through 'new' keyword outside of getInstance()
    private Singleton() {
        System.out.println("Creating a new instance");
    }

    // Returns instance when called
    public static synchronized Singleton getInstance() {
        // Creates new instance if none exists
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}