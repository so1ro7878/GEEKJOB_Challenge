/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.database.serv;

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
public class databaseServlet2 extends HttpServlet {

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
           
        Connection db_con = null;
        PreparedStatement db_st = null; 
        ResultSet db_data = null;
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/challenge_db","noshikun","Tknsh6378");
            out.println("接続完了です！<br>");
            //insertにてレコードを追加します
            db_st = db_con.prepareStatement("insert into profiles values(?,?,?,?,?)");
            db_st.setInt(1,7);
            db_st.setString(2, "髙野子 雅宜");
            db_st.setString(3, "0120-444-444");
            db_st.setInt(4, 65);
            db_st.setString(5, "1951-12-21");
            int i = db_st.executeUpdate();            
                    out.println(i + "件の処理を追加しました<br>");
            db_st = db_con.prepareStatement("select * from profiles where age = ?");
            db_st.setInt(1, 65);
            db_data = db_st.executeQuery();
            while(db_data.next()){
                out.println("名前：" + db_data.getString("name") + "さんです。<br>");
            }
            db_data.close();
            db_st.close();
            db_con.close();
            
        }catch(SQLException e_sql){
            out.println("接続エラーです" + e_sql.toString());
        }catch(Exception e){
            out.println("接続エラーです" + e.toString());
        }finally{
            if(db_con != null){
            try{
                db_con.close();
            }catch(Exception e_con){
                System.out.println(e_con.getMessage());
            }
            }
        
        }
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>テーブルへ情報を格納</title>");            
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
