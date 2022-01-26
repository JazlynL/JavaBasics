package com.careerdevs.moviefactory;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the title of your favorite movie?");
        String title = scan.nextLine();
        System.out.println("Who is the director of this movie?");
        String director = scan.nextLine();
        System.out.println("What is the runtime for this movie?");
        float runTime = scan.nextFloat();
        System.out.println(" Is it longer that 2 hours ?");
        boolean hasBeenReleased = scan.nextBoolean();


        MovieFactory generateMovie = new MovieFactory(title,director,runTime,hasBeenReleased);
        System.out.println(generateMovie);

    }
}
