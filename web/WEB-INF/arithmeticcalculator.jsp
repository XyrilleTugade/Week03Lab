<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 22, 2022, 2:59:10 PM
    Author     : Xyrille
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
            First: <input type="text" name="firstNum"><br>
            Second: <input type="text" name="secNum"><br>
            <input type="submit" value="+">
            <input type="submit" value="-">
            <input type="submit" value="*">
            <input type="submit" value="%">
        </form>
        <a href="age">Age Calculator</a>
    </body>
</html>
