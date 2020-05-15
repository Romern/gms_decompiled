package p000;

/* renamed from: hxy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class hxy extends hyj {

    /* renamed from: a */
    private final long f20533a;

    /* renamed from: b */
    private final int f20534b;

    public hxy(long j, int i) {
        this.f20533a = j;
        this.f20534b = i;
    }

    /* renamed from: a */
    public final long mo12799a() {
        return this.f20533a;
    }

    /* renamed from: b */
    public final int mo12800b() {
        return this.f20534b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hyj) {
            hyj hyj = (hyj) obj;
            return this.f20533a == hyj.mo12799a() && this.f20534b == hyj.mo12800b();
        }
    }

    public final int hashCode() {
        long j = this.f20533a;
        return this.f20534b ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.f20533a;
        int i = this.f20534b;
        StringBuilder sb = new StringBuilder(68);
        sb.append("ResponseRecord{timestamp=");
        sb.append(j);
        sb.append(", response=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
