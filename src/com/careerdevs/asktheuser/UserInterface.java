package com.careerdevs.asktheuser;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanName = new Scanner(System.in);
        System.out.println("What is Your Name?");
        String userInput1 = scanName.nextLine();
        System.out.println( "Well Hello "+ userInput1);

        Scanner trueOr = new Scanner(System.in);
        System.out.println("Are You a Female?\n(true or false ?)");
        Boolean userInput2 = trueOr.nextBoolean();
        System.out.println("Oh I see you answered " + userInput2);

        Scanner ageOfUser = new Scanner(System.in);
        System.out.println("How old are you?");
        byte userInput3 = ageOfUser.nextByte();
        System.out.println(" Oh you said you were this Age? " + userInput3);

        Scanner howMany = new Scanner(System.in);
        System.out.println("How many days you spent crying this year truthfully?");
        short userInputs = howMany.nextShort();
        System.out.println("You spent this many days crying ? "+ userInputs);

        Scanner  howMuch = new Scanner(System.in);
        System.out.println("How Much money you wish to get paid a year? You can only manifest 6 figures plus");
        int userInput4 = howMuch.nextInt();
        System.out.println("So you wish to make a year  " + userInput4 + " Good Choice :-)");

        Scanner decimal = new Scanner(System.in);
        System.out.println(" Knowledge test: \n What is half of number 5?");
        float userInput5 = decimal.nextFloat();
        System.out.println("OKAY YOU'RE SMART TOO , YOU ANSWERED " + userInput5 + "  This is correct");

        Scanner bigGuess = new Scanner(System.in);
        System.out.println("You have to guess what is the number that comes after a  4 billion ?");
        long  userInput6 = bigGuess.nextLong();
        System.out.println("Yeah That's a big number and you got it right  :-) " + userInput6);

        Scanner ultDec = new Scanner(System.in);
        System.out.println("Think  of a really big decimal:\n What do you think is the remainder of 387  ");
        double userinput7 = ultDec.nextDouble();
        System.out.println("Yeah Yeah you got it " + userinput7);




    }
}
