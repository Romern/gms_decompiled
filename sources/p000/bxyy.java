package p000;

/* renamed from: bxyy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxyy {
    /* renamed from: a */
    public static void m124523a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (m124530d(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m124530d(b3) || m124530d(b4)) {
            throw bxwf.m124096i();
        }
        int e = ((b & 7) << 18) | (m124531e(b2) << 12) | (m124531e(b3) << 6) | m124531e(b4);
        cArr[i] = (char) ((e >>> 10) + 55232);
        cArr[i + 1] = (char) ((e & 1023) + 56320);
    }

    /* renamed from: a */
    public static boolean m124527a(byte b) {
        return b >= 0;
    }

    /* renamed from: b */
    public static boolean m124528b(byte b) {
        return b < -32;
    }

    /* renamed from: c */
    public static boolean m124529c(byte b) {
        return b < -16;
    }

    /* renamed from: d */
    private static boolean m124530d(byte b) {
        return b > -65;
    }

    /* renamed from: e */
    private static int m124531e(byte b) {
        return b & 63;
    }

    /* renamed from: a */
    public static void m124524a(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (m124530d(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m124530d(b3)))) {
            throw bxwf.m124096i();
        }
        cArr[i] = (char) (((b & 15) << 12) | (m124531e(b2) << 6) | m124531e(b3));
    }

    /* renamed from: a */
    public static void m124525a(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || m124530d(b2)) {
            throw bxwf.m124096i();
        }
        cArr[i] = (char) (((b & 31) << 6) | m124531e(b2));
    }

    /* renamed from: a */
    public static void m124526a(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }
}
