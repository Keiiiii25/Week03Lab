<%-- 
    Document   : agecalculator
    Created on : 21-Sep-2022, 11:41:03 PM
    Author     : Keith
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="calculate" method="post">
            Enter your age: <input type="number" name="age" value="${age}"><br>
            <input type="submit" name="Age next birthday">
        </form>
            <p>${answer}</p>
    </body>
</html>
