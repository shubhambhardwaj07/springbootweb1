<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<body>
    <h1>Welcome to the JSP Example</h1>
    <p>This is a simple JSP page.</p>

    <form action="submit.jsp" method="post">
        <label for="name">Enter your name:</label>
        <input type="text" id="name" name="name" required>
        <input type="submit" value="Submit">
    </form>

    <p>Current date and time:
        <%= new java.util.Date() %>
    </p>
    </body>
</html>