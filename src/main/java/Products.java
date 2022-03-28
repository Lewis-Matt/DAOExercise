// TODO: This DAO interface describes the operations that our app can perform with products

import java.util.List;

interface Products {
    List<Product> all(); // get all the product records

    void insert(Product product); // persist new product to the database
}
