<%-- 
    Document   : myname
    Created on : 2017/01/30, 15:39:37
    Author     : soich
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>バイト数と文字数の表示</title>
    </head>
    <body>
        <%
        //自分の名前の変数を宣言します
        String kanji = "髙野子荘一郎";
        String hira = "たかのしそういちろう";
        
        //漢字の名前のバイト数と文字数を取得し、表示します
        out.println("私の漢字の名前は【" + kanji + "】です。<br>");
        out.println("バイト数は【" + kanji.getBytes("UTF-8").length + "】<br>");
        out.println("文字数は【" + kanji.length() + "】<br>");
        
        //ひらがなの名前のバイト数と文字数を取得し、表示します
        out.println("私のひらがなの名前は【" + hira + "】です。<br>");
        out.println("バイト数は【" + hira.getBytes("UTF-8").length + "】<br>");
        out.println("文字数は【" + hira.length() + "】<br>");
        
        %>
    </body>
</html>
