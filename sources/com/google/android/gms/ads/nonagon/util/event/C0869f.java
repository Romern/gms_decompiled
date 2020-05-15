package com.google.android.gms.ads.nonagon.util.event;

import com.google.android.gms.ads.nonagon.util.concurrent.C0851d;
import com.google.android.gms.ads.nonagon.util.concurrent.C0863p;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.ads.nonagon.util.event.f */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0869f implements cayy {

    /* renamed from: a */
    private final cijl f9404a;

    /* renamed from: b */
    private final cijl f9405b;

    public C0869f(cijl cijl, cijl cijl2) {
        this.f9404a = cijl;
        this.f9405b = cijl2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        bqgj b = C0851d.m6032b();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f9404a.mo6445a();
        return new C0863p(b, ((C0870g) this.f9405b).mo6445a());
    }
}
