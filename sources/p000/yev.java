package p000;

/* renamed from: yev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class yev extends yel {

    /* renamed from: a */
    private double f53707a = 0.0d;

    /* renamed from: b */
    private int f53708b = 0;

    /* renamed from: c */
    private long f53709c = 0;

    /* renamed from: d */
    private double f53710d = 0.0d;

    public yev(int i) {
        super(i);
    }

    /* renamed from: a */
    public final caaw mo30398a(long j) {
        int i = this.f53708b;
        if (i == 0) {
            throw new IllegalStateException();
        } else if (i == 1) {
            return yyp.m45046a(this.f53710d);
        } else {
            double d = this.f53707a;
            double d2 = (double) j;
            Double.isNaN(d2);
            return yyp.m45046a(d / d2);
        }
    }

    /* renamed from: b */
    public final double mo30399b(cadn cadn) {
        caaw a = mo30397a(cadn);
        if (!yyp.m45052c(a) || (a.f172381a & 2) == 0) {
            return 0.0d;
        }
        int i = this.f53708b;
        if (i > 0) {
            long j = cadn.f172702b;
            long j2 = this.f53709c;
            double d = this.f53707a;
            double d2 = (double) (j - j2);
            Double.isNaN(d2);
            this.f53707a = d + ((a.f172383c + this.f53710d) * 0.5d * d2);
        }
        this.f53708b = i + 1;
        this.f53710d = a.f172383c;
        this.f53709c = cadn.f172702b;
        return 1.0d;
    }
}
