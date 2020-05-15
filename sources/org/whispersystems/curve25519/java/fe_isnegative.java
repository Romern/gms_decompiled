package org.whispersystems.curve25519.java;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class fe_isnegative {
    public static int fe_isnegative(int[] iArr) {
        byte[] bArr = new byte[32];
        fe_tobytes.fe_tobytes(bArr, iArr);
        return bArr[0] & 1;
    }
}
