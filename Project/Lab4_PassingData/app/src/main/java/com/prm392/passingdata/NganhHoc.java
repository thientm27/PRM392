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

public class NganhHoc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nganh_hoc);

        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        Button btnOrderDrink = findViewById(R.id.btnOrderDrink);

        List<String> drinkList = new ArrayList<>();
        drinkList.add("Digital Marketing");
        drinkList.add("Kỹ Thuật Phần Mềm");
        drinkList.add("An Toàn Thông Tin");
        drinkList.add("Kinh Doanh Quốc Tế");

        drinkList.forEach(drink -> {
            RadioButton radioButton = new RadioButton(NganhHoc.this);
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
                Toast.makeText(NganhHoc.this, "Bạn chưa chọn ngành học nào.", Toast.LENGTH_SHORT).show();
                return;
            }
            RadioButton radioButton = findViewById(selectedId);
            String drink = radioButton.getText().toString();
            Intent intent = new Intent(NganhHoc.this, MainActivity.class);
            intent.putExtra("nganhhoc", drink);
            startActivity(intent);
        });

    }
}