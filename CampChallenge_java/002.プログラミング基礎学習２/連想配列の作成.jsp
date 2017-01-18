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
        <title>連想配列の作成</title>
    </head>
    <body>
        <%@page import = "java.util.*" %>
        <%
        //配列を作成します
        HashMap<String, String>hMap =
        new HashMap<String, String>();
        
        //配列を格納します
        hMap.put("1","AAA");
        hMap.put("hello","world");
        hMap.put("soeda","33");
        hMap.put("20","20");
        
        //参照します
        out.println(hMap.get("1"));
        out.println(hMap.get("hello"));
        out.println(hMap.get("soeda"));
        out.println(hMap.get("20"));
        
        %>
    </body>
</html>
