package com.example.tulior.vacinasonline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SuccessDeleteAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_delete_account);
    }

    public void sendToLoginAccount(View v) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);

    }
}
