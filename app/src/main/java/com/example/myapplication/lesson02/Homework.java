package com.example.myapplication.lesson02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.R;

import java.util.ArrayList;

public class Homework extends AppCompatActivity {
    private Button submit;
    private EditText etName, etPhone, etEmail, etAddress;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework);
//        final TextView result = (TextView)findViewById(R.id.result);
        etName = (EditText) findViewById(R.id.etName);
        etPhone = (EditText) findViewById(R.id.etPhone);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etAddress = (EditText) findViewById(R.id.etAddress);
        submit = (Button) findViewById(R.id.btn);
        result = (TextView) findViewById(R.id.result);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString();
                String phone = etPhone.getText().toString();
                String email = etEmail.getText().toString();
                String address = etAddress.getText().toString();

                result.setText("Name: " + name + "\nPhone:" + phone + "\nEmail:" + email + "\nAddress:" + address);
            }
        });
    }
}
//if (etName.getText().toString().isEmpty() || etPhone.getText().toString().isEmpty() || etEmail.getText().toString().isEmpty()) {
//        Toast.makeText(getApplicationContext(), "Medeelel dutuu oruulsan baina", Toast.LENGTH_SHORT).show();
//
//        } else {
//        Toast.makeText(getApplicationContext(), "Name: " + etName.getText().toString() + " \n" + "Phone Number:  " + etPhone.getText().toString() + " \n" + "Email:  " + etEmail.getText().toString(), Toast.LENGTH_SHORT).show();
//        }