package de.telran.controller;

import de.telran.data.Transferable;

public class WordTransferApp {
    public static void main(String[] args) {


        System.out.println(Transferable.createRules("AGHJ kLU jgkslg ttt ",1));
        System.out.println(Transferable.createRules("AGHJ kLU jgkslg ttt ", 2));
        System.out.println(Transferable.createRules("AGHJ kLU jgkslg ttt ", 0));  //не получилось
    }
}
