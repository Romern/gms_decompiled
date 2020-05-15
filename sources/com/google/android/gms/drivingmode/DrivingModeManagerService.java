package com.google.android.gms.drivingmode;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DrivingModeManagerService extends BoundService {

    /* renamed from: a */
    private vtv f31229a;

    public final IBinder onBind(Intent intent) {
        vtv vtv = new vtv(getApplicationContext());
        this.f31229a = vtv;
        if (!vtv.f49966b) {
            vtv.f49966b = true;
            vtv.f49965a = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(vtv);
        }
        vup vup = new vup(getApplicationContext());
        return vup.getInterfaceDescriptor() != null ? new vux(vup) : vup;
    }

    public final boolean onUnbind(Intent intent) {
        vtv vtv = this.f31229a;
        if (vtv.f49966b) {
            vtv.f49966b = false;
            Thread.setDefaultUncaughtExceptionHandler(vtv.f49965a);
        }
        return super.onUnbind(intent);
    }
}
