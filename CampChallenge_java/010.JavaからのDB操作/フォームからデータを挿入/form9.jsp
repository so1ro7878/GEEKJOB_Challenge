<%-- 
    Document   : form9
    Created on : 2017/02/09, 14:05:41
    Author     : soich
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>フォームからデータを挿入</title>
    </head>
    <body>
            <%//検索用フォームを用意します%>
        <form action="./databaseServlet9" method = "post" ><%//postで、dataservlet9に接続%>
            <font color = magenta size = 3><i><b>簡単！データ挿入君</b></i></font><br>
            <font color = magenta size = 2>[各データを入力後、Enterをクリックしてください。]</font><br>
            ・ProfilesID<input type = "text" name="id" >
            <font color = red size = 1>※お好きな数字をどうぞ<br></font>
            ・名前      <input type = "text" name="txtName" >
            <font color = red size = 1>※なるべく本名でお願いします<br></font>
            ・電話番号  <input type = "text" name="tel" >
            <font color = red size = 1>※急に電話等はしません<br></font>
            ・年齢      <input type = "text" name="age" >
            <font color = red size = 1>※嘘はだめですよ<br></font>
            ・誕生日    <input type = "text" name="birth" >
            <font color = red size = 1>※いや、何もあげませんよ<br></font>
            <input type ="submit" value = "Enter">　　<%//ボタン%>
        </form>
    </body>
</html>
