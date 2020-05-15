package p000;

import java.util.concurrent.Executor;

/* renamed from: afss */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afss implements cayy {

    /* renamed from: a */
    private final cijl f64689a;

    /* renamed from: b */
    private final cijl f64690b;

    public afss(cijl cijl, cijl cijl2) {
        this.f64689a = cijl;
        this.f64690b = cijl2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        bbkj bbkj = new bbkj((Executor) this.f64689a.mo6445a(), (befa) this.f64690b.mo6445a());
        cazf.m127593a(bbkj, "Cannot return null from a non-@Nullable @Provides method");
        return bbkj;
    }
}
