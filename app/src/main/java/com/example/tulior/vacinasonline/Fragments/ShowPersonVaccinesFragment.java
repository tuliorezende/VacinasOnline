package com.example.tulior.vacinasonline.Fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import com.example.tulior.vacinasonline.Adapters.ShowPersonVaccinesAdapter;
import com.example.tulior.vacinasonline.Model.PersonVaccine;
import com.example.tulior.vacinasonline.R;

import java.util.ArrayList;
import java.util.List;

public class ShowPersonVaccinesFragment extends android.support.v4.app.Fragment {

    ListView personVaccinesListView;
    Button addVaccine;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View baseView = inflater.inflate(R.layout.fragment_show_person_vaccines, container, false);

        ShowPersonVaccinesAdapter showPersonVaccinesAdapter = new ShowPersonVaccinesAdapter(getPersonVaccineList(), getActivity());

        setHasOptionsMenu(true);

        personVaccinesListView = baseView.findViewById(R.id.lstPersonVaccines);
        personVaccinesListView.setAdapter(showPersonVaccinesAdapter);

        addVaccine = baseView.findViewById(R.id.addVacine);
        addVaccine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.basicLayout, new CreateVaccineFragment()).commit();
                return;
            }
        });

        return baseView;
    }

    private List<PersonVaccine> getPersonVaccineList() {
        List<PersonVaccine> personVaccinesList = new ArrayList<PersonVaccine>();

        PersonVaccine personVaccine1 = new PersonVaccine();

        personVaccine1.VaccineName = "Hepatite B";
        personVaccine1.VaccineTotalPortion = "3";
        personVaccine1.VaccineExecutedPortion = "1";
        personVaccine1.VaccineIcon = R.drawable.ic_noprazo;
        personVaccine1.VaccineId = 1;

        personVaccinesList.add(personVaccine1);

        PersonVaccine personVaccine2 = new PersonVaccine();
        personVaccine2.VaccineName = "Poliomelite";
        personVaccine2.VaccineTotalPortion = "4";
        personVaccine2.VaccineExecutedPortion = "1";
        personVaccine2.VaccineIcon = R.drawable.ic_agendadas;
        personVaccine2.VaccineId = 2;

        personVaccinesList.add(personVaccine2);

        PersonVaccine personVaccine3 = new PersonVaccine();
        personVaccine3.VaccineName = "Gripe";
        personVaccine3.VaccineTotalPortion = "1";
        personVaccine3.VaccineExecutedPortion = "1";
        personVaccine3.VaccineIcon = R.drawable.ic_recomendada;
        personVaccine3.VaccineId = 3;

        personVaccinesList.add(personVaccine3);

        PersonVaccine personVaccine4 = new PersonVaccine();
        personVaccine4.VaccineName = "Febre Amarela";
        personVaccine4.VaccineTotalPortion = "1";
        personVaccine4.VaccineExecutedPortion = "1";
        personVaccine4.VaccineIcon = R.drawable.ic_recomendada;
        personVaccine4.VaccineId = 4;

        personVaccinesList.add(personVaccine4);

        PersonVaccine personVaccine5 = new PersonVaccine();
        personVaccine5.VaccineName = "Pneumonia";
        personVaccine5.VaccineTotalPortion = "3";
        personVaccine5.VaccineExecutedPortion = "1";
        personVaccine5.VaccineIcon = R.drawable.ic_agendadas;
        personVaccine5.VaccineId = 5;

        personVaccinesList.add(personVaccine5);

        PersonVaccine personVaccine6 = new PersonVaccine();
        personVaccine6.VaccineName = "Tríplice-viral";
        personVaccine6.VaccineTotalPortion = "2";
        personVaccine6.VaccineExecutedPortion = "2";
        personVaccine6.VaccineIcon = R.drawable.ic_noprazo;
        personVaccine6.VaccineId = 6;

        personVaccinesList.add(personVaccine6);

        PersonVaccine personVaccine7 = new PersonVaccine();
        personVaccine7.VaccineName = "HPV";
        personVaccine7.VaccineTotalPortion = "1";
        personVaccine7.VaccineExecutedPortion = "1";
        personVaccine7.VaccineIcon = R.drawable.ic_naotomar;
        personVaccine7.VaccineId = 7;

        personVaccinesList.add(personVaccine7);

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
