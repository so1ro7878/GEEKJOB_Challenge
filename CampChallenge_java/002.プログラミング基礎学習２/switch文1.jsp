<%-- 
    Document   : newjsp
    Created on : 2017/01/16, 15:56:39
    Author     : soich
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>switch文1</title>
    </head>
    <body>
        <%
        //変数定義します
        int x = 2;
        String message = "";
        
        //switch文を表示します
        switch(x){
            case 1:
                message = "one";
            break;
            
            case 2:
                message = "two";
            break;
            
            default:
                message = "想定外";                
            break;
        
        }
        out.println(message);
        %>
    </body>
</html>
