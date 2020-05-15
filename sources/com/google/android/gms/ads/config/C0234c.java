package com.google.android.gms.ads.config;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.flag.C0412y;

/* renamed from: com.google.android.gms.ads.config.c */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0234c implements C0412y {

    /* renamed from: a */
    final /* synthetic */ SharedPreferences.Editor f7945a;

    public C0234c(SharedPreferences.Editor editor) {
        this.f7945a = editor;
    }

    /* renamed from: a */
    public final void mo6437a(String str, double d) {
        this.f7945a.putFloat(str, (float) d);
    }

    /* renamed from: a */
    public final void mo6438a(String str, long j) {
        if (C0235d.f7946a.contains(str)) {
            this.f7945a.putInt(str, (int) j);
        } else {
            this.f7945a.putLong(str, j);
        }
    }

    /* renamed from: a */
    public final void mo6439a(String str, String str2) {
        this.f7945a.putString(str, str2);
    }

    /* renamed from: a */
    public final void mo6440a(String str, boolean z) {
        this.f7945a.putBoolean(str, z);
    }
}
