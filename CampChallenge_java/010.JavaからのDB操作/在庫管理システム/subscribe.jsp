<%-- 
    Document   : subscribe
    Created on : 2017/02/13, 16:34:06
    Author     : soich
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>商品登録</title>
    </head>
    <body>
        <font color = "green" size = "4">商品登録ページ</font>
        <br>
        <br>
        <form action= "./ZaikoMenuServlet" method = "post">
            商品名：<input type = "text" name = "name">
            <br>
            値段：<input type = "text" name = "price" value = "円">
            <font color ="red" size ="2">※"円"は消さないこと</font>
            <br>
            <br>
            <input type = "submit" value = "登録">
        </form>
    </body>
</html>
