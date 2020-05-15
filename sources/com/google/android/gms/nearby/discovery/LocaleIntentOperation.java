package com.google.android.gms.nearby.discovery;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocaleIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        srn srn = ahsd.f67925a;
        intent.getAction();
        startService(DiscoveryChimeraService.m67336a(this).setAction("com.google.android.gms.nearby.discovery:ACTION_LOCALE_CHANGE"));
    }
}
