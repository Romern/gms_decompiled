package p000;

/* renamed from: bumd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bumd {
    /* renamed from: a */
    public static final int m119958a(byte[] bArr) {
        if (bArr != null) {
            return bArr[0];
        }
        throw new IllegalArgumentException("FREWLE tile to be parsed is null.");
    }

    /* renamed from: b */
    public static final int m119961b(byte[] bArr) {
        if (m119958a(bArr) == 1) {
            return bumr.m120007a(bArr, 1);
        }
        throw new IllegalArgumentException("Unsupported protocol version on getFrewleTileVersion.");
    }

    /* renamed from: c */
    public static final double m119963c(byte[] bArr, int i) {
        if (m119958a(bArr) == 1) {
            return (double) bArr[(bume.m119967a(bArr, i) * 11) + 20];
        }
        throw new IllegalArgumentException("Unknown protocol version on getPowerOutput.");
    }

    /* renamed from: d */
    public static final double m119965d(byte[] bArr, int i) {
        if (m119958a(bArr) == 1) {
            double d = (double) bArr[(bume.m119967a(bArr, i) * 11) + 21];
            Double.isNaN(d);
            return (d + 128.0d) * 0.01d;
        }
        throw new IllegalArgumentException("Unknown protocol version on getPathLossExponent.");
    }

    /* renamed from: a */
    public static final long m119959a(long j, int i) {
        long j2 = (long) (i & 16777215);
        int b = 30 - ayvd.m84910b(j);
        return (j ^ ayvd.m84916c(j)) | (((j2 + j2) | 1) << ((b + b) - 24));
    }

    /* renamed from: a */
    public static final long m119960a(byte[] bArr, int i) {
        if (m119958a(bArr) == 1) {
            int i2 = (i * 11) + 11;
            return (bumr.m120008b(bArr[i2]) << 40) + (bumr.m120008b(bArr[i2 + 1]) << 32) + (bumr.m120008b(bArr[i2 + 2]) << 24) + (bumr.m120008b(bArr[i2 + 3]) << 16) + (bumr.m120008b(bArr[i2 + 4]) << 8) + bumr.m120008b(bArr[i2 + 5]);
        }
        throw new IllegalArgumentException("Unknown protocol version on getMacAddress.");
    }

    /* renamed from: b */
    public static final int m119962b(byte[] bArr, int i) {
        if (m119958a(bArr) == 1) {
            int a = (bume.m119967a(bArr, i) * 11) + 17;
            return (bumr.m120006a(bArr[a]) << 16) + (bumr.m120006a(bArr[a + 1]) << 8) + bumr.m120006a(bArr[a + 2]);
        }
        throw new IllegalArgumentException("Unknown protocol version on getApS2CellIdSuffix.");
    }

    /* renamed from: c */
    public static final long m119964c(byte[] bArr) {
        if (m119958a(bArr) == 1) {
            return (((((bumr.m120008b(bArr[4]) << 32) + (bumr.m120008b(bArr[5]) << 24)) + (bumr.m120008b(bArr[6]) << 16)) + (bumr.m120008b(bArr[7]) << 8)) + bumr.m120008b(bArr[8])) << 24;
        }
        throw new IllegalArgumentException("Unsupported protocol version on getS2CellId.");
    }

    /* renamed from: d */
    public static final int m119966d(byte[] bArr) {
        if (m119958a(bArr) == 1) {
            return bumr.m120007a(bArr, 9);
        }
        throw new IllegalArgumentException("Unsupported protocol version on getNumMacEntries.");
    }
}
