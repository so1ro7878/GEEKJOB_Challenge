<%-- 
    Document   : クエリストリングの利用
    Created on : 2017/01/15, 17:54:10
    Author     : soich
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>クエリストリングの利用</title>
    </head>
    <body>
        <%
                             
    //①商品種別は、３つ。１：雑貨、２：生鮮食品、３：その他。まずは、この商品種別を表示してください。
    //商品種別を定義する
    int s = Integer.parseInt(request.getParameter("param3"));      
    //sが1ならば、１：雑貨を表示する
    if(s == 1){
        out.println("この商品は、１：雑貨です。");
        }
        out.println("<br>");
    //sが2ならば、２：生鮮食品を表示する
        if(s == 2){
            out.println("この商品は、２：生鮮食品です。");
            }
            out.println("<br>");
    //sが1および2でないならば、３：その他を表示する
            if(s == 3){
                out.println("この商品は、３：その他です。");
                }
                out.println("<br>");
    
    //②総額と個数から１個当たりの値段を算出してください。総額と１個当たりの値段を表示してください。    
    //総額と、個数の定義
    int a = Integer.parseInt(request.getParameter("param1")); 
    int n = Integer.parseInt(request.getParameter("param2")); 
        //総額及び１個当たりの値段を表示
            out.println("総額は"+ a + "円になります。");
            out.println("<br>");
            out.println("本商品の１個当たりの値段は" +(a / n)+ "円です。");    
            out.println("<br>");
            out.println("<br>");
            
    //③3000円以上購入で4%、5000円以上購入で5%のポイントが付きます。購入額に応じたポイントの表示を行ってください。
    //変数を定義します
    double x = 0.04;
    double y = 0.05;
        
    //3000円以上の場合の4%のポイントを表示
    if(a >= 3000 && a < 5000){
       out.println("3000円以上お買い上げの為、" + (a * x ) + "ポイントが付与されます");
    }
       out.println("<br>");
    
    //5000円以上の場合の5%のポイントを表示
    if(a >= 3000 && a > 5000){
       out.println("5000円以上お買い上げの為、" + (a * y ) + "ポイントが付与されます");
    }
       out.println("<br>");
        %>
    </body>
</html>
