<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<body>
    <h1>Welcome to the JSP Example</h1>
    <p>This is a simple JSP page.</p>

    <h2>Result is: <%= session.getAttribute("result") %></h2>
    <h2>Result is: ${result} </h2>

    <p>Current date and time:
        <%= new java.util.Date() %>
    </p>
    </body>
</html>