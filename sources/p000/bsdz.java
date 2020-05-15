package p000;

/* renamed from: bsdz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsdz {

    /* renamed from: a */
    private final double f144236a;

    /* renamed from: b */
    private final double f144237b;

    /* renamed from: c */
    private final double f144238c;

    /* renamed from: d */
    private final double f144239d;

    /* renamed from: e */
    private final double f144240e;

    /* renamed from: f */
    private double f144241f = Double.NaN;

    /* renamed from: g */
    private int f144242g = 0;

    /* renamed from: h */
    private int f144243h = 0;

    /* renamed from: i */
    private boolean f144244i = false;

    public bsdz(bsex bsex) {
        this.f144236a = bsex.mo70390a();
        this.f144237b = bsex.mo70391b();
        this.f144238c = bsex.mo70392c();
        this.f144239d = bsex.mo70394e();
        this.f144240e = bsex.mo70393d();
    }

    /* renamed from: a */
    public final double mo70289a(int i, int i2, double d, double d2) {
        if (this.f144244i && (d2 - this.f144241f <= this.f144239d || ayuo.m84843a(i, i2, this.f144242g, this.f144243h) <= this.f144240e)) {
            return Double.NaN;
        }
        this.f144242g = i;
        this.f144243h = i2;
        this.f144241f = d2;
        this.f144244i = true;
        return bsgl.m115743a(d * this.f144238c, this.f144236a, this.f144237b);
    }

    /* renamed from: a */
    public final void mo70290a() {
        this.f144241f = Double.NaN;
        this.f144242g = 0;
        this.f144243h = 0;
        this.f144244i = false;
    }
}
