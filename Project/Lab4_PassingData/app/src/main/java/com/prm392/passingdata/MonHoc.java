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

public class MonHoc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon_hoc);

        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        Button btnOrderDrink = findViewById(R.id.btnOrderDrink);

        List<String> drinkList = new ArrayList<>();
        drinkList.add("Lập trình Mobile");
        drinkList.add("Lập trình Unity");
        drinkList.add("Lập trình Web");
        drinkList.add("Lập trình Unreal Engine");

        drinkList.forEach(drink -> {
            RadioButton radioButton = new RadioButton(MonHoc.this);
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
                Toast.makeText(MonHoc.this, "Bạn chưa chọn môn học nào.", Toast.LENGTH_SHORT).show();
                return;
            }
            RadioButton radioButton = findViewById(selectedId);
            String drink = radioButton.getText().toString();
            Intent intent = new Intent(MonHoc.this, MainActivity.class);
            intent.putExtra("monhoc", drink);
            startActivity(intent);
        });

    }
}