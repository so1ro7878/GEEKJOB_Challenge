<%-- 
    Document   : switch文2
    Created on : 2017/01/16, 17:19:16
    Author     : soich
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>switch文2</title>
    </head>
    <body>
        <%
        //変数を定義します
        char a = 'Ｂ';
        String message = "";
        //switch文を表示します
        switch(a){
            case 'Ａ':
                message = "英語";
            break;
            case 'あ':
                message = "日本語";
            break;    
        }
            out.println(message);    
        
        %>
    </body>
</html>
