package com.example.themoviedb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.themoviedb.View.Movies;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);


        new Handler().postDelayed(() -> {
            Intent intent= new Intent(this, Movies.class);
            startActivity(intent);
            finish();
        },3000);


    }
}