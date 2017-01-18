<%-- 
    Document   : for文2
    Created on : 2017/01/16, 17:44:31
    Author     : soich
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>for文2</title>
    </head>
    <body>
        <%
        
          //Aを30個連結します
          char x = 'Ａ';
           for(int y = 0; y <= 30; y++){
               out.println(x);
           }
        
        %>
    </body>
</html>
