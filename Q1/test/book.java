/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FPT
 */
public class book {
    protected String maker;
    protected int volume;

    public book() {
        this.maker = ""; 
        this.volume = 0; 
    }

    public book(String maker, int volume) {
        this.maker = maker;
        this.volume = volume;
    }

    public String getMaker() {
        return maker.toLowerCase(); 
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    void setPrice(int xPrice2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getTitle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int getPrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


