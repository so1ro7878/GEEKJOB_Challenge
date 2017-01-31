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
        File txt = new File("C:/Users/soich/OneDrive/ドキュメント/NetBeansProjects/javanoshi/web/test/takanoshi.txt");
        String a[] = {"髙野子 荘一郎","ギター","よろしくお願いします！"};
        //ファイルの上書き
        FileWriter fw = new FileWriter(txt);
        fw.write("私の名前は" + a[0] + "です。");
                
        //残りの情報を追記します
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("趣味は" + a[1] + "です。");
        bw.newLine();
        bw.write(a[2]);
        bw.newLine();
        bw.close();

        %>
    </body>
</html>
