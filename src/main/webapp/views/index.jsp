<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<body>
    <h1>Welcome to the JSP Example</h1>
    <p>This is a simple JSP page.</p>

    <form action="add" >
        <label for="num1">First Number</label>
        <input type="text" id="num1" name="num1" required>

          <label for="num2">First Number</label>
          <input type="text" id="num2" name="num2" required>
        <input type="submit" value="Submit">
    </form>

    <p>Current date and time:
        <%= new java.util.Date() %>
    </p>
    </body>
</html>