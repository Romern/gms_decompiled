package org.whispersystems.curve25519;

import org.whispersystems.curve25519.java.Sha512;
import org.whispersystems.curve25519.java.curve_sigs;
import org.whispersystems.curve25519.java.scalarmult;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class BaseJavaCurve25519Provider implements Curve25519Provider {
    private SecureRandomProvider secureRandomProvider;
    private final Sha512 sha512provider;

    protected BaseJavaCurve25519Provider(Sha512 sha512, SecureRandomProvider secureRandomProvider2) {
        this.sha512provider = sha512;
        this.secureRandomProvider = secureRandomProvider2;
    }

    public byte[] calculateAgreement(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[32];
        scalarmult.crypto_scalarmult(bArr3, bArr, bArr2);
        return bArr3;
    }

    public byte[] calculateSignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[64];
        curve_sigs.curve25519_sign(this.sha512provider, bArr4, bArr2, bArr3, bArr3.length, bArr);
        return bArr4;
    }

    public byte[] calculateVrfSignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        throw new AssertionError("NYI");
    }

    public byte[] generatePrivateKey() {
        return generatePrivateKey(getRandom(32));
    }

    public byte[] generatePublicKey(byte[] bArr) {
        byte[] bArr2 = new byte[32];
        curve_sigs.curve25519_keygen(bArr2, bArr);
        return bArr2;
    }

    public byte[] getRandom(int i) {
        byte[] bArr = new byte[i];
        this.secureRandomProvider.nextBytes(bArr);
        return bArr;
    }

    public abstract boolean isNative();

    public void setRandomProvider(SecureRandomProvider secureRandomProvider2) {
        this.secureRandomProvider = secureRandomProvider2;
    }

    public boolean verifySignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return curve_sigs.curve25519_verify(this.sha512provider, bArr3, bArr, bArr2, bArr2.length) == 0;
    }

    public byte[] verifyVrfSignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        throw new AssertionError("NYI");
    }

    public byte[] generatePrivateKey(byte[] bArr) {
        byte[] bArr2 = new byte[32];
        System.arraycopy(bArr, 0, bArr2, 0, 32);
        bArr2[0] = (byte) (bArr2[0] & 248);
        bArr2[31] = (byte) ((bArr2[31] & Byte.MAX_VALUE) | 64);
        return bArr2;
    }
}
