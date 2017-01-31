<%-- 
    Document   : change
    Created on : 2017/01/31, 10:33:18
    Author     : soich
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>文字の入れ替え</title>
    </head>
    <body>
        <%
        //課題の文章を定義します
        String today = "きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます";
        //"I"→"い"へ置き換えを行い、別の変数に定義します
        String after = today.replace("I", "い");
            
            //"U"→"う"へ置き換えを行い、出力します。
            out.println(after.replace("U", "う"));
            
        %>
    </body>
</html>
