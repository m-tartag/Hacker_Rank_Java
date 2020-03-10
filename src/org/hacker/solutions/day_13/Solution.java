package org.hacker.solutions.day_13;

abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

// Declare your class here. Do not use the 'public' access modifier.
// Declare the price instance variable

class MyBook extends Book {
    int price;

    // Write your constructor here

    MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }
    // Write your method here

    void display() {
        System.out.println("Title: "  + title);
        System.out.println("Author: " + author);
        System.out.println("Price: "  + price);
    }

}
