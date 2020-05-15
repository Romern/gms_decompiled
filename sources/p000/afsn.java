package p000;

import java.util.concurrent.Executor;

/* renamed from: afsn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afsn implements cayy {

    /* renamed from: a */
    private final cijl f64674a;

    /* renamed from: b */
    private final cijl f64675b;

    /* renamed from: c */
    private final cijl f64676c;

    /* renamed from: d */
    private final cijl f64677d;

    /* renamed from: e */
    private final cijl f64678e;

    /* renamed from: f */
    private final cijl f64679f;

    /* renamed from: g */
    private final cijl f64680g;

    public afsn(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4, cijl cijl5, cijl cijl6, cijl cijl7) {
        this.f64674a = cijl;
        this.f64675b = cijl2;
        this.f64676c = cijl3;
        this.f64677d = cijl4;
        this.f64678e = cijl5;
        this.f64679f = cijl6;
        this.f64680g = cijl7;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        bbja bbja = (bbja) this.f64674a.mo6445a();
        bbko b = ((afsl) this.f64675b).mo6445a();
        bbkl b2 = ((afsk) this.f64676c).mo6445a();
        bbkj bbkj = (bbkj) this.f64677d.mo6445a();
        bbkr b3 = ((afsj) this.f64678e).mo6445a();
        Executor executor = (Executor) this.f64679f.mo6445a();
        afsp afsp = (afsp) this.f64680g.mo6445a();
        bblp bblp = new bblp(bbja, b, b2, bbkj, new afsd(b3), new afse(b3), executor, afsf.f64659a);
        cazf.m127593a(bblp, "Cannot return null from a non-@Nullable @Provides method");
        return bblp;
    }
}
