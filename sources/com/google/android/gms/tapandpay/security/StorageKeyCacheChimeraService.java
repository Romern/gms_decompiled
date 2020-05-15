package com.google.android.gms.tapandpay.security;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class StorageKeyCacheChimeraService extends Service {
    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        if (rsk.m34335a(intent)) {
            athk.m75896a(this).mo49993a(intent);
        }
        stopSelf();
        return super.onStartCommand(intent, i, i2);
    }
}
