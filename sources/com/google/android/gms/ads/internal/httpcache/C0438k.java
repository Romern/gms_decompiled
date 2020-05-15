package com.google.android.gms.ads.internal.httpcache;

import android.os.Binder;

/* renamed from: com.google.android.gms.ads.internal.httpcache.k */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0438k implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0441n f8397a;

    public C0438k(C0441n nVar) {
        this.f8397a = nVar;
    }

    public final void run() {
        C0441n nVar = this.f8397a;
        if (nVar.f8401a != null) {
            nVar.f8401a.mo14032j();
            Binder.flushPendingCommands();
        }
    }
}
