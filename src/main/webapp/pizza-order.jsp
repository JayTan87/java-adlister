<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order Form</title>
</head>
<body>
<form action = "pizza-order.jsp" method = "POST">
  <label for = "crust">Please select your crust:</label>
  <select name = "crust" id = "crust">
    <option value="garlic-parm">Garlic Parmesan</option>
    <option value="stuffed-crust">Stuffed Crust</option>
    <option value="thin-crust">Thin Crust</option>
    <option value="new-york">New York Style</option>
  </select>

  <label for = "sauce">Please select your sauce:</label>
  <select name = "sauce" id = "sauce">
    <option value="marinara">Marinara</option>
    <option value="alfredo">Cheesy Alfredo</option>
    <option value="bbq">BBQ</option>
    <option value="pesto">Pesto</option>
  </select>

  <label for = "size">Please select your sauce:</label>
  <select name = "size" id = "size">
    <option value="medium">Medium</option>
    <option value="large">Large</option>
    <option value="extra-large">Extra Large</option>
  </select>

</form>
</body>
</html>
