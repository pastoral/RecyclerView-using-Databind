package com.munir.databindrecycler;

import android.databinding.ObservableArrayList;
import android.view.View;

/**
 * Created by munirul.hoque on 7/19/2016.
 */
public class MovieInfoData {
    public ObservableArrayList<Movie> movieList = new ObservableArrayList<>();

    public MovieInfoData(){
        Movie movie = new Movie(android.R.drawable.sym_def_app_icon, "Mad Max: Fury Road", "Action & Adventure", "2015");
        movieList.add(movie);

        movie = new Movie(android.R.drawable.sym_def_app_icon, "Inside Out", "Animation, Kids & Family", "2015");
        movieList.add(movie);

        movie = new Movie(android.R.drawable.sym_def_app_icon, "Star Wars: Episode VII - The Force Awakens", "Action", "2015");
        movieList.add(movie);

        movie = new Movie(android.R.drawable.sym_def_app_icon, "Shaun the Sheep", "Animation", "2015");
        movieList.add(movie);

        movie = new Movie(android.R.drawable.sym_def_app_icon, "The Martian", "Science Fiction & Fantasy", "2015");
        movieList.add(movie);

        movie = new Movie(android.R.drawable.sym_def_app_icon, "Mission: Impossible Rogue Nation", "Action", "2015");
        movieList.add(movie);

        movie = new Movie(android.R.drawable.sym_def_app_icon, "Up", "Animation", "2009");
        movieList.add(movie);

        movie = new Movie(android.R.drawable.sym_def_app_icon, "Star Trek", "Science Fiction", "2009");
        movieList.add(movie);

        movie = new Movie(android.R.drawable.sym_def_app_icon, "The LEGO Movie", "Animation", "2014");
        movieList.add(movie);

        movie = new Movie(android.R.drawable.sym_def_app_icon, "Iron Man", "Action & Adventure", "2008");
        movieList.add(movie);

        movie = new Movie(android.R.drawable.sym_def_app_icon, "Aliens", "Science Fiction", "1986");
        movieList.add(movie);

        movie = new Movie(android.R.drawable.sym_def_app_icon, "Chicken Run", "Animation", "2000");
        movieList.add(movie);

        movie = new Movie(android.R.drawable.sym_def_app_icon, "Back to the Future", "Science Fiction", "1985");
        movieList.add(movie);

        movie = new Movie(android.R.drawable.sym_def_app_icon, "Raiders of the Lost Ark", "Action & Adventure", "1981");
        movieList.add(movie);

        movie = new Movie(android.R.drawable.sym_def_app_icon, "Goldfinger", "Action & Adventure", "1965");
        movieList.add(movie);

        movie = new Movie(android.R.drawable.sym_def_app_icon, "Guardians of the Galaxy", "Science Fiction & Fantasy", "2014");
        movieList.add(movie);
    }


    public void add(Movie movie){
        movieList.add(movie);
    }

    public void remove(View view){
        if(!movieList.isEmpty()){
            movieList.remove(0);
        }
    }
}
