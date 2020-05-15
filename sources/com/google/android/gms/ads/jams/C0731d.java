package com.google.android.gms.ads.jams;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.ads.jams.d */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0731d {

    /* renamed from: a */
    public final SharedPreferences f9141a;

    /* renamed from: b */
    public final Context f9142b;

    /* renamed from: a */
    public final SharedPreferences mo7024a(String str) {
        Context context = this.f9142b;
        String valueOf = String.valueOf(str);
        return context.getSharedPreferences(valueOf.length() == 0 ? new String("jams.prefs.") : "jams.prefs.".concat(valueOf), 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo7027b() {
        return mo7025a().size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo7028c() {
        return this.f9141a.getBoolean("negotiation_enabled", false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo7029d() {
        return this.f9141a.getBoolean("non_default_account_enabled", false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final long mo7030e() {
        return this.f9141a.getLong("retry_count", 0);
    }

    public C0731d(Context context) {
        this.f9141a = context.getSharedPreferences("jams.prefs.default", 0);
        this.f9142b = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Set mo7025a() {
        return this.f9141a.getStringSet("all_account_names", new HashSet());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo7026a(long j) {
        this.f9141a.edit().putLong("retry_count", j).apply();
    }
}
