package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class MenuAdapter extends FragmentPagerAdapter {

    private Context Context;

    //Constructor
    public MenuAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        Context = context;
    }

    //method overriding
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = new Fragment();
        switch (position) {
            case 0:
                fragment = new SeeFragment();
            case 1:
                fragment = new EatFragment();
            case 2:
                fragment = new SleepFragment();
            case 3:
                fragment = new PartyFragment();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return Context.getString(R.string.menu_See);
            case 1:
                return Context.getString(R.string.menu_eat);
            case 2:
                return Context.getString(R.string.menu_Sleep);
            case 3:
                return Context.getString(R.string.menu_Party);
            default:
                return null;
        }
    }
}
