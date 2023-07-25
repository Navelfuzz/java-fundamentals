package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater extends Establishment {
    private List<String> movies;

    public Theater(String name, List<String> movies) {
        super(name);
        this.movies = movies;
    }

    public Theater(String name) {
        super(name);
        this.movies = new ArrayList<>();
    }

    public List<String> getMovies() {
        return movies;
    }

    public void setMovies(List<String> movies) {
        this.movies = movies;
    }

    public void addMovie(String movieName) {
        movies.add(movieName);
    }

    public void removeMovie(String movieName) {
        movies.remove(movieName);
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + getName() + '\'' +
                ", movies=" + movies +
                ", reviews=" + getReviews() +
                '}';
    }
}
