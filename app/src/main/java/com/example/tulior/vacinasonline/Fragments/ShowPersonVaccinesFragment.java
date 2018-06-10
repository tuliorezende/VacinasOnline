package com.example.tulior.vacinasonline.Fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.tulior.vacinasonline.Adapters.ShowPersonVaccinesAdapter;
import com.example.tulior.vacinasonline.Model.PersonVaccine;
import com.example.tulior.vacinasonline.R;

import java.util.ArrayList;
import java.util.List;

public class ShowPersonVaccinesFragment extends android.support.v4.app.Fragment {

    ListView personVaccinesListView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View baseView = inflater.inflate(R.layout.fragment_show_person_vaccines, container, false);

        ShowPersonVaccinesAdapter showPersonVaccinesAdapter = new ShowPersonVaccinesAdapter(getPersonVaccineList(), getActivity());

        setHasOptionsMenu(true);

        personVaccinesListView = baseView.findViewById(R.id.lstPersonVaccines);
        personVaccinesListView.setAdapter(showPersonVaccinesAdapter);

        return baseView;
    }

    private List<PersonVaccine> getPersonVaccineList() {
        List<PersonVaccine> personVaccinesList = new ArrayList<PersonVaccine>();

        PersonVaccine personVaccine1 = new PersonVaccine();

        personVaccine1.VaccineName = "Hepatite B";
        personVaccine1.VaccineTotalPortion = "3";
        personVaccine1.VaccineExecutedPortion = "1";
        personVaccine1.VaccineIcon = R.drawable.ic_check;
        personVaccine1.VaccineId = 1;

        personVaccinesList.add(personVaccine1);

        PersonVaccine personVaccine2 = new PersonVaccine();
        personVaccine2.VaccineName = "Poliomelite";
        personVaccine2.VaccineTotalPortion = "4";
        personVaccine2.VaccineExecutedPortion = "1";
        personVaccine2.VaccineIcon = R.drawable.ic_check;
        personVaccine2.VaccineId = 2;

        personVaccinesList.add(personVaccine2);

        PersonVaccine personVaccine3 = new PersonVaccine();
        personVaccine3.VaccineName = "Gripe";
        personVaccine3.VaccineTotalPortion = "1";
        personVaccine3.VaccineExecutedPortion = "1";
        personVaccine3.VaccineIcon = R.drawable.ic_check;
        personVaccine3.VaccineId = 3;

        personVaccinesList.add(personVaccine3);

        PersonVaccine personVaccine4 = new PersonVaccine();
        personVaccine4.VaccineName = "Febre Amarela";
        personVaccine4.VaccineTotalPortion = "1";
        personVaccine4.VaccineExecutedPortion = "1";
        personVaccine4.VaccineIcon = R.drawable.ic_check;
        personVaccine4.VaccineId = 4;

        personVaccinesList.add(personVaccine4);


        return personVaccinesList;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        menu.clear();
        inflater.inflate(R.menu.main_menu, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id) {
            case R.id.action_delete:
                return true;
            case R.id.action_save:
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
