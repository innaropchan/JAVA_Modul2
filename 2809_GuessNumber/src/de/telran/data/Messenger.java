package de.telran.data;

import java.util.Scanner;

public class Messenger {
    Scanner scanner = new Scanner(System.in);

    public void displayMessege(String str) {
        System.out.println(str);
    }

    public int getNumber() {
        return scanner.nextInt();
    }
    public void closeMessenger() {
        scanner.close();
    }
}
