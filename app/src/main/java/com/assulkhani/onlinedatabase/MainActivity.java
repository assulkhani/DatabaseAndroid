package com.assulkhani.onlinedatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<MovieModel> dataMovie = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // pertama membuat layout per item
        // kedua membuat model datanya
        // selanjutnya membuat dummy data

        MovieModel moviel = new MovieModel();
        moviel.setJudulFilm("Judul Film");
        moviel.setPosterFilm("https://image.tmdb.org/t/p/w185_and_h278_bestv2/7WsyChQLEftFiDOVTGkv3hFpyyt.jpg");

        for (int i = 0; i < 20; i++) {
            dataMovie.add(moviel);
        }

    }
}
