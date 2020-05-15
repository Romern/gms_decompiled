package com.google.android.gms.ads.internal.request.service;

import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.ads.internal.request.service.f */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0556f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Future f8735a;

    public C0556f(Future future) {
        this.f8735a = future;
    }

    public final void run() {
        if (!this.f8735a.isDone()) {
            this.f8735a.cancel(true);
        }
    }
}
