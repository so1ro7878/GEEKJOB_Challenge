<%-- 
    Document   : timestump
    Created on : 2017/01/30, 13:11:43
    Author     : soich
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>タイムスタンプの作成</title>
    </head>
    <body>
        <%@ page import = "java.util.*"%>
        <%@ page import = "java.text.*"%>
        <%
        //2016年1月1日0時0分0秒を取得します
        Calendar cal = Calendar.getInstance();
        cal.set(2016,1-1,1,0,0,0);
        Date date = cal.getTime();
        
        //SimpleDateFormatを使用して表示します
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日H時m分s秒");
        String dateset = sdf.format(date);       
        out.println(dateset);
        
        
        %>
    </body>
</html>
