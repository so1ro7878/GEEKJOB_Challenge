<%-- 
    Document   : 変数の宣言と表示【自己紹介】
    Created on : 2017/01/13, 18:00:06
    Author     : soich
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>変数の宣言と表示(自己紹介)</title>
    </head>
    <body>
        <%
        //変数を宣言します
        String name="髙野子 荘一郎";
        String hobby="ギター演奏、音楽鑑賞";
        String greeting="よろしくお願い致します。";
        int age = 28;

        //自己紹介を定義します
        out.println("私の名前は、" + name + "です。年齢は" + age + "歳です。");
        out.println("<br>");
        out.println("趣味は" + hobby + "です。"+ greeting);

        %>
    </body>
</html>
