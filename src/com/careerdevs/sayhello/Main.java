package com.careerdevs.sayhello;

import java.util.Scanner;

public class Main {
    public static void main( String [] args){
        whatIsYourName();
        whatIsYourFullName();

    }
    public static void whatIsYourName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello Nice to  Meet You ");
        String fName = scanner.next();
        System.out.println(fName);
        System.out.println("Hello Nice To Meet You  " + fName);
    }
    public static void whatIsYourFullName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your first name?");
        String fullName = scanner.nextLine();
        System.out.println("What is your last name?");
        String lastName = scanner.nextLine();
        System.out.println("Ahh your whole name is  " + fullName + " " + lastName);

    }
}
