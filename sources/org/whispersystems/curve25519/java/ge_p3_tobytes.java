package org.whispersystems.curve25519.java;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ge_p3_tobytes {
    public static void ge_p3_tobytes(byte[] bArr, ge_p3 ge_p3) {
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = new int[10];
        fe_invert.fe_invert(iArr, ge_p3.f192142Z);
        fe_mul.fe_mul(iArr2, ge_p3.f192140X, iArr);
        fe_mul.fe_mul(iArr3, ge_p3.f192141Y, iArr);
        fe_tobytes.fe_tobytes(bArr, iArr3);
        bArr[31] = (byte) (bArr[31] ^ (fe_isnegative.fe_isnegative(iArr2) << 7));
    }
}
