package AdvancedJavaFeatures.Collections.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AppRunner {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 24, "New York"),
                new Person("Bob", 30, "San Francisco"),
                new Person("Charlie", 22, "New York"),
                new Person("Diana", 29, "London")
        );

        // Use Stream API to process the collection
        List<String> namesOfPeopleOver25 = people.stream()
                .sorted(new AgeComparator())  // Sorting by age using the custom comparator
                .filter(p -> p.getAge() > 25)  // Filtering to find people over 25 years old
                .map(Person::getName)          // Transforming to get names
                .collect(Collectors.toList()); // Collecting results into a list

        System.out.println("Names of people over 25: " + namesOfPeopleOver25);
    }
}
