package com.munir.databindrecycler;

import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.databinding.ObservableArrayList;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

/**
 * Created by munirul.hoque on 7/20/2016.
 */
public class MovieListBinder {
    @BindingAdapter("bind:imageRes")
    public static void bindImage(ImageView imageView, int r){
        imageView.setImageResource(r);
    }
    @BindingAdapter("bind:items")
    public static void bindList(RecyclerView recyclerView, ObservableArrayList<Movie> list){
        LinearLayoutManager layoutManager = new LinearLayoutManager(recyclerView.getContext());
        recyclerView.setLayoutManager(layoutManager);

    }
}
