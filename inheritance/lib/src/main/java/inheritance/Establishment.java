package inheritance;

import java.util.HashMap;
import java.util.Map;

public class Establishment {
    private String name;
    private double stars;
    private Map<String, Review> reviews;

    public Establishment() {
        this.reviews = new HashMap<>();
    }

    public Establishment(String name) {
        this.name = name;
        this.reviews = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStars() {
        return stars;
    }

    public void setStars(double stars) {
        this.stars = stars;
    }

    public Map<String, Review> getReviews() {
        return reviews;
    }

    public void addReview(Review review) {
        if (reviews == null) {
            reviews = new HashMap<>();
        }
        reviews.put(review.getAuthor(), review);
        updateStars();
    }

    private void updateStars() {
        double totalStars = 0;
        for (Review review : reviews.values()) {
            totalStars += review.getStars();
        }
        stars = reviews.isEmpty() ? 0 : (totalStars / reviews.size());
    }

    @Override
    public String toString() {
        return "Establishment{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", reviews=" + reviews +
                '}';
    }
}

