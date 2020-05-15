package com.google.android.gms.app.phone.service;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CorePhoneInitIntentOperation extends fps {

    /* renamed from: a */
    static final String[] f9500a = {"com.google.android.gms.app.net.NetworkUsageActivity", "com.google.android.gms.app.net.NetworkUsageActivityAdvanced", "com.google.android.gms.app.settings.DataManagementActivity", "com.google.android.gms.app.settings.SettingsSubPageActivity"};

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String[] mo7151a() {
        return f9500a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7150a(Context context) {
        int i = Build.VERSION.SDK_INT;
        spn.m35854a(context, new ComponentName(context, "com.google.android.gms.app.settings.GoogleSettingsLink"));
        spn.m35854a(context, new ComponentName(context, "com.google.android.gms.app.settings.GoogleSettingsIALink"));
    }
}
