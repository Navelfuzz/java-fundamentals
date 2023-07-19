package inheritance;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RestaurantTest {

    @Test
    public void testRestaurantConstructor() {
        Restaurant restaurant = new Restaurant("Pizza Place", 4.5, 2);

        assertEquals("Pizza Place", restaurant.getName());
        assertEquals(4.5, restaurant.getStars());
        assertEquals(2, restaurant.getPrice());
    }

    @Test
    public void testToString() {
        Restaurant restaurant = new Restaurant("Pizza Place", 4.5, 2);
        String expectedString = "Restaurant{name='Pizza Place', stars=4.5, price='2'}";

        assertEquals(expectedString, restaurant.toString());
    }

    @Test
    public void testAddReviewAndUpdateStars() {
        Restaurant restaurant = new Restaurant("Pizza Place", 4.5, 2);

        // Create two reviews
        Review review1 = new Review("Great pizza!", "John", 5);
        Review review2 = new Review("Average service.", "Jane", 3);

        // Add the reviews to the restaurant
        restaurant.addReview(review1);
        restaurant.addReview(review2);

        // Check if the stars were updated correctly
        assertEquals(4.0, restaurant.getStars());
    }

    @Test
    public void testReviewConstructor() {
        Review review = new Review("Great pizza!", "John", 4.5);

        assertEquals("Great pizza!", review.getBody());
        assertEquals("John", review.getAuthor());
        assertEquals(4.5, review.getStars());
    }
}
