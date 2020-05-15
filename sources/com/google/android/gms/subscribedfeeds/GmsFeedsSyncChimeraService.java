package com.google.android.gms.subscribedfeeds;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GmsFeedsSyncChimeraService extends Service {
    public final IBinder onBind(Intent intent) {
        return new ashp(getApplicationContext(), "com.google.android.gms.subscribedfeeds").getSyncAdapterBinder();
    }
}
