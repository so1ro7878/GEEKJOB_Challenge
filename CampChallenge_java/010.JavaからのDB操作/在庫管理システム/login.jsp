
<%-- 
    Document   : login
    Created on : 2017/02/10, 11:38:59
    Author     : soich
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>在庫管理システム</title>
    </head>
    <body>
        <font color = "magenta" size = "4">在庫管理システム</font>
        <form action="./ZaikologinServlet" method = "post">
            ID：<input type= "text" name = "ID">
            <font color = "red" size = "1">※半角英数字</font><br>
            Password：<input type = "password" name = "PASS">
            <font color = "red" size = "1">※忘れても…教えません</font><br>
            <input type = "submit" value = "ログイン">
        </form>
        </body>
</html>
