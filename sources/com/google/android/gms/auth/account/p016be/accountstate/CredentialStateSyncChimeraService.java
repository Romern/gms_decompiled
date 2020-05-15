package com.google.android.gms.auth.account.p016be.accountstate;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* renamed from: com.google.android.gms.auth.account.be.accountstate.CredentialStateSyncChimeraService */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CredentialStateSyncChimeraService extends Service {

    /* renamed from: a */
    private static final Object f9988a = new Object();

    /* renamed from: b */
    private static gla f9989b = null;

    public final IBinder onBind(Intent intent) {
        return f9989b.getSyncAdapterBinder();
    }

    public final void onCreate() {
        synchronized (f9988a) {
            if (f9989b == null) {
                f9989b = new gla(getApplicationContext());
            }
        }
    }
}
