package com.example.lab3presentation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class FuirdListView extends AppCompatActivity {
    ListView lvLegends;
    List<Fuird> legends;
    FuirdAdapter legendAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fuiid_list);

        Button button1 = findViewById(R.id.exitButton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        mapping();
        legendAdapter = new FuirdAdapter(this, R.layout.fuird_item, legends);
        lvLegends.setAdapter(legendAdapter);

    }
    private void mapping() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        lvLegends = findViewById(R.id.lvLegends);
        legends = new ArrayList<>();
        try {
            legends.add(new Fuird("Dau tay","co mau do rat ngot" , R.drawable.dau));
            legends.add(new Fuird("Nho", "ngot thanh, dung lam ruou", R.drawable.nho));
            legends.add(new Fuird("Chuoi", "Rat nhieu protein",R.drawable.chuoi));
            legends.add(new Fuird("Bo", "Beo ngay thom lung",R.drawable.bo));
            legends.add(new Fuird("Soai", "ngot thanh mien tay", R.drawable.soai));
            legends.add(new Fuird("Man", "nhai gion sum sup", R.drawable.man));
            legends.add(new Fuird("Coc", "vua cung vua chua", R.drawable.coc));
        } catch (Exception e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }

    }

}