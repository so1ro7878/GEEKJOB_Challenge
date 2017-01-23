/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.task2.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author soich
 */
public class Task2ServletBack extends HttpServlet {
    
    //booleanを定義します
    public final boolean handan = true;
    //プロフィールを定義します(名前、生年月日、自己紹介)＋handanで返します
    String getMyName(){
        return "髙野子　荘一郎";
    }
    String getMyBirthDay(){
        return "1988年7月8日";
    }
    String getMyProfile(){
        return "よろしくお願い致します！";
    }
    public boolean isHandan(){
        return handan;
    }
    //プロフィールを呼び出します
        String name = getMyName();
        String birth = getMyBirthDay();
        String prof = getMyProfile(); 
        
    
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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Task2ServletBack</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>");
        
        //handanがtrueの場合の処理、そうでない場合の処理を実行します
        if(handan == true){
            out.println("【この処理は正しく実行されました】<br>");
                for(int x = 0; x <= 10; x++){
                    out.println("私の名前は" + name + "です。<br>");
                    out.println("生年月日は" + birth + "です。<br>");
                    out.println(prof +"<br>");
            }
                }else{
                    out.println("【正しく実行されませんでした】");
        }    
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
