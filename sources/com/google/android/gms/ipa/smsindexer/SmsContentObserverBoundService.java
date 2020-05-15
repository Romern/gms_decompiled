package com.google.android.gms.ipa.smsindexer;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SmsContentObserverBoundService extends BoundService {
    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        adsu.m51140a(getApplicationContext());
    }

    public final void onDestroy() {
        adsu.m51138a();
    }
}
