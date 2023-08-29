<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Outcome Page</title>
</head>
<body>
<c:choose>
<c:when test = "${correct == true}">
    <p>You Won!</p>
</c:when>
<c:otherwise>
    <p>You Lose!</p>
</c:otherwise>
</c:choose>
</body>
</html>
