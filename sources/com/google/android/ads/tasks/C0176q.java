package com.google.android.ads.tasks;

import com.google.ads.afma.proto2api.C0152c;

/* renamed from: com.google.android.ads.tasks.q */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0176q extends C0181v {
    public C0176q(dca dca, String str, String str2, bxvd bxvd, int i) {
        super(dca, str, str2, bxvd, i, 51);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5035a() {
        synchronized (this.f7598g) {
            dbv dbv = new dbv((String) this.f7595d.invoke(null, new Object[0]));
            bxvd bxvd = this.f7598g;
            long longValue = dbv.f12752a.longValue();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            C0152c cVar = (C0152c) bxvd.f164949b;
            C0152c cVar2 = C0152c.f7500Q;
            cVar.f7519b |= 4096;
            cVar.f7503B = longValue;
            bxvd bxvd2 = this.f7598g;
            long longValue2 = dbv.f12753b.longValue();
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            C0152c cVar3 = (C0152c) bxvd2.f164949b;
            cVar3.f7519b |= 8192;
            cVar3.f7504C = longValue2;
        }
    }
}
