<%-- 
    Document   : form10
    Created on : 2017/02/09, 14:46:10
    Author     : soich
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>特定のレコードを削除する</title>
    </head>
    <body>
            <form action="./databaseServlet10" method = "post" ><%//postで、dataservlet10に接続%>
            <font color = magenta size = 3><i><b>ID削除ボタン</b></i></font><br>
            <font color = magenta size = 2>[パラメータを入力後、Enterをクリックしてください。]</font><br>
            ・ProfilesID<input type = "text" name="id" >
            <font color = red size = 1>※お間違えのないように<br></font>
            <input type ="submit" value = "Enter">　　<%//ボタン%>
        </form>
    </body>
</html>
