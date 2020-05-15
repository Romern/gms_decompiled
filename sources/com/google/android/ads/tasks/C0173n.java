package com.google.android.ads.tasks;

import com.google.ads.afma.proto2api.C0152c;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.ads.tasks.n */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0173n extends C0181v {
    public C0173n(dca dca, String str, String str2, bxvd bxvd, int i) {
        super(dca, str, str2, bxvd, i, 73);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5035a() {
        try {
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
            cVar.f7511J = i - 1;
            cVar.f7520c |= 8;
        } catch (InvocationTargetException e) {
            bxvd bxvd2 = this.f7598g;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            C0152c cVar3 = (C0152c) bxvd2.f164949b;
            C0152c cVar4 = C0152c.f7500Q;
            cVar3.f7511J = 2;
            cVar3.f7520c |= 8;
        }
    }
}
