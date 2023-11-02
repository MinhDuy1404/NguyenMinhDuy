/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FPT
 */
public class Engine {
    private String designer;
    private int power;

    public Engine() {
        this.designer = "";
        this.power = 0;
    }

    public Engine(String designer, int power) {
        this.designer = designer;
        this.power = power;
    }

    public String getDesigner() {
        String s = designer.substring(0, 3);
        return s.substring(0, 1).toLowerCase() + s.substring(1);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
