<%-- 
    Document   : form12
    Created on : 2017/02/09, 16:34:02
    Author     : soich
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>複合検索</title>
    </head>
    <body>
        <% //複合検索のフォームを作成します%>
        <form action = "./databaseServlet12" method = "post">
        <font color = magenta size = 3><i><b>あいまい複合検索君</b></i></font><br>
        <font color = magenta size = 2>[各検索パラメータを入力後にEnterをクリックしてください。]</font><br>
            名前：<input type = "text" name = "txtName"><br>
            <font color = red size = 1>※お間違えのないように<br></font>
            年齢：<input type = "text" name = "Age"><br>
            <font color = red size = 1>※半角数字で入力<br></font>
            誕生日<input type = "text" name = "Birth"><br>
            <font color = red size = 1>※YYYY-MM-DDという形式で入力<br></font>
            <input type = "submit" value = "Enter">
                
            
        
        </form>
        </body>
</html>
