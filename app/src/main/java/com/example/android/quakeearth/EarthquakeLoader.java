package com.example.android.quakeearth;

import android.content.Context;

import java.util.List;

public class EarthquakeLoader {

    private static final String LOG_TAG = EarthquakeLoader.class.getName();
    private String mUrl;

    //Constructor
    public EarthquakeLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    //This is on a background thread.
    @Override
    public List<Earthquake> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of earthquakes.
        List<Earthquake> earthquakes = QueryUtils.fetchEarthquakeData(mUrl);
        return earthquakes;
    }
}
