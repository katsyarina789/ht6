package com.company;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("1)");
        for (int i = 1; i <= 100; i++)
            if (i % 3 == 0 & i % 7 == 0)
                System.out.println(i + "");

            for (int i = 1; i<=100; i++){
                if (i % 3 == 0 && i % 5 == 0)
                    continue;
                if (i % 3 == 0|| i % 5 == 0)
                    System.out.println(i + "");
            }
          System.out.println("Sub2");
        for (int i = 1; i <= 100; i++) {
            if (i / 10 % 2 == 1) 
            if (i % 3 == 0 ^ i % 5 == 0)
                System.out.println(i + "");}
            }}


