package com.example.tulior.vacinasonline.Adapters;

import android.app.Activity;
import android.content.Context;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.tulior.vacinasonline.R;

import java.util.List;

public class LocationAdapter extends BaseAdapter {

    private final List<String> addressList;
    private final Activity act;

    TextView addressLocation;

    public LocationAdapter(List<String> address, Activity act) {
        this.addressList = address;
        this.act = act;
    }

    @Override
    public int getCount() {
        return this.addressList.size();
    }

    @Override
    public Object getItem(int position) {
        return this.addressList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = this.act.getLayoutInflater().inflate(R.layout.list_vaccine_location, parent, false);

        String address = this.addressList.get(position);

        addressLocation = view.findViewById(R.id.address_location);
        addressLocation.setText(Html.fromHtml(address));

        return view;
    }
}
