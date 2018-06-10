package com.example.tulior.vacinasonline.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.tulior.vacinasonline.Adapters.LocationAdapter;
import com.example.tulior.vacinasonline.R;

import java.util.ArrayList;
import java.util.List;

public class VaccineLocationFragment extends android.support.v4.app.Fragment {
    ListView lstView;

    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View baseView = inflater.inflate(R.layout.fragment_vaccine_location, container, false);

        lstView = baseView.findViewById(R.id.lstView);

        LocationAdapter locationAdapter = new LocationAdapter(generateAddressList(), getActivity());

        lstView.setAdapter(locationAdapter);
        return baseView;
    }

    private List<String> generateAddressList() {

        List<String> address = new ArrayList<>();

        address.add(getString(R.string.location_1));
        address.add(getString(R.string.location_2));
        address.add(getString(R.string.location_3));
        address.add(getString(R.string.location_4));

        return address;
    }


}
