package com.careerdevs.sayhello;

import java.util.Scanner;

public class Main {
    public static void main( String [] args){
        whatIsYourName();
        whatIsYourFullName();
        whatIsYourAge();
        doYouLikeBananas();

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

    //What was your Name again assignment

    public static void whatIsYourAge(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your age?");
        int userInput1 = scan.nextInt();
        System.out.println(" So your age is " + userInput1);
    }

    public static void doYouLikeBananas(){
        Scanner scan = new Scanner(System.in);
        System.out.println("is it true you like bananas");
        boolean userInput2 = scan.nextBoolean();
        System.out.println(" you answered  " + userInput2);
    }
}
