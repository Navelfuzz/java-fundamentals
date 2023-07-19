package inheritance;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EstablishmentTests {

    @Test
    public void testShopBasics() {
        Shop shop = new Shop("Bookstore", "A cozy bookstore", "$$");
        assertEquals("Bookstore", shop.getName());
        assertEquals("A cozy bookstore", shop.getDescription());
        assertEquals("$$", shop.getPrice());
    }

    @Test
    public void testAddReviewToShop() {
        Shop shop = new Shop("Bookstore", "A cozy bookstore", "$$");
        Review review = new Review("John", "Great selection of books!", shop, 5);

        shop.addReview(review);

        assertEquals(1, shop.getReviews().size());
        assertEquals(review, shop.getReviews().get("John"));
        assertEquals(5, shop.getStars());
    }

    @Test
    public void testAddReviewToRestaurant() {
        Restaurant restaurant = new Restaurant("Pizza Place", "$$$");
        Review review = new Review("Jane", "Delicious pizza!", restaurant, 4.5);

        restaurant.addReview(review);

        assertEquals(1, restaurant.getReviews().size());
        assertEquals(review, restaurant.getReviews().get("Jane"));
        assertEquals(4.5, restaurant.getStars());
    }

    @Test
    public void testTheaterFunctionality() {
        List<String> movies = Arrays.asList("Movie 1", "Movie 2", "Movie 3");
        Theater theater = new Theater("Cinema", movies);

        assertEquals("Cinema", theater.getName());
        assertEquals(movies, theater.getMovies());

        Review review = new Review("John", "Great movie experience!", theater, 4.8, "Movie 1");
        theater.addReview(review);

        assertEquals(1, theater.getReviews().size());
        assertEquals(review, theater.getReviews().get("John"));
        assertEquals(4.8, theater.getStars());
    }

    @Test
    public void testReviewWithoutMovieSeen() {
        Shop shop = new Shop("Bookstore", "A cozy bookstore", "$$");
        Review shopReview = new Review("John", "Great selection of books!", shop, 5);

        Restaurant restaurant = new Restaurant("Pizza Place", "$$$");
        Review restaurantReview = new Review("Jane", "Delicious pizza!", restaurant, 4.5);

        Theater theater = new Theater("Cinema", Arrays.asList("Movie 1", "Movie 2"));
        Review theaterReview = new Review("Mike", "Nice theater", theater, 4.0, null);

        assertEquals(null, shopReview.getMovieSeen());
        assertEquals(null, restaurantReview.getMovieSeen());
        assertEquals(null, theaterReview.getMovieSeen());
    }
}
