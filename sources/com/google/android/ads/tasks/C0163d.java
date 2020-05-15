package com.google.android.ads.tasks;

import com.google.ads.afma.proto2api.C0152c;

/* renamed from: com.google.android.ads.tasks.d */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0163d extends C0181v {
    public C0163d(dca dca, String str, String str2, bxvd bxvd, int i) {
        super(dca, str, str2, bxvd, i, 5);
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
        cVar.f7518a |= 16;
        cVar.f7524g = -1;
        bxvd bxvd2 = this.f7598g;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        C0152c cVar3 = (C0152c) bxvd2.f164949b;
        cVar3.f7518a |= 32;
        cVar3.f7525h = -1;
        int[] iArr = (int[]) this.f7595d.invoke(null, this.f7592a.f12765a);
        synchronized (this.f7598g) {
            bxvd bxvd3 = this.f7598g;
            long j = (long) iArr[0];
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            C0152c cVar4 = (C0152c) bxvd3.f164949b;
            cVar4.f7518a |= 16;
            cVar4.f7524g = j;
            bxvd bxvd4 = this.f7598g;
            long j2 = (long) iArr[1];
            if (bxvd4.f164950c) {
                bxvd4.mo74035c();
                bxvd4.f164950c = false;
            }
            C0152c cVar5 = (C0152c) bxvd4.f164949b;
            cVar5.f7518a |= 32;
            cVar5.f7525h = j2;
            int i = iArr[2];
            if (i != Integer.MIN_VALUE) {
                bxvd bxvd5 = this.f7598g;
                long j3 = (long) i;
                if (bxvd5.f164950c) {
                    bxvd5.mo74035c();
                    bxvd5.f164950c = false;
                }
                C0152c cVar6 = (C0152c) bxvd5.f164949b;
                cVar6.f7519b |= 2097152;
                cVar6.f7506E = j3;
            }
        }
    }
}
