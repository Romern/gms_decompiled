package com.google.android.gms.gcm.http;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GoogleHttpService extends qlb {
    public final IBinder onBind(Intent intent) {
        Service service = this.f13207a;
        if (service != null) {
            return service.onBind(intent);
        }
        return null;
    }
}
