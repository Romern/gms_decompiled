package p000;

/* renamed from: brtn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brtn {
    /* renamed from: a */
    static void m114632a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (m114639d(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m114639d(b3) || m114639d(b4)) {
            throw new IllegalArgumentException("Invalid UTF-8");
        }
        int e = ((b & 7) << 18) | (m114640e(b2) << 12) | (m114640e(b3) << 6) | m114640e(b4);
        cArr[i] = (char) ((e >>> 10) + 55232);
        cArr[i + 1] = (char) ((e & 1023) + 56320);
    }

    /* renamed from: a */
    static boolean m114636a(byte b) {
        return b >= 0;
    }

    /* renamed from: b */
    static boolean m114637b(byte b) {
        return b < -32;
    }

    /* renamed from: c */
    static boolean m114638c(byte b) {
        return b < -16;
    }

    /* renamed from: d */
    private static boolean m114639d(byte b) {
        return b > -65;
    }

    /* renamed from: e */
    private static int m114640e(byte b) {
        return b & 63;
    }

    /* renamed from: a */
    static void m114633a(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (m114639d(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m114639d(b3)))) {
            throw new IllegalArgumentException("Invalid UTF-8");
        }
        cArr[i] = (char) (((b & 15) << 12) | (m114640e(b2) << 6) | m114640e(b3));
    }

    /* renamed from: a */
    static void m114634a(byte b, byte b2, char[] cArr, int i) {
        if (b < -62) {
            throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
        } else if (!m114639d(b2)) {
            cArr[i] = (char) (((b & 31) << 6) | m114640e(b2));
        } else {
            throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
        }
    }

    /* renamed from: a */
    static void m114635a(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }
}
