package com.google.android.gms.lockbox.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LockboxBrokerChimeraService extends Service {
    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.lockbox.service.START".equals(intent.getAction())) {
            return new aezp(this, this);
        }
        return null;
    }
}
