package com.example.android.tourguideapp;


public class Item {

    //global variables
    private int iTitleTextID;
    private int iAddressID;
    private int iShortDescID;
    private int iPicID = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    //Constructor
    public Item(int title, int address, int shortDesc, int picture) {
        iTitleTextID = title;
        iAddressID = address;
        iShortDescID = shortDesc;
        iPicID = picture;
    }

    //getters
    public int getTitleTextID() {
        return iTitleTextID;
    }
    public int getAddressID() {
        return iAddressID;
    }
    public int getShortDescID() {
        return iShortDescID;
    }
    public int getPicID() {
        return iPicID;
    }

}