package com.google.android.gms.nearby.discovery;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BluetoothDeviceIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        if (cfod.f184793a.mo6606a().mo81887I()) {
            startService(DiscoveryChimeraService.m67336a(this).setAction(intent.getAction()).putExtras(intent));
        }
    }
}
