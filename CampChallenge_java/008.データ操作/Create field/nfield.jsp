<%-- 
    Document   : nfield
    Created on : 2017/02/01, 15:54:28
    Author     : soich
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>入力フィールド</title>
    </head>
    <body>
        <form action="./sample.jsp" method ="post">
            名前：<input type ="text" name = "txtName"><br> 
            性別：<input type="radio" name ="rdosx" value ="0">男性<input type="radio" name ="rdosx" value = "1">女性<br>
            趣味：<textarea name = "hbText"></textarea>
            <input type ="submit" value ="Submit!!">
        </form>
    </body>
</html>
