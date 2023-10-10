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

public class Statue extends Item {
    private int weight;
    private String colour;

    public Statue() {
    }

    public Statue(int value, String creator, int weight, String colour) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public void outputStatue() {
        super.output();
        System.out.println("Weight: " + weight);
        System.out.println("Colour: " + colour);
    }

    public void inputStatue() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight: ");
        this.weight = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter colour: ");
        this.colour = scanner.nextLine();
    }
}
