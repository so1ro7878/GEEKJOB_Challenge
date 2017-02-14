<%-- 
    Document   : top
    Created on : 2017/02/10, 11:46:00
    Author     : soich
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>メニュー</title>
    </head>
    <body>
            
        <font color = "magenta" size = "6">在庫管理システム</font>
        <br>
        <font color = "red" size = "3"><i>メニュー</i></font>
        <br>
        <br>
        <a href = "./products.jsp">・商品一覧</a>
        <br>
        <br>
        <a href = "./subscribe.jsp">・商品登録</a>
        <br>
        <br>
        <form action ="./logoutServlet" method = "post">
            <input type = "submit" value = "ログアウトはこちら">            
        </form>      
    </body>
</html>
