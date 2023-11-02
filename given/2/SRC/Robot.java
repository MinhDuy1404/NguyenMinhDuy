/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FPT
 */
public class Robot {
    protected String label;
    protected int type;

    public Robot(String label, int type) {
        this.label = label;
        this.type = type;
    }

    public String getLabel() {
        return this.label;
    }

    public int getType() {
        return this.type;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return this.label + ", " + this.type;
    }
}
