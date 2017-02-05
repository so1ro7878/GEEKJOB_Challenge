<%-- 
    Document   : ResultProf
    Created on : 2017/02/03, 11:15:09
    Author     : soich
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="java.util.*"%>
<%@page import ="java.text.*"%>
<%@page import ="javax.servlet.http.*" %>
<%@page import ="java.io.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>★あなたのプロフィール★</title>
    </head>
    <body>
        <%
        //Tableタグ、Fontタグ、aタグをメインとして使用しました
        %>
        <br>
        <br>
    <table border>
    <tr>
        <th>名前</th>
        <th>血液型</th>
        <th>趣味</th>
    </tr>
    <tr>
        <td><strike>髙野子</strike></td>
        <td>O</td>
        <td><b>ドライブ</b></td>
    </tr>
    <tr>
        <td>町山</td>
        <td>B</td>
        <td><em>音楽鑑賞</em></td>
    </tr>
    <tr>
        <td><strong>井上</strong></td>
        <td>B</td>
        <td>Instagram</td>
    </tr>
    </table>    
        <a href="./ResultProf2.jsp"><i>TOP</i></a><br>
        <font size ="1" color ="red">※同じページへ飛びます※</font>       
        </body>
</html>
