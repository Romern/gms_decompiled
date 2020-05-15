package p000;

/* renamed from: kjp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kjp {

    /* renamed from: a */
    public final kcv f24264a;

    /* renamed from: b */
    public final bngx f24265b;

    /* renamed from: c */
    public final bmxv f24266c;

    /* renamed from: d */
    public final bmxv f24267d;

    /* renamed from: e */
    public final bmxv f24268e;

    /* renamed from: f */
    public final int f24269f;

    public kjp(kcv kcv, bngx bngx, bmxv bmxv, bmxv bmxv2, bmxv bmxv3, int i) {
        this.f24264a = kcv;
        this.f24265b = bngx;
        this.f24266c = bmxv;
        this.f24267d = bmxv2;
        this.f24268e = bmxv3;
        this.f24269f = i;
    }

    /* renamed from: a */
    public static kjo m17947a(kcv kcv) {
        return new kjo(kcv);
    }

    public final String toString() {
        return String.format("DetectedForm[metricsId=%d, domain=%s, fields=%s, focusedField=%s]", Integer.valueOf(this.f24269f), this.f24264a, this.f24265b, this.f24266c);
    }

    /* renamed from: a */
    public final kjo mo14538a() {
        kjo a = m17947a(this.f24264a);
        a.f24259a.mo67666b((Iterable) this.f24265b);
        a.f24260b = (kjl) this.f24266c.mo66815c();
        a.f24261c = (kjj) this.f24267d.mo66815c();
        a.f24262d = (kka) this.f24268e.mo66815c();
        return a;
    }
}
