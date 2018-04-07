package com.example.android.quakeearth;

/**
 * Created by e6420 on 4/6/2018.
 */

public class Earthquake {
    private String mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;

    //contructor
    public Earthquake(String magnitude, String location, long timeInMilliseconds) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
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
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
