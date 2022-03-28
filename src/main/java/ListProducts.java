// TODO: The DAO implementation
// This class implements the methods defined in the Products interface. It does so by keeping a private property named products that is an array list of product objects. This is a stand-in for a real database, we could replace all the array list manipulation with database interactivity.

import java.util.ArrayList;
import java.util.List;

class ListProducts implements Products {
    private List<Product> products = new ArrayList();

    // When an instance of this class is created, we'll populate the
    // products array list with data, "faking" the records
    public ListProducts() {
        insert(new Product("hammer", 9.99));
        insert(new Product("screwdriver", 9.99));
        insert(new Product("drill", 19.99));
    }

    // Persist a new record. We'll simulate this by adding the passed object
    // to our internal array list of products.
    public void insert(Product product) {
        this.products.add(product);
    }
    // From the interface
    public List<Product> all() {
        return this.products;
    }
}
