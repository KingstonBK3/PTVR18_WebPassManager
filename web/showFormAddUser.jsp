<%-- 
    Document   : ShowFormAddUser
    Created on : Sep 15, 2020, 12:59:57 PM
    Author     : pupil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Creating new user</h1>
        <form action="createUser" method="POST">
            Name: <input type="text" name="name"><br>
            Login:<input type="text" name="login"><br>
            Password:<input type="text" name="password"><br>
            <input type="submit" value="Create">
        </form>
    </body>
</html>
