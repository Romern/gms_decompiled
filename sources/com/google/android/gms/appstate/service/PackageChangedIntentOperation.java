package com.google.android.gms.appstate.service;

import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PackageChangedIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        String str;
        if (!cbwf.m128761b() && "android.intent.action.PACKAGE_REMOVED".equals(intent.getAction()) && !intent.getBooleanExtra("android.intent.extra.REPLACING", false)) {
            Uri data = intent.getData();
            if (data != null) {
                str = data.getSchemeSpecificPart();
            } else {
                str = null;
            }
            if (str != null) {
                AppStateIntentChimeraService.m6237a(this, AppStateIntentChimeraService.f9813a, new gam(str));
            }
        }
    }
}
