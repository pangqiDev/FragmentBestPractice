package com.example.fragmentbestpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //在activity_main布局中会加载NewsTitleFragment
        setContentView(R.layout.activity_main);
    }
}