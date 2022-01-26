package com.careerdevs.moviefactory;

public class MovieFactory {
    public String title;
    public String director;
    public float runtime;
    public boolean hasBeenReleased;

    public MovieFactory(String title, String director,float runtime,boolean hasBeenReleased){
        this.title = title;
        this.director = director;
        this.runtime = runtime;
        this.hasBeenReleased = hasBeenReleased;

    }

    @Override
    public String toString() {
        return "MovieFactory{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", runtime=" + runtime +
                ", hasBeenReleased=" + hasBeenReleased +
                '}';
    }
}
