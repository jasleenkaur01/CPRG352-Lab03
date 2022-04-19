<%-- 
    Document   : ageCalculator
    Created on : Feb 6, 2022, 1:08:30 PM
    Author     : Jasleen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            <label>Enter your Age:</label>
            <input type="text" name="enter_age" value="${age}">
            <br>
            <input type="submit" name="calculate_age" name="Age next birthday">
            <br>
            <label>$(result)</label>
        </form>
            <a href="http://localhost:8084/Calculators/arithmetic">Arithmetic Calculator</a>
    </body>
</html>
