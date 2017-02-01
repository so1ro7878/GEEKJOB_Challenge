<%-- 
    Document   : normal_last
    Created on : 2017/01/31, 17:29:52
    Author     : soich
--%>

<%@page import="org.jboss.logging.Logger"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <tiクラスを利用して処理を作成</title>
    </head>
    <body>
        <%@page import = "java.util.*;" %>
        <%@page import = "java.text.*;" %>
        <%@page import = "java.io.*;" %>
        <%
        //処理の経過を書き込むログファイルを作成します
        File flog = new File("C:/Users/soich/OneDrive/ドキュメント/NetBeansProjects/javanoshi/web/標準クラス最終課題/log.txt");
        
        //書き込むための日時を取得します
        Calendar cal = Calendar.getInstance();
        int y = cal.get(Calendar.YEAR);             //年
        int m = cal.get(Calendar.MONTH)+1;          //月
        int d = cal.get(Calendar.DAY_OF_MONTH);     //日
        int h = cal.get(Calendar.HOUR_OF_DAY);      //時
        int mm = cal.get(Calendar.MINUTE);          //分
        int s = cal.get(Calendar.SECOND);           //秒
        
        //上書きのオブジェクトを作成します
        FileWriter fwt = new FileWriter(flog);
        fwt.write("処理開始【" + y + "/" + m + "/" + d +"_" + h + "：" + mm + "：" + s +"】...<br><br>");
        
        //まとめの上書きオブジェクトを作成します
        BufferedWriter bwt = new BufferedWriter(fwt);
        //処理内容を記載します
        String soi[] = {"「次の文の英語の部分を全部大文字にしたいなぁ」", "【boowyのlast gigsは最高だったthank you!!】" , "変換中..."};
        bwt.write(soi[0] + "　　　【" + y + "/" + m + "/" + d +"_" + h + "：" + mm + "：" + s +"】...<br>");
        bwt.newLine();
        bwt.write(soi[1] + "　　　【" + y + "/" + m + "/" + d +"_" + h + "：" + mm + "：" + s +"】...<br><br>");
        bwt.newLine();
        bwt.write(soi[2] + "【" + y + "/" + m + "/" + d +"_" + h + "：" + mm + "：" + s +"】...<br><br>");
        bwt.newLine();
        bwt.write(soi[1].toUpperCase()  + "【" + y + "/" + m + "/" + d +"_" + h + "：" + mm + "：" + s +"】...<br><br>");
        bwt.newLine();
        bwt.write("処理終了【" + y + "/" + m + "/" + d +"_" + h + "：" + mm + "：" + s +"】...<br>");
        bwt.close();        
        
        //読み込むオブジェクトを作成します
        FileReader frd = new FileReader(flog);
        //高速化バッファリングします
        BufferedReader brd = new BufferedReader(frd);
        String boi;
        while((boi = brd.readLine()) != null){
            out.println(boi);
        }
        //クローズします
        brd.close();
        
        %>
    </body>
</html>
