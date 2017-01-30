<%-- 
    Document   : now
    Created on : 2017/01/30, 13:52:44
    Author     : soich
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>現在の日時の表示</title>
    </head>
    <body>
        <%@ page import = "java.util.*"%>
        <%
        //現在時刻を取得します
        Date date = new Date();

        //現在時刻を表示します
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int y = cal.get(Calendar.YEAR);             //年
        int m = cal.get(Calendar.MONTH)+1;          //月
        int d = cal.get(Calendar.DAY_OF_MONTH);     //日
        int h = cal.get(Calendar.HOUR_OF_DAY);      //時
        int mm = cal.get(Calendar.MINUTE);          //分
        int s = cal.get(Calendar.SECOND);           //秒
            out.println("現在の日時は" + y + "年" + m + "月" + d +"日 " + h + "：" + mm + "：" + s +"です。");
        %>
    </body>
</html>
