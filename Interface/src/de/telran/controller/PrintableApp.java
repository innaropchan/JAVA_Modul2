package de.telran.controller;

import de.telran.data.*;

public class PrintableApp {
    public static void main(String[] args) {

        Book book = new Book("The little prince", "Saint-Exupery");
        Printable book2 = new Book("War and Peace", "Lev Tolstoy");
        Printable journal = new Journal(" World");
        Printable newspaper = new Newspaper();
        WaterPipe pipe = new WaterPipe();

        Printable[] printableObjects= {book, book2, journal, newspaper, pipe};

        Lamp lamp = new Lamp();

        lamp.printsState(0);
        pipe.printsState(1);

     //   for (Printable p:printableObjects) {
          //  p.print();
      //  }

        book.print2("I`m a book");
        newspaper.print2("Morgen Post");

        Printable print= new Printable() {
            @Override
            public void print() {
                System.out.println("i`m printer");
            }
        };



        Printable.print1();
        Printable p = Printable.createObjects("Peace", 2);
        p.print();

    }
}

