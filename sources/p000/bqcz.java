package p000;

import java.math.BigInteger;

/* renamed from: bqcz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqcz {

    /* renamed from: a */
    static final long[] f140493a = new long[37];

    /* renamed from: b */
    static final int[] f140494b = new int[37];

    /* renamed from: c */
    static final int[] f140495c = new int[37];

    static {
        long j;
        int i;
        BigInteger bigInteger = new BigInteger("10000000000000000", 16);
        for (int i2 = 2; i2 <= 36; i2++) {
            long j2 = (long) i2;
            long[] jArr = f140493a;
            long j3 = -1;
            if (j2 >= 0) {
                long j4 = Long.MAX_VALUE / j2;
                long j5 = j4 + j4;
                if (bqda.m112612a(-1 - (j5 * j2), j2) >= 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                j = j5 + ((long) i);
            } else {
                j = bqda.m112612a(-1, j2) < 0 ? 0 : 1;
            }
            jArr[i2] = j;
            int[] iArr = f140494b;
            if (j2 >= 0) {
                long j6 = Long.MAX_VALUE / j2;
                long j7 = -1 - ((j6 + j6) * j2);
                if (bqda.m112612a(j7, j2) < 0) {
                    j2 = 0;
                }
                j3 = j7 - j2;
            } else if (bqda.m112612a(-1, j2) >= 0) {
                j3 = -1 - j2;
            }
            iArr[i2] = (int) j3;
            f140495c[i2] = bigInteger.toString(i2).length() - 1;
        }
    }

    /* renamed from: a */
    static boolean m112611a(long j, int i) {
        if (j < 0) {
            return true;
        }
        long[] jArr = f140493a;
        if (j >= jArr[16]) {
            return j > jArr[16] || i > f140494b[16];
        }
        return false;
    }
}
