<%-- 
    Document   : timestump3
    Created on : 2017/01/30, 14:19:32
    Author     : soich
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>タイムスタンプの表示2</title>
    </head>
    <body>
        <%@ page import = "java.util.*"%>
        <%@ page import = "java.text.*"%>
        <%
        //2015年1月1日0時0分0秒を取得します
        Calendar cal = Calendar.getInstance();
        cal.set(2015,1-1,1,0,0,0);
                   
        
        //2015年12月31日23時59分59秒を取得します
        Calendar cal1 = Calendar.getInstance();
        cal1.set(2015,12-1,31,23,59,59);
        
        
        //Calendarクラスで取得した日時をミリ秒に変換します
        long a = cal.getTimeInMillis();
        long b = cal1.getTimeInMillis();
        
        //引き算を実施し、表示します
            out.println(b-a);
                  
        
        %>
    </body>
</html>
