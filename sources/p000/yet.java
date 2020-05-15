package p000;

/* renamed from: yet */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class yet extends yel {

    /* renamed from: a */
    private double f53705a = 0.0d;

    public yet(int i) {
        super(i);
    }

    /* renamed from: a */
    public final caaw mo30398a(long j) {
        double d = this.f53705a;
        double d2 = (double) j;
        Double.isNaN(d2);
        return yyp.m45046a(d / d2);
    }

    /* renamed from: b */
    public final double mo30399b(cadn cadn) {
        caaw a = mo30397a(cadn);
        if (!yyp.m45052c(a) || (a.f172381a & 2) == 0) {
            return 0.0d;
        }
        long j = cadn.f172702b;
        long j2 = cadn.f172703c;
        double d = this.f53705a;
        double d2 = a.f172383c;
        double d3 = (double) (j - j2);
        Double.isNaN(d3);
        this.f53705a = d + (d2 * d3);
        return 1.0d;
    }
}
