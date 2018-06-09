package com.example.tulior.vacinasonline;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void sendToRecoverAccount(View v) {
        Intent intent = new Intent(this, RecoverAccountActivity.class);
        startActivity(intent);
    }

    public  void sendToCreateAccount (View v){
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);
    }

    public void sendToMainMenu(View v){
        Intent intent = new Intent(this, MainMenuActivity.class);
        startActivity(intent);

    }
}
