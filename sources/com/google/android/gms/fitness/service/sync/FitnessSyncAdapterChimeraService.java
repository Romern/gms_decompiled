package com.google.android.gms.fitness.service.sync;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FitnessSyncAdapterChimeraService extends Service {

    /* renamed from: a */
    private zot f32418a;

    public final IBinder onBind(Intent intent) {
        return this.f32418a.getSyncAdapterBinder();
    }

    public final void onCreate() {
        this.f32418a = new zot(this, false, true, yzq.m45107a(this));
    }
}
