// TODO: This provides access to the DAOs
// This class has a single method that provides access to our products DAO. It ensures that only a single instance of ListProducts is ever created.
public class DaoFactory {
    private static Products productsDao;

    // The first time getProductsDao is called, an instance of ListProducts is created, stored as a class property, and returned from the method. Every other time after the first time getProductsDao is called, a new object does not need to be instantiated, the existing one will be re-used.
    public static Products getProductsDao() {
        if (productsDao == null) {
            productsDao = new ListProducts();
        }
        return productsDao;
    }
}
