package de.telran.data;

public class Journal implements  Printable{
    private  String title;

    public Journal(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void print() {

    }

    @Override
    public void print2(String str) {

    }
}
