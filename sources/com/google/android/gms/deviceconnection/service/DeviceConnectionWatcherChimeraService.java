package com.google.android.gms.deviceconnection.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeviceConnectionWatcherChimeraService extends Service {
    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        tvo.m37525a(this);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }
}
