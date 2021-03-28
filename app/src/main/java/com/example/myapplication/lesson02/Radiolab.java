package com.example.myapplication.lesson02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.R;

public class Radiolab extends AppCompatActivity {
    private Button btn;
    private TextView tv;
    private RadioButton rbOne, rbTwo, rbThree, rbFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson2_radiolab);

        btn=(Button) findViewById(R.id.btn);
        tv=(TextView) findViewById(R.id.tv);
        rbOne=(RadioButton) findViewById(R.id.rbOne);
        rbTwo=(RadioButton) findViewById(R.id.rbTwo);
        rbThree=(RadioButton) findViewById(R.id.rbThree);
        rbFour=(RadioButton) findViewById(R.id.rbFour);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rbOne.isChecked()) {
                    tv.setText("Your Grade is: 1 Grade");
                }
                if (rbTwo.isChecked()) {
                    tv.setText("Your Grade is: 2 Grade");
                }
                if (rbThree.isChecked()) {
                    tv.setText("Your Grade is: 3 Grade");
                }
                if (rbFour.isChecked()) {
                    tv.setText("Your Grade is: 4 Grade");
                }
            }
        });
    }
}