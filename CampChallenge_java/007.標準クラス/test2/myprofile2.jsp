<%-- 
    Document   : myprofile
    Created on : 2017/01/31, 16:57:06
    Author     : soich
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ファイルの書き出しと保存</title>
    </head>
    <body>
        <%@page import = "java.util.*;" %>
        <%@page import = "java.text.*;" %>
        <%@page import = "java.io.*;"%>
        <%
        //ファイルをオープン
        File txt = new File("C:/Users/soich/OneDrive/ドキュメント/NetBeansProjects/javanoshi/web/test2/takanoshi2.txt");
        
        //ファイルを読み込みます
        FileReader fr = new FileReader(txt);
        
        //高速化にてファイルを読み込み用にバッファリングし、1行用格納変数を定義します
        BufferedReader br = new BufferedReader(fr);
        String prof;
        while((prof = br.readLine()) != null){
            out.println(prof);
        }
        
        //クローズします
        br.close();
        
        %>
    </body>
</html>
