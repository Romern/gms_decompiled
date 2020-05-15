package p000;

/* renamed from: bacr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bacr extends bacv {

    /* renamed from: b */
    private final long f100492b;

    /* renamed from: c */
    private final long f100493c;

    /* renamed from: d */
    private final long f100494d;

    public bacr(long j, long j2, long j3) {
        this.f100492b = j;
        this.f100493c = j2;
        this.f100494d = j3;
    }

    /* renamed from: a */
    public final long mo55581a() {
        return this.f100492b;
    }

    /* renamed from: b */
    public final long mo55582b() {
        return this.f100493c;
    }

    /* renamed from: c */
    public final long mo55583c() {
        return this.f100494d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bacv) {
            bacv bacv = (bacv) obj;
            return this.f100492b == bacv.mo55581a() && this.f100493c == bacv.mo55582b() && this.f100494d == bacv.mo55583c();
        }
    }

    public final int hashCode() {
        long j = this.f100492b;
        long j2 = this.f100493c;
        long j3 = this.f100494d;
        return ((int) ((j3 >>> 32) ^ j3)) ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        long j = this.f100492b;
        long j2 = this.f100493c;
        long j3 = this.f100494d;
        StringBuilder sb = new StringBuilder(167);
        sb.append("CoreSyncStatus{elapsedRealtimeMillisAtLastSync=");
        sb.append(j);
        sb.append(", currentTimeMillisAtLastSync=");
        sb.append(j2);
        sb.append(", serverTimeMillisAtLastSync=");
        sb.append(j3);
        sb.append("}");
        return sb.toString();
    }
}
