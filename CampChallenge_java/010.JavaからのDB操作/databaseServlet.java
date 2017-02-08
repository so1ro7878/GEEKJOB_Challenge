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
import java.sql.*;  //①データベース操作に必要なクラス定義のためのインポート文を用意します

/**
 *
 * @author soich
 */
public class databaseServlet extends HttpServlet {

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
        try(PrintWriter out = response.getWriter();){
        
        //②データベース接続を管理するConnectionクラスを用いて変数を用意します
        Connection db_con = null;
        
        try
            {
            //③ライブラリに登録したMySQL用のドライバーを利用可能にします
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            //④DriverManagerクラスで用意されているgetConnectionメソッドを使用し、Connectionクラスのインスタンスを取得します
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/challenge_db","noshikun","PPAPpass");    //DB名、ユーザ名とパスワードは仮の値です
                    out.println("接続が完了しました。");    //接続完了時の表示
            }catch(SQLException e_sql){                    //例外処理(エラーハンドリング)
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
            out.println("<title>エラーハンドリングを含んだ接続の確立</title>");            
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
