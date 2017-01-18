<%-- 
    Document   : クエリストリング【簡易素因数分解】
    Created on : 2017/01/17, 20:45:32
    Author     : soich
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>クエリストリングの利用(簡易素因数分解)</title>
    </head>
    <body>
        <%@ page import ="java.util.*" %>
        <%
        //kazuに数値を入れるクエリストリングで処理します
        int s = Integer.parseInt(request.getParameter("kazu"));
        out.println("元の値は【" + s + "】です。");
        out.println("<br>");
        out.println("素因数は下記です。");
        out.println("<br>");
        
        //素数を定義します[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]
        int sosu[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};      
       
        //各素数で割り算を実施します
        while(s % sosu[0] == 0){
            s /= sosu[0];
            out.println(2);
        } 
            while(s % sosu[1] == 0){
                s /=sosu[1];
                out.println(3);
            }
                while(s % sosu[2] == 0){
                    s /= sosu[2];
                    out.println(5);    
                }
                    while(s % sosu[3] == 0){
                       s /= sosu[3];
                        out.println(7);
                        }
                        while(s % sosu[4] == 0){        //素数が2桁以上の場合にその他と表示する
                            s /= sosu[4];
                            out.println("その他");  
                            } 
                            while(s % sosu[5] == 0){       
                                s /= sosu[5];
                                out.println("その他");  
                                }
                                while(s % sosu[6] == 0){       
                                    s /= sosu[7];
                                    out.println("その他");  
                                    }
                                        while(s % sosu[7] == 0){       
                                            s /= sosu[7];
                                            out.println("その他");  
                                            }
                                            while(s % sosu[8] == 0){       
                                                s /= sosu[8];
                                                out.println("その他");  
                                                }                    
                                                while(s % sosu[9] == 0){       
                                                    s /= sosu[9];
                                                    out.println("その他");  
                                                    }
                                                    while(s % sosu[10] == 0){       
                                                        s /= sosu[10];
                                                        out.println("その他");  
                                                        }
                                                        while(s % sosu[11] == 0){       
                                                            s /= sosu[11];
                                                            out.println("その他");  
                                                            }
                                                            while(s % sosu[12] == 0){       
                                                                s /= sosu[12];
                                                                out.println("その他");  
                                                                }
                                                                while(s % sosu[12] == 0){       
                                                                    s /= sosu[12];
                                                                    out.println("その他");  
                                                                    }
                                                                    while(s % sosu[12] == 0){       
                                                                        s /= sosu[12];
                                                                        out.println("その他");  
                                                                        }
                                                                        while(s % sosu[13] == 0){       
                                                                            s /= sosu[13];
                                                                            out.println("その他");  
                                                                            }
                                                                            while(s % sosu[14] == 0){       
                                                                                s /= sosu[14];
                                                                                out.println("その他");  
                                                                                }
                                                                                while(s % sosu[15] == 0){       
                                                                                    s /= sosu[15];
                                                                                    out.println("その他");  
                                                                                    }
                                                                                    while(s % sosu[16] == 0){       
                                                                                        s /= sosu[16];
                                                                                        out.println("その他");  
                                                                                        }
                                                                                        while(s % sosu[17] == 0){       
                                                                                            s /= sosu[18];
                                                                                            out.println("その他");  
                                                                                            }
                                                                                            while(s % sosu[19] == 0){       
                                                                                                s /= sosu[19];
                                                                                                out.println("その他");  
                                                                                                }
                                                                                                while(s % sosu[20] == 0){       
                                                                                                    s /= sosu[20];
                                                                                                    out.println("その他");  
                                                                                                    }
                                                                                                    while(s % sosu[21] == 0){       
                                                                                                        s /= sosu[21];
                                                                                                        out.println("その他");  
                                                                                                        }
                                                                                                        while(s % sosu[22] == 0){       
                                                                                                            s /= sosu[22];
                                                                                                            out.println("その他");  
                                                                                                            }
                                                                                                            while(s % sosu[23] == 0){       
                                                                                                                s /= sosu[23];
                                                                                                                out.println("その他");  
                                                                                                                }
                                                                                                            while(s % sosu[24] == 0){       
                                                                                                                s /= sosu[24];
                                                                                                                out.println("その他");  
                                                                                                    }
        
        %>       
    </body>
</html>
