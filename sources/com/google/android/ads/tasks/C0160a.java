package com.google.android.ads.tasks;

import android.provider.Settings;
import com.google.ads.afma.proto2api.C0152c;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.ads.tasks.a */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0160a extends C0181v {
    public C0160a(dca dca, String str, String str2, bxvd bxvd, int i) {
        super(dca, str, str2, bxvd, i, 49);
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
        int i = 2;
        cVar.f7502A = 2;
        cVar.f7519b |= 2048;
        try {
            boolean booleanValue = ((Boolean) this.f7595d.invoke(null, this.f7592a.f12765a)).booleanValue();
            bxvd bxvd2 = this.f7598g;
            if (!booleanValue) {
                i = 1;
            }
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            C0152c cVar3 = (C0152c) bxvd2.f164949b;
            cVar3.f7502A = i - 1;
            cVar3.f7519b |= 2048;
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
