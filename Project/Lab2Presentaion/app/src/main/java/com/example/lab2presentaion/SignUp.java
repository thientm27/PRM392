package com.example.lab2presentaion;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignUp extends AppCompatActivity {
    private EditText eUsername, ePassword,eConfirmPassword;
    private TextView tvSignin;
    private Button btnSignup;

    private final String REQUIRE = "Require";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        Button button1 = findViewById(R.id.exitButton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        eUsername = findViewById(R.id.etUsername);
        ePassword = findViewById(R.id.etPassword);
        eConfirmPassword = findViewById(R.id.etConfirmPassword);
        tvSignin = findViewById(R.id.tvSignin);
        btnSignup = findViewById(R.id.btnSignup);

        tvSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signInForm();
            }
        });
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkInput()){
                    return;
                }
                signInForm();
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

        if(TextUtils.isEmpty(eConfirmPassword.getText().toString())){
            ePassword.setError(REQUIRE);
            return false;

        }

        if(!TextUtils.equals(eConfirmPassword.getText().toString(), ePassword.getText().toString())){
            Toast.makeText(this, "Password not match", Toast.LENGTH_LONG).show();
            return false;
        }

        return true;
    }

    private void signInForm(){

        finish();
    }
}
