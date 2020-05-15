package org.whispersystems.curve25519.java;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class scalarmult {
    public static int crypto_scalarmult(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[32];
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = new int[10];
        int[] iArr4 = new int[10];
        int[] iArr5 = new int[10];
        int[] iArr6 = new int[10];
        int[] iArr7 = new int[10];
        for (int i = 0; i < 32; i++) {
            bArr4[i] = bArr2[i];
        }
        fe_frombytes.fe_frombytes(iArr, bArr3);
        fe_1.fe_1(iArr2);
        fe_0.fe_0(iArr3);
        fe_copy.fe_copy(iArr4, iArr);
        fe_1.fe_1(iArr5);
        int i2 = 254;
        int i3 = 0;
        while (i2 >= 0) {
            int i4 = (bArr4[i2 / 8] >>> (i2 & 7)) & 1;
            int i5 = i3 ^ i4;
            fe_cswap.fe_cswap(iArr2, iArr4, i5);
            fe_cswap.fe_cswap(iArr3, iArr5, i5);
            fe_sub.fe_sub(iArr6, iArr4, iArr5);
            fe_sub.fe_sub(iArr7, iArr2, iArr3);
            fe_add.fe_add(iArr2, iArr2, iArr3);
            fe_add.fe_add(iArr3, iArr4, iArr5);
            fe_mul.fe_mul(iArr5, iArr6, iArr2);
            fe_mul.fe_mul(iArr3, iArr3, iArr7);
            fe_sq.fe_sq(iArr6, iArr7);
            fe_sq.fe_sq(iArr7, iArr2);
            fe_add.fe_add(iArr4, iArr5, iArr3);
            fe_sub.fe_sub(iArr3, iArr5, iArr3);
            fe_mul.fe_mul(iArr2, iArr7, iArr6);
            fe_sub.fe_sub(iArr7, iArr7, iArr6);
            fe_sq.fe_sq(iArr3, iArr3);
            fe_mul121666.fe_mul121666(iArr5, iArr7);
            fe_sq.fe_sq(iArr4, iArr4);
            fe_add.fe_add(iArr6, iArr6, iArr5);
            fe_mul.fe_mul(iArr5, iArr, iArr3);
            fe_mul.fe_mul(iArr3, iArr7, iArr6);
            i2--;
            i3 = i4;
        }
        fe_cswap.fe_cswap(iArr2, iArr4, i3);
        fe_cswap.fe_cswap(iArr3, iArr5, i3);
        fe_invert.fe_invert(iArr3, iArr3);
        fe_mul.fe_mul(iArr2, iArr2, iArr3);
        fe_tobytes.fe_tobytes(bArr, iArr2);
        return 0;
    }
}
