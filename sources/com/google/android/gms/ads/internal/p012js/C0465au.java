package com.google.android.gms.ads.internal.p012js;

import android.content.Context;
import com.google.android.gms.ads.internal.util.C0604ab;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.future.C0645d;

/* renamed from: com.google.android.gms.ads.internal.js.au */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0465au {

    /* renamed from: a */
    public final Object f8443a;

    /* renamed from: b */
    public final Context f8444b;

    /* renamed from: c */
    public final String f8445c;

    /* renamed from: d */
    public final VersionInfoParcel f8446d;

    /* renamed from: e */
    public final C0604ab f8447e;

    /* renamed from: f */
    public C0464at f8448f;

    /* renamed from: g */
    public int f8449g;

    /* renamed from: h */
    private final C0604ab f8450h;

    public C0465au(Context context, VersionInfoParcel versionInfoParcel, String str) {
        this.f8443a = new Object();
        this.f8449g = 1;
        this.f8445c = str;
        this.f8444b = context.getApplicationContext();
        this.f8446d = versionInfoParcel;
        this.f8447e = new C0455ak();
        this.f8450h = new C0455ak();
    }

    /* renamed from: a */
    public final C0464at mo6656a() {
        C0464at atVar = new C0464at(this.f8450h);
        C0645d.f8976d.execute(new C0507y(this, atVar));
        atVar.mo6864a(new C0453ai(this, atVar), new C0454aj(this, atVar));
        return atVar;
    }

    public C0465au(Context context, VersionInfoParcel versionInfoParcel, String str, C0604ab abVar, C0604ab abVar2) {
        this(context, versionInfoParcel, str);
        this.f8447e = abVar;
        this.f8450h = abVar2;
    }
}
