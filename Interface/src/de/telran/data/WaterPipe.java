package de.telran.data;

public class WaterPipe implements Stateable, Printable {
    @Override
    public void print(){
        System.out.println(" i`m pipe");

    }

    @Override
    public void printsState(int n) {
        if (n==OPEN){
            System.out.println("water is open");
        }else if (n==CLOSED) {
            System.out.println("water is closed");
        }else{
            System.out.println("stare not valid");
        }
    }
}
