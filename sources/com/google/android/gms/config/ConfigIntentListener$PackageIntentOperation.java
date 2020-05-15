package com.google.android.gms.config;

import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ConfigIntentListener$PackageIntentOperation extends IntentOperation {
    /* renamed from: a */
    private static final String m22776a(Intent intent) {
        return intent.getData().getSchemeSpecificPart();
    }

    public final void onHandleIntent(Intent intent) {
        String schemeSpecificPart;
        String a;
        if (intent != null) {
            String action = intent.getAction();
            Uri data = intent.getData();
            if (data != null && (schemeSpecificPart = data.getSchemeSpecificPart()) != null && !schemeSpecificPart.isEmpty()) {
                if ("android.intent.action.PACKAGE_DATA_CLEARED".equals(action)) {
                    String a2 = m22776a(intent);
                    if (a2 != null) {
                        swn.m36529a();
                        swn.m36530a(this, "com.google.android.gms.config.ACTION_PACKAGE_DATA_CLEARED", a2);
                    }
                } else if ("android.intent.action.PACKAGE_REMOVED".equals(action) && !intent.getBooleanExtra("android.intent.extra.REPLACING", false) && (a = m22776a(intent)) != null) {
                    swn.m36529a();
                    swn.m36530a(this, "com.google.android.gms.config.ACTION_PACKAGE_FULLY_REMOVED", a);
                }
            }
        }
    }
}
