package com.google.android.ads.tasks;

import com.google.ads.afma.proto2api.C0152c;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: com.google.android.ads.tasks.f */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0165f extends C0181v {

    /* renamed from: h */
    private final long f7576h;

    public C0165f(dca dca, String str, String str2, bxvd bxvd, long j, int i) {
        super(dca, str, str2, bxvd, i, 25);
        this.f7576h = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5035a() {
        long longValue = ((Long) this.f7595d.invoke(null, new Object[0])).longValue();
        synchronized (this.f7598g) {
            bxvd bxvd = this.f7598g;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            C0152c cVar = (C0152c) bxvd.f164949b;
            C0152c cVar2 = C0152c.f7500Q;
            cVar.f7520c |= 2048;
            cVar.f7516O = longValue;
            long j = this.f7576h;
            if (j != 0) {
                bxvd bxvd2 = this.f7598g;
                long j2 = longValue - j;
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                C0152c cVar3 = (C0152c) bxvd2.f164949b;
                cVar3.f7518a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                cVar3.f7528k = j2;
                bxvd bxvd3 = this.f7598g;
                long j3 = this.f7576h;
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                C0152c cVar4 = (C0152c) bxvd3.f164949b;
                cVar4.f7518a |= 2097152;
                cVar4.f7531n = j3;
            }
        }
    }
}
