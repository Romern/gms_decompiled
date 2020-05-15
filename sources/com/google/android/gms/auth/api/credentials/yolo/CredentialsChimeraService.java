package com.google.android.gms.auth.api.credentials.yolo;

import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class CredentialsChimeraService extends zzx {

    /* renamed from: a */
    public static final sek f10144a = ght.m13172b("CredentialsChimeraService");

    public CredentialsChimeraService() {
        super(68, "com.google.android.gms.auth.api.credentials.service.START", Collections.singleton("android.permission-group.PHONE"), 3, 9);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        gsp gsp;
        gsp a = gsp.m13834a(getServiceRequest.f30233g);
        String str = a.f18960b;
        if (bmxx.m108577a(str)) {
            str = getServiceRequest.f30230d;
            gso gso = new gso(a);
            gso.f18956a = str;
            gsp = gso.mo12173a();
        } else {
            gsp = a;
        }
        if (!str.equals(getServiceRequest.f30230d)) {
            rfz.m33557a(this).mo24605a(getServiceRequest.f30230d);
        }
        bmxv a2 = qqt.m32666a(this, str);
        if (!a2.mo66813a()) {
            aaac.mo16650a(10, (Bundle) null);
        } else {
            aaac.mo16652a(new hqz(this, (String) a2.mo66814b(), gsp, new aaag(this, this.f56354e, this.f56355f), his.m14426a(), new qws(this, "IDENTITY_GMSCORE", null)));
        }
    }
}
