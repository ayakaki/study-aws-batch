package com.mystudy;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Integer arrLen = args.length;

        System.out.println("start process");

        if(arrLen == 0){
            System.out.println("0 argument");
        }

        if(arrLen >= 1){
            System.out.println("more 1 argument");
            System.out.println("arg1： " + args[0]);
        }

        if(arrLen >= 2){
            System.out.println("more 2 arguments");
            System.out.println("arg2： " + args[1]);
        }
    }
}