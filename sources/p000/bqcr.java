package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: bqcr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqcr {
    /* renamed from: a */
    public static int m112590a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: a */
    public static int m112591a(long j, long j2) {
        if (j >= j2) {
            return j <= j2 ? 0 : 1;
        }
        return -1;
    }

    /* renamed from: a */
    public static long m112593a(byte b, byte b2, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8) {
        return ((((long) b2) & 255) << 48) | ((((long) b) & 255) << 56) | ((((long) b3) & 255) << 40) | ((((long) b4) & 255) << 32) | ((((long) b5) & 255) << 24) | ((((long) b6) & 255) << 16) | ((((long) b7) & 255) << 8) | (((long) b8) & 255);
    }

    /* renamed from: b */
    public static List m112598b(long... jArr) {
        int length = jArr.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        return new bqcp(jArr, 0, length);
    }

    /* renamed from: a */
    public static int m112592a(long[] jArr, long j, int i, int i2) {
        while (i < i2) {
            if (jArr[i] == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: b */
    public static byte[] m112599b(long j) {
        byte[] bArr = new byte[8];
        for (int i = 7; i >= 0; i--) {
            bArr[i] = (byte) ((int) (255 & j));
            j >>= 8;
        }
        return bArr;
    }

    /* renamed from: a */
    public static long m112594a(byte[] bArr) {
        int length = bArr.length;
        bmxy.m108592a(length >= 8, "array too small: %s < %s", length, 8);
        return m112593a(bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], bArr[5], bArr[6], bArr[7]);
    }

    /* renamed from: a */
    public static long m112595a(long... jArr) {
        boolean z;
        if (jArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        long j = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            long j2 = jArr[i];
            if (j2 > j) {
                j = j2;
            }
        }
        return j;
    }

    /* renamed from: a */
    public static Long m112596a(String str) {
        bmxy.m108581a(str);
        if (!str.isEmpty()) {
            int i = 0;
            char charAt = str.charAt(0);
            if (charAt == '-') {
                i = 1;
            }
            if (i != str.length()) {
                int i2 = i + 1;
                int a = bqco.m112587a(str.charAt(i));
                if (a >= 0 && a < 10) {
                    long j = (long) (-a);
                    while (i2 < str.length()) {
                        int i3 = i2 + 1;
                        int a2 = bqco.m112587a(str.charAt(i2));
                        if (a2 >= 0 && a2 < 10) {
                            long j2 = j * 10;
                            long j3 = (long) a2;
                            if (j2 >= Long.MIN_VALUE + j3) {
                                j = j2 - j3;
                                i2 = i3;
                            }
                        }
                        return null;
                    }
                    if (charAt == '-') {
                        return Long.valueOf(j);
                    }
                    if (j != Long.MIN_VALUE) {
                        return Long.valueOf(-j);
                    }
                    return null;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static long[] m112597a(Collection collection) {
        if (collection instanceof bqcp) {
            bqcp bqcp = (bqcp) collection;
            return Arrays.copyOfRange(bqcp.f140481a, bqcp.f140482b, bqcp.f140483c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            bmxy.m108581a(obj);
            jArr[i] = ((Number) obj).longValue();
        }
        return jArr;
    }
}
