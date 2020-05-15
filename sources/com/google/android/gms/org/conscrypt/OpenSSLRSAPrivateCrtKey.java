package com.google.android.gms.org.conscrypt;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPrivateCrtKeySpec;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class OpenSSLRSAPrivateCrtKey extends OpenSSLRSAPrivateKey implements RSAPrivateCrtKey {
    private static final long serialVersionUID = 3785291944868707197L;
    private BigInteger crtCoefficient;
    private BigInteger primeExponentP;
    private BigInteger primeExponentQ;
    private BigInteger primeP;
    private BigInteger primeQ;
    private BigInteger publicExponent;

    public OpenSSLRSAPrivateCrtKey(OpenSSLKey openSSLKey) {
        super(openSSLKey);
    }

    static OpenSSLKey getInstance(RSAPrivateCrtKey rSAPrivateCrtKey) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        if (rSAPrivateCrtKey.getFormat() == null) {
            return wrapPlatformKey(rSAPrivateCrtKey);
        }
        BigInteger modulus = rSAPrivateCrtKey.getModulus();
        BigInteger privateExponent = rSAPrivateCrtKey.getPrivateExponent();
        if (modulus == null) {
            throw new InvalidKeyException("modulus == null");
        } else if (privateExponent != null) {
            try {
                BigInteger publicExponent2 = rSAPrivateCrtKey.getPublicExponent();
                BigInteger primeP2 = rSAPrivateCrtKey.getPrimeP();
                BigInteger primeQ2 = rSAPrivateCrtKey.getPrimeQ();
                BigInteger primeExponentP2 = rSAPrivateCrtKey.getPrimeExponentP();
                BigInteger primeExponentQ2 = rSAPrivateCrtKey.getPrimeExponentQ();
                BigInteger crtCoefficient2 = rSAPrivateCrtKey.getCrtCoefficient();
                byte[] byteArray = modulus.toByteArray();
                if (publicExponent2 != null) {
                    bArr = publicExponent2.toByteArray();
                } else {
                    bArr = null;
                }
                byte[] byteArray2 = privateExponent.toByteArray();
                if (primeP2 != null) {
                    bArr2 = primeP2.toByteArray();
                } else {
                    bArr2 = null;
                }
                if (primeQ2 != null) {
                    bArr3 = primeQ2.toByteArray();
                } else {
                    bArr3 = null;
                }
                if (primeExponentP2 != null) {
                    bArr4 = primeExponentP2.toByteArray();
                } else {
                    bArr4 = null;
                }
                if (primeExponentQ2 != null) {
                    bArr5 = primeExponentQ2.toByteArray();
                } else {
                    bArr5 = null;
                }
                if (crtCoefficient2 != null) {
                    bArr6 = crtCoefficient2.toByteArray();
                } else {
                    bArr6 = null;
                }
                return new OpenSSLKey(NativeCrypto.EVP_PKEY_new_RSA(byteArray, bArr, byteArray2, bArr2, bArr3, bArr4, bArr5, bArr6));
            } catch (Exception e) {
                throw new InvalidKeyException(e);
            }
        } else {
            throw new InvalidKeyException("privateExponent == null");
        }
    }

    private static OpenSSLKey init(RSAPrivateCrtKeySpec rSAPrivateCrtKeySpec) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        BigInteger modulus = rSAPrivateCrtKeySpec.getModulus();
        BigInteger privateExponent = rSAPrivateCrtKeySpec.getPrivateExponent();
        if (modulus == null) {
            throw new InvalidKeySpecException("modulus == null");
        } else if (privateExponent != null) {
            try {
                BigInteger publicExponent2 = rSAPrivateCrtKeySpec.getPublicExponent();
                BigInteger primeP2 = rSAPrivateCrtKeySpec.getPrimeP();
                BigInteger primeQ2 = rSAPrivateCrtKeySpec.getPrimeQ();
                BigInteger primeExponentP2 = rSAPrivateCrtKeySpec.getPrimeExponentP();
                BigInteger primeExponentQ2 = rSAPrivateCrtKeySpec.getPrimeExponentQ();
                BigInteger crtCoefficient2 = rSAPrivateCrtKeySpec.getCrtCoefficient();
                byte[] byteArray = modulus.toByteArray();
                if (publicExponent2 != null) {
                    bArr = publicExponent2.toByteArray();
                } else {
                    bArr = null;
                }
                byte[] byteArray2 = privateExponent.toByteArray();
                if (primeP2 != null) {
                    bArr2 = primeP2.toByteArray();
                } else {
                    bArr2 = null;
                }
                if (primeQ2 != null) {
                    bArr3 = primeQ2.toByteArray();
                } else {
                    bArr3 = null;
                }
                if (primeExponentP2 != null) {
                    bArr4 = primeExponentP2.toByteArray();
                } else {
                    bArr4 = null;
                }
                if (primeExponentQ2 != null) {
                    bArr5 = primeExponentQ2.toByteArray();
                } else {
                    bArr5 = null;
                }
                if (crtCoefficient2 != null) {
                    bArr6 = crtCoefficient2.toByteArray();
                } else {
                    bArr6 = null;
                }
                return new OpenSSLKey(NativeCrypto.EVP_PKEY_new_RSA(byteArray, bArr, byteArray2, bArr2, bArr3, bArr4, bArr5, bArr6));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e);
            }
        } else {
            throw new InvalidKeySpecException("privateExponent == null");
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        objectInputStream.defaultReadObject();
        byte[] byteArray = this.modulus.toByteArray();
        BigInteger bigInteger = this.publicExponent;
        if (bigInteger != null) {
            bArr = bigInteger.toByteArray();
        } else {
            bArr = null;
        }
        byte[] byteArray2 = this.privateExponent.toByteArray();
        BigInteger bigInteger2 = this.primeP;
        if (bigInteger2 != null) {
            bArr2 = bigInteger2.toByteArray();
        } else {
            bArr2 = null;
        }
        BigInteger bigInteger3 = this.primeQ;
        if (bigInteger3 != null) {
            bArr3 = bigInteger3.toByteArray();
        } else {
            bArr3 = null;
        }
        BigInteger bigInteger4 = this.primeExponentP;
        if (bigInteger4 != null) {
            bArr4 = bigInteger4.toByteArray();
        } else {
            bArr4 = null;
        }
        BigInteger bigInteger5 = this.primeExponentQ;
        if (bigInteger5 != null) {
            bArr5 = bigInteger5.toByteArray();
        } else {
            bArr5 = null;
        }
        BigInteger bigInteger6 = this.crtCoefficient;
        if (bigInteger6 != null) {
            bArr6 = bigInteger6.toByteArray();
        } else {
            bArr6 = null;
        }
        this.key = new OpenSSLKey(NativeCrypto.EVP_PKEY_new_RSA(byteArray, bArr, byteArray2, bArr2, bArr3, bArr4, bArr5, bArr6));
        this.fetchedParams = true;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        ensureReadParams();
        objectOutputStream.defaultWriteObject();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OpenSSLRSAPrivateKey) {
            return getOpenSSLKey().equals(((OpenSSLRSAPrivateKey) obj).getOpenSSLKey());
        }
        if (obj instanceof RSAPrivateCrtKey) {
            ensureReadParams();
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) obj;
            if (!getModulus().equals(rSAPrivateCrtKey.getModulus()) || !this.publicExponent.equals(rSAPrivateCrtKey.getPublicExponent()) || !getPrivateExponent().equals(rSAPrivateCrtKey.getPrivateExponent()) || !this.primeP.equals(rSAPrivateCrtKey.getPrimeP()) || !this.primeQ.equals(rSAPrivateCrtKey.getPrimeQ()) || !this.primeExponentP.equals(rSAPrivateCrtKey.getPrimeExponentP()) || !this.primeExponentQ.equals(rSAPrivateCrtKey.getPrimeExponentQ()) || !this.crtCoefficient.equals(rSAPrivateCrtKey.getCrtCoefficient())) {
                return false;
            }
            return true;
        }
        if (obj instanceof RSAPrivateKey) {
            ensureReadParams();
            RSAPrivateKey rSAPrivateKey = (RSAPrivateKey) obj;
            if (!getModulus().equals(rSAPrivateKey.getModulus()) || !getPrivateExponent().equals(rSAPrivateKey.getPrivateExponent())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public BigInteger getCrtCoefficient() {
        ensureReadParams();
        return this.crtCoefficient;
    }

    public BigInteger getPrimeExponentP() {
        ensureReadParams();
        return this.primeExponentP;
    }

    public BigInteger getPrimeExponentQ() {
        ensureReadParams();
        return this.primeExponentQ;
    }

    public BigInteger getPrimeP() {
        ensureReadParams();
        return this.primeP;
    }

    public BigInteger getPrimeQ() {
        ensureReadParams();
        return this.primeQ;
    }

    public BigInteger getPublicExponent() {
        ensureReadParams();
        return this.publicExponent;
    }

    public final int hashCode() {
        int hashCode = super.hashCode();
        BigInteger bigInteger = this.publicExponent;
        return bigInteger != null ? hashCode ^ bigInteger.hashCode() : hashCode;
    }

    public synchronized void readParams(byte[][] bArr) {
        super.readParams(bArr);
        byte[] bArr2 = bArr[1];
        if (bArr2 != null) {
            this.publicExponent = new BigInteger(bArr2);
        }
        byte[] bArr3 = bArr[3];
        if (bArr3 != null) {
            this.primeP = new BigInteger(bArr3);
        }
        byte[] bArr4 = bArr[4];
        if (bArr4 != null) {
            this.primeQ = new BigInteger(bArr4);
        }
        byte[] bArr5 = bArr[5];
        if (bArr5 != null) {
            this.primeExponentP = new BigInteger(bArr5);
        }
        byte[] bArr6 = bArr[6];
        if (bArr6 != null) {
            this.primeExponentQ = new BigInteger(bArr6);
        }
        byte[] bArr7 = bArr[7];
        if (bArr7 != null) {
            this.crtCoefficient = new BigInteger(bArr7);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OpenSSLRSAPrivateCrtKey{");
        ensureReadParams();
        sb.append("modulus=");
        sb.append(getModulus().toString(16));
        if (this.publicExponent != null) {
            sb.append(",publicExponent=");
            sb.append(this.publicExponent.toString(16));
        }
        sb.append('}');
        return sb.toString();
    }

    public OpenSSLRSAPrivateCrtKey(OpenSSLKey openSSLKey, byte[][] bArr) {
        super(openSSLKey, bArr);
    }

    public OpenSSLRSAPrivateCrtKey(RSAPrivateCrtKeySpec rSAPrivateCrtKeySpec) {
        super(init(rSAPrivateCrtKeySpec));
    }
}
