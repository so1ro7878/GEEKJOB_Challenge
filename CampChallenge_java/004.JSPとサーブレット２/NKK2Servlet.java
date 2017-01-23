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
public class NKK2Servlet extends HttpServlet {
    
    //id番号の定義
    int nid = 818;
    int tid = 790;
    int kid = 131;
    
    //3人のプロフィールを定義します。
    String nakai[] = {"中居正広", "1972年8月18日", "神奈川県藤沢市", null};
    String kusanagi[] = {"草彅 剛", "1974年7月9日", "埼玉県春日部市", null};
    String katori[] = {"香取慎吾", "1977年1月31日", null, null};
    
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
    String getNhobby(){
        return nakai[3];
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
        String getKhobby(){
            return kusanagi[3];
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
            String getKhobby1(){
                return katori[3];
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
            out.println("<title>Servlet NKK2Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>");
            out.println("司会「皆さんの名前と生年月日と住所を教えてください」<br><br>");
            
            //ループ処理で定義された値がnullではないプロフィールを表示します
            for(int a = 0; a < nakai.length; a++){
                if(nakai[a] != null){
                out.println(nakai[a] +"です。<br>");
                    }else if(nakai[a] == null){
                        out.println("");
                        continue;
                    }
            }    
                for(int b = 0; b < kusanagi.length; b++){
                    if(kusanagi[b] != null){
                    out.println(kusanagi[b] + "です。<br>");
                    }else if(kusanagi[b] == null){
                        out.println("");
                        continue;
                    }
                }
                    for(int c = 0; c < katori.length; c++){
                        if(katori[c] != null){
                        out.println(katori[c] + "です。<br>");
                        }else if(katori[c] == null){
                            out.println("");
                            continue;
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
