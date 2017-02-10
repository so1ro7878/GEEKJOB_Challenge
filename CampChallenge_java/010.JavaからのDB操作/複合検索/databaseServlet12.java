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
public class databaseServlet12 extends HttpServlet {

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
            
            //文字コードを指定します
            request.setCharacterEncoding("UTF-8");
            
            //受け取るパラメータを定義します
            String n = request.getParameter("txtName");
            int a = Integer.parseInt(request.getParameter("Age"));
            String b = request.getParameter("Birth");
            
            Connection db_noshi = null;
            PreparedStatement db_st = null;
            ResultSet db_data = null;
            
            try{
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                db_noshi = DriverManager.getConnection("jdbc:mysql://localhost:3306/challenge_db", "noshikun", "Tknsh6378");
                System.out.println("Connection, Complete!!");
            //selectを使用して、検索された内容の処理します
                db_st = db_noshi.prepareStatement("select * from profiles where name = ? or age = ? or birthday = ?");   
                db_st.setString(1, n);  //txtName
                db_st.setInt(2, a);  //Age
                db_st.setString(3, b);  //Birth
                db_data = db_st.executeQuery();
                while(db_data.next()){
                    out.println("<font color = red >【見つかったユーザー】<br></font>");
                    out.println("ProfilesID：" + db_data.getInt(1) + "<br>");
                    out.println("名前：" + db_data.getString(2) + "<br>");
                    out.println("電話番号："+ db_data.getString(3) + "<br>");
                    out.println("年齢："+ db_data.getInt(4) + "<br>");
                    out.println("誕生日："+ db_data.getString(5) + "<br>");
                }
            db_noshi.close();
            db_data.close();
            db_st.close();
            
            }catch(SQLException eee){
                out.println("Errooooooooooor!!" + eee.toString());
            }catch(Exception e){
                out.println("Errooooooooooor!!" + e.toString());
            }finally{
                if(db_noshi != null){
                try{
                    db_noshi.close();
                }catch(Exception aaa){
                    System.out.println(aaa.getMessage());
                }
                }
            }
            
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>複合検索</title>");            
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
