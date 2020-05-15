package p000;

import android.app.Application;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;

/* renamed from: gzv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gzv extends C0058bp {

    /* renamed from: a */
    private final Application f19305a;

    /* renamed from: b */
    private final String f19306b;

    /* renamed from: c */
    private final BeginSignInRequest f19307c;

    /* renamed from: d */
    private final C1240of f19308d;

    /* renamed from: e */
    private final String f19309e;

    public gzv(Application application, String str, C1240of ofVar, BeginSignInRequest beginSignInRequest, String str2) {
        this.f19305a = application;
        this.f19306b = str;
        this.f19308d = ofVar;
        this.f19307c = beginSignInRequest;
        this.f19309e = str2;
    }

    /* renamed from: a */
    public final C0053bl mo3261a(Class cls) {
        Application application = this.f19305a;
        return (C0053bl) cls.cast(new gzz(application, this.f19306b, this.f19308d, this.f19307c, this.f19309e, new qws(application, "IDENTITY_GMSCORE", null)));
    }
}
