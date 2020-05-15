package com.google.android.ads.tasks;

import com.google.ads.afma.proto2api.C0152c;

/* renamed from: com.google.android.ads.tasks.i */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0168i extends C0181v {
    public C0168i(dca dca, String str, String str2, bxvd bxvd, int i) {
        super(dca, str, str2, bxvd, i, 76);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5035a() {
        int i = 1;
        boolean booleanValue = ((Boolean) this.f7595d.invoke(null, this.f7592a.f12765a)).booleanValue();
        bxvd bxvd = this.f7598g;
        if (booleanValue) {
            i = 2;
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        C0152c cVar = (C0152c) bxvd.f164949b;
        C0152c cVar2 = C0152c.f7500Q;
        cVar.f7512K = i - 1;
        cVar.f7520c |= 16;
    }
}
