package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ServiceChimeraAutoStarter extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        if (!aytw.m84813a(context) || (ceck.m135995e() && aaka.m21376a(context))) {
            aajg.m21335a(context);
            if (aajg.m21343c()) {
                if (intent == null) {
                    intent = new Intent();
                }
                intent.setClassName(context, "com.google.android.gms.gcm.GcmService");
                context.startService(intent);
            }
        }
    }
}
