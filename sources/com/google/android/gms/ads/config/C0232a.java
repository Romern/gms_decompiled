package com.google.android.gms.ads.config;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.flag.C0412y;

/* renamed from: com.google.android.gms.ads.config.a */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0232a implements C0412y {

    /* renamed from: a */
    public String f7939a;

    /* renamed from: b */
    public String f7940b;

    /* renamed from: c */
    public SharedPreferences.Editor f7941c;

    /* renamed from: d */
    public int f7942d;

    /* renamed from: a */
    public final void mo6437a(String str, double d) {
        if (this.f7939a.equals(str)) {
            this.f7942d++;
            this.f7941c.putFloat(str, Float.parseFloat(this.f7940b));
        }
    }

    /* renamed from: a */
    public final void mo6438a(String str, long j) {
        if (this.f7939a.equals(str)) {
            this.f7942d++;
            this.f7941c.putLong(str, Long.parseLong(this.f7940b));
        }
    }

    /* renamed from: a */
    public final void mo6439a(String str, String str2) {
        if (this.f7939a.equals(str)) {
            this.f7942d++;
            this.f7941c.putString(str, this.f7940b);
        }
    }

    /* renamed from: a */
    public final void mo6440a(String str, boolean z) {
        if (this.f7939a.equals(str)) {
            this.f7942d++;
            this.f7941c.putBoolean(str, Boolean.parseBoolean(this.f7940b));
        }
    }
}
