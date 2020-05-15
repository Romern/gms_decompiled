package com.google.android.gms.telephonyspam.service;

import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.internal.GetServiceRequest;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TelephonySpamApiChimeraService extends zzx {

    /* renamed from: a */
    private static final bnic f109047a = bnic.m109491a("android.permission-group.PHONE", "android.permission-group.SMS", "android.permission-group.STORAGE");

    /* JADX WARNING: Illegal instructions before constructor call */
    public TelephonySpamApiChimeraService() {
        super((int) MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED, "com.google.android.gms.telephonyspam.service.START", r4, 3, 10);
        bnic bnic;
        if (cgyd.f188020a.mo6606a().mo84722C()) {
            bnic = f109047a;
        } else {
            bnic = sft.m35178d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        aaac.mo16652a(new auet(this, aaag.m21013a(), getServiceRequest.f30230d));
    }
}
