package org.whispersystems.curve25519.java;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class sign_modified {
    static int crypto_sign_modified(Sha512 sha512, byte[] bArr, byte[] bArr2, long j, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        byte[] bArr6 = bArr;
        long j2 = j;
        byte[] bArr7 = bArr3;
        byte[] bArr8 = new byte[64];
        byte[] bArr9 = new byte[64];
        ge_p3 ge_p3 = new ge_p3();
        System.arraycopy(bArr2, 0, bArr6, 64, (int) j2);
        System.arraycopy(bArr7, 0, bArr6, 32, 32);
        bArr6[0] = -2;
        for (int i = 1; i < 32; i++) {
            bArr6[i] = -1;
        }
        long j3 = 64 + j2;
        System.arraycopy(bArr5, 0, bArr6, (int) j3, 64);
        sha512.calculateDigest(bArr8, bArr6, j2 + 128);
        System.arraycopy(bArr4, 0, bArr6, 32, 32);
        sc_reduce.sc_reduce(bArr8);
        ge_scalarmult_base.ge_scalarmult_base(ge_p3, bArr8);
        ge_p3_tobytes.ge_p3_tobytes(bArr6, ge_p3);
        sha512.calculateDigest(bArr9, bArr6, j3);
        sc_reduce.sc_reduce(bArr9);
        byte[] bArr10 = new byte[32];
        sc_muladd.sc_muladd(bArr10, bArr9, bArr7, bArr8);
        System.arraycopy(bArr10, 0, bArr6, 32, 32);
        return 0;
    }
}
