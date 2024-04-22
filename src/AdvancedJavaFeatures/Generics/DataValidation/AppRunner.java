package AdvancedJavaFeatures.Generics.DataValidation;


public class AppRunner {
    public static void main(String[] args) {
        // Example usage for Integer
        boolean isValidInteger = DataValidation.validate(123, num -> num > 100);
        System.out.println("Is valid integer: " + isValidInteger);

        // Example usage for String
        boolean isValidString = DataValidation.validate("Hello World", str -> str.contains("World"));
        System.out.println("Is valid string: " + isValidString);

        // Example usage for String
        boolean isInalidString = DataValidation.validate("Hello world", str -> str.contains("World"));
        System.out.println("Is valid string: " + isValidString);
    }
}
