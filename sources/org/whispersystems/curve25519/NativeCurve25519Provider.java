package org.whispersystems.curve25519;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class NativeCurve25519Provider implements Curve25519Provider {
    private static Throwable libraryFailedException;
    private static boolean libraryPresent;
    private SecureRandomProvider secureRandomProvider = new JCESecureRandomProvider();

    static {
        libraryPresent = false;
        libraryFailedException = null;
        try {
            System.loadLibrary("curve25519");
            libraryPresent = true;
        } catch (SecurityException | UnsatisfiedLinkError e) {
            libraryPresent = false;
            libraryFailedException = e;
        }
    }

    public NativeCurve25519Provider() {
        if (libraryPresent) {
            try {
                smokeCheck(31337);
            } catch (UnsatisfiedLinkError e) {
                throw new NoSuchProviderException(e);
            }
        } else {
            throw new NoSuchProviderException(libraryFailedException);
        }
    }

    private native boolean smokeCheck(int i);

    public native byte[] calculateAgreement(byte[] bArr, byte[] bArr2);

    public native byte[] calculateSignature(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native byte[] calculateVrfSignature(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public byte[] generatePrivateKey() {
        return generatePrivateKey(getRandom(32));
    }

    public native byte[] generatePrivateKey(byte[] bArr);

    public native byte[] generatePublicKey(byte[] bArr);

    public byte[] getRandom(int i) {
        byte[] bArr = new byte[i];
        this.secureRandomProvider.nextBytes(bArr);
        return bArr;
    }

    public boolean isNative() {
        return true;
    }

    public void setRandomProvider(SecureRandomProvider secureRandomProvider2) {
        this.secureRandomProvider = secureRandomProvider2;
    }

    public native boolean verifySignature(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native byte[] verifyVrfSignature(byte[] bArr, byte[] bArr2, byte[] bArr3);
}
