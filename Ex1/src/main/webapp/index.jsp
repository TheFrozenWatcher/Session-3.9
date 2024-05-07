<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h2>Product Price Calculator</h2>
<form method="post" action="/submit">
    <label>Mô tả: </label><br/>
    <input type="text" name="description" placeholder="Nhập mô tả sản phẩm" value="Mô tả"/><br/>
    <label>Gía niêm yết: </label><br/>
    <input type="number" name="list-price" placeholder="USD" value="0"/><br/>
    <label>Chiết khấu: </label><br/>
    <input type="number" name="discount" placeholder="%" value="0"/><br/>
    <input type = "submit" id = "submit" value = "Submit"/>
</form>
</body>
</html>
