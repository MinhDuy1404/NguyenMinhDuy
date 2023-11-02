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
    private String label;
    private int step;

    public Robot() {
        // default constructor
    }

    public Robot(String label, int step) {
        this.label = label;
        this.step = step;
    }

    public String getLabel() {
        return this.label;
    }

    public int getStep() {
        return this.step;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setStep(int step) {
        this.step = step;
    }
}
