package org.whispersystems.curve25519.java;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class fe_cmov {
    public static void fe_cmov(int[] iArr, int[] iArr2, int i) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int i10 = iArr[8];
        int i11 = iArr[9];
        int i12 = iArr2[0];
        int i13 = iArr2[1];
        int i14 = iArr2[2];
        int i15 = iArr2[3];
        int i16 = iArr2[4];
        int i17 = iArr2[5];
        int i18 = iArr2[6];
        int i19 = iArr2[7];
        int i20 = iArr2[8];
        int i21 = iArr2[9];
        int i22 = -i;
        iArr[0] = i2 ^ ((i2 ^ i12) & i22);
        iArr[1] = ((i3 ^ i13) & i22) ^ i3;
        iArr[2] = ((i4 ^ i14) & i22) ^ i4;
        iArr[3] = ((i5 ^ i15) & i22) ^ i5;
        iArr[4] = ((i6 ^ i16) & i22) ^ i6;
        iArr[5] = ((i7 ^ i17) & i22) ^ i7;
        iArr[6] = ((i8 ^ i18) & i22) ^ i8;
        iArr[7] = ((i9 ^ i19) & i22) ^ i9;
        iArr[8] = i10 ^ ((i10 ^ i20) & i22);
        iArr[9] = i11 ^ ((i11 ^ i21) & i22);
    }
}
