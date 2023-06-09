package com.example.passingdata;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_view);

        txt = findViewById(R.id.textView);

        Intent intent = getIntent();
        String NoiDung = intent.getStringExtra("Data");
        txt.setText(NoiDung);
    }
}