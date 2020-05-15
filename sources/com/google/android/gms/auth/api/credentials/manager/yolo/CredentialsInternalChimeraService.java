package com.google.android.gms.auth.api.credentials.manager.yolo;

import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CredentialsInternalChimeraService extends zzx {

    /* renamed from: a */
    public static final sek f10143a = ght.m13172b("CredentialsInternalChimeraService");

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        Bundle bundle = getServiceRequest.f30233g;
        aaac.mo16652a(new hpn(this, bundle != null ? bundle.getString("log_session_id") : null));
    }

    public CredentialsInternalChimeraService() {
        super(179, "com.google.android.gms.auth.api.credentials.internal_service.START", bnon.f131923a, 0, 9);
    }
}
