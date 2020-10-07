package de.telran.controller;

import de.telran.data.ToLowerCase;
import de.telran.data.ToStarCase;
import de.telran.data.ToUpperCase;
import de.telran.data.WordTransformer;

public class WordsTransformApp {
    public static void main(String[] args) {
        WordTransformer wt = new WordTransformer();
        String str= "aa RTYUI fgh GHFj";
        System.out.println(wt.transform(str, new ToLowerCase()));
        String str1= "aa RTYUI fgh GHFj";
        System.out.println(wt.transform(str1, new ToStarCase()));
        String str2= "aa RTYUI fgh GHFj";
        System.out.println(wt.transform(str2, new ToUpperCase()));
    }
//AGHJ KLU jgkslg TTT
//aghj kLU jgkslg ttt
//AGHJ kLU ****** ttt
}
