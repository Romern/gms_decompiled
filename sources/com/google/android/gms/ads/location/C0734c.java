package com.google.android.gms.ads.location;

import android.location.Location;
import com.google.android.gms.ads.internal.util.future.C0648g;

/* renamed from: com.google.android.gms.ads.location.c */
final /* synthetic */ class C0734c implements aubq {

    /* renamed from: a */
    private final C0648g f9146a;

    public C0734c(C0648g gVar) {
        this.f9146a = gVar;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        C0648g gVar = this.f9146a;
        if (aucb.mo50384b()) {
            gVar.mo6830a((Location) aucb.mo50386d());
            return;
        }
        Exception e = aucb.mo50387e();
        if (e != null) {
            gVar.mo6831a((Throwable) e);
        } else {
            gVar.mo6831a((Throwable) new IllegalStateException());
        }
    }
}
