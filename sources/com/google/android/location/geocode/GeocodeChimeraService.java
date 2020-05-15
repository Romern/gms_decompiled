package com.google.android.location.geocode;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GeocodeChimeraService extends Service {

    /* renamed from: a */
    private bfvu f150773a;

    public final IBinder onBind(Intent intent) {
        IBinder binder;
        synchronized (this) {
            if (this.f150773a == null) {
                this.f150773a = new bfvu(getApplicationContext());
            }
            binder = this.f150773a.getBinder();
        }
        return binder;
    }

    public final void onDestroy() {
        synchronized (this) {
            this.f150773a = null;
        }
        super.onDestroy();
    }

    public final boolean onUnbind(Intent intent) {
        return false;
    }
}
