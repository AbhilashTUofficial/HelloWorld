package com.helloworld;

public class Main {

    public static void main(String[] args) {
        String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", " "};
        String helloWorld = "Hello World";
        String str = "";
        int i = 0;
        System.out.println("Hello World");
        while (!(str.equals("Hello World"))) {
            str.concat("H");
            System.out.println(i);
            System.out.println(str);

            i++;
        }
    }
}