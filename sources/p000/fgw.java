package p000;

import org.chromium.net.CronetEngine;

/* renamed from: fgw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fgw implements cayy {

    /* renamed from: a */
    private final cijl f16529a;

    public fgw(cijl cijl) {
        this.f16529a = cijl;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        bmxv b = ffy.m11632b();
        cazf.m127593a(b, "Cannot return null from a non-@Nullable @Provides method");
        Object fgm = b.mo66813a() ? new fgm((CronetEngine) b.mo66814b(), ((epb) this.f16529a).mo6445a().getApplicationInfo().uid) : new fgq();
        cazf.m127593a(fgm, "Cannot return null from a non-@Nullable @Provides method");
        return fgm;
    }
}
