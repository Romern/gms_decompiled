package org.whispersystems.curve25519;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OpportunisticCurve25519Provider implements Curve25519Provider {
    private Curve25519Provider delegate;

    OpportunisticCurve25519Provider() {
        try {
            this.delegate = new NativeCurve25519Provider();
        } catch (NoSuchProviderException e) {
            this.delegate = new JavaCurve25519Provider();
        }
    }

    public byte[] calculateAgreement(byte[] bArr, byte[] bArr2) {
        return this.delegate.calculateAgreement(bArr, bArr2);
    }

    public byte[] calculateSignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.delegate.calculateSignature(bArr, bArr2, bArr3);
    }

    public byte[] calculateVrfSignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.delegate.calculateVrfSignature(bArr, bArr2, bArr3);
    }

    public byte[] generatePrivateKey() {
        return this.delegate.generatePrivateKey();
    }

    public byte[] generatePublicKey(byte[] bArr) {
        return this.delegate.generatePublicKey(bArr);
    }

    public byte[] getRandom(int i) {
        return this.delegate.getRandom(i);
    }

    public boolean isNative() {
        return this.delegate.isNative();
    }

    public void setRandomProvider(SecureRandomProvider secureRandomProvider) {
        this.delegate.setRandomProvider(secureRandomProvider);
    }

    public boolean verifySignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.delegate.verifySignature(bArr, bArr2, bArr3);
    }

    public byte[] verifyVrfSignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.delegate.verifyVrfSignature(bArr, bArr2, bArr3);
    }

    public byte[] generatePrivateKey(byte[] bArr) {
        return this.delegate.generatePrivateKey(bArr);
    }
}
