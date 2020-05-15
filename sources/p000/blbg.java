package p000;

/* renamed from: blbg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class blbg {

    /* renamed from: a */
    public final long f125822a;

    /* renamed from: b */
    public final long f125823b;

    public blbg(long j, long j2) {
        boolean z = true;
        bmxy.m108588a(j >= 0);
        bmxy.m108588a(j2 < j ? false : z);
        this.f125822a = j;
        this.f125823b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof blbg) {
            blbg blbg = (blbg) obj;
            return this.f125823b == blbg.f125823b && this.f125822a == blbg.f125822a;
        }
    }

    public final int hashCode() {
        long j = this.f125822a;
        long j2 = this.f125823b;
        return ((((int) (j ^ (j >>> 32))) + 527) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return String.format("ByteRange{start=%d, end=%d}", Long.valueOf(this.f125822a), Long.valueOf(this.f125823b));
    }
}
