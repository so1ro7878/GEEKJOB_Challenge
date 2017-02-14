/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.zaiko.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;


/**
 *
 * @author soich
 */
public class ZaikoMenuServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        
        //文字コードの指定をします    
        request.setCharacterEncoding("UTF-8");
        
        //入力されたパラメータを受け取ります
        String n = request.getParameter("name");
        String p = request.getParameter("price");
                
        Connection db_log = null;
        PreparedStatement db_st = null;
        ResultSet db_data = null;
               
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_log = DriverManager.getConnection("jdbc:mysql://localhost:3306/zaikosystem","zaiko78","zaiko78");
            System.out.println("接続完了です！<br>");
            //ログインの可否を確認します
            db_st = db_log.prepareStatement("insert into products values(?, ?)");
            db_st.setString(1, request.getParameter("name"));
            db_st.setString(2, request.getParameter("price"));
            int x = db_st.executeUpdate();            
                    out.println(x + "件の商品を追加しました<br>");
            db_st = db_log.prepareStatement("select * from products where name = ?");
            db_st.setString(1, n);
            db_data = db_st.executeQuery();
            while(db_data.next()){
                out.println("<table border= 1 cellpadding = 5 cellspacing = 0>");
                out.println("<tr>");
                out.println("<td>商品名</td>");
                out.println("<td>値段</td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td>" + db_data.getString("name") + "</td>");
                out.println("<td>" + db_data.getString("price") + "</td></tr>");
                out.println("</table><br><br>");
                }
                out.println("<a href = './top.jsp'>TOP</a><br>");
                out.println("<a href = './products.jsp'>商品一覧</a><br>");
                
                       
        }catch(SQLException e_sql){
            System.out.println("接続エラーです" + e_sql.toString());
        }catch(Exception e){
            System.out.println("接続エラーです" + e.toString());
        }finally{
            if(db_log != null && db_st != null && db_data != null){
            try{
                db_data.close();
                db_st.close();
                db_log.close();
            }catch(Exception e_con){
                System.out.println(e_con.getMessage());
            }
            }
        
        }    
            
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ZaikoMenuServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
