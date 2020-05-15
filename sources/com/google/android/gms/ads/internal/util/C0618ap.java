package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.ads.internal.util.ap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0618ap implements Callable {

    /* renamed from: a */
    final /* synthetic */ Context f8931a;

    /* renamed from: b */
    final /* synthetic */ Context f8932b;

    public C0618ap(Context context, Context context2) {
        this.f8931a = context;
        this.f8932b = context2;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        SharedPreferences sharedPreferences;
        Context context = this.f8931a;
        boolean z = false;
        if (context == null) {
            sharedPreferences = this.f8932b.getSharedPreferences("admob_user_agent", 0);
            z = true;
        } else {
            sharedPreferences = context.getSharedPreferences("admob_user_agent", 0);
        }
        String string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            string = WebSettings.getDefaultUserAgent(this.f8932b);
            if (z) {
                sharedPreferences.edit().putString("user_agent", string).apply();
                return string;
            }
        }
        return string;
    }
}
