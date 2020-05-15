package p000;

/* renamed from: bjq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjq {

    /* renamed from: a */
    public final long f3397a = 0;

    /* renamed from: b */
    public long f3398b = 5000;

    /* renamed from: c */
    public int f3399c = 0;

    /* renamed from: d */
    public long f3400d = 86400000;

    /* renamed from: e */
    public final long f3401e = 0;

    /* renamed from: f */
    public final long f3402f = 0;

    public final String toString() {
        int i = this.f3399c;
        Double valueOf = Double.valueOf(0.0d);
        if (i > 0) {
            double d = (double) this.f3398b;
            Double.isNaN(d);
            double d2 = (double) this.f3399c;
            Double.isNaN(d2);
            double d3 = (double) this.f3400d;
            Double.isNaN(d3);
            return String.format("OperationScheduler.Options[backoff=%.1f+%.1f+%.1f max=%.1f min=%.1f period=%.1f]", valueOf, Double.valueOf(d / 1000.0d), Double.valueOf(d2 / 1000.0d), Double.valueOf(d3 / 1000.0d), valueOf, valueOf);
        }
        double d4 = (double) this.f3398b;
        Double.isNaN(d4);
        double d5 = (double) this.f3400d;
        Double.isNaN(d5);
        return String.format("OperationScheduler.Options[backoff=%.1f+%.1f max=%.1f min=%.1f period=%.1f]", valueOf, Double.valueOf(d4 / 1000.0d), Double.valueOf(d5 / 1000.0d), valueOf, valueOf);
    }
}
