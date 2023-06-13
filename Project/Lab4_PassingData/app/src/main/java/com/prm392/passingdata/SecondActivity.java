package com.prm392.passingdata;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);

        EditText name = findViewById(R.id.name);
        EditText code = findViewById(R.id.id);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(view -> {
            if (name.getText().toString().isEmpty()) {
                Toast.makeText(SecondActivity.this, "Bạn chưa Nhập tên.", Toast.LENGTH_SHORT).show();
                return;
            }
            if (code.getText().toString().isEmpty()) {
                Toast.makeText(SecondActivity.this, "Bạn chưa Nhập id.", Toast.LENGTH_SHORT).show();
                return;
            }

            Intent intent = new Intent(SecondActivity.this, MainActivity.class);
            Student student = new Student(name.getText().toString(), code.getText().toString());
            Bundle bundle = new Bundle();
            bundle.putString("string", "Your information");
            bundle.putSerializable("student", student);
            intent.putExtra("Bundle", bundle);
            startActivity(intent);
            finish();
        });

    }
}