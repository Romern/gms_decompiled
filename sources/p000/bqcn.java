package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: bqcn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqcn {
    /* renamed from: a */
    public static int m112575a(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    /* renamed from: a */
    public static int m112576a(int i, int i2) {
        if (i >= i2) {
            return i <= i2 ? 0 : 1;
        }
        return -1;
    }

    /* renamed from: b */
    public static int m112585b(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j >= -2147483648L) {
            return (int) j;
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: b */
    public static List m112586b(int... iArr) {
        int length = iArr.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        return new bqcm(iArr, 0, length);
    }

    /* renamed from: a */
    public static int m112577a(int i, int i2, int i3) {
        bmxy.m108592a(i2 <= i3, "min (%s) must be less than or equal to max (%s)", i2, i3);
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: a */
    public static int m112578a(long j) {
        int i = (int) j;
        bmxy.m108593a(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    /* renamed from: a */
    public static int m112579a(byte[] bArr) {
        int length = bArr.length;
        bmxy.m108592a(length >= 4, "array too small: %s < %s", length, 4);
        return m112575a(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    /* renamed from: a */
    public static int m112580a(int... iArr) {
        boolean z;
        if (iArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        int i = iArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            if (i3 > i) {
                i = i3;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static int m112581a(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: a */
    public static Integer m112582a(String str) {
        Long a = bqcr.m112596a(str);
        if (a == null || a.longValue() != ((long) a.intValue())) {
            return null;
        }
        return Integer.valueOf(a.intValue());
    }

    /* renamed from: a */
    public static byte[] m112583a(int i) {
        return new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i};
    }

    /* renamed from: a */
    public static int[] m112584a(Collection collection) {
        if (collection instanceof bqcm) {
            bqcm bqcm = (bqcm) collection;
            return Arrays.copyOfRange(bqcm.f140477a, bqcm.f140478b, bqcm.f140479c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            bmxy.m108581a(obj);
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
