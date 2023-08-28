
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ include file="partials/head.jsp"%>
<%@include file="partials/navbar.jsp"%>
<form method = "POST" action = "login.jsp">
  <input type = "text" name = "username" placeholder = "Enter your username">
  <input type = "password" name = "password" placeholder = "Enter your password">
  <input type = "submit">
</form>
  <c:if test="${param.username.equals('admin') && param.password.equals('password')}">

    <c:redirect url="profile.jsp" />
  </c:if>
</body>
</html>
