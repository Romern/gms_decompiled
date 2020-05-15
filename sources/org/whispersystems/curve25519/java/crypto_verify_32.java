package org.whispersystems.curve25519.java;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class crypto_verify_32 {
    public static int crypto_verify_32(byte[] bArr, byte[] bArr2) {
        byte b = 0;
        for (int i = 0; i < 32; i++) {
            b |= bArr[i] ^ bArr2[i];
        }
        return b;
    }
}
