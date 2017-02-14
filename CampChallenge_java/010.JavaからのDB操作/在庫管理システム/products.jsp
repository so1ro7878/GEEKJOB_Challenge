<%-- 
    Document   : products
    Created on : 2017/02/13, 15:32:25
    Author     : soich
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>商品一覧</title>
    </head>
    <body>
        <%@page import = "java.sql.*;" %>
        <font color = "blue" size = "4">商品一覧</font><br><br>
        <table border= 1 cellpadding = 5 cellspacing = 0>
        <tr>
            <td>商品名</td>
            <td>値段</td>
        </tr>
            <%
         
        Connection db_log = null;
        PreparedStatement db_st = null;
        ResultSet db_data = null;
        
        Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_log = DriverManager.getConnection("jdbc:mysql://localhost:3306/zaikosystem","zaiko78","zaiko78");
            System.out.println("接続完了です！<br>");
            //selectを使用し、商品一覧を出力します。
            db_st = db_log.prepareStatement("select * from products");
            db_data = db_st.executeQuery();
            while(db_data.next()){
                out.println("<tr>");
                out.println("<td>" + db_data.getString("name") + "</td>");
                out.println("<td>" + db_data.getString("price") + "</td></tr>");
                }
            %>
        </table>
            <br>
            <br>
            <font size = "3"><a href = "./top.jsp"><i>TOP</i></a>
    
    </body>
</html>
