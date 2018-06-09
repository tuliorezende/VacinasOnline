package com.example.tulior.vacinasonline.Fragments;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tulior.vacinasonline.R;
import com.example.tulior.vacinasonline.SuccessDeleteAccountActivity;

public class UpdateProfileActivity extends android.support.v4.app.Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View baseView = inflater.inflate(R.layout.fragment_update_profile, container, false);

        return baseView;
    }

    public void sendToDeletedAccount(View v) {
        Intent intent = new Intent(this, SuccessDeleteAccountActivity.class);
        startActivity(intent);
    }
}
