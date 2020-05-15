package com.google.android.location.internal;

import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NlpNetworkProviderSettingsUpdateChimeraReceiver extends BroadcastReceiver {

    /* renamed from: b */
    private static Boolean f150792b = null;

    /* renamed from: a */
    public static synchronized void m117260a(Context context) {
        synchronized (NlpNetworkProviderSettingsUpdateChimeraReceiver.class) {
            boolean isProviderEnabled = ((LocationManager) context.getSystemService("location")).isProviderEnabled("network");
            if (f150792b == null || f150792b.booleanValue() != isProviderEnabled) {
                Boolean valueOf = Boolean.valueOf(isProviderEnabled);
                f150792b = valueOf;
                if (valueOf.booleanValue()) {
                    new bxbi(context.getPackageName()).mo73549a(context);
                }
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        if (!ceze.m138466k() && intent != null) {
            m117260a(context);
        }
    }
}
