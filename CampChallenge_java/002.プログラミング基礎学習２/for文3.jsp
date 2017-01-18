<%-- 
    Document   : for文3
    Created on : 2017/01/16, 17:49:39
    Author     : soich
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>for文3</title>
    </head>
    <body>
        <%
        //0から100までの数値に100を足して表示する
        
        for(int x = 0; x <=100; x++){
            out.println(x + 100);
        
        }
        
        
        %>
    </body>
</html>
