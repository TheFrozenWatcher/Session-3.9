<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h2>User Data</h2>
<form method="post" action="/add">
    <label>Id: </label><br/>
    <input type="number" name="id" placeholder="Id" value="1"/><br/>
    <label>Name: </label><br/>
    <input type="text" name="name" placeholder="Enter username" value="John Smith"/><br/>
    <label>Email: </label><br/>
    <input type="text" name="email" placeholder="Enter email" value="abc@email.com"/><br/>
    <label>Age: </label><br/>
    <input type="number" name="age" placeholder="Enter age" value="18"/><br/>
    <input type = "submit" id = "submit" value = "Submit"/>
</form>
</body>
</html>
