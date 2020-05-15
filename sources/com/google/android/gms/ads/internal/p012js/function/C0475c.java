package com.google.android.gms.ads.internal.p012js.function;

import android.content.Context;
import com.google.android.gms.ads.internal.flag.C0406s;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* renamed from: com.google.android.gms.ads.internal.js.function.c */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0475c {

    /* renamed from: a */
    public final Object f8461a = new Object();

    /* renamed from: b */
    public C0484l f8462b;

    /* renamed from: c */
    private final Object f8463c = new Object();

    /* renamed from: d */
    private C0484l f8464d;

    /* renamed from: a */
    public static final Context m5445a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* renamed from: a */
    public final C0484l mo6671a(Context context, VersionInfoParcel versionInfoParcel) {
        C0484l lVar;
        synchronized (this.f8463c) {
            if (this.f8464d == null) {
                this.f8464d = new C0484l(m5445a(context), versionInfoParcel, (String) C0406s.f8364a.mo6621a());
            }
            lVar = this.f8464d;
        }
        return lVar;
    }
}
