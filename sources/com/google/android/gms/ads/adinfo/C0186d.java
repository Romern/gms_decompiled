package com.google.android.gms.ads.adinfo;

import com.google.android.gms.ads.internal.util.future.C0648g;

/* renamed from: com.google.android.gms.ads.adinfo.d */
final /* synthetic */ class C0186d implements aubq {

    /* renamed from: a */
    private final C0648g f7830a;

    public C0186d(C0648g gVar) {
        this.f7830a = gVar;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        C0648g gVar = this.f7830a;
        if (((auck) aucb).f91396d) {
            gVar.cancel(true);
        } else if (aucb.mo50384b()) {
            gVar.mo6830a(aucb.mo50386d());
        } else {
            Exception e = aucb.mo50387e();
            if (e != null) {
                gVar.mo6831a((Throwable) e);
            } else {
                gVar.mo6831a((Throwable) new IllegalStateException());
            }
        }
    }
}
