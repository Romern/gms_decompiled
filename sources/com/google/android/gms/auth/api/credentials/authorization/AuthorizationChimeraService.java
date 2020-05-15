package com.google.android.gms.auth.api.credentials.authorization;

import android.os.Bundle;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.internal.GetServiceRequest;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AuthorizationChimeraService extends zzx {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        aaag aaag = new aaag(this, this.f56354e, this.f56355f);
        qws qws = new qws(rpr.m34216b(), "IDENTITY_GMSCORE", null);
        String str = getServiceRequest.f30230d;
        Bundle bundle = getServiceRequest.f30233g;
        huo huo = new huo();
        String string = bundle.getString("session_id");
        if (string != null) {
            sdo.m34977c(string);
            huo.f20459a = string;
        }
        aaac.mo16652a(new hbe(this, aaag, qws, str, new hup(huo.f20459a)));
    }

    public AuthorizationChimeraService() {
        super((int) BaseMfiEventCallback.TYPE_OPSRV_REQUIRED_LIB_UNAVAILABLE, "com.google.android.gms.auth.api.identity.service.authorization.START", bnon.f131923a, 3, 9);
    }
}
