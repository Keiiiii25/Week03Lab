<%-- 
    Document   : arithmeticCalculator.jsp
    Created on : 21-Sep-2022, 11:42:19 PM
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
        <h1>Arithmetic Calculator</h1>
        <form action="calculate" method="post">
            First: <input type="number" name="first" value="${first}"><br>
            Second: <input type="number" name="second" value="${second}"><br>
            <input type="submit" value="+">
            <input type="submit" value="-">
            <input type="submit" value="*">
            <input type="submit" value="%">
        </form>
            <br>
            <p>${result}</p>
    </body>
</html>
