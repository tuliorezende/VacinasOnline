package com.example.tulior.vacinasonline.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.tulior.vacinasonline.R;

public class MainMenuFragment extends android.support.v4.app.Fragment {
    Button addVaccine;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View baseView = inflater.inflate(R.layout.fragment_main_menu, container, false);

        addVaccine = baseView.findViewById(R.id.addVacine);

        addVaccine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.basicLayout, new CreateVaccineFragment()).commit();
            }
        });

        return baseView;
    }
}
