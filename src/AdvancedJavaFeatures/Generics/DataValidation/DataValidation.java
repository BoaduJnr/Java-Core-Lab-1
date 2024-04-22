package AdvancedJavaFeatures.Generics.DataValidation;

import java.util.function.Predicate;

public class DataValidation {
    // Generic method for data validation
    public static <T> boolean validate(T data, Predicate<T> criterion) {
        return criterion.test(data);
    }


}