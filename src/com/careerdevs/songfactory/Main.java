package com.careerdevs.songfactory;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Whats A Song name \n Enter:");
        String title = scan.nextLine();
        System.out.println("Who is the artist that sings this?");
        String artist = scan.nextLine();
        System.out.println("What genre do they fall under?");
        String genre = scan.nextLine();
        System.out.println("How many seconds is the song?");
        int seconds = scan.nextInt();

        SongFactory generatedSong = new SongFactory(title,artist,genre,seconds);
        System.out.println(generatedSong);
    }
}
