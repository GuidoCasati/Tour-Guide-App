package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class SeeFragment extends Fragment {

    public SeeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.items_list_layout, container, false);

        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(R.string.seeTitle_01, R.string.seeAddress_01, R.string.seeShortDesc_01, R.drawable.see01));
        items.add(new Item(R.string.seeTitle_02, R.string.seeAddress_02, R.string.seeShortDesc_02, R.drawable.see02));
        items.add(new Item(R.string.seeTitle_03, R.string.seeAddress_03, R.string.seeShortDesc_03, R.drawable.see03));
        items.add(new Item(R.string.seeTitle_04, R.string.seeAddress_04, R.string.seeShortDesc_04, R.drawable.see04));
        items.add(new Item(R.string.seeTitle_05, R.string.seeAddress_05, R.string.seeShortDesc_05, R.drawable.see05));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);
        ListView listView = (ListView) rootView.findViewById(R.id.listview);
        listView.setAdapter(adapter);

        return rootView;
    }
}
