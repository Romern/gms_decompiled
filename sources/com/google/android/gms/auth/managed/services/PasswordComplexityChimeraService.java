package com.google.android.gms.auth.managed.services;

import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PasswordComplexityChimeraService extends zzx {
    public PasswordComplexityChimeraService() {
        super(187, "com.google.android.gms.auth.managed.START_POLICY_SERVICE", Collections.emptySet(), 3, 10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        jho.m16722b().mo13752c();
        aaac.mo16650a(16, (Bundle) null);
        jhm a = jhm.m16712a(this);
        bxvd da = cily.f190683f.mo74144da();
        String str = getServiceRequest.f30230d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cily cily = (cily) da.f164949b;
        str.getClass();
        cily.f190685a |= 1;
        cily.f190686b = str;
        jho.m16722b().mo13746a();
        int b = jhm.m16713b(4);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cily cily2 = (cily) da.f164949b;
        cily2.f190689e = b - 1;
        cily2.f190685a |= 8;
        a.mo13745a(4, (cily) da.mo74062i());
    }
}
