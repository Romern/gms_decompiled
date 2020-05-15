package com.google.android.gms.appstate.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AppStateSyncChimeraService extends Service {

    /* renamed from: a */
    private static final Object f9814a = new Object();

    /* renamed from: b */
    private static gak f9815b = null;

    public final IBinder onBind(Intent intent) {
        return f9815b.getSyncAdapterBinder();
    }

    public final void onCreate() {
        synchronized (f9814a) {
            if (f9815b == null) {
                f9815b = new gak(getApplicationContext());
            }
        }
    }
}
