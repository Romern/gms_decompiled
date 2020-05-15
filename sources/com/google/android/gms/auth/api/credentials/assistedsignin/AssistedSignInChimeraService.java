package com.google.android.gms.auth.api.credentials.assistedsignin;

import android.os.Bundle;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.internal.GetServiceRequest;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AssistedSignInChimeraService extends zzx {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        bmxv a = qqt.m32666a(this, getServiceRequest.f30230d);
        if (!a.mo66813a()) {
            aaac.mo16650a(10, (Bundle) null);
            return;
        }
        aaag aaag = new aaag(this, this.f56354e, this.f56355f);
        qws qws = new qws(rpr.m34216b(), "IDENTITY_GMSCORE", null);
        String str = (String) a.mo66814b();
        String str2 = getServiceRequest.f30230d;
        Bundle bundle = getServiceRequest.f30233g;
        hvn hvn = new hvn();
        String string = bundle.getString("session_id");
        if (string != null) {
            sdo.m34977c(string);
            hvn.f20473a = string;
        }
        aaac.mo16652a(new gwt(this, aaag, qws, str2, new hvo(hvn.f20473a)));
    }

    public AssistedSignInChimeraService() {
        super((int) BaseMfiEventCallback.TYPE_EXIST_UNKNOWN_CARD, "com.google.android.gms.auth.api.identity.service.signin.START", bnon.f131923a, 3, 9);
    }
}
