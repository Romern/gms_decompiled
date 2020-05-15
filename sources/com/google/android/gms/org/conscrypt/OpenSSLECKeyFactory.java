package com.google.android.gms.org.conscrypt;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class OpenSSLECKeyFactory extends KeyFactorySpi {
    /* access modifiers changed from: protected */
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec == null) {
            throw new InvalidKeySpecException("keySpec == null");
        } else if (keySpec instanceof ECPrivateKeySpec) {
            return new OpenSSLECPrivateKey((ECPrivateKeySpec) keySpec);
        } else {
            if (keySpec instanceof PKCS8EncodedKeySpec) {
                return OpenSSLKey.getPrivateKey((PKCS8EncodedKeySpec) keySpec, 408);
            }
            String valueOf = String.valueOf(keySpec.getClass().getName());
            throw new InvalidKeySpecException(valueOf.length() == 0 ? new String("Must use ECPrivateKeySpec or PKCS8EncodedKeySpec; was ") : "Must use ECPrivateKeySpec or PKCS8EncodedKeySpec; was ".concat(valueOf));
        }
    }

    /* access modifiers changed from: protected */
    public PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (keySpec == null) {
            throw new InvalidKeySpecException("keySpec == null");
        } else if (keySpec instanceof ECPublicKeySpec) {
            return new OpenSSLECPublicKey((ECPublicKeySpec) keySpec);
        } else {
            if (keySpec instanceof X509EncodedKeySpec) {
                return OpenSSLKey.getPublicKey((X509EncodedKeySpec) keySpec, 408);
            }
            String valueOf = String.valueOf(keySpec.getClass().getName());
            throw new InvalidKeySpecException(valueOf.length() == 0 ? new String("Must use ECPublicKeySpec or X509EncodedKeySpec; was ") : "Must use ECPublicKeySpec or X509EncodedKeySpec; was ".concat(valueOf));
        }
    }

    /* access modifiers changed from: protected */
    public KeySpec engineGetKeySpec(Key key, Class cls) {
        if (key == null) {
            throw new InvalidKeySpecException("key == null");
        } else if (cls == null) {
            throw new InvalidKeySpecException("keySpec == null");
        } else if (!"EC".equals(key.getAlgorithm())) {
            throw new InvalidKeySpecException("Key must be an EC key");
        } else if (!(key instanceof ECPublicKey) || !ECPublicKeySpec.class.isAssignableFrom(cls)) {
            boolean z = key instanceof PublicKey;
            if (z && ECPublicKeySpec.class.isAssignableFrom(cls)) {
                byte[] encoded = key.getEncoded();
                if (!"X.509".equals(key.getFormat()) || encoded == null) {
                    throw new InvalidKeySpecException("Not a valid X.509 encoding");
                }
                ECPublicKey eCPublicKey = (ECPublicKey) engineGeneratePublic(new X509EncodedKeySpec(encoded));
                return new ECPublicKeySpec(eCPublicKey.getW(), eCPublicKey.getParams());
            } else if (!(key instanceof ECPrivateKey) || !ECPrivateKeySpec.class.isAssignableFrom(cls)) {
                if (key instanceof PrivateKey) {
                    if (ECPrivateKeySpec.class.isAssignableFrom(cls)) {
                        byte[] encoded2 = key.getEncoded();
                        if (!"PKCS#8".equals(key.getFormat()) || encoded2 == null) {
                            throw new InvalidKeySpecException("Not a valid PKCS#8 encoding");
                        }
                        ECPrivateKey eCPrivateKey = (ECPrivateKey) engineGeneratePrivate(new PKCS8EncodedKeySpec(encoded2));
                        return new ECPrivateKeySpec(eCPrivateKey.getS(), eCPrivateKey.getParams());
                    } else if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                        byte[] encoded3 = key.getEncoded();
                        if (!"PKCS#8".equals(key.getFormat())) {
                            String valueOf = String.valueOf(key.getFormat());
                            throw new InvalidKeySpecException(valueOf.length() == 0 ? new String("Encoding type must be PKCS#8; was ") : "Encoding type must be PKCS#8; was ".concat(valueOf));
                        } else if (encoded3 != null) {
                            return new PKCS8EncodedKeySpec(encoded3);
                        } else {
                            throw new InvalidKeySpecException("Key is not encodable");
                        }
                    }
                }
                if (!z || !X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                    String name = key.getClass().getName();
                    String name2 = cls.getName();
                    StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 61 + String.valueOf(name2).length());
                    sb.append("Unsupported key type and key spec combination; key=");
                    sb.append(name);
                    sb.append(", keySpec=");
                    sb.append(name2);
                    throw new InvalidKeySpecException(sb.toString());
                }
                byte[] encoded4 = key.getEncoded();
                if (!"X.509".equals(key.getFormat())) {
                    String valueOf2 = String.valueOf(key.getFormat());
                    throw new InvalidKeySpecException(valueOf2.length() == 0 ? new String("Encoding type must be X.509; was ") : "Encoding type must be X.509; was ".concat(valueOf2));
                } else if (encoded4 != null) {
                    return new X509EncodedKeySpec(encoded4);
                } else {
                    throw new InvalidKeySpecException("Key is not encodable");
                }
            } else {
                ECPrivateKey eCPrivateKey2 = (ECPrivateKey) key;
                return new ECPrivateKeySpec(eCPrivateKey2.getS(), eCPrivateKey2.getParams());
            }
        } else {
            ECPublicKey eCPublicKey2 = (ECPublicKey) key;
            return new ECPublicKeySpec(eCPublicKey2.getW(), eCPublicKey2.getParams());
        }
    }

    /* access modifiers changed from: protected */
    public Key engineTranslateKey(Key key) {
        if (key == null) {
            throw new InvalidKeyException("key == null");
        } else if ((key instanceof OpenSSLECPublicKey) || (key instanceof OpenSSLECPrivateKey)) {
            return key;
        } else {
            if (key instanceof ECPublicKey) {
                ECPublicKey eCPublicKey = (ECPublicKey) key;
                try {
                    return engineGeneratePublic(new ECPublicKeySpec(eCPublicKey.getW(), eCPublicKey.getParams()));
                } catch (InvalidKeySpecException e) {
                    throw new InvalidKeyException(e);
                }
            } else if (key instanceof ECPrivateKey) {
                ECPrivateKey eCPrivateKey = (ECPrivateKey) key;
                try {
                    return engineGeneratePrivate(new ECPrivateKeySpec(eCPrivateKey.getS(), eCPrivateKey.getParams()));
                } catch (InvalidKeySpecException e2) {
                    throw new InvalidKeyException(e2);
                }
            } else if ((key instanceof PrivateKey) && "PKCS#8".equals(key.getFormat())) {
                byte[] encoded = key.getEncoded();
                if (encoded != null) {
                    try {
                        return engineGeneratePrivate(new PKCS8EncodedKeySpec(encoded));
                    } catch (InvalidKeySpecException e3) {
                        throw new InvalidKeyException(e3);
                    }
                } else {
                    throw new InvalidKeyException("Key does not support encoding");
                }
            } else if (!(key instanceof PublicKey) || !"X.509".equals(key.getFormat())) {
                String valueOf = String.valueOf(key.getClass().getName());
                throw new InvalidKeyException(valueOf.length() == 0 ? new String("Key must be EC public or private key; was ") : "Key must be EC public or private key; was ".concat(valueOf));
            } else {
                byte[] encoded2 = key.getEncoded();
                if (encoded2 != null) {
                    try {
                        return engineGeneratePublic(new X509EncodedKeySpec(encoded2));
                    } catch (InvalidKeySpecException e4) {
                        throw new InvalidKeyException(e4);
                    }
                } else {
                    throw new InvalidKeyException("Key does not support encoding");
                }
            }
        }
    }
}
