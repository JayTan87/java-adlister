<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order Form</title>
</head>
<body>
<form action = "/pizza-order" method = "POST">
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

  <label for = "size">Please select your size:</label>
  <select name = "size" id = "size">
    <option value="medium">Medium</option>
    <option value="large">Large</option>
    <option value="extra-large">Extra Large</option>
  </select>

  <p>Please select your toppings:</p>

    <label for = "sausage">Sausage</label>
    <input type = "checkbox" id = "sausage" name = "topping" value = "sausage">
    <label for = "pepperoni">Pepperoni</label>
    <input type = "checkbox" id = "pepperoni" name = "topping" value = "pepperoni">
    <label for = "green-pepper">Green Pepper</label>
    <input type = "checkbox" id = "green-pepper" name = "topping" value = "green-pepper">
    <label for = "mushroom">Mushroom</label>
    <input type = "checkbox" id = "mushroom" name = "topping" value = "mushroom">

  <p>Please enter the delivery address:</p>
    <textarea rows = "3" name = "address" placeholder="Address"></textarea>

  <input type = "submit">
</form>
</body>
</html>
