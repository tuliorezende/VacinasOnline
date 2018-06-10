package com.example.tulior.vacinasonline.Adapters;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tulior.vacinasonline.Model.PersonVaccine;
import com.example.tulior.vacinasonline.R;

import java.util.List;

public class ShowPersonVaccinesAdapter extends BaseAdapter {

    private final List<PersonVaccine> vaccineList;
    private final Activity act;

    public ShowPersonVaccinesAdapter(List<PersonVaccine> vaccineList, Activity act) {
        this.vaccineList = vaccineList;
        this.act = act;
    }

    @Override
    public int getCount() {
        return this.vaccineList.size();
    }

    @Override
    public Object getItem(int position) {
        return this.vaccineList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return this.vaccineList.get(position).VaccineId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView vaccineIcon;
        TextView vaccineName;
        TextView vaccinePortion;

        View view = this.act.getLayoutInflater().inflate(R.layout.list_show_person_vaccine, parent, false);

        PersonVaccine personVaccine = this.vaccineList.get(position);

        vaccineIcon = view.findViewById(R.id.vaccineIcon);
        vaccineName = view.findViewById(R.id.vaccineName);
        vaccinePortion = view.findViewById(R.id.vaccinePortion);

        vaccineName.setText(personVaccine.VaccineName);
        vaccinePortion.setText("Dose" + personVaccine.VaccineExecutedPortion + "/" + personVaccine.VaccineTotalPortion);
        vaccineIcon.setImageResource(personVaccine.VaccineIcon);
        return view;
    }
}
