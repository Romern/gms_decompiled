package p000;

import android.app.Application;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;

/* renamed from: hhd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hhd extends C0058bp {

    /* renamed from: a */
    private final Application f19743a;

    /* renamed from: b */
    private final String f19744b;

    /* renamed from: c */
    private final String f19745c;

    /* renamed from: d */
    private final String f19746d;

    /* renamed from: e */
    private final C1240of f19747e;

    /* renamed from: f */
    private final SavePasswordRequest f19748f;

    public hhd(Application application, String str, String str2, String str3, C1240of ofVar, SavePasswordRequest savePasswordRequest) {
        this.f19743a = application;
        this.f19744b = str;
        this.f19745c = str2;
        this.f19746d = str3;
        this.f19747e = ofVar;
        this.f19748f = savePasswordRequest;
    }

    /* renamed from: a */
    public final C0053bl mo3261a(Class cls) {
        Application application = this.f19743a;
        return (C0053bl) cls.cast(new hhe(application, this.f19744b, this.f19745c, this.f19746d, this.f19748f, this.f19747e, new qws(application, "IDENTITY_GMSCORE", null)));
    }
}
