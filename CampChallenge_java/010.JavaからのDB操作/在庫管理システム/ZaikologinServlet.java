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
import javax.servlet.http.*;

/**
 *
 * @author soich
 */
public class ZaikologinServlet extends HttpServlet {

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
        
        Connection db_log = null;
        PreparedStatement db_st = null;
        ResultSet db_data = null;
               
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_log = DriverManager.getConnection("jdbc:mysql://localhost:3306/zaikosystem","zaiko78","zaiko78");
            System.out.println("接続完了です！<br>");
            //ログインの可否を確認します
            db_st = db_log.prepareStatement("select * from member where ID = ? PASS = ?");
            db_st.setString(1, request.getParameter("ID"));     //IDの受け取り
            db_st.setString(2, request.getParameter("PASS"));   //PASSの受け取り
            db_data = db_st.executeQuery();
                
            if(db_data.next()){
                HttpSession hs = request.getSession();
                while(db_data.next()){
                    hs.setAttribute("ID", db_data.getString("ID"));
                }  
            }
            db_data.close();
            db_st.close();
            db_log.close();             
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
            out.println("ログインが完了しました！");
            out.println("<a href = './top.jsp'>こちら</a>から入場下さい。");
        }    
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
