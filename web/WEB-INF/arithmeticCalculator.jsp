<%-- 
    Document   : arithmeticCalculator
    Created on : Feb 6, 2022, 2:00:42 PM
    Author     : Jasleen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            <label>First:</label>
            <input type="text" name="first" value="${first}">
            <br>
            <label>Second:</label>
            <input type="text" name="second" value="${second}">
            <br>
            <input type="submit" name="operation" value="+">
            <input type="submit" name="operation" value="-">
            <input type="submit" name="operation" value="*">
            <input type="submit" name="operation" value="%">
            <br>
            <label>Result: ${result}</label>
        </form>
            <a href="http://localhost:8084/Calculators/age">Age Calculator</a>
    </body>
</html>
