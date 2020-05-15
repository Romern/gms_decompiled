package com.google.android.location.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NlpNetworkProviderSettingsUpdateIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static Boolean f150793a = null;

    /* renamed from: a */
    public static synchronized void m117261a(Context context) {
        synchronized (NlpNetworkProviderSettingsUpdateIntentOperation.class) {
            boolean a = aeri.m52435a(context, "network");
            if (f150793a == null || f150793a.booleanValue() != a) {
                Boolean valueOf = Boolean.valueOf(a);
                f150793a = valueOf;
                if (valueOf.booleanValue()) {
                    new bxbi(context.getPackageName()).mo73549a(context);
                }
            }
        }
    }

    public final void onHandleIntent(Intent intent) {
        if (ceze.m138466k() && intent != null) {
            m117261a(this);
        }
    }
}
