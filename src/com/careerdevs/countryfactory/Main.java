package com.careerdevs.countryfactory;


import java.util.Scanner;

public class Main {

public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println(" Country information, \n What is the name of the country");
    String country =scanner.nextLine();
    System.out.println("What Is the population of this country?");
    long population = scanner.nextLong();
    scanner.nextLine();
    System.out.println("What Is the capital of this country");
    String capital = scanner.nextLine();
//    System.out.println(capital);

    Country generatedCountry = new Country(country,population,capital);
    System.out.println(generatedCountry);

}
 }
