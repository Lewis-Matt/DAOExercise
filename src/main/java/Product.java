
// TODO: This class represents the MODEL
public class Product {
    private String name;
    private double price;

// The number and type of constructors defined on your models will be determined by the needs of your app
    // No-arg constructor
    public Product() {}

    // Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
