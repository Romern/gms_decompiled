package com.google.android.gms.ads.social;

import android.accounts.Account;
import android.content.Context;

/* renamed from: com.google.android.gms.ads.social.e */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0904e {

    /* renamed from: a */
    public final adyd f9475a;

    /* renamed from: b */
    private final Context f9476b;

    public C0904e(Context context, adyd adyd) {
        this.f9476b = context;
        this.f9475a = adyd;
    }

    /* renamed from: a */
    static C0904e m6102a(Context context) {
        return new C0904e(context, adyd.m51363a(context));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo7131a(String str) {
        Account b = soz.m35793b(this.f9476b, str);
        if (b != null) {
            return b.name;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Account[] mo7132a() {
        Account[] a = this.f9475a.mo33916a("com.google");
        return a == null ? new Account[0] : a;
    }
}
