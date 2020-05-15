package org.whispersystems.curve25519.java;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class fe_frombytes {
    public static void fe_frombytes(int[] iArr, byte[] bArr) {
        long load_4 = load_4(bArr, 0);
        long load_3 = load_3(bArr, 4) << 6;
        long load_32 = load_3(bArr, 7);
        long load_33 = load_3(bArr, 10) << 3;
        long load_34 = load_3(bArr, 13);
        long load_42 = load_4(bArr, 16);
        long load_35 = load_3(bArr, 20);
        long load_36 = load_3(bArr, 23) << 5;
        long load_37 = load_3(bArr, 26);
        long load_38 = (load_3(bArr, 29) & 8388607) << 2;
        long j = (load_38 + 16777216) >> 25;
        long j2 = load_4 + (19 * j);
        long j3 = (load_3 + 16777216) >> 25;
        long j4 = (load_32 << 5) + j3;
        long j5 = (load_33 + 16777216) >> 25;
        long j6 = (load_34 << 2) + j5;
        long j7 = (load_42 + 16777216) >> 25;
        long j8 = (load_35 << 7) + j7;
        long j9 = (load_36 + 16777216) >> 25;
        long j10 = (load_37 << 4) + j9;
        long j11 = (j2 + 33554432) >> 26;
        long j12 = (j4 + 33554432) >> 26;
        long j13 = (j6 + 33554432) >> 26;
        long j14 = (load_42 - (j7 << 25)) + j13;
        long j15 = (j8 + 33554432) >> 26;
        long j16 = (load_36 - (j9 << 25)) + j15;
        long j17 = j8 - (j15 << 26);
        long j18 = (j10 + 33554432) >> 26;
        long j19 = (load_38 - (j << 25)) + j18;
        iArr[0] = (int) (j2 - (j11 << 26));
        iArr[1] = (int) ((load_3 - (j3 << 25)) + j11);
        iArr[2] = (int) (j4 - (j12 << 26));
        iArr[3] = (int) ((load_33 - (j5 << 25)) + j12);
        iArr[4] = (int) (j6 - (j13 << 26));
        iArr[5] = (int) j14;
        iArr[6] = (int) j17;
        iArr[7] = (int) j16;
        iArr[8] = (int) (j10 - (j18 << 26));
        iArr[9] = (int) j19;
    }

    public static long load_3(byte[] bArr, int i) {
        return ((((long) bArr[i + 2]) << 16) & 16711680) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) << 8) & 65280);
    }

    public static long load_4(byte[] bArr, int i) {
        return ((((long) bArr[i + 3]) << 24) & 4278190080L) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) << 8) & 65280) | ((((long) bArr[i + 2]) << 16) & 16711680);
    }
}
