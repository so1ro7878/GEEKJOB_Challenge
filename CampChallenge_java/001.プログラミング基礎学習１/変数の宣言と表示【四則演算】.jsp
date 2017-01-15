<%-- 
    Document   : 変数の宣言と表示【四則演算】
    Created on : 2017/01/15, 16:41:04
    Author     : soich
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>変数の宣言と表示(四則演算)</title>
    </head>
    <body>
        <%
        //変数を宣言します
        int num1 = 15;
        int num2 = 3;
        String text="15と3を使った四則演算の結果です。";
        out.println(text);
        out.println("<br>");
        
        //aは18になります
        int a = num1 + num2;
        //bは12になります
        int b = num1 - num2;
        //cは45になります
        int c = num1 * num2;
        //dは5になります
        int d = num1 / num2;
        //eは0になります
        int e = num1 % num2;
        
            //足し算の結果
                out.println(num1 + "+" + num2 + "=" + a);
                out.println("<br>");
            //引き算の結果
                out.println(num1 + "-" + num2 + "=" + b);
                out.println("<br>");        
            //掛け算の結果
                out.println(num1 + "*" + num2 + "=" + c);
                out.println("<br>");
            //割り算の結果
                out.println(num1 + "/" + num2 + "=" + d);       
                out.println("<br>");
            //余剰算の結果
                out.println(num1 + "%" + num2 + "=" + e);
                out.println("<br>");
        
        %>
    </body>
</html>
