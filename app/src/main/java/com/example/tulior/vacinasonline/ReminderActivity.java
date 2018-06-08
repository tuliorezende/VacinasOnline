package com.example.tulior.vacinasonline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ReminderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);
    }

    public void sendToSuccessOnCreate(View v) {
        Intent intent = new Intent(this, AccountSuccessActivity.class);
        startActivity(intent);
    }
}
