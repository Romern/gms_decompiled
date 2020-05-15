package com.google.android.gms.ads.measurement;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.ads.internal.util.client.C0633h;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GmpConversionTrackingBrokerChimeraService extends Service {
    public final IBinder onBind(Intent intent) {
        C0633h.m5664a("Binding to the conversion tracking service");
        if ("com.google.android.gms.ads.measurement.service.START".equals(intent.getAction())) {
            return new C0738a(this, this);
        }
        return null;
    }
}
