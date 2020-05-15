package p000;

import android.app.Application;

/* renamed from: bdlw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdlw implements cayy {

    /* renamed from: a */
    private final cijl f105924a;

    /* renamed from: b */
    private final cijl f105925b;

    /* renamed from: c */
    private final cijl f105926c;

    /* renamed from: d */
    private final cijl f105927d;

    public bdlw(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4) {
        this.f105924a = cijl;
        this.f105925b = cijl2;
        this.f105926c = cijl3;
        this.f105927d = cijl4;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        bdkh b = ((bdki) this.f105924a).mo6445a();
        Application application = (Application) ((cayz) this.f105925b).f176439a;
        cijl cijl = this.f105926c;
        bmxv b2 = ((bdfs) this.f105927d).mo6445a();
        bdfd a = bdfd.m90662a(application);
        cijl cijl2 = (cijl) ((bdls) b2.mo66814b()).mo58158e().mo66815c();
        return new bdlu(b, application, cijl, a, ((bdls) b2.mo66814b()).mo58157d());
    }
}
