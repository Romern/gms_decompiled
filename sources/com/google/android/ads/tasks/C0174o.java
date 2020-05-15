package com.google.android.ads.tasks;

import com.google.ads.afma.proto2api.C0152c;
import java.util.List;

/* renamed from: com.google.android.ads.tasks.o */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0174o extends C0181v {

    /* renamed from: h */
    private List f7581h = null;

    public C0174o(dca dca, String str, String str2, bxvd bxvd, int i) {
        super(dca, str, str2, bxvd, i, 31);
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
        cVar.f7518a |= 33554432;
        cVar.f7534q = -1;
        bxvd bxvd2 = this.f7598g;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        C0152c cVar3 = (C0152c) bxvd2.f164949b;
        cVar3.f7518a |= 67108864;
        cVar3.f7535r = -1;
        if (this.f7581h == null) {
            this.f7581h = (List) this.f7595d.invoke(null, this.f7592a.f12765a);
        }
        List list = this.f7581h;
        if (list != null && list.size() == 2) {
            synchronized (this.f7598g) {
                bxvd bxvd3 = this.f7598g;
                long longValue = ((Long) this.f7581h.get(0)).longValue();
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                C0152c cVar4 = (C0152c) bxvd3.f164949b;
                cVar4.f7518a = 33554432 | cVar4.f7518a;
                cVar4.f7534q = longValue;
                bxvd bxvd4 = this.f7598g;
                long longValue2 = ((Long) this.f7581h.get(1)).longValue();
                if (bxvd4.f164950c) {
                    bxvd4.mo74035c();
                    bxvd4.f164950c = false;
                }
                C0152c cVar5 = (C0152c) bxvd4.f164949b;
                cVar5.f7518a |= 67108864;
                cVar5.f7535r = longValue2;
            }
        }
    }
}
