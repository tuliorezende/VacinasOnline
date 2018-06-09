package com.example.tulior.vacinasonline.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import com.example.tulior.vacinasonline.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AboutVaccineFragment extends android.support.v4.app.Fragment {

    ExpandableListView expListView;
    ExpandableListAdapter listAdapter;

    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View baseView = inflater.inflate(R.layout.fragment_about_vaccine, container, false);

        expListView = baseView.findViewById(R.id.lvExp);

        prepareListData();

        listAdapter = new com.example.tulior.vacinasonline.Adapters.ExpandableListAdapter(getActivity(), listDataHeader, listDataChild);

        expListView.setAdapter(listAdapter);

        return baseView;
    }

    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Hepatite B");
        listDataHeader.add("Poliomelite");
        listDataHeader.add("Gripe");

        // Adding child data
        List<String> hepatiteB = new ArrayList<String>();
        hepatiteB.add("Uma infecção grave do fígado causada pelo vírus da hepatite B, que pode ser facilmente prevenida por meio de vacina.");

        List<String> poliomelite = new ArrayList<String>();
        poliomelite.add("A poliomielite é uma doença infecto-contagiosa aguda, causada por um vírus que vive no intestino, denominado Poliovírus.");

        List<String> gripe = new ArrayList<String>();
        gripe.add("A gripe é uma infecção viral que afeta especialmente as vias aéreas e o pulmão. ");

        listDataChild.put(listDataHeader.get(0), hepatiteB); // Header, Child data
        listDataChild.put(listDataHeader.get(1), poliomelite);
        listDataChild.put(listDataHeader.get(2), gripe);
    }
}
