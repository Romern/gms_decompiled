package com.google.android.gms.ads.measurement.service;

import android.os.Bundle;

/* renamed from: com.google.android.gms.ads.measurement.service.a */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0743a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Bundle f9153a;

    /* renamed from: b */
    final /* synthetic */ String f9154b;

    /* renamed from: c */
    final /* synthetic */ C0744b f9155c;

    public C0743a(C0744b bVar, Bundle bundle, String str) {
        this.f9155c = bVar;
        this.f9153a = bundle;
        this.f9154b = str;
    }

    public final void run() {
        this.f9155c.f9158c.mo44018a("auto", "_iap", this.f9153a, this.f9154b);
    }
}
