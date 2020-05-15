package com.google.android.gms.ads.settings.internal;

import android.content.Context;
import com.google.android.gms.ads.identifier.settings.C0287e;
import com.google.android.gms.ads.internal.C0387d;

/* renamed from: com.google.android.gms.ads.settings.internal.a */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0880a {

    /* renamed from: a */
    final /* synthetic */ C0287e f9436a;

    /* renamed from: b */
    final /* synthetic */ int f9437b;

    /* renamed from: c */
    final /* synthetic */ Context f9438c;

    public C0880a(C0287e eVar, int i, Context context) {
        this.f9436a = eVar;
        this.f9437b = i;
        this.f9438c = context;
    }

    /* renamed from: a */
    public final void mo7117a(boolean z) {
        if (z) {
            this.f9436a.mo6509a(true);
            if (cbvp.m128522i()) {
                C0387d.m5363a().mo6853a(this.f9438c, null, "gmob-apps", C0881b.m6073a("edu_eligible", Boolean.toString(this.f9436a.mo6518i()), Integer.toString(this.f9437b)));
            }
        }
    }
}
