package com.google.android.ads.tasks;

import com.google.ads.afma.proto2api.C0152c;

/* renamed from: com.google.android.ads.tasks.h */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0167h extends C0181v {

    /* renamed from: h */
    private static volatile Long f7577h = null;

    /* renamed from: i */
    private static final Object f7578i = new Object();

    public C0167h(dca dca, String str, String str2, bxvd bxvd, int i) {
        super(dca, str, str2, bxvd, i, 22);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5035a() {
        if (f7577h == null) {
            synchronized (f7578i) {
                if (f7577h == null) {
                    f7577h = (Long) this.f7595d.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f7598g) {
            bxvd bxvd = this.f7598g;
            long longValue = f7577h.longValue();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            C0152c cVar = (C0152c) bxvd.f164949b;
            C0152c cVar2 = C0152c.f7500Q;
            cVar.f7518a |= 1048576;
            cVar.f7530m = longValue;
        }
    }
}
