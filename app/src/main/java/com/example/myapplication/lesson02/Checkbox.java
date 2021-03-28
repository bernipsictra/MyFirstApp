package com.example.myapplication.lesson02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.R;

import java.util.ArrayList;

public class Checkbox extends AppCompatActivity {
    private Button btn;
    private TextView result;
    private CheckBox chHTML, chJava, chWeb, chCSS;
    ArrayList<String> lesson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson2_checkbox);

        btn = (Button) findViewById(R.id.btn);
        result = (TextView) findViewById(R.id.result);
        chHTML = (CheckBox) findViewById(R.id.chHTML);
        chJava = (CheckBox) findViewById(R.id.chJava);
        chWeb = (CheckBox) findViewById(R.id.chWeb);
        chCSS = (CheckBox) findViewById(R.id.chCSS);
        lesson = new ArrayList<String>();

        chHTML.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chHTML.isChecked()) lesson.add("HTML");
                else lesson.remove("HTML");
            }
        });

        chJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chJava.isChecked()) lesson.add("Java");
                else lesson.remove("Java");
            }
        });

        chWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chWeb.isChecked()) lesson.add("Web");
                else lesson.remove("Web");
            }
        });


        chCSS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chCSS.isChecked()) lesson.add("CSS");
                else lesson.remove("CSS");
            }
        });



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder  sb = new StringBuilder();
                for (String txt : lesson)
                    sb.append(txt).append(", ");
                result.setText("Your Skills: " + sb.toString());
            }
        });

    }
}