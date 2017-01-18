<%-- 
    Document   : 配列の作成
    Created on : 2017/01/17, 18:05:38
    Author     : soich
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>配列の作成</title>
    </head>
    <body>
        <%@page import = "java.util.*" %>
        <%
        //配列を作成します
        String nArr[] = {"10", "100", "soeda", "hayashi", "-20", "118", "END"};
        //配列を表示します
        out.println(Arrays.toString(nArr));
        
        %>
    </body>
</html>
