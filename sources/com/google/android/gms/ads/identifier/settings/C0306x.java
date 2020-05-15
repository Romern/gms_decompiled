package com.google.android.gms.ads.identifier.settings;

import android.content.Context;
import java.io.Closeable;

/* renamed from: com.google.android.gms.ads.identifier.settings.x */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0306x implements Closeable {

    /* renamed from: a */
    final long f8052a = bmvy.f131119a.mo15379a();

    /* renamed from: b */
    final String f8053b;

    /* renamed from: c */
    final Context f8054c;

    /* renamed from: d */
    String f8055d;

    public C0306x(String str, Context context, String str2) {
        this.f8053b = str;
        this.f8054c = context;
        this.f8055d = str2;
    }

    public final void close() {
        C0288f.m5214a(this.f8054c, this.f8053b, this.f8055d, bmvy.f131119a.mo15379a() - this.f8052a);
    }
}
