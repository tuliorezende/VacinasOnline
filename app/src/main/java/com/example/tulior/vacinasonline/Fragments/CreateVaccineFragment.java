package com.example.tulior.vacinasonline.Fragments;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import com.example.tulior.vacinasonline.AccountSuccessActivity;
import com.example.tulior.vacinasonline.MainMenuActivity;
import com.example.tulior.vacinasonline.R;

public class CreateVaccineFragment extends android.support.v4.app.Fragment {

    EditText vaccineDate;
    Button saveVaccine;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        final View baseView = inflater.inflate(R.layout.fragment_create_vaccine, container, false);

        vaccineDate = baseView.findViewById(R.id.showCalendar);
        saveVaccine = baseView.findViewById(R.id.saveVaccine);

        vaccineDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog.OnDateSetListener listener = new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        vaccineDate.setText(dayOfMonth + "/" + monthOfYear + "/" + year);
                    }
                };
                DatePickerDialog dpDialog = new DatePickerDialog(getActivity(), listener, 2018, 06, 13);
                dpDialog.show();
            }
        });

        saveVaccine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder dialog = new AlertDialog.Builder(getActivity()).setView(R.layout.dialog_success_create_vaccine);
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();

                        Intent intent = new Intent(getActivity(), MainMenuActivity.class);
                        startActivity(intent);
                    }
                });

                dialog.show();
            }
        });

        return baseView;
    }
}