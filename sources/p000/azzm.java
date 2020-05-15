package p000;

/* renamed from: azzm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azzm extends azzt {

    /* renamed from: a */
    private final long f100331a;

    /* renamed from: b */
    private final long f100332b;

    /* renamed from: c */
    private final long f100333c;

    public azzm(long j, long j2, long j3) {
        this.f100331a = j;
        this.f100332b = j2;
        this.f100333c = j3;
    }

    /* renamed from: a */
    public final long mo55507a() {
        return this.f100331a;
    }

    /* renamed from: b */
    public final long mo55508b() {
        return this.f100332b;
    }

    /* renamed from: c */
    public final long mo55509c() {
        return this.f100333c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof azzt) {
            azzt azzt = (azzt) obj;
            return this.f100331a == azzt.mo55507a() && this.f100332b == azzt.mo55508b() && this.f100333c == azzt.mo55509c();
        }
    }

    public final int hashCode() {
        long j = this.f100331a;
        long j2 = this.f100332b;
        long j3 = this.f100333c;
        return ((int) ((j3 >>> 32) ^ j3)) ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        long j = this.f100331a;
        long j2 = this.f100332b;
        long j3 = this.f100333c;
        StringBuilder sb = new StringBuilder(163);
        sb.append("SyncStatus{elapsedRealtimeMillisAtLastSync=");
        sb.append(j);
        sb.append(", currentTimeMillisAtLastSync=");
        sb.append(j2);
        sb.append(", serverTimeMillisAtLastSync=");
        sb.append(j3);
        sb.append("}");
        return sb.toString();
    }
}
