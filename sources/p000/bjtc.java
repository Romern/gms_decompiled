package p000;

/* renamed from: bjtc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjtc {
    /* renamed from: a */
    public static long m104548a(long j, int i) {
        return m104549a(j, i, 0);
    }

    /* renamed from: a */
    public static long m104549a(long j, int i, int i2) {
        return (j & 16777215) | (((long) i) << 24) | (((long) ((char) i2)) << 32);
    }

    /* renamed from: a */
    public static long m104550a(bwgx bwgx, int i) {
        return (((long) (i & 4095)) << 12) | ((long) bwgx.m121949a(bwgx.f159461cf).f159461cf);
    }
}
