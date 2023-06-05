package com.example.lab2presentaion;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SignIn extends AppCompatActivity {

    private EditText eUsername, ePassword;
    private TextView tvCreateOne;
    private Button btnSignIn;

    private final String REQUIRE = "Require";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);

        Button button1 = findViewById(R.id.exitButton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        eUsername = findViewById(R.id.etUserName);
        ePassword = findViewById(R.id.etPassword);
        tvCreateOne = findViewById(R.id.tvCreateOne);
        btnSignIn = findViewById(R.id.btnSignIn);

        tvCreateOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signUpForm();
            }
        });
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signIn();
            }
        });

    }
    private boolean checkInput(){
        if(TextUtils.isEmpty(eUsername.getText().toString())){
            eUsername.setError(REQUIRE);
            return false;

        }

        if(TextUtils.isEmpty(ePassword.getText().toString())){
            ePassword.setError(REQUIRE);
            return false;

        }

        return true;
    }

    private void signIn(){
        if(!checkInput()){
            return;
        }
        finish();
    }

    private void signUpForm(){
        Intent intend = new Intent(this, SignUp.class);
        startActivity(intend);
    }

}
