package com.google.android.ads.tasks;

import com.google.ads.afma.proto2api.C0152c;

/* renamed from: com.google.android.ads.tasks.j */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0169j extends C0181v {
    public C0169j(dca dca, String str, String str2, bxvd bxvd, int i) {
        super(dca, str, str2, bxvd, i, 11);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5035a() {
        bxvd bxvd = this.f7598g;
        long longValue = ((Long) this.f7595d.invoke(null, this.f7592a.f12765a)).longValue();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        C0152c cVar = (C0152c) bxvd.f164949b;
        C0152c cVar2 = C0152c.f7500Q;
        cVar.f7518a |= 1024;
        cVar.f7526i = longValue;
    }
}
