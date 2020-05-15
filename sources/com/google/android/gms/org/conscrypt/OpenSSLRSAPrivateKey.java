package com.google.android.gms.org.conscrypt;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPrivateKeySpec;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class OpenSSLRSAPrivateKey implements RSAPrivateKey, OpenSSLKeyHolder {
    private static final long serialVersionUID = 4872170254439578735L;
    transient boolean fetchedParams;
    transient OpenSSLKey key;
    BigInteger modulus;
    BigInteger privateExponent;

    public OpenSSLRSAPrivateKey(OpenSSLKey openSSLKey) {
        this.key = openSSLKey;
    }

    static OpenSSLKey getInstance(RSAPrivateKey rSAPrivateKey) {
        if (rSAPrivateKey.getFormat() == null) {
            return wrapPlatformKey(rSAPrivateKey);
        }
        BigInteger modulus2 = rSAPrivateKey.getModulus();
        BigInteger privateExponent2 = rSAPrivateKey.getPrivateExponent();
        if (modulus2 == null) {
            throw new InvalidKeyException("modulus == null");
        } else if (privateExponent2 != null) {
            try {
                return new OpenSSLKey(NativeCrypto.EVP_PKEY_new_RSA(modulus2.toByteArray(), null, privateExponent2.toByteArray(), null, null, null, null, null));
            } catch (Exception e) {
                throw new InvalidKeyException(e);
            }
        } else {
            throw new InvalidKeyException("privateExponent == null");
        }
    }

    private static OpenSSLKey init(RSAPrivateKeySpec rSAPrivateKeySpec) {
        BigInteger modulus2 = rSAPrivateKeySpec.getModulus();
        BigInteger privateExponent2 = rSAPrivateKeySpec.getPrivateExponent();
        if (modulus2 == null) {
            throw new InvalidKeySpecException("modulus == null");
        } else if (privateExponent2 != null) {
            try {
                return new OpenSSLKey(NativeCrypto.EVP_PKEY_new_RSA(modulus2.toByteArray(), null, privateExponent2.toByteArray(), null, null, null, null, null));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e);
            }
        } else {
            throw new InvalidKeySpecException("privateExponent == null");
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.key = new OpenSSLKey(NativeCrypto.EVP_PKEY_new_RSA(this.modulus.toByteArray(), null, this.privateExponent.toByteArray(), null, null, null, null, null));
        this.fetchedParams = true;
    }

    static OpenSSLKey wrapJCAPrivateKeyForTLSStackOnly(PrivateKey privateKey, PublicKey publicKey) {
        BigInteger modulus2 = privateKey instanceof RSAKey ? ((RSAKey) privateKey).getModulus() : publicKey instanceof RSAKey ? ((RSAKey) publicKey).getModulus() : null;
        if (modulus2 != null) {
            return new OpenSSLKey(NativeCrypto.getRSAPrivateKeyWrapper(privateKey, modulus2.toByteArray()), true);
        }
        String valueOf = String.valueOf(privateKey);
        String valueOf2 = String.valueOf(publicKey);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46 + String.valueOf(valueOf2).length());
        sb.append("RSA modulus not available. Private: ");
        sb.append(valueOf);
        sb.append(", public: ");
        sb.append(valueOf2);
        throw new InvalidKeyException(sb.toString());
    }

    static OpenSSLKey wrapPlatformKey(RSAPrivateKey rSAPrivateKey) {
        Platform.wrapRsaKey(rSAPrivateKey);
        return new OpenSSLKey(NativeCrypto.getRSAPrivateKeyWrapper(rSAPrivateKey, rSAPrivateKey.getModulus().toByteArray()), true);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        ensureReadParams();
        objectOutputStream.defaultWriteObject();
    }

    /* access modifiers changed from: package-private */
    public final synchronized void ensureReadParams() {
        if (!this.fetchedParams) {
            readParams(NativeCrypto.get_RSA_private_params(this.key.getNativeRef()));
            this.fetchedParams = true;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OpenSSLRSAPrivateKey) {
            return this.key.equals(((OpenSSLRSAPrivateKey) obj).getOpenSSLKey());
        }
        if (obj instanceof RSAPrivateKey) {
            ensureReadParams();
            RSAPrivateKey rSAPrivateKey = (RSAPrivateKey) obj;
            if (!this.modulus.equals(rSAPrivateKey.getModulus()) || !this.privateExponent.equals(rSAPrivateKey.getPrivateExponent())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String getAlgorithm() {
        return "RSA";
    }

    public final byte[] getEncoded() {
        return NativeCrypto.EVP_marshal_private_key(this.key.getNativeRef());
    }

    public final String getFormat() {
        return "PKCS#8";
    }

    public final BigInteger getModulus() {
        ensureReadParams();
        return this.modulus;
    }

    public OpenSSLKey getOpenSSLKey() {
        return this.key;
    }

    public final BigInteger getPrivateExponent() {
        ensureReadParams();
        return this.privateExponent;
    }

    public int hashCode() {
        ensureReadParams();
        int hashCode = this.modulus.hashCode() + 3;
        BigInteger bigInteger = this.privateExponent;
        return bigInteger != null ? (hashCode * 7) + bigInteger.hashCode() : hashCode;
    }

    public void readParams(byte[][] bArr) {
        byte[] bArr2 = bArr[0];
        if (bArr2 == null) {
            throw new NullPointerException("modulus == null");
        } else if (bArr[2] != null) {
            this.modulus = new BigInteger(bArr2);
            byte[] bArr3 = bArr[2];
            if (bArr3 != null) {
                this.privateExponent = new BigInteger(bArr3);
            }
        } else {
            throw new NullPointerException("privateExponent == null");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OpenSSLRSAPrivateKey{");
        ensureReadParams();
        sb.append("modulus=");
        sb.append(this.modulus.toString(16));
        return sb.toString();
    }

    public OpenSSLRSAPrivateKey(OpenSSLKey openSSLKey, byte[][] bArr) {
        this(openSSLKey);
        readParams(bArr);
        this.fetchedParams = true;
    }

    public OpenSSLRSAPrivateKey(RSAPrivateKeySpec rSAPrivateKeySpec) {
        this(init(rSAPrivateKeySpec));
    }

    static OpenSSLRSAPrivateKey getInstance(OpenSSLKey openSSLKey) {
        byte[][] bArr = NativeCrypto.get_RSA_private_params(openSSLKey.getNativeRef());
        if (bArr[1] != null) {
            return new OpenSSLRSAPrivateCrtKey(openSSLKey, bArr);
        }
        return new OpenSSLRSAPrivateKey(openSSLKey, bArr);
    }
}
