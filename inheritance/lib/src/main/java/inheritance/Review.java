package inheritance;

public class Review {
    private String author;
    private String body;
    private Establishment establishment;
    private double stars;
    private String movieSeen;

    public Review(String author, String body, Restaurant restaurant, double stars) {
        this.author = author;
        this.body = body;
        this.establishment = restaurant;
        this.stars = stars;
    }

    public Review(String author, String body, Shop shop, double stars) {
        this.author = author;
        this.body = body;
        this.establishment = shop;
        this.stars = stars;
    }

    public Review(String author, String body, Theater theater, double stars, String movieSeen) {
        this.author = author;
        this.body = body;
        this.establishment = theater;
        this.stars = stars;
        this.movieSeen = movieSeen;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Establishment getEstablishment() {
        return establishment;
    }

    public void setEstablishment(Establishment establishment) {
        this.establishment = establishment;
    }

    public double getStars() {
        return stars;
    }

    public void setStars(double stars) {
        this.stars = stars;
    }

    public String getMovieSeen() {
        return movieSeen;
    }

    public void setMovieSeen(String movieSeen) {
        this.movieSeen = movieSeen;
    }

    @Override
    public String toString() {
        return "Review{" +
                "author='" + author + '\'' +
                ", body='" + body + '\'' +
                ", establishment=" + establishment.getName() +
                ", stars=" + stars +
                ", movieSeen='" + movieSeen + '\'' +
                '}';
    }
}
