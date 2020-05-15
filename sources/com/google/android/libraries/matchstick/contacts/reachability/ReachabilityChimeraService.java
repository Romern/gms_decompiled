package com.google.android.libraries.matchstick.contacts.reachability;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ReachabilityChimeraService extends Service {

    /* renamed from: a */
    private IBinder f111072a;

    public final IBinder onBind(Intent intent) {
        return this.f111072a;
    }

    public final void onCreate() {
        super.onCreate();
        this.f111072a = new ddm(getApplicationContext());
    }

    public final void onDestroy() {
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            azoj.m85932b("ReachabilityService", "Null intent", new Object[0]);
            return 2;
        }
        if (this.f111072a == null) {
            azoj.m85932b("ReachabilityService", "Null binder", new Object[0]);
        }
        return 2;
    }

    public final boolean onUnbind(Intent intent) {
        return false;
    }
}
