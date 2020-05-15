package com.google.android.gms.ads.nonagon.util.concurrent;

import com.google.android.gms.ads.nonagon.util.event.C0866c;

/* renamed from: com.google.android.gms.ads.nonagon.util.concurrent.m */
final /* synthetic */ class C0860m implements Runnable {

    /* renamed from: a */
    private final C0862o f9365a;

    /* renamed from: b */
    private final C0856i f9366b;

    public C0860m(C0862o oVar, C0856i iVar) {
        this.f9365a = oVar;
        this.f9366b = iVar;
    }

    public final void run() {
        this.f9365a.f9369a.f9375b.mo7044a(new C0866c(this.f9366b));
    }
}
