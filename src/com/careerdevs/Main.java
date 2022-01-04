package com.careerdevs;

public class Main {

    public static void main(String[] args) {



	// write your code here
        String  fName = "Jazlyn";
        String  lName = "Luben";
        System.out.println(fName.concat(lName));
        System.out.println(createFullName("Donald","Duck"));
    }

    public static String createFullName(String firstName, String  lastName){
          return firstName + " " + lastName;
    }
}
