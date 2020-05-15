package p000;

import android.content.Context;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;

/* renamed from: hbe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hbe extends hvr implements aaai {

    /* renamed from: a */
    public static final Logger f19400a = ght.m13172b("AuthorizationServiceImpl");

    /* renamed from: b */
    private final Context f19401b;

    /* renamed from: c */
    private final aaag f19402c;

    /* renamed from: d */
    private final String f19403d;

    /* renamed from: e */
    private final qws f19404e;

    /* renamed from: f */
    private final hup f19405f;

    public hbe(Context context, aaag aaag, qws qws, String str, hup hup) {
        this.f19401b = context;
        this.f19402c = aaag;
        this.f19403d = str;
        this.f19405f = hup;
        this.f19404e = qws;
    }

    /* renamed from: a */
    public final void mo12374a(hvq hvq, AuthorizationRequest authorizationRequest) {
        String b = ccco.f178754a.mo6606a().mo75770b();
        String str = this.f19403d;
        hew a = hex.m14288a(new hpm(str, b, new hbj(this.f19401b, str, authorizationRequest.f10205g, authorizationRequest, this.f19404e)), BaseMfiEventCallback.TYPE_OPSRV_REQUIRED_LIB_UNAVAILABLE, "Authorize", this.f19405f.f20460a);
        this.f19402c.mo16658a(a);
        bqga.m112781a(a.f19623a, new hbd(hvq), bqfb.INSTANCE);
    }
}
