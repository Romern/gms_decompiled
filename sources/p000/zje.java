package p000;

/* renamed from: zje */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zje {

    /* renamed from: a */
    public final long f55195a;

    /* renamed from: b */
    public final long f55196b;

    /* renamed from: c */
    public final int f55197c;

    public zje(long j, long j2, int i) {
        this.f55195a = j;
        this.f55196b = j2;
        this.f55197c = i;
    }

    /* renamed from: a */
    public final double mo31165a() {
        long j = this.f55196b;
        if (j == 0) {
            return 0.0d;
        }
        double d = (double) this.f55197c;
        double d2 = (double) j;
        Double.isNaN(d);
        Double.isNaN(d2);
        return d / d2;
    }

    public final String toString() {
        long j = this.f55195a;
        long j2 = this.f55196b;
        int i = this.f55197c;
        StringBuilder sb = new StringBuilder(53);
        sb.append(j);
        sb.append(",");
        sb.append(j2);
        sb.append(",");
        sb.append(i);
        return sb.toString();
    }
}
