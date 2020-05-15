package com.google.android.gms.auth.uncertifieddevice;

import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.internal.GetServiceRequest;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UncertifiedDeviceChimeraService extends zzx {
    /* JADX WARNING: Illegal instructions before constructor call */
    public UncertifiedDeviceChimeraService() {
        super((int) MfiClientException.TYPE_MFICLIENT_NOT_FOUND, "com.google.android.gms.auth.uncertifieddevice.service.START", r4, 1, 10);
        bnon bnon;
        if (cbxi.f178510a.mo6606a().mo75576d()) {
            bnon = bnon.f131923a;
        } else {
            bnon = sft.m35178d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        aaac.mo16652a(new kar(this, aaag.m21013a()));
    }
}
