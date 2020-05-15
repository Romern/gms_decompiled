package p000;

import java.util.Arrays;

/* renamed from: bqvy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqvy {

    /* renamed from: a */
    public static final /* synthetic */ int f141700a = 0;

    /* renamed from: b */
    private static final int[] f141701b = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};

    /* renamed from: c */
    private static final int[] f141702c = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};

    /* renamed from: d */
    private static final int[] f141703d = {67108863, 33554431};

    /* renamed from: e */
    private static final int[] f141704e = {26, 25};

    /* renamed from: a */
    static void m113500a(long[] jArr, long[] jArr2) {
        int length = jArr.length;
        if (length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, length);
            jArr = jArr3;
        }
        long j = jArr[8] + (jArr[18] << 4);
        jArr[8] = j;
        long j2 = jArr[18];
        long j3 = j + j2 + j2;
        jArr[8] = j3;
        jArr[8] = j3 + jArr[18];
        long j4 = jArr[7] + (jArr[17] << 4);
        jArr[7] = j4;
        long j5 = jArr[17];
        long j6 = j4 + j5 + j5;
        jArr[7] = j6;
        jArr[7] = j6 + jArr[17];
        long j7 = jArr[6] + (jArr[16] << 4);
        jArr[6] = j7;
        long j8 = jArr[16];
        long j9 = j7 + j8 + j8;
        jArr[6] = j9;
        jArr[6] = j9 + jArr[16];
        long j10 = jArr[5] + (jArr[15] << 4);
        jArr[5] = j10;
        long j11 = jArr[15];
        long j12 = j10 + j11 + j11;
        jArr[5] = j12;
        jArr[5] = j12 + jArr[15];
        long j13 = jArr[4] + (jArr[14] << 4);
        jArr[4] = j13;
        long j14 = jArr[14];
        long j15 = j13 + j14 + j14;
        jArr[4] = j15;
        jArr[4] = j15 + jArr[14];
        long j16 = jArr[3] + (jArr[13] << 4);
        jArr[3] = j16;
        long j17 = jArr[13];
        long j18 = j16 + j17 + j17;
        jArr[3] = j18;
        jArr[3] = j18 + jArr[13];
        long j19 = jArr[2] + (jArr[12] << 4);
        jArr[2] = j19;
        long j20 = jArr[12];
        long j21 = j19 + j20 + j20;
        jArr[2] = j21;
        jArr[2] = j21 + jArr[12];
        long j22 = jArr[1] + (jArr[11] << 4);
        jArr[1] = j22;
        long j23 = jArr[11];
        long j24 = j22 + j23 + j23;
        jArr[1] = j24;
        jArr[1] = j24 + jArr[11];
        long j25 = jArr[0] + (jArr[10] << 4);
        jArr[0] = j25;
        long j26 = jArr[10];
        long j27 = j25 + j26 + j26;
        jArr[0] = j27;
        jArr[0] = j27 + jArr[10];
        jArr[10] = 0;
        int i = 0;
        while (i < 10) {
            long j28 = jArr[i];
            long j29 = j28 / 67108864;
            jArr[i] = j28 - (j29 << 26);
            int i2 = i + 1;
            long j30 = jArr[i2] + j29;
            jArr[i2] = j30;
            long j31 = j30 / 33554432;
            jArr[i2] = j30 - (j31 << 25);
            i += 2;
            jArr[i] = jArr[i] + j31;
        }
        long j32 = jArr[0] + (jArr[10] << 4);
        jArr[0] = j32;
        long j33 = jArr[10];
        long j34 = j32 + j33 + j33;
        jArr[0] = j34;
        jArr[0] = j34 + jArr[10];
        jArr[10] = 0;
        long j35 = jArr[0];
        long j36 = j35 / 67108864;
        jArr[0] = j35 - (j36 << 26);
        jArr[1] = jArr[1] + j36;
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    /* renamed from: b */
    static void m113504b(long[] jArr, long[] jArr2) {
        long j = jArr2[0];
        long j2 = jArr2[0];
        long j3 = jArr2[1];
        long j4 = (j3 * j3) + (jArr2[0] * jArr2[2]);
        long j5 = (jArr2[1] * jArr2[2]) + (jArr2[0] * jArr2[3]);
        long j6 = jArr2[2];
        long j7 = jArr2[1];
        long j8 = jArr2[3];
        long j9 = jArr2[0];
        long j10 = (jArr2[2] * jArr2[3]) + (jArr2[1] * jArr2[4]) + (jArr2[0] * jArr2[5]);
        long j11 = jArr2[3];
        long j12 = jArr2[2];
        long j13 = jArr2[4];
        long j14 = jArr2[0];
        long j15 = jArr2[6];
        long j16 = jArr2[1];
        long j17 = (j11 * j11) + (j12 * j13) + (j14 * j15) + ((j16 + j16) * jArr2[5]);
        long j18 = (jArr2[3] * jArr2[4]) + (jArr2[2] * jArr2[5]) + (jArr2[1] * jArr2[6]) + (jArr2[0] * jArr2[7]);
        long j19 = jArr2[4];
        long j20 = jArr2[2];
        long j21 = jArr2[6];
        long j22 = jArr2[0];
        long j23 = jArr2[8];
        long j24 = (jArr2[1] * jArr2[7]) + (jArr2[3] * jArr2[5]);
        long j25 = (j20 * j21) + (j22 * j23) + j24 + j24;
        long j26 = (jArr2[4] * jArr2[5]) + (jArr2[3] * jArr2[6]) + (jArr2[2] * jArr2[7]) + (jArr2[1] * jArr2[8]) + (jArr2[0] * jArr2[9]);
        long j27 = jArr2[5];
        long j28 = jArr2[4];
        long j29 = jArr2[6];
        long j30 = jArr2[2];
        long j31 = jArr2[8];
        long j32 = (jArr2[3] * jArr2[7]) + (jArr2[1] * jArr2[9]);
        long j33 = (j27 * j27) + (j28 * j29) + (j30 * j31) + j32 + j32;
        long j34 = (jArr2[5] * jArr2[6]) + (jArr2[4] * jArr2[7]) + (jArr2[3] * jArr2[8]) + (jArr2[2] * jArr2[9]);
        long j35 = jArr2[6];
        long j36 = jArr2[4];
        long j37 = jArr2[8];
        long j38 = (jArr2[5] * jArr2[7]) + (jArr2[3] * jArr2[9]);
        long j39 = (j36 * j37) + j38 + j38;
        long j40 = (jArr2[6] * jArr2[7]) + (jArr2[5] * jArr2[8]) + (jArr2[4] * jArr2[9]);
        long j41 = jArr2[7];
        long j42 = jArr2[6];
        long j43 = jArr2[8];
        long j44 = jArr2[5];
        long j45 = (j41 * j41) + (j42 * j43) + ((j44 + j44) * jArr2[9]);
        long j46 = (jArr2[7] * jArr2[8]) + (jArr2[6] * jArr2[9]);
        long j47 = jArr2[8];
        long j48 = jArr2[8];
        long j49 = jArr2[9];
        m113500a(new long[]{j * j, (j2 + j2) * jArr2[1], j4 + j4, j5 + j5, (j6 * j6) + (j7 * 4 * j8) + ((j9 + j9) * jArr2[4]), j10 + j10, j17 + j17, j18 + j18, (j19 * j19) + j25 + j25, j26 + j26, j33 + j33, j34 + j34, (j35 * j35) + j39 + j39, j40 + j40, j45 + j45, j46 + j46, (j47 * j47) + (jArr2[7] * 4 * jArr2[9]), (j48 + j48) * jArr2[9], (j49 + j49) * j49}, jArr);
    }

    /* renamed from: c */
    static void m113506c(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr2[1];
        long j2 = jArr2[2];
        long j3 = jArr3[2];
        long j4 = (jArr2[1] * jArr3[3]) + (jArr2[3] * jArr3[1]);
        long j5 = (jArr2[3] * jArr3[3]) + (jArr2[1] * jArr3[5]) + (jArr2[5] * jArr3[1]);
        long j6 = jArr2[4];
        long j7 = jArr3[4];
        long j8 = (jArr2[3] * jArr3[5]) + (jArr2[5] * jArr3[3]) + (jArr2[1] * jArr3[7]) + (jArr2[7] * jArr3[1]);
        long j9 = (jArr2[5] * jArr3[5]) + (jArr2[3] * jArr3[7]) + (jArr2[7] * jArr3[3]) + (jArr2[1] * jArr3[9]) + (jArr2[9] * jArr3[1]);
        long j10 = jArr2[6];
        long j11 = jArr3[6];
        long j12 = (jArr2[5] * jArr3[7]) + (jArr2[7] * jArr3[5]) + (jArr2[3] * jArr3[9]) + (jArr2[9] * jArr3[3]);
        long j13 = (jArr2[7] * jArr3[7]) + (jArr2[5] * jArr3[9]) + (jArr2[9] * jArr3[5]);
        long j14 = jArr2[8] * jArr3[8];
        long j15 = (jArr2[7] * jArr3[9]) + (jArr2[9] * jArr3[7]);
        long j16 = jArr2[9];
        m113500a(new long[]{jArr2[0] * jArr3[0], (jArr2[0] * jArr3[1]) + (jArr2[1] * jArr3[0]), ((j + j) * jArr3[1]) + (jArr2[0] * jArr3[2]) + (jArr2[2] * jArr3[0]), (jArr2[1] * jArr3[2]) + (jArr2[2] * jArr3[1]) + (jArr2[0] * jArr3[3]) + (jArr2[3] * jArr3[0]), (j2 * j3) + j4 + j4 + (jArr2[0] * jArr3[4]) + (jArr2[4] * jArr3[0]), (jArr2[2] * jArr3[3]) + (jArr2[3] * jArr3[2]) + (jArr2[1] * jArr3[4]) + (jArr2[4] * jArr3[1]) + (jArr2[0] * jArr3[5]) + (jArr2[5] * jArr3[0]), j5 + j5 + (jArr2[2] * jArr3[4]) + (jArr2[4] * jArr3[2]) + (jArr2[0] * jArr3[6]) + (jArr2[6] * jArr3[0]), (jArr2[3] * jArr3[4]) + (jArr2[4] * jArr3[3]) + (jArr2[2] * jArr3[5]) + (jArr2[5] * jArr3[2]) + (jArr2[1] * jArr3[6]) + (jArr2[6] * jArr3[1]) + (jArr2[0] * jArr3[7]) + (jArr2[7] * jArr3[0]), (j6 * j7) + j8 + j8 + (jArr2[2] * jArr3[6]) + (jArr2[6] * jArr3[2]) + (jArr2[0] * jArr3[8]) + (jArr2[8] * jArr3[0]), (jArr2[4] * jArr3[5]) + (jArr2[5] * jArr3[4]) + (jArr2[3] * jArr3[6]) + (jArr2[6] * jArr3[3]) + (jArr2[2] * jArr3[7]) + (jArr2[7] * jArr3[2]) + (jArr2[1] * jArr3[8]) + (jArr2[8] * jArr3[1]) + (jArr2[0] * jArr3[9]) + (jArr2[9] * jArr3[0]), j9 + j9 + (jArr2[4] * jArr3[6]) + (jArr2[6] * jArr3[4]) + (jArr2[2] * jArr3[8]) + (jArr2[8] * jArr3[2]), (jArr2[5] * jArr3[6]) + (jArr2[6] * jArr3[5]) + (jArr2[4] * jArr3[7]) + (jArr2[7] * jArr3[4]) + (jArr2[3] * jArr3[8]) + (jArr2[8] * jArr3[3]) + (jArr2[2] * jArr3[9]) + (jArr2[9] * jArr3[2]), (j10 * j11) + j12 + j12 + (jArr2[4] * jArr3[8]) + (jArr2[8] * jArr3[4]), (jArr2[6] * jArr3[7]) + (jArr2[7] * jArr3[6]) + (jArr2[5] * jArr3[8]) + (jArr2[8] * jArr3[5]) + (jArr2[4] * jArr3[9]) + (jArr2[9] * jArr3[4]), j13 + j13 + (jArr2[6] * jArr3[8]) + (jArr2[8] * jArr3[6]), (jArr2[7] * jArr3[8]) + (jArr2[8] * jArr3[7]) + (jArr2[6] * jArr3[9]) + (jArr2[9] * jArr3[6]), j14 + j15 + j15, (jArr2[8] * jArr3[9]) + (jArr2[9] * jArr3[8]), (j16 + j16) * jArr3[9]}, jArr);
    }

    /* renamed from: b */
    static void m113505b(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] - jArr3[i];
        }
    }

    /* renamed from: a */
    static void m113501a(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] + jArr3[i];
        }
    }

    /* renamed from: a */
    static byte[] m113502a(long[] jArr) {
        int i;
        long[] copyOf = Arrays.copyOf(jArr, 10);
        int i2 = 0;
        while (true) {
            i = 2;
            if (i2 >= 2) {
                break;
            }
            int i3 = 0;
            while (i3 < 9) {
                long j = copyOf[i3];
                int i4 = i3 & 1;
                int[] iArr = f141704e;
                int i5 = -((int) ((j & (j >> 31)) >> iArr[i4]));
                copyOf[i3] = copyOf[i3] + ((long) (i5 << iArr[i4]));
                i3++;
                copyOf[i3] = copyOf[i3] - ((long) i5);
            }
            long j2 = copyOf[9];
            int i6 = -((int) (((j2 >> 31) & j2) >> 25));
            copyOf[9] = j2 + ((long) (i6 << 25));
            copyOf[0] = copyOf[0] - ((long) (i6 * 19));
            i2++;
        }
        long j3 = copyOf[0];
        int i7 = -((int) (((j3 >> 31) & j3) >> 26));
        copyOf[0] = j3 + ((long) (i7 << 26));
        int i8 = 1;
        copyOf[1] = copyOf[1] - ((long) i7);
        int i9 = 0;
        while (i9 < i) {
            int i10 = 0;
            while (i10 < 9) {
                long j4 = copyOf[i10];
                int i11 = i10 & 1;
                int i12 = f141704e[i11];
                copyOf[i10] = ((long) f141703d[i11]) & copyOf[i10];
                i10++;
                copyOf[i10] = copyOf[i10] + ((long) ((int) (j4 >> i12)));
            }
            i9++;
            i = 2;
            i8 = 1;
        }
        long j5 = copyOf[9];
        copyOf[9] = 33554431 & j5;
        long j6 = copyOf[0] + ((long) (((int) (j5 >> 25)) * 19));
        copyOf[0] = j6;
        int i13 = ((((int) j6) - 67108845) >> 31) ^ -1;
        for (int i14 = 1; i14 < 10; i14++) {
            int i15 = (((int) copyOf[i14]) ^ f141703d[i14 & 1]) ^ -1;
            int i16 = i15 & (i15 << 16);
            int i17 = i16 & (i16 << 8);
            int i18 = i17 & (i17 << 4);
            int i19 = i18 & (i18 << 2);
            i13 &= (i19 & (i19 + i19)) >> 31;
        }
        copyOf[0] = copyOf[0] - ((long) (67108845 & i13));
        long j7 = (long) (33554431 & i13);
        copyOf[i8] = copyOf[i8] - j7;
        for (int i20 = 2; i20 < 10; i20 += 2) {
            copyOf[i20] = copyOf[i20] - ((long) (67108863 & i13));
            int i21 = i20 + 1;
            copyOf[i21] = copyOf[i21] - j7;
        }
        for (int i22 = 0; i22 < 10; i22++) {
            copyOf[i22] = copyOf[i22] << f141702c[i22];
        }
        byte[] bArr = new byte[32];
        for (int i23 = 0; i23 < 10; i23++) {
            int[] iArr2 = f141701b;
            int i24 = iArr2[i23];
            bArr[i24] = (byte) ((int) (((long) bArr[i24]) | (copyOf[i23] & 255)));
            int i25 = iArr2[i23] + i8;
            bArr[i25] = (byte) ((int) (((long) bArr[i25]) | ((copyOf[i23] >> 8) & 255)));
            int i26 = iArr2[i23] + i;
            bArr[i26] = (byte) ((int) (((long) bArr[i26]) | ((copyOf[i23] >> 16) & 255)));
            int i27 = iArr2[i23] + 3;
            bArr[i27] = (byte) ((int) (((long) bArr[i27]) | ((copyOf[i23] >> 24) & 255)));
        }
        return bArr;
    }

    /* renamed from: a */
    static long[] m113503a(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i = 0; i < 10; i++) {
            int[] iArr = f141701b;
            jArr[i] = ((((((long) (bArr[iArr[i]] & 255)) | (((long) (bArr[iArr[i] + 1] & 255)) << 8)) | (((long) (bArr[iArr[i] + 2] & 255)) << 16)) | (((long) (bArr[iArr[i] + 3] & 255)) << 24)) >> f141702c[i]) & ((long) f141703d[i & 1]);
        }
        return jArr;
    }
}
