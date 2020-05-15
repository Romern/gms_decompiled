package com.google.android.gms.drive.metadata.sync.syncadapter;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SyncAdapterChimeraService extends Service {

    /* renamed from: a */
    private static vbg f31079a = null;

    public final IBinder onBind(Intent intent) {
        if (f31079a == null) {
            f31079a = new vbg(getApplicationContext());
        }
        return f31079a.getSyncAdapterBinder();
    }
}
