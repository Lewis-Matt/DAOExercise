<%--The View: displays a form for the user to add a product--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create A Product</title>
</head>
<body>
<h1>Create A Product</h1>
<%--The form's action attribute points to /products/create. We will invoke the doPost method of the servlet defined above because the servlet is mapped to that url.--%>
<%--There are two inputs, and the name attribute for both inputs is present. Whatever value we put into the name attribute will be what we look for in the servlet.--%>
<form action="/products/create" method="post">
    <label for="name">Name</label>
    <input name="name" id="name" type="text">
    <br/>
    <label for="price">Price</label>
    <input name="price" id="price" type="text">
    <br/>
    <input type="submit">
</form>
</body>
</html>
