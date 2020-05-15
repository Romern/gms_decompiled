package com.google.android.gms.herrevad.services;

import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class NetworkQualityChimeraAndroidService extends zzx {
    public NetworkQualityChimeraAndroidService() {
        super(28, "com.google.android.gms.mdm.services.START", Collections.singleton("android.permission.READ_PHONE_STATE"), 2, 10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        aaac.mo16652a(new abmp(getApplicationContext()));
    }

    public final void onCreate() {
        abme.m47897a(getApplicationContext());
    }

    public final void onDestroy() {
    }
}
