package com.google.android.gms.ads.cache;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.util.client.C0633h;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class CacheBrokerChimeraService extends Service {
    public final IBinder onBind(Intent intent) {
        C0371o.m5339a(this);
        C0633h.m5664a("Binding to the ad cache service.");
        if ("com.google.android.gms.ads.service.CACHE".equals(intent.getAction())) {
            return new C0199e(this, this);
        }
        return null;
    }
}
