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

public class Vase extends Item {
    private int height;
    private String material;

    public Vase() {
    }

    public Vase(int value, String creator, int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public void outputVase() {
        super.output();
        System.out.println("Height: " + height);
        System.out.println("Material: " + material);
    }

    public void inputVase() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter height: ");
        this.height = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter material: ");
        this.material = scanner.nextLine();
    }
}

