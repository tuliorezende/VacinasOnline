package com.example.tulior.vacinasonline.Fragments;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.tulior.vacinasonline.MainMenuActivity;
import com.example.tulior.vacinasonline.R;
import com.example.tulior.vacinasonline.SuccessDeleteAccountActivity;

public class UpdateProfileFragment extends android.support.v4.app.Fragment {

    Button saveProfile;
    TextView deleteAccount;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View baseView = inflater.inflate(R.layout.fragment_update_profile, container, false);

setHasOptionsMenu(true);

        saveProfile = baseView.findViewById(R.id.confirmSaveProfile);
        deleteAccount = baseView.findViewById(R.id.deleteAccount);

        saveProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainMenuActivity.class);
                startActivity(intent);
            }
        });

        deleteAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentActivity activity = getActivity();

                Intent intent = new Intent(activity, SuccessDeleteAccountActivity.class);
                startActivity(intent);

                activity.finish();
            }
        });

        return baseView;
    }

    @Override
    public void onPrepareOptionsMenu(Menu menu) {
        menu.clear();
    }
}
