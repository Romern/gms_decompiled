package com.google.android.gms.vision.service;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DependencyBroadcastReceiver extends BroadcastReceiver {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: avzo.a(android.content.Context, java.lang.String, boolean):void
     arg types: [android.content.Context, java.lang.String, int]
     candidates:
      avzo.a(android.content.Context, java.util.Set, boolean):void
      avzo.a(android.content.Context, java.lang.String, boolean):void */
    public final void onReceive(Context context, Intent intent) {
        boolean z;
        boolean z2;
        new Object[1][0] = intent.getAction();
        if (intent.getAction() != null) {
            z = intent.getAction().equals("android.intent.action.DOWNLOAD_COMPLETE");
        } else {
            z = false;
        }
        if (intent.getAction() == null) {
            z2 = !intent.hasExtra("com.google.android.gms.vision.DEPENDENCIES");
        } else {
            z2 = false;
        }
        int intExtra = intent.getIntExtra("ttl", 30);
        if (!z && !z2) {
            String stringExtra = intent.getStringExtra("com.google.android.gms.vision.DEPENDENCIES");
            if (stringExtra != null) {
                new Object[1][0] = stringExtra;
                avzo.m79548a(context, stringExtra, false);
                return;
            }
            return;
        }
        avzo.m79549a(context, new ArrayList(), false, true, intExtra);
    }
}
