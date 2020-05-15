package com.google.android.gms.languageprofile.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LanguageProfileChimeraService extends zzx {
    /* JADX WARNING: Illegal instructions before constructor call */
    public LanguageProfileChimeraService() {
        super(167, "com.google.android.gms.languageprofile.service.START", r3, r4, 10);
        int i;
        Set emptySet = Collections.emptySet();
        if (!ceqz.f183340a.mo6606a().mo79659B()) {
            i = 2;
        } else {
            i = 3;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        aaac.mo16652a(new adwz(new aaag(this, this.f56354e, this.f56355f), getServiceRequest.f30230d));
    }

    public final void onCreate() {
        adxt.m51334a();
        if (cere.m138102c()) {
            adxl.m51314a();
        }
        rpr.m34216b().startService(AccountsChangedIntentOperation.m66808a(rpr.m34216b()));
    }
}
