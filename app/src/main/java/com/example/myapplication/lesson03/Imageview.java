package com.example.myapplication.lesson03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.myapplication.R;

public class Imageview extends AppCompatActivity {
    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imageview);

        iv = (ImageView) findViewById(R.id.iv);
        iv.setImageResource(R.drawable.mountn);

    }
}