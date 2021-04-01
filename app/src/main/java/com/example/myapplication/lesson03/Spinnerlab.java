package com.example.myapplication.lesson03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import com.example.myapplication.R;

public class Spinnerlab extends AppCompatActivity {
    private Spinner sp;
    private Button btn;
    private ImageView iv;
    private String[] user = {"Fruit 1", "Fruit 2", "Fruit 3", "Fruit 4", };
    private int[] users = {R.drawable.fruit1,R.drawable.fruit2 ,R.drawable.fruit3, R.drawable.fruit4};
    private ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson03_spinnerlab);

        sp = (Spinner) findViewById(R.id.sp);
        btn = (Button) findViewById(R.id.btn);
        iv = (ImageView) findViewById(R.id.iv);
        adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, user);
        sp.setAdapter(adapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = sp.getSelectedItemPosition();
                iv.setImageResource(users[pos]);
            }
        });
    }
}