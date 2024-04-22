package AdvancedJavaFeatures.DesignPatterns.Prototype.MovieSeries;

import java.util.ArrayList;
import java.util.List;

public class MovieSeries implements Cloneable {
    private  String name;
    private  int season;
    // Notice one or more properties are a complex type and mutable
    private  List<Episode> episodes;

    public MovieSeries(String name, int season, List<Episode> episodes) {
        this.name = name;
        this.season = season;
        this.episodes = episodes;
    }

    // Shallow copy method
    @Override
    public MovieSeries clone() throws CloneNotSupportedException {
        // Cast to TvSeries as super returns Object
        return (MovieSeries) super.clone();
    }

    // Deep copy
    public MovieSeries deepCopy() {
        // New Episode objects are created during the copy
        final List<Episode> episodes = new ArrayList<>();

        for (Episode episode : this.episodes) {
            episodes.add(new Episode(episode.getName(), episode.getEpNo()));
        }

        return new MovieSeries(this.name, this.season, episodes);
    }


    // Getters and toString

    public String getName() {
        return name;
    }

    public int getSeason() {
        return season;
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }

    @Override
    public String toString() {
        return "MovieSeries{" +
                "name='" + name + '\'' +
                ", season=" + season +
                ", episodes=" + episodes +
                '}';
    }
}
