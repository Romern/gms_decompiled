package p000;

/* renamed from: bnwj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnwj {

    /* renamed from: a */
    public final bnvt f132291a;

    /* renamed from: b */
    public final double f132292b;

    /* renamed from: c */
    public final int f132293c;

    /* renamed from: d */
    public final int f132294d;

    /* renamed from: e */
    public final int f132295e;

    /* renamed from: f */
    public final int f132296f;

    /* renamed from: g */
    private final bnvk f132297g;

    /* renamed from: h */
    private bnvk f132298h;

    public bnwj(bnvt bnvt, double d) {
        this.f132291a = bnvt;
        this.f132292b = d;
        if (bnvt.mo68587d()) {
            double d2 = 1.0d + d;
            double d3 = -d2;
            this.f132297g = new bnvk(new bnvj(d3, d2), new bnvj(d3, d2));
            double d4 = -d;
            this.f132298h = new bnvk(new bnvj(d4, d), new bnvj(d4, d));
            this.f132294d = 0;
            this.f132293c = 0;
            this.f132295e = bnvt.mo68579a() & 1;
            this.f132296f = 0;
            return;
        }
        long i = bnvt.mo68594i();
        int a = bnvt.m110558a(i);
        int b = bnvt.m110567b(i);
        this.f132295e = bnvt.m110570c(i);
        int b2 = bnvt.mo68581b();
        this.f132296f = b2;
        this.f132297g = bnvt.m110568b(a, b, b2).mo68527a(d);
        int i2 = -bnvt.m110566b(this.f132296f);
        this.f132293c = a & i2;
        this.f132294d = i2 & b;
    }

    /* renamed from: a */
    public final bnvk mo68657a() {
        if (this.f132298h == null) {
            int b = bnvt.m110566b(this.f132296f);
            bnxi bnxi = bnxi.f132328e;
            long j = (long) this.f132293c;
            long j2 = (long) b;
            double a = bnxi.mo68686a(bnxi.m110723a(j + j + j2));
            bnxi bnxi2 = bnxi.f132328e;
            long j3 = (long) this.f132294d;
            double a2 = bnxi2.mo68686a(bnxi.m110723a(j3 + j3 + j2));
            double d = this.f132292b;
            bnvj bnvj = new bnvj(a - d, a + d);
            double d2 = this.f132292b;
            this.f132298h = new bnvk(bnvj, new bnvj(a2 - d2, a2 + d2));
        }
        return this.f132298h;
    }

    public bnwj(bnwj bnwj, int i, int i2, int i3) {
        int i4;
        this.f132292b = bnwj.f132292b;
        this.f132297g = new bnvk(bnwj.f132297g);
        int i5 = 1;
        this.f132296f = bnwj.f132296f + 1;
        bnvt bnvt = bnwj.f132291a;
        this.f132291a = new bnvt(bnvt.f132250b + (((long) ((i + i) - 3)) * (bnvt.mo68595j() >>> 2)));
        int b = bnvt.m110566b(this.f132296f);
        this.f132293c = bnwj.f132293c + (i2 * b);
        this.f132294d = bnwj.f132294d + (b * i3);
        this.f132295e = bnvr.m110548a(i) ^ bnwj.f132295e;
        bnvk a = bnwj.mo68657a();
        if (i2 != 0) {
            i4 = 1;
        } else {
            i4 = 2;
        }
        bnvi.m110495a(i4, this.f132297g.f132222a, bnvi.m110494a(i4, a.f132222a));
        i5 = i3 == 0 ? 2 : i5;
        bnvi.m110495a(i5, this.f132297g.f132223b, bnvi.m110494a(i5, a.f132223b));
    }
}
