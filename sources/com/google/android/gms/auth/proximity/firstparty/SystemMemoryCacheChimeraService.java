package com.google.android.gms.auth.proximity.firstparty;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SystemMemoryCacheChimeraService extends Service {
    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        if (!rsk.m34335a(intent)) {
            return 2;
        }
        jqw a = jqw.m17133a();
        sdo.m34974b(rsk.m34335a(intent));
        a.f23087b.post(new jqp(a, intent));
        return 2;
    }
}
