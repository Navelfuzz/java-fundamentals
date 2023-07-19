package inheritance;

public class Shop extends Establishment {
    private String description;
    private String price;

    public Shop(String name, String description, String price) {
        super(name);
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + getName() + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                ", reviews=" + getReviews() +
                '}';
    }
}
