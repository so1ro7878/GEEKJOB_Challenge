/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.task3.bandman;

/**
 *
 * @author soich
 */

//BandClassを定義します
public class BandClass {
    //フィールド(2つの変数定義)
    public String name = "";             
    public String bloodtype = "";
        //メソッド(値を設定する)
        public void setBandClass(String n, String b){
            this.name = n;
            this.bloodtype = b;
        } 
            public void showName(){}
            public void showBlood(){}
}
