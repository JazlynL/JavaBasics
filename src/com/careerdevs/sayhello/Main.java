package com.careerdevs.sayhello;

import java.util.Scanner;

public class Main {
    public static void main( String [] args){
        whatIsYourName();

    }
    public static void whatIsYourName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello Nice to  Meet You ");
        String fName = scanner.next();
        System.out.println(fName);
        System.out.println("Hello Nice To Meet You  " + fName);
    }
}
