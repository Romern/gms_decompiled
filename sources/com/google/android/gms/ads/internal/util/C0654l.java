package com.google.android.gms.ads.internal.util;

import android.content.Context;

/* renamed from: com.google.android.gms.ads.internal.util.l */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0654l implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f9008a;

    /* renamed from: b */
    final /* synthetic */ C0658o f9009b;

    public C0654l(C0658o oVar, Context context) {
        this.f9009b = oVar;
        this.f9008a = context;
    }

    public final void run() {
        synchronized (this.f9009b.f9013b) {
            this.f9009b.f9014c = C0658o.m5698a(this.f9008a);
            this.f9009b.f9013b.notifyAll();
        }
    }
}
