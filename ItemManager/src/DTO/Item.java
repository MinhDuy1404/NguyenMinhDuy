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

public class Item {
    protected int value;
    protected String creator;

    public Item() {
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public void output() {
        System.out.println("Value: " + value);
        System.out.println("Creator: " + creator);
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value: ");
        this.value = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter creator: ");
        this.creator = scanner.nextLine();
    }
}


