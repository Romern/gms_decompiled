package p000;

/* renamed from: yew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class yew extends yel {

    /* renamed from: a */
    private boolean f53711a = false;

    /* renamed from: b */
    private double f53712b;

    public yew(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public double mo30401a(double d) {
        return 1.0d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract double mo30400a(double d, double d2);

    /* renamed from: b */
    public final double mo30399b(cadn cadn) {
        caaw a = mo30397a(cadn);
        if (!yyp.m45052c(a) || (a.f172381a & 2) == 0) {
            return 0.0d;
        }
        double d = a.f172383c;
        if (!this.f53711a) {
            this.f53712b = d;
            this.f53711a = true;
        } else {
            this.f53712b = mo30400a(this.f53712b, d);
        }
        return mo30401a(d);
    }

    /* renamed from: a */
    public final caaw mo30398a(long j) {
        if (this.f53711a) {
            return yyp.m45046a(this.f53712b);
        }
        return caaw.f172379i;
    }
}
