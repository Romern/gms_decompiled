package p000;

/* renamed from: ayun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayun {
    /* renamed from: a */
    public static final int m84835a(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: a */
    public static final long m84837a(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    /* renamed from: b */
    public static final double m84838b(long j) {
        return ayuo.m84847b(m84835a(j));
    }

    /* renamed from: c */
    public static final double m84839c(long j) {
        return ayuo.m84847b((int) j);
    }

    /* renamed from: a */
    public static final long m84836a(double d, double d2) {
        return m84837a(ayuo.m84844a(Math.max(-1.5707963267948966d, Math.min(1.5707963267948966d, d))), ayuo.m84844a(ayuo.m84850c(d2)));
    }
}
