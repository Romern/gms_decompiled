package com.google.android.gms.ads.nonagon.signals.gmscore;

import com.google.android.gms.ads.internal.spamsignals.C0593a;
import com.google.android.gms.ads.nonagon.util.concurrent.C0851d;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.ads.nonagon.signals.gmscore.e */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0823e implements cayy {

    /* renamed from: a */
    private final cijl f9277a;

    /* renamed from: b */
    private final cijl f9278b;

    /* renamed from: c */
    private final cijl f9279c;

    public C0823e(cijl cijl, cijl cijl2, cijl cijl3) {
        this.f9277a = cijl;
        this.f9278b = cijl2;
        this.f9279c = cijl3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        return new C0821c((C0593a) this.f9277a.mo6445a(), ((fia) this.f9278b).mo6445a(), (ScheduledExecutorService) this.f9279c.mo6445a(), C0851d.m6032b());
    }
}
