package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.ads.internal.util.ao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0617ao implements Callable {

    /* renamed from: a */
    final /* synthetic */ Context f8930a;

    public C0617ao(Context context) {
        this.f8930a = context;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        SharedPreferences sharedPreferences = this.f8930a.getSharedPreferences("admob_user_agent", 0);
        String string = sharedPreferences.getString("user_agent", "");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String defaultUserAgent = WebSettings.getDefaultUserAgent(this.f8930a);
        stj.m36296a(this.f8930a, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
        return defaultUserAgent;
    }
}
