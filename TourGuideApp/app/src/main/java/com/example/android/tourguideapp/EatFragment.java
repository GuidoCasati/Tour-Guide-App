package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class EatFragment extends Fragment {

    //Constructor
    public EatFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.items_list_layout, container, false);
        // ArrayList of items
        final ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(R.string.eatTitle_01, R.string.eatAddress_01, R.string.eatShortDesc_01, R.drawable.eat01));
        items.add(new Item(R.string.eatTitle_02, R.string.eatAddress_02, R.string.eatShortDesc_02, R.drawable.eat02));
        items.add(new Item(R.string.eatTitle_03, R.string.eatAddress_03, R.string.eatShortDesc_03, R.drawable.eat03));
        items.add(new Item(R.string.eatTitle_04, R.string.eatAddress_04, R.string.eatShortDesc_04, R.drawable.eat04));

        //adapting items to the listView
        // ItemAdapter} from list of items
        ItemAdapter itemAdapter = new ItemAdapter(getActivity(), items);
        // ListView object from the ID
        ListView listView = (ListView) view.findViewById(R.id.listview);
        //set adapter to display items
        listView.setAdapter(itemAdapter);
        return view;
    }
}

