<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%! int customers = 0; %>
<% customers++; %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>We have had <%= customers %> customers visit our shop!</h1>


    <form method = "POST" action = "coffee-example.jsp">
        <input type = "text" name = "coffee-name" placeholder = "Enter a coffee">
        <input type = "text" name = "username" placeholder = "Enter your name">
        <label for ="caramel-checkbox">Caramel</label>
        <input id = "caramel-checkbox" type = "checkbox" name = "addons" value="Caramel">
        <label for ="caramel-checkbox">Creamer</label>
        <input id = "creamer-checkbox" type = "checkbox" name = "addons" value="Creamer">
        <label for ="caramel-checkbox">Sugar</label>
        <input id = "sugar-checkbox" type = "checkbox" name = "addons" value="Sugar">
    </form>
</body>
</html>
