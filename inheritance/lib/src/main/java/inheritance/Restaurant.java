package inheritance;

public class Restaurant extends Establishment {
    private String price;

    public Restaurant(String name, String price) {
        super(name);
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + getName() + '\'' +
                ", stars=" + getStars() +
                ", price='" + price + '\'' +
                ", reviews=" + getReviews() +
                '}';
    }
}
