package com.google.android.gms.ads.nonagon.load.service;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.ads.nonagon.load.service.c */
final /* synthetic */ class C0767c implements Callable {

    /* renamed from: a */
    private final bqgg f9184a;

    /* renamed from: b */
    private final bqgg f9185b;

    public C0767c(bqgg bqgg, bqgg bqgg2) {
        this.f9184a = bqgg;
        this.f9185b = bqgg2;
    }

    public final Object call() {
        bqgg bqgg = this.f9184a;
        bqgg bqgg2 = this.f9185b;
        return new C0779o((C0782r) bqgg.get(), ((C0777m) bqgg2.get()).f9196b, ((C0777m) bqgg2.get()).f9195a);
    }
}
