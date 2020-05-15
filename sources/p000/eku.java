package p000;

/* renamed from: eku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class eku extends eky {

    /* renamed from: b */
    private final long f15220b;

    /* renamed from: c */
    private final int f15221c;

    /* renamed from: d */
    private final int f15222d;

    /* renamed from: e */
    private final long f15223e;

    public eku(long j, int i, int i2, long j2) {
        this.f15220b = j;
        this.f15221c = i;
        this.f15222d = i2;
        this.f15223e = j2;
    }

    /* renamed from: a */
    public final long mo10242a() {
        return this.f15220b;
    }

    /* renamed from: b */
    public final int mo10243b() {
        return this.f15221c;
    }

    /* renamed from: c */
    public final int mo10244c() {
        return this.f15222d;
    }

    /* renamed from: d */
    public final long mo10245d() {
        return this.f15223e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eky) {
            eky eky = (eky) obj;
            return this.f15220b == eky.mo10242a() && this.f15221c == eky.mo10243b() && this.f15222d == eky.mo10244c() && this.f15223e == eky.mo10245d();
        }
    }

    public final int hashCode() {
        long j = this.f15220b;
        int i = this.f15221c;
        int i2 = this.f15222d;
        long j2 = this.f15223e;
        return ((int) ((j2 >>> 32) ^ j2)) ^ ((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003);
    }

    public final String toString() {
        long j = this.f15220b;
        int i = this.f15221c;
        int i2 = this.f15222d;
        long j2 = this.f15223e;
        StringBuilder sb = new StringBuilder(168);
        sb.append("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(j);
        sb.append(", loadBatchSize=");
        sb.append(i);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(i2);
        sb.append(", eventCleanUpAge=");
        sb.append(j2);
        sb.append("}");
        return sb.toString();
    }
}
