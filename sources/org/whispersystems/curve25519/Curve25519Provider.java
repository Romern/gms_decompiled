package org.whispersystems.curve25519;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
interface Curve25519Provider {
    public static final int PRIVATE_KEY_LEN = 32;

    byte[] calculateAgreement(byte[] bArr, byte[] bArr2);

    byte[] calculateSignature(byte[] bArr, byte[] bArr2, byte[] bArr3);

    byte[] calculateVrfSignature(byte[] bArr, byte[] bArr2, byte[] bArr3);

    byte[] generatePrivateKey();

    byte[] generatePrivateKey(byte[] bArr);

    byte[] generatePublicKey(byte[] bArr);

    byte[] getRandom(int i);

    boolean isNative();

    void setRandomProvider(SecureRandomProvider secureRandomProvider);

    boolean verifySignature(byte[] bArr, byte[] bArr2, byte[] bArr3);

    byte[] verifyVrfSignature(byte[] bArr, byte[] bArr2, byte[] bArr3);
}
