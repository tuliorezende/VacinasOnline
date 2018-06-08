package com.example.tulior.vacinasonline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AccountSuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_success);
    }

    public void sendToMainMenu(View v) {
        Intent intent = new Intent(this, MainMenuActivity.class);
        startActivity(intent);

    }
}
