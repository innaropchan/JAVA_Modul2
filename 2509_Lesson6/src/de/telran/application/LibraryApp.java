package de.telran.application;

import de.telran.dao.Library;
import de.telran.data.Book;

public class LibraryApp {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "Joan Rollings", 2005, 435);
        Book book2 = new Book("Winnie the Pooh", "Alex Milan", 1957, 256);
        Book book3 = new Book("Sherlock Holmes", "Artur Conan Doyle", 1892, 388);
        Book book4 = new Book("Little prince", "Saint-Exupery", 1938, 300);


        Library myLib = new Library(100);
       //System.out.println(myLib);
        myLib.addBook(book1);
        myLib.addBook(book2);
        myLib.addBook(book3);
        myLib.addBook(book4);
        //System.out.println(myLib.getSize());
        //myLib.display();
        myLib.addBook(new Book("War and Piece", "Lev Tolstoy", 1886, 678));
        //System.out.println(myLib.getSize());
      //  myLib.deleteBook(book3);
       // myLib.display();

        myLib.searchBookByAuthor("Alex Milan");
        myLib.searchBookByAuthor("Gogol");
    }
}


