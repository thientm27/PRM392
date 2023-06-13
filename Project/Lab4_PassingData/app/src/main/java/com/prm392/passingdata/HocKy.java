package com.prm392.passingdata;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class HocKy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoc_ky);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        Button btnOrderDrink = findViewById(R.id.btnOrderDrink);

        List<String> drinkList = new ArrayList<>();
        drinkList.add("Spring");
        drinkList.add("Fall");
        drinkList.add("Winter");

        drinkList.forEach(drink -> {
            RadioButton radioButton = new RadioButton(HocKy.this);
            radioButton.setText(drink);
            radioButton.setPadding(12, 0, 0, 0);
            radioButton.setTextSize(18);
            radioButton.setTextColor(Color.parseColor("#4A4A4A"));
            radioButton.setTextAlignment(RadioButton.TEXT_ALIGNMENT_CENTER);
            radioGroup.addView(radioButton);
        });

        btnOrderDrink.setOnClickListener(v -> {
            int selectedId = radioGroup.getCheckedRadioButtonId();
            if (selectedId == -1) {
                Toast.makeText(HocKy.this, "Bạn chưa chọn học kỳ nào.", Toast.LENGTH_SHORT).show();
                return;
            }
            RadioButton radioButton = findViewById(selectedId);
            String drink = radioButton.getText().toString();
            Intent intent = new Intent(HocKy.this, MainActivity.class);
            intent.putExtra("hocky", drink);
            startActivity(intent);
        });


    }
}