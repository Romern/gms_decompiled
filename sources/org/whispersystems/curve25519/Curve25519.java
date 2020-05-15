package org.whispersystems.curve25519;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Curve25519 {
    public static final String BEST = "best";
    public static final String J2ME = "j2me";
    public static final String JAVA = "java";
    public static final String NATIVE = "native";
    private final Curve25519Provider provider;

    private Curve25519(Curve25519Provider curve25519Provider) {
        this.provider = curve25519Provider;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    private static Curve25519Provider constructClass(String str, SecureRandomProvider secureRandomProvider) {
        Class<?> cls;
        try {
            char c = 65535;
            switch (str.hashCode()) {
                case -1052618729:
                    if (str.equals(NATIVE)) {
                        c = 0;
                        break;
                    }
                    break;
                case 3020260:
                    if (!str.equals(BEST)) {
                        break;
                    } else {
                        c = 3;
                        break;
                    }
                case 3209376:
                    if (str.equals(J2ME)) {
                        c = 2;
                        break;
                    }
                    break;
                case 3254818:
                    if (str.equals(JAVA)) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                cls = Class.forName("org.whispersystems.curve25519.NativeCurve25519Provider");
            } else if (c == 1) {
                cls = Class.forName("org.whispersystems.curve25519.JavaCurve25519Provider");
            } else if (c == 2) {
                cls = Class.forName("org.whispersystems.curve25519.J2meCurve25519Provider");
            } else if (c == 3) {
                cls = Class.forName("org.whispersystems.curve25519.OpportunisticCurve25519Provider");
            } else {
                throw new NoSuchProviderException("No such provider");
            }
            Curve25519Provider curve25519Provider = (Curve25519Provider) cls.newInstance();
            if (secureRandomProvider != null) {
                curve25519Provider.setRandomProvider(secureRandomProvider);
            }
            return curve25519Provider;
        } catch (InstantiationException e) {
            throw new NoSuchProviderException(e);
        } catch (IllegalAccessException e2) {
            throw new NoSuchProviderException(e2);
        } catch (ClassNotFoundException e3) {
            throw new NoSuchProviderException(e3);
        }
    }

    private static Curve25519Provider constructJ2meProvider(SecureRandomProvider secureRandomProvider) {
        return constructClass(J2ME, secureRandomProvider);
    }

    private static Curve25519Provider constructJavaProvider(SecureRandomProvider secureRandomProvider) {
        return constructClass(JAVA, secureRandomProvider);
    }

    private static Curve25519Provider constructNativeProvider(SecureRandomProvider secureRandomProvider) {
        return constructClass(NATIVE, secureRandomProvider);
    }

    private static Curve25519Provider constructOpportunisticProvider(SecureRandomProvider secureRandomProvider) {
        return constructClass(BEST, secureRandomProvider);
    }

    public static Curve25519 getInstance(String str) {
        return getInstance(str, null);
    }

    public byte[] calculateAgreement(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            throw new IllegalArgumentException("Keys must not be null!");
        } else if (bArr.length == 32 && bArr2.length == 32) {
            return this.provider.calculateAgreement(bArr2, bArr);
        } else {
            throw new IllegalArgumentException("Keys must be 32 bytes!");
        }
    }

    public byte[] calculateSignature(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 32) {
            throw new IllegalArgumentException("Invalid private key length!");
        }
        return this.provider.calculateSignature(this.provider.getRandom(64), bArr, bArr2);
    }

    public byte[] calculateVrfSignature(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 32) {
            throw new IllegalArgumentException("Invalid private key!");
        }
        return this.provider.calculateVrfSignature(this.provider.getRandom(64), bArr, bArr2);
    }

    public Curve25519KeyPair generateKeyPair() {
        byte[] generatePrivateKey = this.provider.generatePrivateKey();
        return new Curve25519KeyPair(this.provider.generatePublicKey(generatePrivateKey), generatePrivateKey);
    }

    public boolean isNative() {
        return this.provider.isNative();
    }

    public boolean verifySignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr.length != 32) {
            throw new IllegalArgumentException("Invalid public key!");
        } else if (bArr2 == null || bArr3 == null || bArr3.length != 64) {
            return false;
        } else {
            return this.provider.verifySignature(bArr, bArr2, bArr3);
        }
    }

    public byte[] verifyVrfSignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr.length != 32) {
            throw new IllegalArgumentException("Invalid public key!");
        } else if (bArr2 != null && bArr3 != null && bArr3.length == 96) {
            return this.provider.verifyVrfSignature(bArr, bArr2, bArr3);
        } else {
            throw new VrfSignatureVerificationFailedException("Invalid message or signature format");
        }
    }

    public static Curve25519 getInstance(String str, SecureRandomProvider secureRandomProvider) {
        if (NATIVE.equals(str)) {
            return new Curve25519(constructNativeProvider(secureRandomProvider));
        }
        if (JAVA.equals(str)) {
            return new Curve25519(constructJavaProvider(secureRandomProvider));
        }
        if (J2ME.equals(str)) {
            return new Curve25519(constructJ2meProvider(secureRandomProvider));
        }
        if (BEST.equals(str)) {
            return new Curve25519(constructOpportunisticProvider(secureRandomProvider));
        }
        throw new NoSuchProviderException(str);
    }
}
