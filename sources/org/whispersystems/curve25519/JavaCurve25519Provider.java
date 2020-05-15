package org.whispersystems.curve25519;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class JavaCurve25519Provider extends BaseJavaCurve25519Provider {
    protected JavaCurve25519Provider() {
        super(new JCESha512Provider(), new JCESecureRandomProvider());
    }

    public /* bridge */ /* synthetic */ byte[] calculateAgreement(byte[] bArr, byte[] bArr2) {
        return super.calculateAgreement(bArr, bArr2);
    }

    public /* bridge */ /* synthetic */ byte[] calculateSignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return super.calculateSignature(bArr, bArr2, bArr3);
    }

    public /* bridge */ /* synthetic */ byte[] calculateVrfSignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return super.calculateVrfSignature(bArr, bArr2, bArr3);
    }

    public /* bridge */ /* synthetic */ byte[] generatePrivateKey() {
        return super.generatePrivateKey();
    }

    public /* bridge */ /* synthetic */ byte[] generatePublicKey(byte[] bArr) {
        return super.generatePublicKey(bArr);
    }

    public /* bridge */ /* synthetic */ byte[] getRandom(int i) {
        return super.getRandom(i);
    }

    public boolean isNative() {
        return false;
    }

    public /* bridge */ /* synthetic */ void setRandomProvider(SecureRandomProvider secureRandomProvider) {
        super.setRandomProvider(secureRandomProvider);
    }

    public /* bridge */ /* synthetic */ boolean verifySignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return super.verifySignature(bArr, bArr2, bArr3);
    }

    public /* bridge */ /* synthetic */ byte[] verifyVrfSignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return super.verifyVrfSignature(bArr, bArr2, bArr3);
    }

    public /* bridge */ /* synthetic */ byte[] generatePrivateKey(byte[] bArr) {
        return super.generatePrivateKey(bArr);
    }
}
