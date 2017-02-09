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
public class databaseServlet11 extends HttpServlet {

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
            String n = request.getParameter("txtName");
            String t = request.getParameter("tel");
            int a = Integer.parseInt(request.getParameter("age"));
            String b = request.getParameter("birth");
            
            Connection db_noshi = null;
            PreparedStatement db_st = null;
            ResultSet db_data = null;
            
            try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_noshi = DriverManager.getConnection("jdbc:mysql://localhost:3306/challenge_db","noshikun","Tknsh6378");
            System.out.println("接続完了です！<br>");
            //updateを使用した、指定されたprofilesIDのレコードのprofilesID以外を上書きする処理を実施します
            db_st = db_noshi.prepareStatement("update profiles set name = '" + n + "'" + ", tell =" +  "'" + t + "'" + ", age =" + a + ", birthday =" + "'" + b + "'" + " where profilesID =" + i);
            int x = db_st.executeUpdate();            
                    out.println(x + "件の該当メンバーのプロフィールを更新しました<br><br>");
                    out.println("更新内容は下記です。<br><br>");
            //更新内容を表示します
            db_st = db_noshi.prepareStatement("select * from profiles where profilesID =" + i);
            db_data = db_st.executeQuery();
            while(db_data.next()){
                    out.println("名前：" + db_data.getString("name") + "<br>");
                    out.println("電話番号：" + db_data.getString("tell") + "<br>");
                    out.println("年齢：" + db_data.getInt("age") + "<br>");
                    out.println("誕生日：" + db_data.getString("birthday") + "<br>");
            }
            db_data.close();
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
            out.println("<title>特定のレコードの更新</title>");            
            out.println("</head>");
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
