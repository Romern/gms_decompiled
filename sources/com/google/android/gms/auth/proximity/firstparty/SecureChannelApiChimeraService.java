package com.google.android.gms.auth.proximity.firstparty;

import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SecureChannelApiChimeraService extends zzx {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        aaac.mo16652a(new jqe(this, aaag.m21013a(), getServiceRequest.f30230d));
    }

    public SecureChannelApiChimeraService() {
        super((int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD, "com.google.android.gms.auth.proximity.securechannelservice.START", bnon.f131923a, 1, 10);
    }
}
