package inheritance;

public class Review {
    //private variables
    private String body;
    private String author;
    private double stars;
    private Restaurant restaurant;

    // Constructor
    public Review(String body, String author, double stars){
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    // getBody
    public String getBody(){
        return body;
    }
    // setBody
    public void setBody(String body){
        this.body = body;
    }

    // getAuthor
    public String getAuthor(){
        return author;
    }
    // setAuthor
    public void setAuthor(String author){
        this.author = author;
    }

    // getStars
    public double getStars(){
        return stars;
    }
    // setStars
    public void setStars(double stars){
        this.stars = stars;
    }



    @Override
    public String toString() {
        return "Review{" +
                "author='" + author + '\'' +
                ", body='" + body + '\'' +
                ", restaurant='" + restaurant.getName() + '\'' +
                ", stars=" + stars +
                '}';
    }
}