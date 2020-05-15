package p000;

/* renamed from: bfmc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfmc {

    /* renamed from: a */
    public final int f114386a;

    /* renamed from: b */
    public final long f114387b;

    public bfmc(int i, long j) {
        this.f114386a = i;
        this.f114387b = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bfmc) {
            bfmc bfmc = (bfmc) obj;
            return this.f114386a == bfmc.f114386a && this.f114387b == bfmc.f114387b;
        }
    }

    public final int hashCode() {
        int i = this.f114386a;
        long j = this.f114387b;
        return (i * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        int i = this.f114386a;
        long j = this.f114387b;
        StringBuilder sb = new StringBuilder(62);
        sb.append("activity = ");
        sb.append(i);
        sb.append(", epochTimeMillis = ");
        sb.append(j);
        return sb.toString();
    }
}
