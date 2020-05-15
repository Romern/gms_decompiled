package com.google.android.gms.wearable.service;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class WearableController$PackageIntentOperation extends IntentOperation {
    /* renamed from: a */
    private static final String m94450a(Intent intent) {
        Uri data = intent.getData();
        if (data != null) {
            return data.getSchemeSpecificPart();
        }
        return null;
    }

    public final void onHandleIntent(Intent intent) {
        String a;
        String action = intent.getAction();
        Uri data = intent.getData();
        String schemeSpecificPart = data != null ? data.getSchemeSpecificPart() : "";
        if (Log.isLoggable("Wear_Controller", 3)) {
            Log.d("Wear_Controller", String.format("Received broadcast action=%s and uri=%s", action, schemeSpecificPart));
        }
        if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
            String a2 = m94450a(intent);
            if (a2 != null) {
                aygy.m83985a();
                int i = Build.VERSION.SDK_INT;
                if (aygy.m83988a(this, a2)) {
                    aygy.m83986a(this);
                    aygy.m83987a(this, "com.google.android.gms.wearable.ACTION_WEARABLE_APP_PACKAGE_ADDED", a2);
                    return;
                }
                aygy.m83987a(this, "com.google.android.gms.wearable.ACTION_PACKAGE_ADDED", a2);
            }
        } else if ("android.intent.action.PACKAGE_DATA_CLEARED".equals(action)) {
            String a3 = m94450a(intent);
            if (a3 != null) {
                aygy.m83985a();
                int i2 = Build.VERSION.SDK_INT;
                aygy.m83987a(this, "com.google.android.gms.wearable.ACTION_PACKAGE_DATA_CLEARED", a3);
            }
        } else if ("android.intent.action.PACKAGE_CHANGED".equals(action)) {
            String a4 = m94450a(intent);
            if (a4 != null) {
                aygy.m83985a();
                int i3 = Build.VERSION.SDK_INT;
                aygy.m83987a(this, "com.google.android.gms.wearable.ACTION_PACKAGE_CHANGED", a4);
            }
        } else if ("android.intent.action.PACKAGE_REMOVED".equals(action) && !intent.getBooleanExtra("android.intent.extra.REPLACING", false) && (a = m94450a(intent)) != null) {
            aygy.m83985a();
            int i4 = Build.VERSION.SDK_INT;
            if (aygy.m83988a(this, a)) {
                aygy.m83987a(this, "com.google.android.gms.wearable.ACTION_WEARABLE_APP_PACKAGE_REMOVED", a);
            } else {
                aygy.m83987a(this, "com.google.android.gms.wearable.ACTION_PACKAGE_REMOVED", a);
            }
        }
    }
}
