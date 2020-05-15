package com.google.android.location.internal.server;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class HardwareArProviderChimeraService extends Service {

    /* renamed from: a */
    private IBinder f150811a;

    public final IBinder onBind(Intent intent) {
        if (!"com.android.location.service.ActivityRecognitionProvider".equals(intent.getAction()) || cers.m138134b()) {
            return null;
        }
        return this.f150811a;
    }

    public final void onCreate() {
        this.f150811a = bgii.m98997a().mo62870a();
    }

    public final void onDestroy() {
        this.f150811a = null;
        super.onDestroy();
    }
}
