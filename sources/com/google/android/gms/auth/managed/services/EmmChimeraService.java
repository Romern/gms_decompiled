package com.google.android.gms.auth.managed.services;

import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class EmmChimeraService extends zzx {

    /* renamed from: a */
    private static final bnic f11056a = bnic.m109489a("android.permission-group.PHONE");

    public EmmChimeraService() {
        super(136, "com.google.android.gms.auth.managed.START_EMM_SERVICE", f11056a, 0, 10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        if (!"com.google.android.gms".equals(getServiceRequest.f30230d)) {
            aaac.mo16650a(16, (Bundle) null);
        } else {
            aaac.mo16652a(new jgd(this, aaag.m21013a()));
        }
    }
}
