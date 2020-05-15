package p000;

/* renamed from: aydp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aydp {

    /* renamed from: a */
    private final int f97241a;

    /* renamed from: b */
    private final long f97242b;

    /* renamed from: c */
    private final long f97243c;

    /* renamed from: d */
    private long f97244d;

    /* renamed from: e */
    private long f97245e = 0;

    public aydp(int i, long j, long j2) {
        this.f97241a = i;
        this.f97242b = j;
        this.f97243c = j2;
    }

    /* renamed from: a */
    public final void mo53966a() {
        this.f97244d = 0;
        this.f97245e = 0;
    }

    /* renamed from: b */
    public final long mo53967b() {
        long min = Math.min((long) this.f97241a, this.f97244d + 1);
        this.f97244d = min;
        long j = (long) ((1 << ((int) (min - 1))) * 1000);
        long j2 = this.f97245e + j;
        this.f97245e = j2;
        long j3 = this.f97242b;
        return (j3 < 0 || j2 < j3) ? j : this.f97243c;
    }

    /* renamed from: c */
    public final void mo53968c() {
        this.f97244d = (long) this.f97241a;
        this.f97245e = Math.max(this.f97245e, this.f97242b);
    }
}
