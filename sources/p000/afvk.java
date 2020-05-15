package p000;

import java.util.concurrent.Executor;

/* renamed from: afvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afvk implements cayy {

    /* renamed from: a */
    private final cijl f64842a;

    /* renamed from: b */
    private final cijl f64843b;

    /* renamed from: c */
    private final cijl f64844c;

    /* renamed from: d */
    private final cijl f64845d;

    public afvk(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4) {
        this.f64842a = cijl;
        this.f64843b = cijl2;
        this.f64844c = cijl3;
        this.f64845d = cijl4;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        bely b = ((afvl) this.f64845d).mo6445a();
        bejv bejv = new bejv();
        bejv.f111685a = (Executor) this.f64842a.mo6445a();
        bejv.f111686b = (befa) this.f64843b.mo6445a();
        bejv.mo60767a((bels) this.f64844c.mo6445a(), b);
        bejv.mo60768a(bekj.f111708a);
        bejv.mo60768a(bejj.f111648a);
        beju a = bejv.mo60766a();
        cazf.m127593a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
