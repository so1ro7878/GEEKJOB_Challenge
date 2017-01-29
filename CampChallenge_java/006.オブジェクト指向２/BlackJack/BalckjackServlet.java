/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.blackjack.project;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
/**
 *
 * @author soich
 */
public class BalckjackServlet extends HttpServlet {

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
        
        //dealerとuserを用意する
        Dealer noshi = new Dealer();
        User soi = new User();
        
        noshi.setCard(noshi.deal()); //ディーラーの手札
        noshi.checkSum();            //ディーラーの合計
        noshi.hit();                 //ディーラーの補充
        noshi.open();                //ディーラーオープン
                       
        soi.setCard(soi.deal());     //ユーザーの手札    
        soi.checkSum();              //ユーザーの合計
        soi.hit();                   //ユーザーの補充
        soi.open();                  //ユーザーオープン
               
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>BalckjackServlet</title>");            
            out.println("</head>");
            out.println("<body>");
                            
        //if文条件分岐による判定
            out.println("ディーラーの合計は"+ noshi.myCards +"です<br>");
            out.println("ユーザーの合計は"+ soi.myCards +"です<br>");
            
            if(noshi.open() > soi.open() && noshi.open() < 22){
                out.println("Result☞Dealer【Win!!】<br>");
                    }else if(noshi.open() > soi.open() && noshi.open() > 21){
                        out.println("Result☞Dealer【Burst...】<br>");
                            }else if(noshi.open() < soi.open() && soi.open() < 22){
                             out.println("Result☞User【Win!!】<br>");
                                }else if(noshi.open() < soi.open() && soi.open() > 21){
                                    out.println("Result☞User【Burst...】<br>");
                                    }else{
                                        out.println("Result☞this Game【--------DRAW--------】<br>");
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
