package AdvancedJavaFeatures.DesignPatterns.Singleton;

public class AppRunner {

    public static void main(String[] args) {

        //first instance
        Singleton singleton1 = Singleton.getInstance();
        System.out.println("First instance : "+  singleton1);

        //Second instance returns first instance
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("Second Instance : "+ singleton2);

    }
}
