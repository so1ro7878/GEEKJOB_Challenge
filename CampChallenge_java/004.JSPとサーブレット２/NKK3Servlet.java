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
public class NKK3Servlet extends HttpServlet {
    //id番号とリミット番号の定義
    int nid = 818;  //中居氏のid
    int tid = 790;  //草彅氏のid
    int kid = 131;  //香取氏のid
    int limit = 2;  //リミット番号
    
    //3人のプロフィールを定義します。
    String nakai[] = {"中居正広", "1972年8月18日", "神奈川県藤沢市"};
    String kusanagi[] = {"草彅 剛", "1974年7月9日", "埼玉県春日部市"};
    String katori[] = {"香取慎吾", "1977年1月31日", "神奈川県横浜市"};
  
    //1人目の呼び出し
    String getNname(){
        return nakai[0];
    }
    String getNbirth(){
        return nakai[1];
    }
    String getNaddress(){
        return nakai[2];
    }
        //2人目の呼び出し
        String getKname(){
            return kusanagi[0];
        }
        String getKbirth(){
            return kusanagi[1];
        }
        String getKaddress(){
            return kusanagi[2];
        }
            //3人目の呼び出し
            String getKname1(){
                return katori[0];
            }
            String getKbirth1(){
                return katori[1];
            }
            String getKaddress1(){
                return katori[2];
            }
                
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
            out.println("<title>Servlet NKK3Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>");
            
            //limitの値が2の場合は2人目までのプロフィールを表示、3の場合は全員の名前を表示
            if(limit == 2){
                for(int a = 0; a < nakai.length; a++){  
                  out.println(nakai[a] + "です<br>");
                    for(int b = 0; b < kusanagi.length; b++){
                    out.println(kusanagi[b] + "です。<br>");
                    }
                }
                }else if(limit == 3){
                        for(int a = 0; a < nakai.length; a++){  
                            out.println(nakai[a] + "です<br>");
                        }
                            for(int b = 0; b < kusanagi.length; b++){
                                out.println(kusanagi[b] + "です。<br>");
                            }
                                for(int c = 0; c < katori.length; c++){
                                    out.println(katori[c] + "です。<br>");
                                }
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

