<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="./register.css">
</head>
<body>
    <section>
        <div>
            <h1>Shop Now</h1>
        </div>
        <form action="register" method="post">
            <h1>Register</h1>
            <h4>${msg}</h4>
            <input type="text" placeholder="Full Name" name="uname" id="name" value="">
            <input type="email" placeholder="Email Id" name="uemail" id="email" value="">
            <input type="password" placeholder="Password" name="upwd" id="pwd" value="">
            <input type="submit" value="Register">
            <a href="./login.jsp">Login Now</a>
        </form>
    </section>
    <script src="./register.js"></script>
</body>
</html>