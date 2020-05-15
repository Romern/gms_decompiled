package p000;

/* renamed from: ynp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ynp extends ynz {

    /* renamed from: a */
    private final long f54214a;

    /* renamed from: b */
    private final long f54215b;

    /* renamed from: c */
    private final int f54216c;

    public ynp(long j, long j2, int i) {
        this.f54214a = j;
        this.f54215b = j2;
        this.f54216c = i;
    }

    /* renamed from: a */
    public final long mo30385a() {
        return this.f54214a;
    }

    /* renamed from: b */
    public final long mo30387b() {
        return this.f54215b;
    }

    /* renamed from: d */
    public final int mo30631d() {
        return this.f54216c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ynz) {
            ynz ynz = (ynz) obj;
            return this.f54214a == ynz.mo30385a() && this.f54215b == ynz.mo30387b() && this.f54216c == ynz.mo30631d();
        }
    }

    public final int hashCode() {
        long j = this.f54214a;
        long j2 = this.f54215b;
        return this.f54216c ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        long j = this.f54214a;
        long j2 = this.f54215b;
        int i = this.f54216c;
        StringBuilder sb = new StringBuilder(119);
        sb.append("ActivitySegment{getStartTimeNanos=");
        sb.append(j);
        sb.append(", getEndTimeNanos=");
        sb.append(j2);
        sb.append(", activityType=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
