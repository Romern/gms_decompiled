package p000;

/* renamed from: bfmw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfmw {

    /* renamed from: a */
    private static final int f114433a = ayuo.m84849b(180.0d);

    /* renamed from: b */
    private static final int f114434b = ayuo.m84849b(90.0d);

    /* renamed from: a */
    public static int m97287a(int i) {
        return i / 1000;
    }

    /* renamed from: a */
    public static boolean m97289a(bfni bfni) {
        int i;
        return bfni.f114482d <= 10000000 && !((i = bfni.f114480b) == 0 && bfni.f114481c == 0) && i <= f114434b && bfni.f114480b >= (-f114434b) && bfni.f114481c <= f114433a && bfni.f114481c >= (-f114433a);
    }

    /* renamed from: b */
    public static int m97290b(int i) {
        if (i <= 2147483) {
            return i * 1000;
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: a */
    public static int m97288a(bfni bfni, bfni bfni2) {
        return (int) Math.round(ayuo.m84843a(bfni.f114480b, bfni.f114481c, bfni2.f114480b, bfni2.f114481c));
    }
}
