package de.telran;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(); //also possible " String"
        StringBuffer sb1= new StringBuffer(32);
        StringBuffer sb2= new StringBuffer("Hello!");
        char[] chars= { 'A', 'B', 'c'};
        StringBuffer sb3= new StringBuffer(String.valueOf(chars));

        System.out.println(sb2.capacity());
        System.out.println(sb2.length());

        sb2.append(" my friend");
        System.out.println(sb2.capacity());
        System.out.println(sb2.length());
        System.out.println(sb2);
        sb2.setCharAt(5,',');
        System.out.println(sb2);
        sb2.insert(10,"dear ");
        System.out.println(sb2);
        sb2.delete(1,3);
        System.out.println(sb2);
        System.out.println(sb2.charAt(6));
        sb1=sb2;
        System.out.println(sb1.reverse());
        System.out.println(sb2.reverse());
        System.out.println(sb1);
        int[ ] nums ={1,2,3};
        System.out.println(sb1.append(5).append("!!!").append(Arrays.toString(nums)).append(";"));
        System.out.println(sb1);

        System.out.println(sb1.length());
        sb1.setLength(19);
        System.out.println(sb1);

       // String str = "456";
        //System.out.println(sumNumbers(str));
        System.out.println("---------");
        StringBuffer sb4= new StringBuffer("5462");
        sumNumbers(sb);

    }
    public static int  sumNumbers(String input){
        int sum =0;

        for (int i = 0; i <input.length(); i++) {
            sum+=Integer.parseInt(input.substring(i,i+1));

        }
        return sum;
    }
    public static int sumNumbers (StringBuffer sb){
        char[] chars= new char[sb.length()];
        sb.getChars(0,chars.length-1,chars,0);
        int sum= 0;
        for (char c:chars) {
            sum += Character.digit(c,10);
        }
        return sum;
    }
}

