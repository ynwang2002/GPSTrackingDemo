package com.example.gpstrackingdemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyService extends Service {

    int mStartMode;       // indicates how to behave if the service is killed
    IBinder mBinder;      // interface for clients that bind
    boolean mAllowRebind; // indicates whether onRebind should be used

    @Override
    public void onCreate() {
        // The service is being created
    }

    @Override
    public IBinder onBind(Intent intent) {
        // A client is binding to the service with bindService()
        return null;
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // 實作工作
        // The service is starting, due to a call to startService()
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy()
    {
        // The service is no longer used and is being destroyed
    }
}