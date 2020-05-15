package com.google.android.location.reporting.service;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmRegistrationChimeraReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        bgzo.m100459a(context);
        if (chcs.m148228D() && "com.google.android.gms.gcm.REGISTERED".equals(intent.getAction())) {
            String valueOf = String.valueOf(intent);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
            sb.append("GCM registration ID changed: ");
            sb.append(valueOf);
            bgur.m100011a("GCoreUlr", sb.toString());
            bgzo.m100465a(context, bgxx.m100271a(context, "com.google.android.location.reporting.GCM_ID_CHANGED"));
        }
    }
}
