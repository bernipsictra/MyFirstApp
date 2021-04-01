package com.example.myapplication.lesson03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.myapplication.R;

public class Intent1 extends AppCompatActivity {
    private Button btn;
    private Spinner sp;
    private String[] user = {"Fruit1 ", "Fruit2", "Fruit 3", "Fruit 4"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        btn = (Button) findViewById(R.id.btn);
        sp = (Spinner) findViewById(R.id.sp);
        ArrayAdapter adapter = new ArrayAdapter(
                this, android.R.layout.simple_spinner_item, user
        );
        sp.setAdapter(adapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = sp.getSelectedItemPosition();
                Intent i = new Intent(Intent1.this, Intent2.class);
                i.putExtra("pic", pos);
                startActivity(i);
            }
        });
    }
}