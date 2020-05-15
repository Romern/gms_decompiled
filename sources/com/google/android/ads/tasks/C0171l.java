package com.google.android.ads.tasks;

import com.google.ads.afma.proto2api.C0152c;

/* renamed from: com.google.android.ads.tasks.l */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0171l extends C0181v {

    /* renamed from: h */
    private static volatile String f7579h = null;

    /* renamed from: i */
    private static final Object f7580i = new Object();

    public C0171l(dca dca, String str, String str2, bxvd bxvd, int i) {
        super(dca, str, str2, bxvd, i, 1);
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
        "E".getClass();
        cVar.f7518a |= 1;
        cVar.f7521d = "E";
        if (f7579h == null) {
            synchronized (f7580i) {
                if (f7579h == null) {
                    f7579h = (String) this.f7595d.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f7598g) {
            bxvd bxvd2 = this.f7598g;
            String str = f7579h;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            C0152c cVar3 = (C0152c) bxvd2.f164949b;
            str.getClass();
            cVar3.f7518a |= 1;
            cVar3.f7521d = str;
        }
    }
}
