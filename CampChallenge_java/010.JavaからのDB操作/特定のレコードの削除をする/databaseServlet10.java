/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.database.serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author soich
 */
public class databaseServlet10 extends HttpServlet {

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
            //受け取るパラメータの文字コードを指定する
            request.setCharacterEncoding("UTF-8");
            
            //データの受け取り
            int i = Integer.parseInt(request.getParameter("id"));
                                    
            Connection db_noshi = null;
            PreparedStatement db_st = null;
            ResultSet db_data = null;
            
            try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_noshi = DriverManager.getConnection("jdbc:mysql://localhost:3306/challenge_db","noshikun","Tknsh6378");
            System.out.println("接続完了です！<br>");
            //deleteを使用して入力されたiを削除する文
            db_st = db_noshi.prepareStatement("delete from profiles where profilesID = " + i);
            int x = db_st.executeUpdate();            
                    out.println(x + "件の該当メンバーのプロフィールを削除しました<br>");
            db_st.close();
            db_noshi.close();
                 
            }catch(SQLException eee){
                out.println("Connection, Erroooooooooooooooooor!!!!" + eee.toString());
            }catch(Exception e){
                out.println("Connection, Erroooooooooooooooooor!!!!" + e.toString());
            }
            
            
            
            
            
            
            
            
            
            
            
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>特定のレコードを削除する</title>");            
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
