<%-- 
    Document   : form11
    Created on : 2017/02/09, 15:23:44
    Author     : soich
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>特定のレコードの更新</title>
    </head>
    <body>
        <form action="./databaseServlet11" method = "post" ><%//postで、dataservlet11に接続%>
            <font color = magenta size = 3><i><b>Hyper Parameter Updater</b></i></font><br>
            <font color = magenta size = 2>[IDを指定し、各パラメータを入力後にEnterをクリックしてください。]</font><br>
            ・ProfilesID<input type = "text" name= "id" >
            <font color = red size = 1>※お間違えのないように<br></font>
            ・名前<input type = "text" name = "txtName">
            <font color = red size = 1>※上書き内容を記載<br></font>
            ・電話番号<input type = "text" name = "tel">
            <font color = red size = 1>※上書き内容を記載<br></font>
            ・年齢<input type = "text" name = "age">
            <font color = red size = 1>※上書き内容を記載<br></font>
            ・誕生日<input type = "text" name = "birth">
            <font color = red size = 1>※上書き内容を記載<br></font>
            <input type ="submit" value = "Enter">　　<%//ボタン%>
        </form>    
    </body>
</html>
