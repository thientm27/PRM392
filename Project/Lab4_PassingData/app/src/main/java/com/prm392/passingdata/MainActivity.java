package com.prm392.passingdata;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static Student studentx;
    private static String title = "";
    private static String monHoc;
    private static String hocKy;
    private static String nganhHoc;
    private static String coSo ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvDisplay = findViewById(R.id.tvDisplay);
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("Bundle");
        if (bundle != null) {
            String str = bundle.getString("string");
            if (!str.isEmpty()){
                title = str;
            }

            Student student = (Student) bundle.getSerializable("student");
            if (student != null){
                studentx = student;
            }else{
                if (!student.getName().isEmpty()){
                    studentx.setName(student.getName());
                }
                if (!student.getId().isEmpty()){
                    studentx.setId(student.getId());
                }
            }

        }
        if (studentx != null){
            String resultx = "String: " + title + "\n" + "\n" + "Student: " + studentx.getName() + " - " + studentx.getId();
            tvDisplay.setText(resultx);
        }



        // BUTTON SETUP
        // user
        Button userInfor = findViewById(R.id.std_Infor);
        userInfor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
        // mon hoc
        Button btnMonHoc = findViewById(R.id.monhoc);
        btnMonHoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MonHoc.class);
                startActivity(intent);
            }
        });
    // Co So
        Button btnCoSo = findViewById(R.id.coso);
        btnCoSo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CoSo.class);
                startActivity(intent);
            }
        });
        // Nganh
        Button btnNganh = findViewById(R.id.nganh);
        btnNganh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NganhHoc.class);
                startActivity(intent);
            }
        });
// hoc ky
        Button btnSemeter = findViewById(R.id.hocky);
        btnSemeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HocKy.class);
                startActivity(intent);
            }
        });

        // LOAD Data
        TextView txMonHoc = findViewById(R.id.txt_monhoc);
        String newMonHoc = getIntent().getStringExtra("monhoc");
        if (newMonHoc != null) {
            monHoc = newMonHoc;
        }
        if (monHoc != null) {
            txMonHoc.setText("Subject: " + monHoc);
        } else {
            txMonHoc.setText("Subject: None");
        }

        // LOAD Data
        TextView txtHocKy = findViewById(R.id.txt_hocky);
        String newHocKy = getIntent().getStringExtra("hocky");
        if (newHocKy != null) {
            hocKy = newHocKy;
        }
        if (hocKy != null) {
            txtHocKy.setText("Semester: " + hocKy);
        } else {
            txtHocKy.setText("Semester: None");
        }



        // LOAD Data
        TextView txtNgang = findViewById(R.id.txt_nganhhoc);
        String newNganh = getIntent().getStringExtra("nganhhoc");
        if (newNganh != null) {
            nganhHoc = newNganh;
        }
        if (nganhHoc != null) {
            txtNgang.setText("Major: " + nganhHoc);
        } else {
            txtNgang.setText("Major: None");
        }

        // LOAD Data
        TextView txtCampus = findViewById(R.id.txt_coso);
        String newCoso = getIntent().getStringExtra("coso");
        if (newCoso != null) {
            coSo = newCoso;
        }
        if (coSo != null) {
            txtCampus.setText("Major: " + coSo);
        } else {
            txtCampus.setText("Major: None");
        }

    }
}