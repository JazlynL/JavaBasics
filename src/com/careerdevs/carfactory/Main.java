package com.careerdevs.carfactory;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
//        createACar();
        createACarObject();

    }
    public static void createACar(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your Name ?");
      String owner = scan.nextLine();
        System.out.println("Okay what is the make of your car.");
        String make = scan.nextLine();
        System.out.println("What is your model of your Car?");
       String  model = scan.nextLine();

//        Scanner userinput1 = scan.nextLine();
        System.out.println(owner + " owns the car "+ make + " " + model);
    }
    public  static  void createACarObject(){
       Scanner carInfo = new Scanner(System.in);
        System.out.println("What is your cars make?");
       String make = carInfo.nextLine();
        System.out.println("What is your cars model");
        String model = carInfo.nextLine();
        System.out.println("What is your cars Mileage");
        int mileage = carInfo.nextInt();
        System.out.println("What is the car percentage?");
        int gasPercentage = carInfo.nextInt();
//        Car car1 = new Car(make,model,mileage,gasPercentage);
        System.out.println("This is the car info "+ make +" "+ model + " , This is the car mileage " + mileage + " this is the gas percentage " + gasPercentage );

    }

}
