package com.project.finalyear.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;

public class Utils {

    // For Checking Internet Availability....
    public static boolean isInternetAvailable(Context c) {

        ConnectivityManager connectivity = (ConnectivityManager) c
                .getSystemService(Context.CONNECTIVITY_SERVICE);

        if (connectivity != null) {

            NetworkInfo[] info = connectivity.getAllNetworkInfo();
            if (info != null)
                for (int i = 0; i < info.length; i++)
                    if (info[i].getState() == NetworkInfo.State.CONNECTED) {
                        return true;
                    }
        }

        return false;
    }


    public static void backButtonOnToolbar(AppCompatActivity mActivity) {
        if (mActivity.getSupportActionBar() != null) {
            mActivity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            mActivity.getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }
}
