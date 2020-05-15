package p000;

import java.nio.charset.Charset;

/* renamed from: ciqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ciqu {

    /* renamed from: a */
    public static final Charset f191265a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static int m150903a(int i) {
        return ((i & 255) << 24) | (i >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    /* renamed from: a */
    public static short m150904a(short s) {
        return (short) (((s & 255) << 8) | ((s >>> 8) & 255));
    }

    /* renamed from: a */
    public static void m150905a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)));
        }
    }

    /* renamed from: a */
    public static boolean m150906a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }
}
