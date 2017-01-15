<%-- 
    Document   : 変数の宣言と表示【if文】
    Created on : 2017/01/15, 17:29:53
    Author     : soich
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>変数の宣言と表示(if文)</title>
    </head>
    <body>
        <%
        //もし値が1なら「１です！」を表示
        //2なら「プログラミングキャンプ！」を表示
        //それ以外なら「その他です！」を表示
        
       int param = 0;
       
        if(param == 1){
            out.println("１です！");
        }else if(param == 2){
            out.println("プログラミングキャンプ！");
            }else{
                out.println("その他です！");
        }
        
        %>
    </body>
</html>
