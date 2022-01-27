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


        Car car1 = new Car("Camaro 2ss","Chevy",10000,0.10);
        System.out.println(car1);
        Car car2 =new Car("Mustang Gt","Ford",300000,0.50);
        System.out.println(car2);
        Car car3 = new Car("Hellcat","Dodge",100,0.90);
        System.out.println(car3);


    }
    public static String createFullName(String firstName, String  lastName){
          return firstName + " " + lastName;
    }
}
