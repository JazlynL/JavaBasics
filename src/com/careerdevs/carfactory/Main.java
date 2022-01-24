package com.careerdevs.carfactory;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        createACar();

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


    }

}
