package com.careerdevs.fruitfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your favorite fruit? \n Enter what it is:");
        String fruit = scan.nextLine();
        System.out.println("What color is "+ fruit+ "?");
        String color = scan.nextLine();
        System.out.println("Does this "+ fruit+" have seeds?");
        boolean itSeeds = scan.nextBoolean();


        FruitFact generatedFruit = new FruitFact(fruit,color,itSeeds);
        System.out.println(generatedFruit);

    }
}
