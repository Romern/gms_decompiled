package p000;

/* renamed from: bqwd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqwd {
    /* renamed from: a */
    public static long m113513a(byte[] bArr, int i) {
        return ((long) (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16))) & 4294967295L;
    }

    /* renamed from: a */
    public static long m113514a(byte[] bArr, int i, int i2) {
        return (m113513a(bArr, i) >> i2) & 67108863;
    }

    /* renamed from: a */
    public static void m113515a(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) ((int) (255 & j));
            i2++;
            j >>= 8;
        }
    }
}
