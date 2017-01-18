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
        <title>配列の変更</title>
    </head>
    <body>
        <%@page import = "java.util.*" %>
        <%
        //配列を作成します
        String nArr[] = {"10", "100", "soeda", "hayashi", "-20", "118", "END"};
        //変更前の配列を表示します
        out.println(Arrays.toString(nArr));
        out.println("<br>");
        //"soeda"を"33"に変更します
        nArr[2] = "33";
        //変更後の配列を表示します
        out.println(Arrays.toString(nArr));
        

        %>
    </body>
</html>
