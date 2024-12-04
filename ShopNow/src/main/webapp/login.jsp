<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="./login.css">
</head>
<body>
    <form action="login" method="post">
        <h2>LOG IN</h2>
        <h4>${msg}</h4>
        <input type="email" placeholder=" Enter Email Id" name="uname" id="email" value="">
        <input type="password" placeholder="Enter Password" name="upassword" id="pwd" value="">
        <input type="submit" value="Login">
        <p>Don't have an account</p>
        <a href="./register.jsp">Register</a>
    </form>
    <script src="./login.js"></script>
</body>
</html>