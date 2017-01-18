<%-- 
    Document   : for文1
    Created on : 2017/01/16, 17:36:59
    Author     : soich
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>for文1</title>
    </head>
    <body>
        <%
        //8を20回掛け算します
        
        long x = 8;
        for(int y = 0; y <= 20; y++){
            x *= 8;
            out.println(x);
        }

        %>
    </body>
</html>
