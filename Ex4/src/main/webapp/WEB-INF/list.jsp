<%--
  Created by IntelliJ IDEA.
  User: HUNG
  Date: 06/05/2024
  Time: 8:22 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<h1>Product Information</h1>
<ul>
    <li>Name: ${product.name}</li>
    <li>Price: ${product.price}</li>
    <li>Stock: ${product.stock}</li>
    <li>Image: <img src="${product.imageUrl}" alt="Product Image"></li>
</ul>
</body>
</html>
