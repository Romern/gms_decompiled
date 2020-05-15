package com.google.android.gms.ads.nonagon.util.concurrent;

import com.google.android.gms.ads.internal.util.future.C0645d;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.ads.nonagon.util.concurrent.k */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0858k {

    /* renamed from: a */
    final /* synthetic */ C0863p f9361a;

    /* renamed from: b */
    private final Object f9362b;

    /* renamed from: c */
    private final List f9363c;

    public C0858k(C0863p pVar, Object obj, List list) {
        this.f9361a = pVar;
        this.f9362b = obj;
        this.f9363c = list;
    }

    /* renamed from: a */
    public final C0862o mo7087a(Callable callable) {
        bqfs c = bqga.m112785c(this.f9363c);
        bqgg a = c.mo69216a(C0857j.f9360a, C0645d.f8977e);
        C0863p pVar = this.f9361a;
        return new C0862o(pVar, this.f9362b, a, this.f9363c, c.mo69216a(callable, pVar.f9374a));
    }
}
