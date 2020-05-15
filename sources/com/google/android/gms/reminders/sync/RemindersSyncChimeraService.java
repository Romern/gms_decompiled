package com.google.android.gms.reminders.sync;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RemindersSyncChimeraService extends Service {

    /* renamed from: a */
    private static final Object f107222a = new Object();

    /* renamed from: b */
    private static aowf f107223b = null;

    public final IBinder onBind(Intent intent) {
        return f107223b.getSyncAdapterBinder();
    }

    public final void onCreate() {
        synchronized (f107222a) {
            if (f107223b == null) {
                f107223b = new aowf(getApplicationContext());
            }
        }
    }
}
