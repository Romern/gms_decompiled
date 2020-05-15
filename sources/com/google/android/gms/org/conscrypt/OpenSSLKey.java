package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.NativeRef;
import com.google.android.gms.org.conscrypt.OpenSSLX509CertificateFactory;
import java.io.InputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class OpenSSLKey {
    private final NativeRef.EVP_PKEY ctx;
    private final boolean wrapped;

    public OpenSSLKey(long j) {
        this(j, false);
    }

    static OpenSSLKey fromECPrivateKeyForTLSStackOnly(PrivateKey privateKey, ECParameterSpec eCParameterSpec) {
        OpenSSLKey openSSLKey = getOpenSSLKey(privateKey);
        return (openSSLKey == null && (openSSLKey = fromKeyMaterial(privateKey)) == null) ? OpenSSLECPrivateKey.wrapJCAPrivateKeyForTLSStackOnly(privateKey, eCParameterSpec) : openSSLKey;
    }

    private static OpenSSLKey fromKeyMaterial(PrivateKey privateKey) {
        byte[] encoded;
        if (!"PKCS#8".equals(privateKey.getFormat()) || (encoded = privateKey.getEncoded()) == null) {
            return null;
        }
        try {
            return new OpenSSLKey(NativeCrypto.EVP_parse_private_key(encoded));
        } catch (OpenSSLX509CertificateFactory.ParsingException e) {
            throw new InvalidKeyException(e);
        }
    }

    static OpenSSLKey fromPrivateKey(PrivateKey privateKey) {
        if (privateKey instanceof OpenSSLKeyHolder) {
            return ((OpenSSLKeyHolder) privateKey).getOpenSSLKey();
        }
        String format = privateKey.getFormat();
        if (format == null) {
            return wrapPrivateKey(privateKey);
        }
        if (!"PKCS#8".equals(privateKey.getFormat())) {
            throw new InvalidKeyException(format.length() == 0 ? new String("Unknown key format ") : "Unknown key format ".concat(format));
        } else if (privateKey.getEncoded() != null) {
            try {
                return new OpenSSLKey(NativeCrypto.EVP_parse_private_key(privateKey.getEncoded()));
            } catch (OpenSSLX509CertificateFactory.ParsingException e) {
                throw new InvalidKeyException(e);
            }
        } else {
            throw new InvalidKeyException("Key encoding is null");
        }
    }

    static OpenSSLKey fromPrivateKeyForTLSStackOnly(PrivateKey privateKey, PublicKey publicKey) {
        OpenSSLKey openSSLKey = getOpenSSLKey(privateKey);
        return (openSSLKey == null && (openSSLKey = fromKeyMaterial(privateKey)) == null) ? wrapJCAPrivateKeyForTLSStackOnly(privateKey, publicKey) : openSSLKey;
    }

    static OpenSSLKey fromPrivateKeyPemInputStream(InputStream inputStream) {
        OpenSSLBIOInputStream openSSLBIOInputStream = new OpenSSLBIOInputStream(inputStream, true);
        try {
            long PEM_read_bio_PrivateKey = NativeCrypto.PEM_read_bio_PrivateKey(openSSLBIOInputStream.getBioContext());
            if (PEM_read_bio_PrivateKey != 0) {
                OpenSSLKey openSSLKey = new OpenSSLKey(PEM_read_bio_PrivateKey);
                openSSLBIOInputStream.release();
                return openSSLKey;
            }
            openSSLBIOInputStream.release();
            return null;
        } catch (Exception e) {
            throw new InvalidKeyException(e);
        } catch (Throwable th) {
            openSSLBIOInputStream.release();
            throw th;
        }
    }

    static OpenSSLKey fromPublicKey(PublicKey publicKey) {
        if (publicKey instanceof OpenSSLKeyHolder) {
            return ((OpenSSLKeyHolder) publicKey).getOpenSSLKey();
        }
        if (!"X.509".equals(publicKey.getFormat())) {
            String valueOf = String.valueOf(publicKey.getFormat());
            throw new InvalidKeyException(valueOf.length() == 0 ? new String("Unknown key format ") : "Unknown key format ".concat(valueOf));
        } else if (publicKey.getEncoded() != null) {
            try {
                return new OpenSSLKey(NativeCrypto.EVP_parse_public_key(publicKey.getEncoded()));
            } catch (Exception e) {
                throw new InvalidKeyException(e);
            }
        } else {
            throw new InvalidKeyException("Key encoding is null");
        }
    }

    static OpenSSLKey fromPublicKeyPemInputStream(InputStream inputStream) {
        OpenSSLBIOInputStream openSSLBIOInputStream = new OpenSSLBIOInputStream(inputStream, true);
        try {
            long PEM_read_bio_PUBKEY = NativeCrypto.PEM_read_bio_PUBKEY(openSSLBIOInputStream.getBioContext());
            if (PEM_read_bio_PUBKEY != 0) {
                OpenSSLKey openSSLKey = new OpenSSLKey(PEM_read_bio_PUBKEY);
                openSSLBIOInputStream.release();
                return openSSLKey;
            }
            openSSLBIOInputStream.release();
            return null;
        } catch (Exception e) {
            throw new InvalidKeyException(e);
        } catch (Throwable th) {
            openSSLBIOInputStream.release();
            throw th;
        }
    }

    private static OpenSSLKey getOpenSSLKey(PrivateKey privateKey) {
        if (privateKey instanceof OpenSSLKeyHolder) {
            return ((OpenSSLKeyHolder) privateKey).getOpenSSLKey();
        }
        if ("RSA".equals(privateKey.getAlgorithm())) {
            Platform.wrapRsaKey(privateKey);
        }
        return null;
    }

    static PrivateKey getPrivateKey(PKCS8EncodedKeySpec pKCS8EncodedKeySpec, int i) {
        try {
            OpenSSLKey openSSLKey = new OpenSSLKey(NativeCrypto.EVP_parse_private_key(pKCS8EncodedKeySpec.getEncoded()));
            if (NativeCrypto.EVP_PKEY_type(openSSLKey.getNativeRef()) == i) {
                try {
                    return openSSLKey.getPrivateKey();
                } catch (NoSuchAlgorithmException e) {
                    throw new InvalidKeySpecException(e);
                }
            } else {
                throw new InvalidKeySpecException("Unexpected key type");
            }
        } catch (Exception e2) {
            throw new InvalidKeySpecException(e2);
        }
    }

    static PublicKey getPublicKey(X509EncodedKeySpec x509EncodedKeySpec, int i) {
        try {
            OpenSSLKey openSSLKey = new OpenSSLKey(NativeCrypto.EVP_parse_public_key(x509EncodedKeySpec.getEncoded()));
            if (NativeCrypto.EVP_PKEY_type(openSSLKey.getNativeRef()) == i) {
                try {
                    return openSSLKey.getPublicKey();
                } catch (NoSuchAlgorithmException e) {
                    throw new InvalidKeySpecException(e);
                }
            } else {
                throw new InvalidKeySpecException("Unexpected key type");
            }
        } catch (Exception e2) {
            throw new InvalidKeySpecException(e2);
        }
    }

    private static OpenSSLKey wrapJCAPrivateKeyForTLSStackOnly(PrivateKey privateKey, PublicKey publicKey) {
        String algorithm = privateKey.getAlgorithm();
        if ("RSA".equals(algorithm)) {
            return OpenSSLRSAPrivateKey.wrapJCAPrivateKeyForTLSStackOnly(privateKey, publicKey);
        }
        if ("EC".equals(algorithm)) {
            return OpenSSLECPrivateKey.wrapJCAPrivateKeyForTLSStackOnly(privateKey, publicKey);
        }
        String valueOf = String.valueOf(algorithm);
        throw new InvalidKeyException(valueOf.length() == 0 ? new String("Unsupported key algorithm: ") : "Unsupported key algorithm: ".concat(valueOf));
    }

    private static OpenSSLKey wrapPrivateKey(PrivateKey privateKey) {
        if (privateKey instanceof RSAPrivateKey) {
            return OpenSSLRSAPrivateKey.wrapPlatformKey((RSAPrivateKey) privateKey);
        }
        if (privateKey instanceof ECPrivateKey) {
            return OpenSSLECPrivateKey.wrapPlatformKey((ECPrivateKey) privateKey);
        }
        String valueOf = String.valueOf(privateKey.toString());
        throw new InvalidKeyException(valueOf.length() == 0 ? new String("Unknown key type: ") : "Unknown key type: ".concat(valueOf));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OpenSSLKey)) {
            return false;
        }
        OpenSSLKey openSSLKey = (OpenSSLKey) obj;
        return this.ctx.equals(openSSLKey.getNativeRef()) || NativeCrypto.EVP_PKEY_cmp(this.ctx, openSSLKey.getNativeRef()) == 1;
    }

    public NativeRef.EVP_PKEY getNativeRef() {
        return this.ctx;
    }

    public int hashCode() {
        return this.ctx.hashCode();
    }

    /* access modifiers changed from: package-private */
    public boolean isWrapped() {
        return this.wrapped;
    }

    public OpenSSLKey(long j, boolean z) {
        this.ctx = new NativeRef.EVP_PKEY(j);
        this.wrapped = z;
    }

    public PrivateKey getPrivateKey() {
        int EVP_PKEY_type = NativeCrypto.EVP_PKEY_type(this.ctx);
        if (EVP_PKEY_type == 6) {
            return new OpenSSLRSAPrivateKey(this);
        }
        if (EVP_PKEY_type == 408) {
            return new OpenSSLECPrivateKey(this);
        }
        throw new NoSuchAlgorithmException("unknown PKEY type");
    }

    public PublicKey getPublicKey() {
        int EVP_PKEY_type = NativeCrypto.EVP_PKEY_type(this.ctx);
        if (EVP_PKEY_type == 6) {
            return new OpenSSLRSAPublicKey(this);
        }
        if (EVP_PKEY_type == 408) {
            return new OpenSSLECPublicKey(this);
        }
        throw new NoSuchAlgorithmException("unknown PKEY type");
    }
}
