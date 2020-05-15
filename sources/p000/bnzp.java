package p000;

import java.nio.ByteOrder;

/* renamed from: bnzp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnzp {

    /* renamed from: a */
    private static final bnzm f132409a;

    static {
        bnzm bnzm = bnzl.INSTANCE;
        try {
            if ("amd64".equals(System.getProperty("os.arch"))) {
                bnzm = !ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN) ? bnzo.UNSAFE_BIG_ENDIAN : bnzo.UNSAFE_LITTLE_ENDIAN;
            }
        } catch (Throwable th) {
        }
        f132409a = bnzm;
    }

    /* renamed from: a */
    static long m110915a(byte[] bArr, int i) {
        return f132409a.mo68750a(bArr, i);
    }

    /* renamed from: b */
    static int m110916b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }
}
