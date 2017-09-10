package com.example.android.tourguideapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Item> {

    public ItemAdapter(Context context, ArrayList<Item> items) {
        super(context, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listview = convertView;
        if (listview == null) {
            listview = LayoutInflater.from(getContext()).inflate(
                    R.layout.single_item_layout, parent, false);
        }

        final Item currentItem = getItem(position);

        //set up TextViews
        TextView titleTV = (TextView) listview.findViewById(R.id.title_textView);
        titleTV.setText(currentItem.getTitleTextID());
        TextView addressTV = (TextView) listview.findViewById(R.id.address_textView);
        addressTV.setText(currentItem.getAddressID());
        TextView shortDescTV = (TextView) listview.findViewById(R.id.shortDesc_textView);
        shortDescTV.setText(currentItem.getShortDescID());
        //set up ImageView
        ImageView imageView = (ImageView) listview.findViewById(R.id.imageView);
        imageView.setImageResource(currentItem.getPicID());
        imageView.setVisibility(View.VISIBLE);

        //callback for map
        addressTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView address = (TextView) view;
                String completeAddress = "Rome, Italy, " + address.getText().toString();
                navigate(completeAddress);
            }
        });
        return listview;
    }

    //method for implicit intent
    private void navigate(String address) {
        Uri gmmIntentUri = Uri.parse("geo:0,0?").buildUpon().appendQueryParameter("q", address).build();
        Intent mapIntent = new Intent(Intent.ACTION_VIEW);
        mapIntent.setData(gmmIntentUri);
        mapIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        getContext().startActivity(mapIntent);
    }
}