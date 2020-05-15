package com.google.android.gms.auth.api.signin.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SignInChimeraService extends zzx {

    /* renamed from: a */
    public static final sek f10359a = new sek("Auth.Api.SignIn", "Service", "SignInChimeraService");

    /* renamed from: b */
    public static final bnhe f10360b;

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b(idp.class, adbj.AUTH_API_SIGNIN_SILENT_SIGNIN);
        h.mo67695b(idn.class, adbj.AUTH_API_SIGNIN_SIGN_OUT);
        h.mo67695b(idm.class, adbj.AUTH_API_SIGNIN_REVOKE_ACCESS);
        f10360b = h.mo67618b();
    }

    public SignInChimeraService() {
        super(91, "com.google.android.gms.auth.api.signin.service.START", Collections.emptySet(), 3, 9);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        aaag aaag = new aaag(this, this.f56354e, this.f56355f);
        ids ids = new ids(this, getServiceRequest.f30230d, getServiceRequest.f30232f, aqks.m71765a(getServiceRequest.f30233g).mo47941a(), aaag, new qws(this, "IDENTITY_GMSCORE", null));
        if (cgmd.m146192b()) {
            ids.getClass();
            adbp.m50129a(aaag, new idr(ids));
        }
        aaac.mo16652a(ids);
    }
}
