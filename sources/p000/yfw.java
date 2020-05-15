package p000;

/* renamed from: yfw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yfw extends yfv {

    /* renamed from: a */
    public final long f53737a;

    /* renamed from: b */
    public final long f53738b;

    public yfw(long j, long j2) {
        this.f53737a = j;
        this.f53738b = j2;
    }

    /* renamed from: a */
    public final long mo30385a() {
        return this.f53737a;
    }

    /* renamed from: b */
    public final long mo30387b() {
        return this.f53738b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yfv) {
            yfv yfv = (yfv) obj;
            return this.f53737a == yfv.mo30385a() && this.f53738b == yfv.mo30387b();
        }
    }

    public final int hashCode() {
        long j = this.f53737a;
        long j2 = this.f53738b;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.f53737a;
        long j2 = this.f53738b;
        StringBuilder sb = new StringBuilder(88);
        sb.append("AutoTimeInterval{startTimeNanos=");
        sb.append(j);
        sb.append(", endTimeNanos=");
        sb.append(j2);
        sb.append("}");
        return sb.toString();
    }
}
