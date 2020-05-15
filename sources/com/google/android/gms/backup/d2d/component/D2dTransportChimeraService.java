package com.google.android.gms.backup.d2d.component;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class D2dTransportChimeraService extends Service {

    /* renamed from: a */
    private mfp f29038a;

    public final IBinder onBind(Intent intent) {
        Intent intent2 = new Intent("com.google.android.gms.backup.NOTIFY_BACKUP_TRANSPORT_BOUND");
        intent2.putExtra("transport", "com.google.android.gms/.backup.migrate.service.D2dTransport");
        intent2.setPackage(getPackageName());
        sendBroadcast(intent2);
        return this.f29038a.getBinder();
    }

    public final void onCreate() {
        if (this.f29038a == null) {
            this.f29038a = new mfp(this);
        }
    }
}
