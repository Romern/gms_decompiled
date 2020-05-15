package com.google.android.ads.tasks;

import com.google.ads.afma.proto2api.C0152c;
import com.google.android.gms.ads.internal.config.C0371o;

/* renamed from: com.google.android.ads.tasks.m */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0172m extends C0181v {
    public C0172m(dca dca, String str, String str2, bxvd bxvd, int i) {
        super(dca, str, str2, bxvd, i, 3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5035a() {
        dbi dbi = new dbi((String) this.f7595d.invoke(null, this.f7592a.f12765a, Boolean.valueOf(((Boolean) C0371o.f8200N.mo6604a()).booleanValue())));
        synchronized (this.f7598g) {
            bxvd bxvd = this.f7598g;
            long j = dbi.f12734a;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            C0152c cVar = (C0152c) bxvd.f164949b;
            C0152c cVar2 = C0152c.f7500Q;
            cVar.f7518a |= 4;
            cVar.f7523f = j;
            bxvd bxvd2 = this.f7598g;
            long j2 = dbi.f12735b;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            C0152c cVar3 = (C0152c) bxvd2.f164949b;
            cVar3.f7519b |= 4194304;
            cVar3.f7507F = j2;
        }
    }
}
