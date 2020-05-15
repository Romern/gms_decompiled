package com.google.android.gms.ads.internal.config;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.google.android.gms.ads.internal.config.i */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0365i {
    /* renamed from: a */
    public static final SharedPreferences m5332a(Context context) {
        return context.getSharedPreferences("google_ads_flags", 0);
    }

    /* renamed from: a */
    public static final void m5333a(Context context, SharedPreferences.Editor editor) {
        stj.m36296a(context, editor, "google_ads_flags");
    }
}
