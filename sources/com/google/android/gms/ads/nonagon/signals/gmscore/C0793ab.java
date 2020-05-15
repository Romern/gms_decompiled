package com.google.android.gms.ads.nonagon.signals.gmscore;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.ads.nonagon.signals.gmscore.ab */
final /* synthetic */ class C0793ab implements Callable {

    /* renamed from: a */
    private final bqgg f9228a;

    /* renamed from: b */
    private final bqgg f9229b;

    public C0793ab(bqgg bqgg, bqgg bqgg2) {
        this.f9228a = bqgg;
        this.f9229b = bqgg2;
    }

    public final Object call() {
        return new C0795ad((String) this.f9228a.get(), (String) this.f9229b.get());
    }
}
