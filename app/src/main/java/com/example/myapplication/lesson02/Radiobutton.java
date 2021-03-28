package com.example.myapplication.lesson02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.myapplication.R;

public class Radiobutton extends AppCompatActivity {
    private RadioButton rbAndroid, rbJava, rbWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson2_radiobutton);

        rbAndroid = (RadioButton) findViewById(R.id.rbAndroid);
        rbWeb = (RadioButton) findViewById(R.id.rbWeb);
        rbJava = (RadioButton) findViewById(R.id.rbJava);

        rbAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Radiobutton.this, "Android", Toast.LENGTH_SHORT).show();
            }
        });

        rbWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Radiobutton.this, "Web", Toast.LENGTH_SHORT).show();

            }
        });

        rbJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Radiobutton.this, "Java", Toast.LENGTH_SHORT).show();

            }
        });
    }
}