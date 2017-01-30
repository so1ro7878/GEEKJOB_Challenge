<%-- 
    Document   : e-mailaddress
    Created on : 2017/01/30, 15:57:41
    Author     : soich
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>文字数の取得</title>
    </head>
    <body>
        <%
        //自分のメールアドレスを宣言します
        String ad = "s●●●●●●●●●●●●●●●●●8@gmail.com";
        
        //自分のメールアドレスと@以降の値を表示します
        out.println("私のE-mailアドレスは【"+ ad +"】です。<br>");
        out.println("使用しているドメインは【" + ad.substring(20) + "】です。<br>");
        
        %>
    </body>
</html>
