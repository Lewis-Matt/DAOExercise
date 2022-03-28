import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/products/create")
public class CreateProductServlet extends HttpServlet {
    @Override
    // Shows the corresponding JSP file
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/products/create.jsp").forward(request, response);
    }

    @Override
    // Access the values the user submitted, and use those values to create a new Product object
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // The servlet does not access the DAO directly; instead, it goes through the factory to access the DAO object
        Products productsDao = DaoFactory.getProductsDao();
        // Create a new product based upon submitted data
        String name = request.getParameter("name");
        // Parse as all values we obtain from the user are strings
        // The string argument passed to request.getParameter must match up with the name attribute defined on the inputs in our HTML.
        double price = Double.parseDouble(request.getParameter("price"));
        Product product = new Product(name, price);
        // Persist the new product
        productsDao.insert(product);
        response.sendRedirect("/products");
    }
}
