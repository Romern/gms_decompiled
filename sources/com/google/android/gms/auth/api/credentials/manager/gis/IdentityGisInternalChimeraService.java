package com.google.android.gms.auth.api.credentials.manager.gis;

import android.os.Bundle;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.internal.GetServiceRequest;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class IdentityGisInternalChimeraService extends zzx {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        hvb a = hvc.m14893a();
        Bundle bundle = getServiceRequest.f30233g;
        sdo.m34959a(bundle);
        a.f20471a = bundle.getString("session_id");
        aaac.mo16652a(new hju(this, a.mo12751a()));
    }

    public IdentityGisInternalChimeraService() {
        super((int) BaseMfiEventCallback.TYPE_ISSUE_LIMIT_EXCEEDED, "com.google.android.gms.auth.api.identity.service.gis_internal.START", bnon.f131923a, 0, 9);
    }
}
