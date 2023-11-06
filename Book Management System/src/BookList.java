

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FPT
 */

import java.util.ArrayList;
public class BookList {
    ArrayList<Book> t;

    public BookList() {
        this.t = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.t.add(book);
    }

    public void displayBooks() {
        this.t.forEach((book) -> {
            System.out.println(book);
        });
    }

    // Implement other methods as per your assignment
}