package inheritance;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    // Private Variables
    private String name;
    private double stars;
    private int price;
    private List<Review> reviews;

    // Constructor
    public Restaurant(String name, double stars, int price){
        this.name = name;
        this.stars = stars;
        this.price = price;
        this.reviews = new ArrayList<>();
    }

    // getName
    public String getName(){
        return name;
    }
    // setName
    public void setName(String name){
        this.name = name;
    }

    // getStars
    public double getStars(){
        return stars;
    }
    // setStars
    public void setStars(double stars){
        this.stars = stars;
    }

    // getPrice
    public int getPrice(){
        return price;
    }
    // setPrice
    public void setPrice(int price){
        this.price = price;
    }

    // getReviews
    public List<Review> getReviews(){
        return reviews;
    }


    // addReview
    public void addReview(Review review){
        if (!reviews.contains(review)){
            reviews.add(review);
            updateStars();
        }
    }

    // updateStars
    private void updateStars(){
        double totalStars = 0;
        for (Review review : reviews){
            totalStars += review.getStars();
        }
        stars = reviews.isEmpty() ? 0 : (totalStars / reviews.size());
    }

    // print
    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", price='" + price + '\'' +
                '}';
    }
}