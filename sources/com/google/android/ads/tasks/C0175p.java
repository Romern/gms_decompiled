package com.google.android.ads.tasks;

import com.google.ads.afma.proto2api.C0152c;

/* renamed from: com.google.android.ads.tasks.p */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0175p extends C0181v {

    /* renamed from: h */
    private final boolean f7582h;

    public C0175p(dca dca, String str, String str2, bxvd bxvd, int i) {
        super(dca, str, str2, bxvd, i, 61);
        this.f7582h = dca.f12780p.f12748a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5035a() {
        long longValue = ((Long) this.f7595d.invoke(null, this.f7592a.f12765a, Boolean.valueOf(this.f7582h))).longValue();
        synchronized (this.f7598g) {
            bxvd bxvd = this.f7598g;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            C0152c cVar = (C0152c) bxvd.f164949b;
            C0152c cVar2 = C0152c.f7500Q;
            cVar.f7519b |= 8388608;
            cVar.f7508G = longValue;
        }
    }
}
