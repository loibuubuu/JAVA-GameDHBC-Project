/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBEntities;

/**
 *
 * @author LENOVO
 */
public class Store {

    public String cardID, seri;
    public int card_value, gem;

    public Store() {
    }

    public Store(String cardID, String seri, int card_value, int gem) {
        this.cardID = cardID;
        this.seri = seri;
        this.card_value = card_value;
        this.gem = gem;
    }

    public String getCardID() {
        return cardID;
    }

    public String getSeri() {
        return seri;
    }

    public int getCard_value() {
        return card_value;
    }

    public int getGem() {
        return gem;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public void setSeri(String seri) {
        this.seri = seri;
    }

    public void setCard_value(int card_value) {
        this.card_value = card_value;
    }

    public void setGem(int gem) {
        this.gem = gem;
    }
}
