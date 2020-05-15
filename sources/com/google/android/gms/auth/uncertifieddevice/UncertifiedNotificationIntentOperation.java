package com.google.android.gms.auth.uncertifieddevice;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UncertifiedNotificationIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(action) || "android.intent.action.BOOT_COMPLETED".equals(action)) {
            UncertifiedNotificationChimeraService.m7118b(this);
            if (cdpf.m134588b() && gnv.m13536ai() == 2) {
                UncertifiedNotificationChimeraService.m7116a(this);
            }
        }
    }
}
