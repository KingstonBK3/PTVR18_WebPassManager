<%-- 
    Document   : showFormAddResource
    Created on : Sep 10, 2020, 2:51:50 PM
    Author     : pupil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add resources.</title>
    </head>
    <body>
        <h1>Creating new resource!</h1>
        <form action="createResource" method="POST">
            Resource name: <input type="text" name="name"><br>
            URL: <input type="text" name="url"><br>
            Login: <input type="text" name="login"><br>
            Password: <input type="text" name="password"><br>
            <input type="submit" value="Create">
        </form>
    </body>
</html>
