<%-- 
    Document   : 文字の連結表示
    Created on : 2017/01/13, 17:40:55
    Author     : soich
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>文字の連結表示</title>
    </head>
    <body>
        <%
       
        //文字「groove」「-」「gear」を連結で表示させます
        out.println("groove" + "-" + "gear");

        %>
    </body>
</html>
