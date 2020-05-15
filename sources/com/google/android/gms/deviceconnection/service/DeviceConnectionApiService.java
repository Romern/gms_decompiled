package com.google.android.gms.deviceconnection.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class DeviceConnectionApiService extends zzx {

    /* renamed from: a */
    private tvo f30715a;

    public DeviceConnectionApiService() {
        super(20, "com.google.android.gms.deviceconnection.service.START", Collections.emptySet(), 1, 10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        aaac.mo16652a(new twc(this, aaag.m21013a(), this.f30715a));
    }

    public final void onCreate() {
        this.f30715a = tvo.m37525a(this);
    }
}
