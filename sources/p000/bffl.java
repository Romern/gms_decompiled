package p000;

/* renamed from: bffl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bffl {

    /* renamed from: a */
    private final bffk f113683a;

    /* renamed from: b */
    private final bsaz f113684b;

    /* renamed from: c */
    private final int f113685c;

    /* renamed from: d */
    private final int f113686d;

    /* renamed from: e */
    private final int f113687e;

    /* renamed from: f */
    private final int f113688f;

    /* renamed from: g */
    private final int f113689g;

    /* renamed from: h */
    private final int f113690h;

    /* renamed from: i */
    private final int f113691i;

    /* renamed from: j */
    private int f113692j = -1;

    /* renamed from: k */
    private long f113693k = Long.MAX_VALUE;

    /* renamed from: l */
    private long f113694l = Long.MAX_VALUE;

    public bffl(bffk bffk, bsaz bsaz, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f113683a = bffk;
        this.f113684b = bsaz;
        this.f113685c = i;
        this.f113686d = i2;
        this.f113687e = i3;
        this.f113688f = i4;
        this.f113689g = i5;
        this.f113690h = i6;
        this.f113691i = i7;
    }

    /* renamed from: a */
    private static final int m96605a(long j, long j2) {
        return (int) ((j2 - j) / 1000);
    }

    /* renamed from: b */
    private static final int m96606b(long j, long j2) {
        return (int) ((j2 - j) % 1000);
    }

    /* renamed from: a */
    public final void mo61617a() {
        this.f113693k = Long.MAX_VALUE;
    }

    /* renamed from: a */
    public final bsax mo61616a(bsax bsax, int i, long j, long j2) {
        int i2;
        int i3;
        this.f113683a.mo61610a(j2);
        this.f113683a.mo61611a(j, j2);
        bsax bsax2 = new bsax(this.f113684b, this.f113685c);
        if (this.f113694l == Long.MAX_VALUE) {
            this.f113694l = this.f113683a.mo61615c(j, j2);
        }
        if (!bsax.mo70137i(1)) {
            bsax.mo70117b(1, this.f113683a.mo61613b(j, this.f113694l));
        }
        if (!bsax.mo70137i(this.f113686d)) {
            bsax2.mo70117b(this.f113690h, j);
            bsax2.mo70117b(this.f113691i, j2 * 1000000);
        }
        long j3 = this.f113693k;
        if (j3 == Long.MAX_VALUE) {
            long c = bsax.mo70124c(1);
            long b = this.f113683a.mo61613b(j, this.f113694l);
            i3 = m96605a(c, b);
            i2 = m96606b(c, b);
        } else {
            i3 = m96605a(j3, j);
            i2 = m96606b(this.f113693k, j);
        }
        if (i3 != 0) {
            bsax2.mo70134g(this.f113688f, i3);
        }
        if (i2 != 0) {
            bsax2.mo70134g(this.f113689g, i2);
        }
        this.f113693k = j;
        if (bsax.mo70138j(this.f113686d) == 0 || this.f113692j != i) {
            bsax2.mo70134g(this.f113687e, i);
            this.f113692j = i;
        }
        return bsax2;
    }
}
