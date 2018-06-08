package com.example.tulior.vacinasonline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class UpdateProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_profile);
    }

    public void sendToDeletedAccount(View v) {
        Intent intent = new Intent(this, SuccessDeleteAccountActivity.class);
        startActivity(intent);
    }
}
