package com.example.android.quakeearth;

/**
 * Created by e6420 on 4/6/2018.
 */

public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;
    private String mUrl;

    //contructor
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    //get magnitude
    public double getmMagnitude() {
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

    //get url
    public String getmUrl() {
        return mUrl;
    }
}
