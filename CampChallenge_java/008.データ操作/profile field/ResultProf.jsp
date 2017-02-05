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
        //文字コードを指定します
        request.setCharacterEncoding("UTF-8");
        
        //データを受け取ります
        String n = request.getParameter("txtName");
        String s = request.getParameter("rdosx");
        String h = request.getParameter("hbText");
        
        //セッションを使用します
        HttpSession hs = request.getSession(true);
        hs.setAttribute("txtName", n);
        hs.setAttribute("rdosx", s);
        hs.setAttribute("hbText", h);
        hs.setMaxInactiveInterval(7200);
        
        //入力された結果を表示します    
            out.println(n + "さんですね。<br>");
            if(Integer.parseInt(s) == 0){
                out.println("男性の方なのですね。<br>");
                }else{
                    out.println("");
                }
                    if(Integer.parseInt(s) == 1){
                        out.println("女性なのですね。<br>");
                        }else{
                            out.println("");
                        }
            out.println("趣味は" + h + "ですか。いいですね！<br>");
        %>
        <br>
        <br>
        <a href="./profdata.jsp">TOP</a><br><br><br>
                
        </body>
</html>
