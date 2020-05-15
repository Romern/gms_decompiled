package p000;

/* renamed from: bezf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bezf {

    /* renamed from: a */
    public final bezi f113121a;

    /* renamed from: b */
    public final int f113122b;

    /* renamed from: c */
    public final int f113123c;

    /* renamed from: d */
    public final double f113124d;

    /* renamed from: e */
    private final int f113125e;

    private bezf(bezi bezi, double d, int i, int i2) {
        this.f113121a = bezi;
        this.f113124d = d;
        this.f113122b = i2;
        this.f113123c = i;
        this.f113125e = (int) Math.ceil(d);
    }

    /* renamed from: a */
    public static bezf m96119a(bezi bezi, bnwc bnwc, double d) {
        return new bezf(bezi, d / bezi.mo61280f(), (int) Math.round(bezi.mo61282a(bnwc)), (int) Math.round(bezi.mo61286b(bnwc)));
    }

    /* renamed from: a */
    public final int mo61268a() {
        return this.f113122b - this.f113125e;
    }

    /* renamed from: b */
    public final int mo61269b() {
        return this.f113122b + this.f113125e;
    }

    /* renamed from: c */
    public final int mo61270c() {
        return this.f113123c - this.f113125e;
    }

    /* renamed from: d */
    public final int mo61271d() {
        return this.f113123c + this.f113125e;
    }

    /* renamed from: e */
    public final beze mo61272e() {
        return new beze(this);
    }
}
