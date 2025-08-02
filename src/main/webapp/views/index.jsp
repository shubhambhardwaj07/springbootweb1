<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<body>
    <h1>Welcome to the JSP Example</h1>
    <p>This is a simple JSP page.</p>

    <form action="addAlien" >
        <label for="aid">Enter ID</label>
        <input type="text" id="aid" name="aid" required>

          <label for="aname">Enter Name</label>
          <input type="text" id="aname" name="aname" required>
        <input type="submit" value="Submit">
    </form>

    <p>Current date and time:
        <%= new java.util.Date() %>
    </p>
    <p>Welcome to ${course} world</p>
    </body>
</html>