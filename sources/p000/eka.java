package p000;

import java.util.Set;

/* renamed from: eka */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class eka extends ekf {

    /* renamed from: a */
    private final long f15166a;

    /* renamed from: b */
    private final long f15167b;

    /* renamed from: c */
    private final Set f15168c;

    public eka(long j, long j2, Set set) {
        this.f15166a = j;
        this.f15167b = j2;
        this.f15168c = set;
    }

    /* renamed from: a */
    public final long mo10222a() {
        return this.f15166a;
    }

    /* renamed from: b */
    public final long mo10223b() {
        return this.f15167b;
    }

    /* renamed from: c */
    public final Set mo10224c() {
        return this.f15168c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ekf) {
            ekf ekf = (ekf) obj;
            return this.f15166a == ekf.mo10222a() && this.f15167b == ekf.mo10223b() && this.f15168c.equals(ekf.mo10224c());
        }
    }

    public final int hashCode() {
        long j = this.f15166a;
        long j2 = this.f15167b;
        return this.f15168c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        long j = this.f15166a;
        long j2 = this.f15167b;
        String valueOf = String.valueOf(this.f15168c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 85);
        sb.append("ConfigValue{delta=");
        sb.append(j);
        sb.append(", maxAllowedDelay=");
        sb.append(j2);
        sb.append(", flags=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
