package com.careerdevs.songfactory;

public class SongFactory {
    public String title;
    public String artist;
    public String  genre;
    public int  seconds;



    public SongFactory(String title, String artist, String genre, int seconds){
      this.title = title;
      this.artist = artist;
      this.genre = genre;
      this.seconds = seconds;
    }


    @Override
    public String toString() {
        return "SongFactory{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                ", seconds=" + seconds +
                '}';
    }
}
