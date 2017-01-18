<%-- 
    Document   : while文
    Created on : 2017/01/17, 10:17:27
    Author     : soich
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>while文</title>
    </head>
    <body>
        <%
    //1000を2で割り続け、100以下になるまで続行します    
     int x = 1000;
     while(x >= 100){
         out.println(x = x / 2);
     }
        
        
        %>
    </body>
</html>
