package com.google.android.gms.people.sync.focus;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ContactsSyncAdapterChimeraService extends Service {

    /* renamed from: a */
    private static final Object f82053a = new Object();

    /* renamed from: b */
    private static amvf f82054b = null;

    public final IBinder onBind(Intent intent) {
        return f82054b.getSyncAdapterBinder();
    }

    public final void onCreate() {
        synchronized (f82053a) {
            if (f82054b == null) {
                f82054b = new amvf(getApplicationContext());
            }
        }
    }
}
