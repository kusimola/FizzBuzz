package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Scrie un numar");
        Scanner scannerOne = new Scanner(System.in);
        int yourNumber = scannerOne.nextInt();

        if (yourNumber % 5 == 0 && yourNumber % 3 == 0){
            System.out.println("FIZZBUZZ");
        }
        else if (yourNumber % 3 == 0){
            System.out.println("FIZZ");
        }
        else if (yourNumber % 5 == 0){
            System.out.println("BUZZ");
        }
        else{
            System.out.println(yourNumber);
        }


    }
}
