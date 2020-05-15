package org.whispersystems.curve25519.java;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class fe_mul121666 {
    public static void fe_mul121666(int[] iArr, int[] iArr2) {
        int i = iArr2[0];
        int i2 = iArr2[1];
        int i3 = iArr2[2];
        int i4 = iArr2[3];
        int i5 = iArr2[4];
        int i6 = iArr2[5];
        int i7 = iArr2[6];
        int i8 = iArr2[7];
        int i9 = iArr2[8];
        long j = ((long) i2) * 121666;
        long j2 = ((long) i4) * 121666;
        long j3 = ((long) i6) * 121666;
        long j4 = ((long) i8) * 121666;
        long j5 = ((long) iArr2[9]) * 121666;
        long j6 = (j5 + 16777216) >> 25;
        long j7 = (((long) i) * 121666) + (19 * j6);
        long j8 = (j + 16777216) >> 25;
        long j9 = (((long) i3) * 121666) + j8;
        long j10 = (j2 + 16777216) >> 25;
        long j11 = (((long) i5) * 121666) + j10;
        long j12 = (j3 + 16777216) >> 25;
        long j13 = (((long) i7) * 121666) + j12;
        long j14 = (j4 + 16777216) >> 25;
        long j15 = (((long) i9) * 121666) + j14;
        long j16 = (j7 + 33554432) >> 26;
        long j17 = (j9 + 33554432) >> 26;
        long j18 = (j11 + 33554432) >> 26;
        long j19 = (j3 - (j12 << 25)) + j18;
        long j20 = j11 - (j18 << 26);
        long j21 = (j13 + 33554432) >> 26;
        long j22 = (j4 - (j14 << 25)) + j21;
        long j23 = (j15 + 33554432) >> 26;
        iArr[0] = (int) (j7 - (j16 << 26));
        iArr[1] = (int) ((j - (j8 << 25)) + j16);
        iArr[2] = (int) (j9 - (j17 << 26));
        iArr[3] = (int) ((j2 - (j10 << 25)) + j17);
        iArr[4] = (int) j20;
        iArr[5] = (int) j19;
        iArr[6] = (int) (j13 - (j21 << 26));
        iArr[7] = (int) j22;
        iArr[8] = (int) (j15 - (j23 << 26));
        iArr[9] = (int) ((j5 - (j6 << 25)) + j23);
    }
}
