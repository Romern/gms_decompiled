package p000;

/* renamed from: alba */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alba {

    /* renamed from: a */
    public double f73242a;

    /* renamed from: b */
    public double f73243b;

    /* renamed from: c */
    public double f73244c;

    /* renamed from: a */
    public static double m60776a(alba alba, alba alba2) {
        return (alba.f73242a * alba2.f73242a) + (alba.f73243b * alba2.f73243b) + (alba.f73244c * alba2.f73244c);
    }

    /* renamed from: a */
    public final void mo40070a() {
        this.f73244c = 0.0d;
        this.f73243b = 0.0d;
        this.f73242a = 0.0d;
    }

    /* renamed from: a */
    public final void mo40071a(double d) {
        this.f73242a *= d;
        this.f73243b *= d;
        this.f73244c *= d;
    }

    /* renamed from: a */
    public final void mo40072a(double d, double d2, double d3) {
        this.f73242a = d;
        this.f73243b = d2;
        this.f73244c = d3;
    }

    /* renamed from: b */
    public final void mo40074b() {
        double c = mo40075c();
        if (c != 0.0d) {
            mo40071a(1.0d / c);
        }
    }

    /* renamed from: c */
    public final double mo40075c() {
        double d = this.f73242a;
        double d2 = this.f73243b;
        double d3 = this.f73244c;
        return Math.sqrt((d * d) + (d2 * d2) + (d3 * d3));
    }

    /* renamed from: a */
    public static void m60777a(alba alba, alba alba2, alba alba3) {
        double d = alba.f73243b;
        double d2 = alba2.f73244c;
        double d3 = alba.f73244c;
        double d4 = alba2.f73243b;
        double d5 = alba2.f73242a;
        double d6 = alba.f73242a;
        alba3.mo40072a((d * d2) - (d3 * d4), (d3 * d5) - (d2 * d6), (d6 * d4) - (d * d5));
    }

    /* renamed from: a */
    public final void mo40073a(alba alba) {
        this.f73242a = alba.f73242a;
        this.f73243b = alba.f73243b;
        this.f73244c = alba.f73244c;
    }
}
