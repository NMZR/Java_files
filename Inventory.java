package com.mini.project;
public class Inventory {
    private Book[] books;
    private int count; 
 // checking the space of the inventory 
    public Inventory(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    public void addBook(Book book) {
      
        if (count >= books.length) {
            System.out.println("Inventory is full. Cannot add more books.");
        } else {
            books[count] = book;
            count++;
        }
    }
///printing the updated books position
    public void listBooks() {
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }


}

