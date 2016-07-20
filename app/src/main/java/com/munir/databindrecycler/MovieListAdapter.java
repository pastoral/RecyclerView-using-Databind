package com.munir.databindrecycler;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.munir.databindrecycler.databinding.MovieListRowBinding;

import java.util.ArrayList;

/**
 * Created by munirul.hoque on 7/20/2016.
 */
public class MovieListAdapter extends RecyclerView.Adapter<MovieListAdapter.MovieViewHolder> {
   ObservableArrayList<Movie> movieList ;
    public MovieListAdapter(ObservableArrayList<Movie> movieList){
        movieList = this.movieList;
    }
    public class MovieViewHolder extends RecyclerView.ViewHolder{
        MovieListRowBinding rowBinding;
        public  MovieViewHolder(View view){
            super(view);
            rowBinding = DataBindingUtil.bind(view);
        }
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_list_row,parent,false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        final Movie movie = movieList.get(position);
        holder.rowBinding.setMovie(movie);
        holder.rowBinding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }
}
