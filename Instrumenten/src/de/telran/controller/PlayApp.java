package de.telran.controller;

import de.telran.data.Drum;
import de.telran.data.Guitar;
import de.telran.data.Playable;
import de.telran.data.Trumpet;

public class PlayApp {

    public static void main(String[] args) {

        Playable trumpet = new Trumpet("Piccolo", 1.48);
        Playable drum = new Drum("Tom-tom drum", "10×8");
        Playable guitar = new Guitar("Guitalele", 12);

        Playable[] player = {trumpet, drum, guitar};

        for (Playable p : player) {
            p.play();
        }
    }
}

