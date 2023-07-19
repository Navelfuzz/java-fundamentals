# Lab: Class 06 Composition and Inheritance Part I

## Architecture 

List of files / classes with their properties, constructors, and methods:

1. Restaurant Class: Restaurant.java
 * Properties
   * `name`
   * `stars`
   * `price`
   * `reviews`
 * Constructors:
   * `Restaurant (String name, double stars, int prices)`
 * Methods:
   * Getters and Setters for `name`, `stars`, `price`, `reviews`.
   * `addReview(Review review)`
   * `updateStars()`
   * `toString()`
2. Review Class: Review.java
* Properties:
  * `body`
  * `author`
  * `stars`
  * `restaurant`
* Constructors:
  * `public Review(String body, String author, double stars)`
* Methods:
  * Getters and Setters for `body`, `author`, `stars`, `restaurant`
  * `toString()`


## Testing

1. RestaurantTest: RestaurantTest.java
* `testRestaurantConstructor()`
* `testToString()`
* `testAddReviewAndUpdateStars()`
* `testReviewConstructor()`

