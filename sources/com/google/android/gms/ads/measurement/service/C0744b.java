package com.google.android.gms.ads.measurement.service;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.C0633h;
import com.google.android.gms.measurement.module.Analytics;

/* renamed from: com.google.android.gms.ads.measurement.service.b */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0744b extends C0745c {

    /* renamed from: a */
    public static final Object f9156a = new Object();

    /* renamed from: b */
    public static C0744b f9157b;

    /* renamed from: c */
    final Analytics f9158c;

    /* renamed from: d */
    private final agje f9159d;

    public C0744b(Analytics analytics, agje agje) {
        this.f9158c = analytics;
        this.f9159d = agje;
    }

    /* renamed from: a */
    public final void mo7040a(Bundle bundle) {
        C0633h.m5664a("Reporting in-app purchase data in gmp conversion tracking service.");
        String string = bundle.getString("ap");
        bundle.remove("ap");
        this.f9159d.mo35498F().mo35492a(new C0743a(this, bundle, string));
    }
}
