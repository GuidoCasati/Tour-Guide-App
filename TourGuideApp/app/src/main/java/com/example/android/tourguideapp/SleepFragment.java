package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class SleepFragment extends Fragment {

    public SleepFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.items_list_layout, container, false);

        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(R.string.sleepTitle_01, R.string.sleepAddress_01, R.string.sleepShortDesc_01, R.drawable.sleep_01));
        items.add(new Item(R.string.sleepTitle_02, R.string.sleepAddress_02, R.string.sleepShortDesc_02, R.drawable.sleep_02));
        items.add(new Item(R.string.sleepTitle_03, R.string.sleepAddress_03, R.string.sleepShortDesc_03, R.drawable.sleep_03));


        //adapting
        ItemAdapter adapter = new ItemAdapter(getActivity(), items);
        ListView listView = (ListView) rootView.findViewById(R.id.listview);
        listView.setAdapter(adapter);

        return rootView;
    }
}
