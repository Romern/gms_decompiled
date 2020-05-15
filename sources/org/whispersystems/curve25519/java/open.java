package org.whispersystems.curve25519.java;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class open {
    public static int crypto_sign_open(Sha512 sha512, byte[] bArr, long j, byte[] bArr2, long j2, byte[] bArr3) {
        Sha512 sha5122 = sha512;
        byte[] bArr4 = bArr;
        byte[] bArr5 = bArr2;
        long j3 = j2;
        byte[] bArr6 = bArr3;
        byte[] bArr7 = new byte[32];
        byte[] bArr8 = new byte[32];
        byte[] bArr9 = new byte[32];
        byte[] bArr10 = new byte[64];
        byte[] bArr11 = new byte[32];
        ge_p3 ge_p3 = new ge_p3();
        ge_p2 ge_p2 = new ge_p2();
        if (j3 < 64 || (bArr5[63] & 224) != 0 || ge_frombytes.ge_frombytes_negate_vartime(ge_p3, bArr6) != 0) {
            return -1;
        }
        sha5122.calculateDigest(new byte[64], bArr6, 32);
        System.arraycopy(bArr6, 0, bArr7, 0, 32);
        System.arraycopy(bArr5, 0, bArr8, 0, 32);
        System.arraycopy(bArr5, 32, bArr9, 0, 32);
        System.arraycopy(bArr5, 0, bArr4, 0, (int) j3);
        System.arraycopy(bArr7, 0, bArr4, 32, 32);
        sha5122.calculateDigest(bArr10, bArr4, j3);
        sc_reduce.sc_reduce(bArr10);
        ge_double_scalarmult.ge_double_scalarmult_vartime(ge_p2, bArr10, ge_p3, bArr9);
        ge_tobytes.ge_tobytes(bArr11, ge_p2);
        if (crypto_verify_32.crypto_verify_32(bArr11, bArr8) != 0) {
            return -1;
        }
        System.arraycopy(bArr4, 64, bArr4, 0, (int) (j3 - 64));
        return 0;
    }
}
