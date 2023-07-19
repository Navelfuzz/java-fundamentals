# Lab: Class 06 Composition and Inheritance Part I
___
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

# Lab: Class 07 Composition and Inheritance Part II
___

## Architecture
List of files / classes with their properties, constructors, and methods:

1. Establishment Class: Establishment.java
* Properties
  * `String name`
  * `double stars`
  * `Map<String, Review> reviews`
* Constructors
  * `Establishment()`
  * `Establishment(String name)`
* Methods
  * Getters & Setters for `name`, `stars`, `reviews`
  * `updateStars()`
  * `toString()`
  
2. Review Class: Review.java
* Properties
    * `author`
    * `body`
    * `Establishment establishment`
    * `stars`
    * `movieSeen`
* Constructors
    * `Review(String author, String body, Restaurant restaurant, double stars)`
    * `Review(String author, String body, Shop shop, double stars)`
    * `Review(String author, String body, Theater theater, double stars, String movieSeen)`
* Methods
    * Getters & Setters: `author`, `body`, `Establishment`, `stars`, `movieSeen`
    * `toString()`

3. Restaurant Class: Restaurant.java
* Properties
  * `String price`
* Constructors
  * `Restaurant(String name, String price`
* Methods
  * Getter & Setter: `price`
  * `toString()`

4. Shop Class: Shop.java
* Properties
  * `description`
  * `price`
* Constructors
  * `Shop(String name, String description, String price)`
* Methods
  * Getters & Setters: `description`, `price`
  * `toString`
  
5. Theater Class: Theater.java
* Properties
  * `List<String> movies`
* Constructors
  * `Theater(String name, List<String> movies)`
  * `Theater(String name)`
* Methods
  * Getters & Setters: `movies`
  * `addMovie`
  * `removeMovie`
  * `toString`

## Testing
1. Establishment Tests: EstablishmentTests.java
