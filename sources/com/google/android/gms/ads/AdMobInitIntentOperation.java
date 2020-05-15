package com.google.android.gms.ads;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.config.C0235d;
import com.google.android.gms.ads.internal.util.client.C0633h;
import com.google.android.gms.ads.play.GmsCachingPlayStoreParentalControlProvider;
import com.google.android.gms.ads.social.C0903d;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AdMobInitIntentOperation extends qlf {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        C0235d.m5106a(this);
        Context applicationContext = getApplicationContext();
        C0903d a = C0903d.m6097a(applicationContext);
        a.mo7129c();
        a.mo7128b();
        GmsCachingPlayStoreParentalControlProvider.m6054a().mo6707a(applicationContext);
        String a2 = stu.m36315a();
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 31);
        sb.append("Initialized AdMob in container ");
        sb.append(a2);
        C0633h.m5670c(sb.toString());
    }
}
