// TODO: This provides access to the DAOs
// This class has a single method that provides access to our products DAO. It ensures that only a single instance of ListProducts is ever created.
public class DaoFactory {
    private static Products productsDao;

    public static Products getProductsDao() {
        if (productsDao == null) {
            productsDao = new ListProducts();
        }
        return productsDao;
    }
}
