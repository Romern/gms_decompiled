package p000;

/* renamed from: egl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class egl {

    /* renamed from: a */
    public double f14864a;

    /* renamed from: b */
    public double f14865b;

    /* renamed from: c */
    public int f14866c;

    public egl() {
        mo10091a();
    }

    /* renamed from: a */
    public final void mo10091a() {
        this.f14864a = 0.0d;
        this.f14865b = 0.0d;
        this.f14866c = 0;
    }

    /* renamed from: a */
    public final void mo10092a(double d) {
        this.f14864a += d;
        this.f14865b += d * d;
        this.f14866c++;
    }

    /* renamed from: b */
    public final double mo10093b() {
        int i = this.f14866c;
        if (i <= 0) {
            return 0.0d;
        }
        double d = this.f14864a;
        double d2 = (double) i;
        Double.isNaN(d2);
        return d / d2;
    }

    /* renamed from: c */
    public final double mo10094c() {
        double d = 0.0d;
        if (this.f14866c > 0) {
            double b = mo10093b();
            int i = this.f14866c;
            if (i > 0) {
                double d2 = this.f14865b;
                double d3 = (double) i;
                Double.isNaN(d3);
                d = d2 / d3;
            }
            d -= b * b;
        }
        return Math.sqrt(d);
    }
}
