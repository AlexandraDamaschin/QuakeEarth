package com.example.android.quakeearth;

/**
 * Created by e6420 on 4/6/2018.
 */

public class Earthquake {
    private String mMagnitude;
    private String mLocation;
    private String mDate;

    //contructor
    public Earthquake(String magnitude, String location, String date) {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    //get magnitude
    public String getmMagnitude() {
        return mMagnitude;
    }

    //get location
    public String getmLocation() {
        return mLocation;
    }

    // get date
    public String getmDate() {
        return mDate;
    }
}
