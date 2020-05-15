package p000;

import java.util.concurrent.Executor;

/* renamed from: afso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afso implements cayy {

    /* renamed from: a */
    private final cijl f64681a;

    /* renamed from: b */
    private final cijl f64682b;

    /* renamed from: c */
    private final cijl f64683c;

    /* renamed from: d */
    private final cijl f64684d;

    /* renamed from: e */
    private final cijl f64685e;

    /* renamed from: f */
    private final cijl f64686f;

    /* renamed from: g */
    private final cijl f64687g;

    public afso(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4, cijl cijl5, cijl cijl6, cijl cijl7) {
        this.f64681a = cijl;
        this.f64682b = cijl2;
        this.f64683c = cijl3;
        this.f64684d = cijl4;
        this.f64685e = cijl5;
        this.f64686f = cijl6;
        this.f64687g = cijl7;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        bbja bbja = (bbja) this.f64681a.mo6445a();
        bbko b = ((afsl) this.f64682b).mo6445a();
        bbkl b2 = ((afsk) this.f64683c).mo6445a();
        bbkj bbkj = (bbkj) this.f64684d.mo6445a();
        bbkr b3 = ((afsj) this.f64685e).mo6445a();
        Executor executor = (Executor) this.f64686f.mo6445a();
        afsp afsp = (afsp) this.f64687g.mo6445a();
        bbmm bbmm = new bbmm(bbja, b, b2, bbkj, new afsg(b3), new afsh(b3), executor, afsi.f64662a);
        cazf.m127593a(bbmm, "Cannot return null from a non-@Nullable @Provides method");
        return bbmm;
    }
}
