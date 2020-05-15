package p000;

/* renamed from: bunf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bunf {

    /* renamed from: a */
    public final long f154305a;

    protected bunf(long j) {
        this.f154305a = j;
    }

    /* renamed from: a */
    public static int m120042a(long j, int i, int i2, int i3, int i4) {
        int i5 = ((int) (j >> i)) & i2;
        m120043b(i5, i3, i4);
        return i5;
    }

    /* renamed from: b */
    protected static void m120043b(int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            StringBuilder sb = new StringBuilder(66);
            sb.append("Check for ");
            sb.append(i);
            sb.append(" failed for range [");
            sb.append(i2);
            sb.append(", ");
            sb.append(i3);
            sb.append("].");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: c */
    protected static long m120044c(int i, int i2, int i3) {
        m120043b(i, 0, i2);
        return ((long) i) << i3;
    }

    /* renamed from: e */
    protected static void m120045e(long j) {
        if (j < 0 || j > 68719476735L) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("Check for ");
            sb.append(j);
            sb.append(" failed for range [0, 68719476735].");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bunf) && this.f154305a == ((bunf) obj).f154305a;
    }

    public final int hashCode() {
        long j = this.f154305a;
        return (int) (j ^ (j >>> 32));
    }
}
