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
    <title>Title</title>
</head>
<body>
<h1>Add product</h1>
<form action="/ProductServlet" method="post" enctype="multipart/form-data">
    <table border="1" >
        <tr>
            <th>Name</th>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <th>Price</th>
            <td><input type="number" name="price"></td>
        </tr>
        <tr>
            <th>Stock</th>
            <td><input type="number" name="stock"></td>
        </tr>
        <tr>
            <th>Image</th>
            <td><input type="file" name="file"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" name="action" value="ADD"></td>
        </tr>
    </table>
</form>
</body>
</html>
