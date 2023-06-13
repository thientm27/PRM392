package com.prm392.lab5_ex2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.prm392.lab5_ex2.adapter.DrinkAdapter;
import com.prm392.lab5_ex2.model.Drink;

import java.util.ArrayList;
import java.util.List;

public class DrinkActivity extends AppCompatActivity {

    List<Drink> drinks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        RecyclerView rvPhoneList = findViewById(R.id.rvPhoneList);

        drinks = new ArrayList<>();
        drinks.add(new Drink("Coca Cola", "Coca", 1950, 20, R.drawable.coca));
        drinks.add(new Drink("Pessi", "Pessi", 1950, 20, R.drawable.pepsi));
        drinks.add(new Drink("KienGiang Beer", "Beer", 2002, 40, R.drawable.kgbeer));
        drinks.add(new Drink("Tiger Beer", "Beer", 1995, 35, R.drawable.tiger));
        drinks.add(new Drink("Ruby", "Beer", 2012, 40, R.drawable.ruby));
        drinks.add(new Drink("Soda", "Coca", 2006, 40, R.drawable.soda));
        drinks.add(new Drink("Sprite", "Pessi", 2006, 40, R.drawable.sprite));

        rvPhoneList.setAdapter(new DrinkAdapter(drinks));
        rvPhoneList.setLayoutManager(new LinearLayoutManager(this));

    }
}