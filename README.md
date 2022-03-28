# DAOExercise
An example application to show us a list of products, and allow the user to add a new product. For now, I am "faking" the database interaction functionality by writing a class that reads from and writes to an ArrayList.

We'll have two servlets (controllers) and two JSPs (views) for the two separate actions in our application: viewing all the products, and adding a new product.

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

### create.jsp
The View for creating products
