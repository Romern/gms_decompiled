package com.google.android.ads.tasks;

import com.google.ads.afma.proto2api.C0152c;

/* renamed from: com.google.android.ads.tasks.k */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0170k extends C0181v {
    public C0170k(dca dca, String str, String str2, bxvd bxvd, int i) {
        super(dca, str, str2, bxvd, i, 12);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5035a() {
        bxvd bxvd = this.f7598g;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        C0152c cVar = (C0152c) bxvd.f164949b;
        C0152c cVar2 = C0152c.f7500Q;
        cVar.f7518a |= 2048;
        cVar.f7527j = -1;
        bxvd bxvd2 = this.f7598g;
        long longValue = ((Long) this.f7595d.invoke(null, this.f7592a.f12765a)).longValue();
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        C0152c cVar3 = (C0152c) bxvd2.f164949b;
        cVar3.f7518a |= 2048;
        cVar3.f7527j = longValue;
    }
}
