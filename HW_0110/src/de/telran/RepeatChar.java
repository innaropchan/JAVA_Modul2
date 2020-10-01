package de.telran;

public class RepeatChar {
    public static void main(String[] args) {

        StringBuffer str = new StringBuffer("aaabbcdddd");
        StringBuffer str1 = new StringBuffer("a3b2c1d4");


        // System.out.println(str = str1);

        System.out.println(printRepeatChar("aaabbcdddd"));

    }

    public static String printRepeatChar(String str) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                a++;
            } else if (str.charAt(i) == 'b') {
                b++;
            } else if (str.charAt(i) == 'c') {
                c++;
            } else if (str.charAt(i) == 'd') {
                d++;
            }
        }
        return "a" + a + "b" + b + "c" + c + "d" + d;
    }

}

