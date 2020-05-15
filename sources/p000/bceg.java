package p000;

/* renamed from: bceg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bceg extends bcen {

    /* renamed from: a */
    public final long f104029a;

    /* renamed from: b */
    public final double f104030b;

    /* renamed from: c */
    public final int f104031c;

    /* renamed from: f */
    private final int f104032f;

    /* renamed from: g */
    private final long f104033g;

    public bceg(int i, long j, long j2, double d, int i2) {
        this.f104032f = i;
        this.f104033g = j;
        this.f104029a = j2;
        this.f104030b = d;
        this.f104031c = i2;
    }

    /* renamed from: a */
    public final int mo56724a() {
        return this.f104032f;
    }

    /* renamed from: b */
    public final long mo56725b() {
        return this.f104033g;
    }

    /* renamed from: c */
    public final long mo56726c() {
        return this.f104029a;
    }

    /* renamed from: d */
    public final double mo56727d() {
        return this.f104030b;
    }

    /* renamed from: e */
    public final int mo56728e() {
        return this.f104031c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bcen) {
            bcen bcen = (bcen) obj;
            return this.f104032f == bcen.mo56724a() && this.f104033g == bcen.mo56725b() && this.f104029a == bcen.mo56726c() && Double.doubleToLongBits(this.f104030b) == Double.doubleToLongBits(bcen.mo56727d()) && this.f104031c == bcen.mo56728e();
        }
    }

    public final int hashCode() {
        int i = this.f104032f;
        long j = this.f104033g;
        long j2 = this.f104029a;
        return ((((((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f104030b) >>> 32) ^ Double.doubleToLongBits(this.f104030b)))) * 1000003) ^ this.f104031c;
    }

    public final String toString() {
        int i = this.f104032f;
        long j = this.f104033g;
        long j2 = this.f104029a;
        double d = this.f104030b;
        int i2 = this.f104031c;
        StringBuilder sb = new StringBuilder(168);
        sb.append("LighterRetryPolicy{maxRetries=");
        sb.append(i);
        sb.append(", maxDelayMs=");
        sb.append(j);
        sb.append(", initialDelayMs=");
        sb.append(j2);
        sb.append(", backoff=");
        sb.append(d);
        sb.append(", jitterMs=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
