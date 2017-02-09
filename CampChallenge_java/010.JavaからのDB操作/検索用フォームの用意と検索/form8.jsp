<%-- 
    Document   : form8
    Created on : 2017/02/09, 13:21:09
    Author     : soich
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>検索用フォームの用意と検索</title>
    </head>
    <body>
        <%//検索用フォームを用意します%>
        <form action="./databaseServlet8" method = "post" ><%//postで、dataservlet8に接続%>
            <font color = magenta size = 3><i><b>プロフィール氏名検索君</b></i></font><br>
            <input type = "text" name="txtName" >   <%//検索窓%>
            <input type ="submit" value = "検索">　　<%//ボタン%>
        </form>
        </body>
</html>
