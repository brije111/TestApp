package com.example.brijeshkum.testapp;

import android.content.Context;
import android.net.ConnectivityManager;

public final class NetManager {
    private Context context;

    public NetManager(Context context) {
        this.context = context;
    }

    public boolean isConnected(){
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm.getActiveNetworkInfo().isConnectedOrConnecting();
    }
}
