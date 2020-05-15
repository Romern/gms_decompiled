package com.google.android.ads.tasks;

import com.google.ads.afma.proto2api.C0152c;

/* renamed from: com.google.android.ads.tasks.s */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0178s extends C0181v {
    public C0178s(dca dca, String str, String str2, bxvd bxvd, int i) {
        super(dca, str, str2, bxvd, i, 48);
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
        cVar.f7543z = 2;
        cVar.f7519b |= 1024;
        boolean booleanValue = ((Boolean) this.f7595d.invoke(null, this.f7592a.f12765a)).booleanValue();
        synchronized (this.f7598g) {
            if (booleanValue) {
                bxvd bxvd2 = this.f7598g;
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                C0152c cVar3 = (C0152c) bxvd2.f164949b;
                cVar3.f7543z = 1;
                cVar3.f7519b |= 1024;
            } else {
                bxvd bxvd3 = this.f7598g;
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                C0152c cVar4 = (C0152c) bxvd3.f164949b;
                cVar4.f7543z = 0;
                cVar4.f7519b |= 1024;
            }
        }
    }
}
