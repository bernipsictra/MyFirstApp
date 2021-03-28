package com.example.myapplication.lesson01;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.R;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    View screenView;
    Button ChangeColor;
    int[] color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        color = new int[] {Color.BLACK, Color.GREEN, Color.GRAY, Color.YELLOW, Color.CYAN, Color.BLUE};

        screenView = findViewById(R.id.zuun);
        ChangeColor =  (Button) findViewById(R.id.buttonLeft);

        ChangeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int arrayLength = color.length;

                Random random = new Random();
                int rNum = random.nextInt(arrayLength);

                screenView.setBackgroundColor(color[rNum]);
            }
        });
    }

}