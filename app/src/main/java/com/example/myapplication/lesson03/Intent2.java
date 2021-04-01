package com.example.myapplication.lesson03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;

public class Intent2 extends AppCompatActivity {
    private TextView tv;
    private ImageView iv;
    private int[] img = {R.drawable.fruit1, R.drawable.fruit2, R.drawable.fruit3,
            R.drawable.fruit4};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent2);

        tv = (TextView) findViewById(R.id.tv);
        iv = (ImageView) findViewById(R.id.iv);
        Bundle bundle = getIntent().getExtras();
        int pos = bundle.getInt("pic");
        iv.setImageResource(img[pos]);
    }
}