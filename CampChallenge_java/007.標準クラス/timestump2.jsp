<%-- 
    Document   : timestump2
    Created on : 2017/01/30, 14:11:47
    Author     : soich
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>タイムスタンプの表示</title>
    </head>
    <body>
        <%@ page import = "java.util.*"%>
        <%@ page import = "java.text.*"%>
        <%
        //2016年11月4日10時0分0秒を取得します
        Calendar cal = Calendar.getInstance();
        cal.set(2016,11-1,4,10,0,0);
        Date date = cal.getTime();
        
        //SimpleDateFormatを使用して表示します
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日" + " " + "HH：mm：ss");
        String dateset = sdf.format(date);       
        out.println(dateset);
        
         %>
    </body>
</html>
