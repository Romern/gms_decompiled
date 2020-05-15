package com.google.android.location.geofencer.service;

import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GeofenceProviderChimeraService extends Service {

    /* renamed from: a */
    private IBinder f150779a;

    public final IBinder onBind(Intent intent) {
        if (!"com.android.location.service.GeofenceProvider".equals(intent.getAction())) {
            return null;
        }
        boolean z = bfxc.f115575a;
        return this.f150779a;
    }

    public final void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        this.f150779a = bfzu.f115822a.getBinder();
    }
}
