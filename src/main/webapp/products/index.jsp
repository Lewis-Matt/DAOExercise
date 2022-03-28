<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Products</title>
</head>
<body>
<h1>Here are all the products:</h1>
<%--Loop through the collection of products (defined in the controller), and generate HTML for each product.--%>
<c:forEach var="product" items="${products}">
    <div class="product">
            <%--EL Syntax to access each product's properties--%>
        <h2>${product.name}</h2>
        <p>Price: $ ${product.price}</p>
    </div>
</c:forEach>

</body>
</html>
