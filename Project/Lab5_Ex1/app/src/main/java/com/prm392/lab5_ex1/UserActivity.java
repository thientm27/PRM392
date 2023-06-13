package com.prm392.lab5_ex1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.prm392.lab5_ex1.adapter.UserAdapter;
import com.prm392.lab5_ex1.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserActivity extends AppCompatActivity {

    List<User> users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        RecyclerView rvUserList = findViewById(R.id.rvUserList);

        users = new ArrayList<>();
        users.add(new User("thientm", "Tran Minh Thien", "thientm@gmail.com"));
        users.add(new User("Bodt", "Do Thanh Bo", "bodt@gmail.com"));
        users.add(new User("Thucnv", "Cao Nguyen Viet Thu", "thucnv@gmail.com"));
        users.add(new User("Lampn", "Pham Ngoc Lam", "Lampn@gmail.com"));
        users.add(new User("Lucdt", "Duong Tan Luc", "Lucdt@gmail.com"));
        users.add(new User("Hanptb", "Phan Thi Bich Han", "Hanptb@gmail.com"));
        users.add(new User("Hanptb", "Phan Thi Bich", "Hanptb@gmail.com"));
        users.add(new User("Hanptb", "Phan Thi Bich Han", "Hanptb@gmail.com"));
        users.add(new User("Hanptb", "Phan Thi Bich Han", "Hanptb@gmail.com"));

        UserAdapter userAdapter = new UserAdapter(users);
        rvUserList.setAdapter(userAdapter);
        rvUserList.setLayoutManager(new LinearLayoutManager(this));
    }
}