/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author PIGA
 */
import java.util.Scanner;

public class Painting extends Item {
    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;

    public Painting() {
    }

    public Painting(int value, String creator, int height, int width, boolean isWatercolour, boolean isFramed) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }


    public void outputPainting() {
        super.output();
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Is Watercolour: " + isWatercolour);
        System.out.println("Is Framed: " + isFramed);
    }

    public void inputPainting() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter height: ");
        this.height = scanner.nextInt();
        System.out.print("Enter width: ");
        this.width = scanner.nextInt();
        System.out.print("Is it watercolour? (true/false): ");
        this.isWatercolour = scanner.nextBoolean();
        System.out.print("Is it framed? (true/false): ");
        this.isFramed = scanner.nextBoolean();
    }
}

