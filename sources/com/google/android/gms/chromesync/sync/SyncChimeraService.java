package com.google.android.gms.chromesync.sync;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SyncChimeraService extends Service {

    /* renamed from: a */
    private static final Object f30020a = new Object();

    /* renamed from: b */
    private static qvu f30021b;

    public final IBinder onBind(Intent intent) {
        return f30021b.getSyncAdapterBinder();
    }

    public final void onCreate() {
        synchronized (f30020a) {
            if (f30021b == null) {
                f30021b = new qvu(getApplicationContext());
            }
        }
    }
}
