package com.google.android.gms.ads.config;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.util.C0640e;
import com.google.android.gms.ads.internal.util.client.C0633h;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GServicesChangedIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(intent.getAction())) {
            C0371o.m5339a(this);
            if (C0640e.m5680a()) {
                C0633h.m5664a("GServicesValues have changed.");
            }
            C0235d.m5106a(this);
        }
    }
}
