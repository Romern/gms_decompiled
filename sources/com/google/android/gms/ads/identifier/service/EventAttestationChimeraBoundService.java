package com.google.android.gms.ads.identifier.service;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class EventAttestationChimeraBoundService extends zzx {
    public EventAttestationChimeraBoundService() {
        super((int) BaseMfiEventCallback.TYPE_OPSRV_ACCOUNT_ERROR, "com.google.android.gms.ads.identifier.service.EVENT_ATTESTATION", Collections.emptySet(), 2, 10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        aaac.mo16652a(new C0282e(new aaag(this, this.f56354e, this.f56355f)));
    }
}
