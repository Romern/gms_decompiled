package com.google.android.location.fused.service;

import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FusedProviderChimeraService extends Service {
    public final IBinder onBind(Intent intent) {
        if (!"com.android.location.service.FusedProvider".equals(intent.getAction())) {
            Log.e("GCoreFlp", "Invalid intent received in FusedProviderService.");
        }
        return null;
    }

    public final void onDestroy() {
        super.onDestroy();
    }

    public final void onCreate() {
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
    }
}
