<%-- 
    Document   : profdata
    Created on : 2017/02/03, 11:13:59
    Author     : soich
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="java.util.*"%>
<%@page import ="java.text.*"%>
<%@page import ="javax.servlet.http.*" %>
<%@page import ="java.io.*" %>
<%@page import ="java.lang.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>入力フィールドの作成と実装</title>
    </head>
    <body>
        <%
        //セッション情報を読み込みます。
        String nn = (String)session.getAttribute("txtName");
        String ss = (String)session.getAttribute("rdosx");
        String hh = (String)session.getAttribute("hbText");

        //nullかどうかチェックします(名前、趣味)
        String tN;
        if(nn != null){
            tN = nn;
            }else if(nn == null){
                tN = "";
        }
        String hT;
        if(hh != null){
            hT = hh;
        }else if(hh == null){
                hT = "";
        }
        
        %>
        <form action="./ResultProf.jsp" method ="post">
        <font size ="5" color ="magenta" >★あなたのプロフィールを教えてください★</font>
        <br>
        <br>
        名前<input type="text" name="txtName"value ="<%= nn %>"><br>
        <font size ="1" color ="red" >※ニックネームでもOK</font><br><br>
        性別<input type="radio" name="rdosx" value="0" checked = "checked">男性<input type="radio" name="rdosx" value="1" checked = "checked">女性<br>
        <font size ="1" color ="red" >※嘘はいけませんよ</font><br><br>
        趣味<textarea name="hbText"><%= hh %></textarea><br>
        <font size ="1" color ="red" >※多趣味歓迎！</font><br><br>
        <input type="submit" value="送信">
        </form>
    </body>
</html>
