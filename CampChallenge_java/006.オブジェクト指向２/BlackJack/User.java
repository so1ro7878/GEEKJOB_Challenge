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
public class User extends Human{
    //cardsというArrayListの変数を用意
    ArrayList<Integer> cards = new ArrayList<>();
    //コンストラクタですべてのトランプ(13枚)を持たせ、カードを切る(シャッフル処理)
    public User(){
        for(int i = 1; i < 14; i++){
           cards.add(i);
           Collections.shuffle(cards);
        }
}
    //dealという公開メソッドを用意【】
    public ArrayList<Integer> deal(){
    //cardsからランダムで2枚のカードをArrayListに返却
    ArrayList<Integer> deal = new ArrayList<>();
    deal.add(cards.get(0));
    deal.add(cards.get(1));
    
        return deal;
    }
    //hitという公開メソッドを用意
    public ArrayList<Integer> hit(){
    //cardsからランダムで1枚のカードをArrayListに返却
    ArrayList<Integer> hit = new ArrayList<>();
    if(true){
    hit.add(cards.get(0));
    }
        return hit;
    }
    //checksumは、myCardsを確認し、カードが必要(16以上)ならtrue/必要なければfalseを返却する
    @Override
    public boolean checkSum(){
        int i = open();
        if(open() > 16){
                return false;
            }else{
                return true;
        }
    }
    //openは、myCardsの合計値を返却する
    @Override
    public int open(){
    int plus = 0;
        for(int i = 0; i < myCards.size(); i++){
        plus += myCards.get(i);
        }
        return plus;
    }
    
    //setCardは、ArrayListで受けたカード情報をmyCardsに追加
    @Override
    public void setCard(ArrayList<Integer> setCard){
    myCards.addAll(setCard);
    }
}
