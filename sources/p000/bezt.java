package p000;

/* renamed from: bezt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bezt {

    /* renamed from: a */
    public static final double f113188a = Math.toRadians(15.0d);

    /* renamed from: b */
    public static final double f113189b = Math.toRadians(15.0d);

    /* renamed from: c */
    public final double f113190c;

    /* renamed from: d */
    public final double f113191d;

    /* renamed from: e */
    public final double f113192e;

    /* renamed from: f */
    public final double f113193f;

    /* renamed from: g */
    public final double f113194g;

    /* renamed from: h */
    public bezv f113195h;

    /* renamed from: i */
    public long f113196i = 0;

    public bezt(double d, double d2, double d3, double d4, double d5) {
        this.f113190c = d;
        this.f113191d = d2;
        this.f113192e = d3;
        this.f113193f = d4;
        this.f113194g = d5;
    }

    /* renamed from: a */
    public static bfne m96183a(double d, double d2, double d3, double d4) {
        double atan2 = Math.atan2(d2, d);
        return bfne.m97311a(Double.valueOf(bsgl.m115746d(atan2)), Double.valueOf((Math.pow(d3 * Math.sin(atan2), 2.0d) + Math.pow(d4 * Math.cos(atan2), 2.0d)) / ((d * d) + (d2 * d2))));
    }

    /* renamed from: a */
    public final bfne mo61304a(double d, double d2, double d3, double d4, long j) {
        bfne a = m96183a(d, d2, d3, d4);
        adyn adyn = new adyn(2, 1);
        bmxy.m108581a((Double) a.f114467a);
        adyn.mo33932a(0, 0, ((Double) a.f114467a).doubleValue());
        adyn.mo33932a(1, 0, 0.0d);
        adyn a2 = adyn.m51430a(2);
        bmxy.m108581a((Double) a.f114468b);
        a2.mo33932a(0, 0, ((Double) a.f114468b).doubleValue());
        a2.mo33932a(1, 1, 9.869604401089358d);
        this.f113195h = new bezv(adyn, a2);
        this.f113196i = j;
        return a;
    }
}
