/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FPT
 */
public class SpecRobot extends Robot {
    private int step;

    public SpecRobot(String label, int type, int step) {
        super(label, type);
        this.step = step;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + this.step;
    }

    public void setData() {
        if (this.label.length() >= 2) {
            this.label = this.label.substring(0, 1) + this.step + this.label.substring(2);
        }
    }

    public int getValue() {
        if (this.type < 3 && this.label.contains("A")) {
            return this.step;
        } else {
            return step +2;
        }
    }
}
