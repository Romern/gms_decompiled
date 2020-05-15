package com.google.android.gms.ads.internal.httpcache;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.ads.internal.util.future.C0648g;

/* renamed from: com.google.android.gms.ads.internal.httpcache.l */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0439l implements sac {

    /* renamed from: a */
    final /* synthetic */ C0648g f8398a;

    /* renamed from: b */
    final /* synthetic */ C0441n f8399b;

    public C0439l(C0441n nVar, C0648g gVar) {
        this.f8399b = nVar;
        this.f8398a = gVar;
    }

    /* renamed from: a */
    public final void mo6635a(int i) {
        C0648g gVar = this.f8398a;
        StringBuilder sb = new StringBuilder(34);
        sb.append("onConnectionSuspended: ");
        sb.append(i);
        gVar.mo6831a((Throwable) new RuntimeException(sb.toString()));
    }

    /* renamed from: a */
    public final void mo6636a(Bundle bundle) {
        try {
            this.f8398a.mo6830a(this.f8399b.f8401a.mo6628e());
        } catch (DeadObjectException e) {
            this.f8398a.mo6831a((Throwable) e);
        }
    }
}
