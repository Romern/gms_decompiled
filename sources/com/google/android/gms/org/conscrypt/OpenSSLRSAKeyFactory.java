package com.google.android.gms.org.conscrypt;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.security.spec.X509EncodedKeySpec;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class OpenSSLRSAKeyFactory extends KeyFactorySpi {
    /* access modifiers changed from: protected */
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec == null) {
            throw new InvalidKeySpecException("keySpec == null");
        } else if (keySpec instanceof RSAPrivateCrtKeySpec) {
            return new OpenSSLRSAPrivateCrtKey((RSAPrivateCrtKeySpec) keySpec);
        } else {
            if (keySpec instanceof RSAPrivateKeySpec) {
                return new OpenSSLRSAPrivateKey((RSAPrivateKeySpec) keySpec);
            }
            if (keySpec instanceof PKCS8EncodedKeySpec) {
                return OpenSSLKey.getPrivateKey((PKCS8EncodedKeySpec) keySpec, 6);
            }
            String valueOf = String.valueOf(keySpec.getClass().getName());
            throw new InvalidKeySpecException(valueOf.length() == 0 ? new String("Must use RSAPublicKeySpec or PKCS8EncodedKeySpec; was ") : "Must use RSAPublicKeySpec or PKCS8EncodedKeySpec; was ".concat(valueOf));
        }
    }

    /* access modifiers changed from: protected */
    public PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (keySpec == null) {
            throw new InvalidKeySpecException("keySpec == null");
        } else if (keySpec instanceof RSAPublicKeySpec) {
            return new OpenSSLRSAPublicKey((RSAPublicKeySpec) keySpec);
        } else {
            if (keySpec instanceof X509EncodedKeySpec) {
                return OpenSSLKey.getPublicKey((X509EncodedKeySpec) keySpec, 6);
            }
            String valueOf = String.valueOf(keySpec.getClass().getName());
            throw new InvalidKeySpecException(valueOf.length() == 0 ? new String("Must use RSAPublicKeySpec or X509EncodedKeySpec; was ") : "Must use RSAPublicKeySpec or X509EncodedKeySpec; was ".concat(valueOf));
        }
    }

    /* access modifiers changed from: protected */
    public KeySpec engineGetKeySpec(Key key, Class cls) {
        if (key == null) {
            throw new InvalidKeySpecException("key == null");
        } else if (cls == null) {
            throw new InvalidKeySpecException("keySpec == null");
        } else if (!"RSA".equals(key.getAlgorithm())) {
            throw new InvalidKeySpecException("Key must be a RSA key");
        } else if (!(key instanceof RSAPublicKey) || !RSAPublicKeySpec.class.isAssignableFrom(cls)) {
            boolean z = key instanceof PublicKey;
            if (!z || !RSAPublicKeySpec.class.isAssignableFrom(cls)) {
                if (key instanceof RSAPrivateCrtKey) {
                    if (RSAPrivateCrtKeySpec.class.isAssignableFrom(cls)) {
                        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) key;
                        return new RSAPrivateCrtKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent(), rSAPrivateCrtKey.getPrivateExponent(), rSAPrivateCrtKey.getPrimeP(), rSAPrivateCrtKey.getPrimeQ(), rSAPrivateCrtKey.getPrimeExponentP(), rSAPrivateCrtKey.getPrimeExponentQ(), rSAPrivateCrtKey.getCrtCoefficient());
                    } else if (RSAPrivateKeySpec.class.isAssignableFrom(cls)) {
                        RSAPrivateCrtKey rSAPrivateCrtKey2 = (RSAPrivateCrtKey) key;
                        return new RSAPrivateKeySpec(rSAPrivateCrtKey2.getModulus(), rSAPrivateCrtKey2.getPrivateExponent());
                    }
                }
                if (!(key instanceof RSAPrivateKey) || !RSAPrivateKeySpec.class.isAssignableFrom(cls)) {
                    boolean z2 = key instanceof PrivateKey;
                    if (z2 && RSAPrivateCrtKeySpec.class.isAssignableFrom(cls)) {
                        byte[] encoded = key.getEncoded();
                        if (!"PKCS#8".equals(key.getFormat()) || encoded == null) {
                            throw new InvalidKeySpecException("Not a valid PKCS#8 encoding");
                        }
                        RSAPrivateKey rSAPrivateKey = (RSAPrivateKey) engineGeneratePrivate(new PKCS8EncodedKeySpec(encoded));
                        if (rSAPrivateKey instanceof RSAPrivateCrtKey) {
                            RSAPrivateCrtKey rSAPrivateCrtKey3 = (RSAPrivateCrtKey) rSAPrivateKey;
                            return new RSAPrivateCrtKeySpec(rSAPrivateCrtKey3.getModulus(), rSAPrivateCrtKey3.getPublicExponent(), rSAPrivateCrtKey3.getPrivateExponent(), rSAPrivateCrtKey3.getPrimeP(), rSAPrivateCrtKey3.getPrimeQ(), rSAPrivateCrtKey3.getPrimeExponentP(), rSAPrivateCrtKey3.getPrimeExponentQ(), rSAPrivateCrtKey3.getCrtCoefficient());
                        }
                        throw new InvalidKeySpecException("Encoded key is not an RSAPrivateCrtKey");
                    } else if (z2 && RSAPrivateKeySpec.class.isAssignableFrom(cls)) {
                        byte[] encoded2 = key.getEncoded();
                        if (!"PKCS#8".equals(key.getFormat()) || encoded2 == null) {
                            throw new InvalidKeySpecException("Not a valid PKCS#8 encoding");
                        }
                        RSAPrivateKey rSAPrivateKey2 = (RSAPrivateKey) engineGeneratePrivate(new PKCS8EncodedKeySpec(encoded2));
                        return new RSAPrivateKeySpec(rSAPrivateKey2.getModulus(), rSAPrivateKey2.getPrivateExponent());
                    } else if (z2 && PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        byte[] encoded3 = key.getEncoded();
                        if (!"PKCS#8".equals(key.getFormat())) {
                            String valueOf = String.valueOf(key.getFormat());
                            throw new InvalidKeySpecException(valueOf.length() == 0 ? new String("Encoding type must be PKCS#8; was ") : "Encoding type must be PKCS#8; was ".concat(valueOf));
                        } else if (encoded3 != null) {
                            return new PKCS8EncodedKeySpec(encoded3);
                        } else {
                            throw new InvalidKeySpecException("Key is not encodable");
                        }
                    } else if (!z || !X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                        String name = key.getClass().getName();
                        String name2 = cls.getName();
                        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 61 + String.valueOf(name2).length());
                        sb.append("Unsupported key type and key spec combination; key=");
                        sb.append(name);
                        sb.append(", keySpec=");
                        sb.append(name2);
                        throw new InvalidKeySpecException(sb.toString());
                    } else {
                        byte[] encoded4 = key.getEncoded();
                        if (!"X.509".equals(key.getFormat())) {
                            String valueOf2 = String.valueOf(key.getFormat());
                            throw new InvalidKeySpecException(valueOf2.length() == 0 ? new String("Encoding type must be X.509; was ") : "Encoding type must be X.509; was ".concat(valueOf2));
                        } else if (encoded4 != null) {
                            return new X509EncodedKeySpec(encoded4);
                        } else {
                            throw new InvalidKeySpecException("Key is not encodable");
                        }
                    }
                } else {
                    RSAPrivateKey rSAPrivateKey3 = (RSAPrivateKey) key;
                    return new RSAPrivateKeySpec(rSAPrivateKey3.getModulus(), rSAPrivateKey3.getPrivateExponent());
                }
            } else {
                byte[] encoded5 = key.getEncoded();
                if (!"X.509".equals(key.getFormat()) || encoded5 == null) {
                    throw new InvalidKeySpecException("Not a valid X.509 encoding");
                }
                RSAPublicKey rSAPublicKey = (RSAPublicKey) engineGeneratePublic(new X509EncodedKeySpec(encoded5));
                return new RSAPublicKeySpec(rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent());
            }
        } else {
            RSAPublicKey rSAPublicKey2 = (RSAPublicKey) key;
            return new RSAPublicKeySpec(rSAPublicKey2.getModulus(), rSAPublicKey2.getPublicExponent());
        }
    }

    /* access modifiers changed from: protected */
    public Key engineTranslateKey(Key key) {
        if (key == null) {
            throw new InvalidKeyException("key == null");
        } else if ((key instanceof OpenSSLRSAPublicKey) || (key instanceof OpenSSLRSAPrivateKey)) {
            return key;
        } else {
            if (key instanceof RSAPublicKey) {
                RSAPublicKey rSAPublicKey = (RSAPublicKey) key;
                try {
                    return engineGeneratePublic(new RSAPublicKeySpec(rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent()));
                } catch (InvalidKeySpecException e) {
                    throw new InvalidKeyException(e);
                }
            } else if (key instanceof RSAPrivateCrtKey) {
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) key;
                try {
                    return engineGeneratePrivate(new RSAPrivateCrtKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent(), rSAPrivateCrtKey.getPrivateExponent(), rSAPrivateCrtKey.getPrimeP(), rSAPrivateCrtKey.getPrimeQ(), rSAPrivateCrtKey.getPrimeExponentP(), rSAPrivateCrtKey.getPrimeExponentQ(), rSAPrivateCrtKey.getCrtCoefficient()));
                } catch (InvalidKeySpecException e2) {
                    throw new InvalidKeyException(e2);
                }
            } else if (key instanceof RSAPrivateKey) {
                RSAPrivateKey rSAPrivateKey = (RSAPrivateKey) key;
                try {
                    return engineGeneratePrivate(new RSAPrivateKeySpec(rSAPrivateKey.getModulus(), rSAPrivateKey.getPrivateExponent()));
                } catch (InvalidKeySpecException e3) {
                    throw new InvalidKeyException(e3);
                }
            } else if ((key instanceof PrivateKey) && "PKCS#8".equals(key.getFormat())) {
                byte[] encoded = key.getEncoded();
                if (encoded != null) {
                    try {
                        return engineGeneratePrivate(new PKCS8EncodedKeySpec(encoded));
                    } catch (InvalidKeySpecException e4) {
                        throw new InvalidKeyException(e4);
                    }
                } else {
                    throw new InvalidKeyException("Key does not support encoding");
                }
            } else if (!(key instanceof PublicKey) || !"X.509".equals(key.getFormat())) {
                String valueOf = String.valueOf(key.getClass().getName());
                throw new InvalidKeyException(valueOf.length() == 0 ? new String("Key must be an RSA public or private key; was ") : "Key must be an RSA public or private key; was ".concat(valueOf));
            } else {
                byte[] encoded2 = key.getEncoded();
                if (encoded2 != null) {
                    try {
                        return engineGeneratePublic(new X509EncodedKeySpec(encoded2));
                    } catch (InvalidKeySpecException e5) {
                        throw new InvalidKeyException(e5);
                    }
                } else {
                    throw new InvalidKeyException("Key does not support encoding");
                }
            }
        }
    }
}
