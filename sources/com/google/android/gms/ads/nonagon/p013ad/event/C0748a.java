package com.google.android.gms.ads.nonagon.p013ad.event;

import com.google.android.gms.ads.internal.C0387d;

/* renamed from: com.google.android.gms.ads.nonagon.ad.event.a */
final /* synthetic */ class C0748a implements Runnable {

    /* renamed from: a */
    private final C0749b f9160a;

    /* renamed from: b */
    private final Object f9161b;

    public C0748a(C0749b bVar, Object obj) {
        this.f9160a = bVar;
        this.f9161b = obj;
    }

    public final void run() {
        try {
            this.f9160a.mo7043a(this.f9161b);
        } catch (Throwable th) {
            C0387d.m5366d().mo6785b(th, "EventEmitter.notify");
        }
    }
}
