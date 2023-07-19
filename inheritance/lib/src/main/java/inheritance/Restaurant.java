package inheritance.RestaurantReviews;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    // Private Variables
    private String name;
    private double stars;
    private int price;
    private List<Reveiw> reviews;

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

    // getStars
    public double getStars(){
        return stars;
    }

    // getPrice
    public int getPrice(){
        return getPrice;
    }

    // getReviews
    public int getPrice(){
        return reviews;
    }

    // addReview
    public void addReview(Review review){
        if (!reviews.contains(review)){
            reviews.add(review);
            review.setRestaurant(this);
            updateStars();
        }
    }

    // updateStars
    private void updateStars(){
        int totalStars = 0;
        for (Review review : reviews){
            totalStars += review.getStars();
        }
        stars = totalStars / reviews.size();
    }

    // print
    @Override
    public String toString() {
        return "Restaurant: " + name + "\nStars: " + stars + "\nPrice Category: " + "$".repeat(priceCategory) + "\n";
    }
}