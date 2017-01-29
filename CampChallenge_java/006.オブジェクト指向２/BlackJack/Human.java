/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.blackjack.project;

import java.util.*;
/**
 *
 * @author soich
 */
//Humanという抽象クラスを作成する、以下は継承先で必ず実装させるメソッド
abstract public class Human {
    //openというabstractな公開メソッドを用意する【カードをオープンするメソッド】
    abstract public int open();
    //setCardというArrayListを引数とした、abstractな公開メソッドを用意する【手札を準備するメソッド】
    abstract public void setCard(ArrayList<Integer> setCard);
    //checkSumというabstractな公開メソッドを用意する【カードの合計値を確認するメソッド】
    abstract public boolean checkSum();
    //myCardsというArrayListの変数を用意する
    ArrayList<Integer> myCards = new ArrayList<>();
}
