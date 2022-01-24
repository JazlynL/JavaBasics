package com.careerdevs;

public class Main {

    public static void main(String[] args) {

        NameGenerator.generateFullName();
	// write your code here
        String  fName = "Jazlyn";
        String  lName = "Luben";
        System.out.println(fName.concat(lName));

        //challenge 2
        System.out.println(createFullName("Jazlyn","Luben"));

        //challenge 3
//        String generatedName = NameGenerator.generateFullName( firstName,  lastName);
//        System.out.println(generatedName);

    }
    public static String createFullName(String firstName, String  lastName){
          return firstName + " " + lastName;
    }
}
