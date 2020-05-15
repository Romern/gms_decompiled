package com.google.android.gms.fido.authenticator.credentialstore.service;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.internal.GetServiceRequest;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CredentialStoreChimeraService extends zzx {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        aaac.mo16652a(new xcn(new aaag(this, this.f56354e, this.f56355f)));
    }

    public CredentialStoreChimeraService() {
        super((int) BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE, "com.google.android.gms.fido.credentialstore.internal_service.START", bnon.f131923a, 0, 9);
    }
}
