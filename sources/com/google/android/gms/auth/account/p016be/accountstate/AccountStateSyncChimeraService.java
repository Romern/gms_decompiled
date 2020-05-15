package com.google.android.gms.auth.account.p016be.accountstate;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* renamed from: com.google.android.gms.auth.account.be.accountstate.AccountStateSyncChimeraService */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountStateSyncChimeraService extends Service {

    /* renamed from: a */
    private static final Object f9983a = new Object();

    /* renamed from: b */
    private static gkw f9984b = null;

    public final IBinder onBind(Intent intent) {
        return f9984b.getSyncAdapterBinder();
    }

    public final void onCreate() {
        synchronized (f9983a) {
            if (f9984b == null) {
                f9984b = new gkw(getApplicationContext());
            }
        }
    }
}
