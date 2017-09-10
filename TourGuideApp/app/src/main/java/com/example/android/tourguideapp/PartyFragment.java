package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class PartyFragment extends Fragment {

    public PartyFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.items_list_layout, container, false);

        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(R.string.partyTitle_01, R.string.partyAddress_01, R.string.partyShortDesc_01, R.drawable.party01));
        items.add(new Item(R.string.partyTitle_02, R.string.partyAddress_02, R.string.partyShortDesc_02, R.drawable.party02));
        items.add(new Item(R.string.partyTitle_03, R.string.partyAddress_03, R.string.partyShortDesc_03, R.drawable.party03));
        items.add(new Item(R.string.partyTitle_04, R.string.partyAddress_04, R.string.partyShortDesc_04, R.drawable.party04));
        items.add(new Item(R.string.partyTitle_05, R.string.partyAddress_05, R.string.partyShortDesc_05, R.drawable.party05));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);
        ListView listView = (ListView) rootView.findViewById(R.id.listview);
        listView.setAdapter(adapter);

        return rootView;
    }
}
