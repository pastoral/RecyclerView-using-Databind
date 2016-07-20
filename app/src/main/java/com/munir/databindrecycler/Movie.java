package com.munir.databindrecycler;

/**
 * Created by munirul.hoque on 7/19/2016.
 */
public class Movie {
    public int posterMovie; /* Resource id for the image */
    private String title, genre, year;
    public Movie(){
    }

    public Movie(int posterMovie,String title, String genre, String year) {
        this.posterMovie = posterMovie;
        this.title = title;
        this.genre = genre;
        this.year = year;
    }
}
