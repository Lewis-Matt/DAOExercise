# DAOExercise
An example application to show us a list of products, and allow the user to add a new product. For now, I am "faking" the database interaction functionality by writing a class that reads from and writes to an ArrayList.

We'll have two servlets (controllers) and two JSPs (views) for the two separate actions in our application: viewing all the products, and adding a new product.
<hr>

    Run the TomCat "DAO Exercise Server," navigate to http://localhost:8080/products OR /products/create

### Product.java
The Model

### Products.java
The DAO Interface

### ListProducts.java
The DAO implementation

### DAOFactory.java
Provides access to DAOs

### ShowProductsServlet.java
The Controller for viewing products

### index.jsp
The View for viewing products

### CreateProductServlet.java
The Controller for creating products
Creating new products (and in general, any operation that involves a user filling out a form) involves two separate HTTP requests:

    GET -- Navigate to the page that shows the form for creating a new product
    POST -- Fill out and submit the form

For this, and the ShowProductsServelt, the servlet does not access the DAO directly; instead, it goes through the factory to access the DAO object. In this way, the servlet only ever knows about the Products interface, and if we were to swap out the implementation of the class, we would not need to make any changes to our controller code.

### create.jsp
The View for creating products

