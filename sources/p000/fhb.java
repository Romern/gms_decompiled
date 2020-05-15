package p000;

import com.android.volley.toolbox.BaseHttpStack;

/* renamed from: fhb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fhb implements cayy {

    /* renamed from: a */
    private final cijl f16593a;

    /* renamed from: b */
    private final cijl f16594b;

    public fhb(cijl cijl, cijl cijl2) {
        this.f16593a = cijl;
        this.f16594b = cijl2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        fgr fgr = new fgr((BaseHttpStack) this.f16594b.mo6445a(), ((epb) this.f16593a).mo6445a().getApplicationInfo().uid);
        cazf.m127593a(fgr, "Cannot return null from a non-@Nullable @Provides method");
        return fgr;
    }
}
