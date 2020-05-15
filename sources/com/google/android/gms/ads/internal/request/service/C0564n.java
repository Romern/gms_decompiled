package com.google.android.gms.ads.internal.request.service;

import android.content.Context;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.flag.C0392e;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.ads.internal.request.service.n */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0564n implements Callable {

    /* renamed from: a */
    final /* synthetic */ Context f8850a;

    /* renamed from: b */
    final /* synthetic */ C0566p f8851b;

    public C0564n(C0566p pVar, Context context) {
        this.f8851b = pVar;
        this.f8850a = context;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C0563m mVar;
        C0565o oVar = (C0565o) this.f8851b.f8854a.get(this.f8850a);
        if (oVar == null || oVar.f8852a + ((Long) C0392e.f8326a.mo6621a()).longValue() < C0387d.m5368f().mo20505a()) {
            mVar = new C0562l(this.f8850a).mo6745a();
        } else {
            mVar = new C0562l(this.f8850a, oVar.f8853b).mo6745a();
        }
        this.f8851b.f8854a.put(this.f8850a, new C0565o(mVar));
        return mVar;
    }
}
