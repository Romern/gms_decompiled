package com.google.android.gms.ads.nonagon.util.concurrent;

import com.google.android.gms.ads.internal.util.future.C0645d;
import com.google.android.gms.ads.nonagon.util.event.C0864a;
import com.google.android.gms.ads.nonagon.util.event.C0865b;
import java.util.List;

/* renamed from: com.google.android.gms.ads.nonagon.util.concurrent.o */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0862o {

    /* renamed from: a */
    public final /* synthetic */ C0863p f9369a;

    /* renamed from: b */
    private final Object f9370b;

    /* renamed from: c */
    private final bqgg f9371c;

    /* renamed from: d */
    private final List f9372d;

    /* renamed from: e */
    private final bqgg f9373e;

    public C0862o(C0863p pVar, Object obj, bqgg bqgg, List list, bqgg bqgg2) {
        this.f9369a = pVar;
        this.f9370b = obj;
        this.f9371c = bqgg;
        this.f9372d = list;
        this.f9373e = bqgg2;
    }

    /* renamed from: a */
    public final C0856i mo7089a() {
        Object obj = this.f9370b;
        C0856i iVar = new C0856i(obj, ((C0864a) obj).f9400x, this.f9373e);
        this.f9369a.f9375b.mo7044a(new C0865b());
        this.f9371c.mo741a(new C0860m(this, iVar), C0645d.f8977e);
        bqga.m112781a(iVar, new C0861n(this, iVar), C0645d.f8977e);
        return iVar;
    }

    /* renamed from: a */
    public final C0862o mo7090a(bqeh bqeh) {
        C0863p pVar = this.f9369a;
        return new C0862o(pVar, this.f9370b, this.f9371c, this.f9372d, bqdx.m112674a(this.f9373e, bqeh, pVar.f9374a));
    }

    /* renamed from: a */
    public final C0862o mo7091a(C0855h hVar) {
        return mo7090a(new C0859l(hVar));
    }
}
