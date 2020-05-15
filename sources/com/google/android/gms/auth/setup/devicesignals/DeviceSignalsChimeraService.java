package com.google.android.gms.auth.setup.devicesignals;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeviceSignalsChimeraService extends Service {
    public final IBinder onBind(Intent intent) {
        return new iyu(this);
    }
}
