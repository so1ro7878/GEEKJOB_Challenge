<%-- 
    Document   : sample
    Created on : 2017/02/01, 16:05:26
    Author     : soich
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HTMLの入力データの取得と表示</title>
    </head>
    <body>
            <%
            //受け取るパラメータの文字コードを指定する
            request.setCharacterEncoding("UTF-8");
            
            //データの受け取り
            String n = request.getParameter("txtName");
            String s = request.getParameter("rdosx");
            String h = request.getParameter("hbText");
            
                //結果を表示します
                out.println("あなたは" + n + "さんですね。<br>");
                if(Integer.parseInt(s) == 0){
                    out.println("男性の方なのですね。<br>");
                    }else{
                        out.println("");
                    }
                    if(Integer.parseInt(s) == 1){
                        out.println("女性の方なのですね。<br>");
                        }else{
                            out.println("");
                        }
                out.println("趣味は" + h + "なのですね。<br>");
            %>
    </body>
</html>
