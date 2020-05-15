package com.google.android.gms.plus.service;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OfflineActionSyncAdapterChimeraService extends Service {
    public final IBinder onBind(Intent intent) {
        Context applicationContext = getApplicationContext();
        if (aoat.f78051a == null) {
            aoat.f78051a = new aoat(applicationContext, anru.m65076a(applicationContext), applicationContext.getPackageManager());
        }
        return aoat.f78051a.getSyncAdapterBinder();
    }
}
