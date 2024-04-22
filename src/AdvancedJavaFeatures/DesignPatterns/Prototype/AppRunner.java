package AdvancedJavaFeatures.DesignPatterns.Prototype;

import AdvancedJavaFeatures.DesignPatterns.Prototype.MovieSeries.Episode;
import AdvancedJavaFeatures.DesignPatterns.Prototype.MovieSeries.MovieSeries;

import java.util.List;
import java.util.stream.Collectors;

public class AppRunner {
    public static void main(String[] args) throws CloneNotSupportedException {


        List<Episode> movieEpisodes = List.of(new Episode("The beginning", 1), new Episode("The end", 2));

        MovieSeries movieSeries = new MovieSeries("The life of a software engineer", 1, movieEpisodes);
        MovieSeries shallowCopy = movieSeries.clone();
        MovieSeries deepCopy = movieSeries.deepCopy();

        System.out.println("Original Object : ");
        System.out.println(movieSeries);


        //Can mutate the original copy reference types properties if changes are done here and also be mutated by original copy

        shallowCopy.getEpisodes().get(0).setName("Climax");
        System.out.println("Shallow Copy : ");
        System.out.println(shallowCopy);
        System.out.println("Original Object  After Shallow Copy Mutation: ");
        System.out.println(movieSeries);


        //Can't mutate original object's reference types properties and can't be mutated by original object
        //Copy original Object reference types properties  and store in different addresses in memory
        System.out.println("Deep Copy : ");
        deepCopy.getEpisodes().get(1).setName("Resolution");
        System.out.println(deepCopy);
        System.out.println("Original Object  After Deep Copy Mutation: ");
        System.out.println(movieSeries);


    }
}
