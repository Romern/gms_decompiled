package p000;

/* renamed from: lxi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lxi extends lyj {

    /* renamed from: a */
    private final bnic f33154a;

    /* renamed from: b */
    private final long f33155b;

    /* renamed from: c */
    private final long f33156c;

    /* renamed from: d */
    private final long f33157d;

    /* renamed from: e */
    private final lxk f33158e;

    public lxi(bnic bnic, long j, long j2, long j3, lxk lxk) {
        this.f33154a = bnic;
        this.f33155b = j;
        this.f33156c = j2;
        this.f33157d = j3;
        this.f33158e = lxk;
    }

    /* renamed from: a */
    public final bnic mo19724a() {
        return this.f33154a;
    }

    /* renamed from: b */
    public final long mo19725b() {
        return this.f33155b;
    }

    /* renamed from: c */
    public final long mo19726c() {
        return this.f33156c;
    }

    /* renamed from: d */
    public final long mo19727d() {
        return this.f33157d;
    }

    /* renamed from: e */
    public final lxk mo19728e() {
        return this.f33158e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lyj) {
            lyj lyj = (lyj) obj;
            return this.f33154a.equals(lyj.mo19724a()) && this.f33155b == lyj.mo19725b() && this.f33156c == lyj.mo19726c() && this.f33157d == lyj.mo19727d() && this.f33158e.equals(lyj.mo19728e());
        }
    }

    public final int hashCode() {
        int hashCode = this.f33154a.hashCode();
        long j = this.f33155b;
        long j2 = this.f33156c;
        long j3 = this.f33157d;
        return ((((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f33158e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f33154a);
        long j = this.f33155b;
        long j2 = this.f33156c;
        long j3 = this.f33157d;
        String valueOf2 = String.valueOf(this.f33158e);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 182 + String.valueOf(valueOf2).length());
        sb.append("RetryManager{retriableStatuses=");
        sb.append(valueOf);
        sb.append(", maxNumberOfAttempts=");
        sb.append(j);
        sb.append(", initialBackoffMillis=");
        sb.append(j2);
        sb.append(", networkRetryMaxFuzzMillis=");
        sb.append(j3);
        sb.append(", clockWithSleep=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
