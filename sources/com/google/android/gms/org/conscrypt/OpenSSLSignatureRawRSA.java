package com.google.android.gms.org.conscrypt;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class OpenSSLSignatureRawRSA extends SignatureSpi {
    private byte[] inputBuffer;
    private boolean inputIsTooLong;
    private int inputOffset;
    private OpenSSLKey key;

    /* access modifiers changed from: protected */
    public Object engineGetParameter(String str) {
        return null;
    }

    /* access modifiers changed from: protected */
    public void engineInitSign(PrivateKey privateKey) {
        if (privateKey instanceof OpenSSLRSAPrivateKey) {
            this.key = ((OpenSSLRSAPrivateKey) privateKey).getOpenSSLKey();
        } else if (privateKey instanceof RSAPrivateCrtKey) {
            this.key = OpenSSLRSAPrivateCrtKey.getInstance((RSAPrivateCrtKey) privateKey);
        } else if (privateKey instanceof RSAPrivateKey) {
            this.key = OpenSSLRSAPrivateKey.getInstance((RSAPrivateKey) privateKey);
        } else {
            throw new InvalidKeyException("Need RSA private key");
        }
        this.inputBuffer = new byte[NativeCrypto.RSA_size(this.key.getNativeRef())];
        this.inputOffset = 0;
    }

    /* access modifiers changed from: protected */
    public void engineInitVerify(PublicKey publicKey) {
        if (publicKey instanceof OpenSSLRSAPublicKey) {
            this.key = ((OpenSSLRSAPublicKey) publicKey).getOpenSSLKey();
        } else if (publicKey instanceof RSAPublicKey) {
            this.key = OpenSSLRSAPublicKey.getInstance((RSAPublicKey) publicKey);
        } else {
            throw new InvalidKeyException("Need RSA public key");
        }
        this.inputBuffer = new byte[NativeCrypto.RSA_size(this.key.getNativeRef())];
        this.inputOffset = 0;
    }

    /* access modifiers changed from: protected */
    public void engineSetParameter(String str, Object obj) {
    }

    /* access modifiers changed from: protected */
    public byte[] engineSign() {
        OpenSSLKey openSSLKey = this.key;
        if (openSSLKey == null) {
            throw new SignatureException("Need RSA private key");
        } else if (!this.inputIsTooLong) {
            byte[] bArr = this.inputBuffer;
            byte[] bArr2 = new byte[bArr.length];
            try {
                NativeCrypto.RSA_private_encrypt(this.inputOffset, bArr, bArr2, openSSLKey.getNativeRef(), 1);
                this.inputOffset = 0;
                return bArr2;
            } catch (Exception e) {
                throw new SignatureException(e);
            } catch (Throwable th) {
                this.inputOffset = 0;
                throw th;
            }
        } else {
            int i = this.inputOffset;
            int length = this.inputBuffer.length;
            StringBuilder sb = new StringBuilder(54);
            sb.append("input length ");
            sb.append(i);
            sb.append(" != ");
            sb.append(length);
            sb.append(" (modulus size)");
            throw new SignatureException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public void engineUpdate(byte b) {
        int i = this.inputOffset;
        int i2 = i + 1;
        this.inputOffset = i2;
        byte[] bArr = this.inputBuffer;
        if (i2 > bArr.length) {
            this.inputIsTooLong = true;
        } else {
            bArr[i] = b;
        }
    }

    /* access modifiers changed from: protected */
    public boolean engineVerify(byte[] bArr) {
        OpenSSLKey openSSLKey = this.key;
        if (openSSLKey == null) {
            throw new SignatureException("Need RSA public key");
        } else if (this.inputIsTooLong) {
            return false;
        } else {
            int length = bArr.length;
            int length2 = this.inputBuffer.length;
            if (length <= length2) {
                byte[] bArr2 = new byte[length2];
                try {
                    boolean z = true;
                    int RSA_public_decrypt = NativeCrypto.RSA_public_decrypt(length, bArr, bArr2, openSSLKey.getNativeRef(), 1);
                    if (RSA_public_decrypt != this.inputOffset) {
                        z = false;
                    }
                    for (int i = 0; i < RSA_public_decrypt; i++) {
                        if (this.inputBuffer[i] != bArr2[i]) {
                            z = false;
                        }
                    }
                    this.inputOffset = 0;
                    return z;
                } catch (SignatureException e) {
                    throw e;
                } catch (Exception e2) {
                    this.inputOffset = 0;
                    return false;
                } catch (Exception e3) {
                    try {
                        throw new SignatureException(e3);
                    } catch (Throwable th) {
                        this.inputOffset = 0;
                        throw th;
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder(62);
                sb.append("Input signature length is too large: ");
                sb.append(length);
                sb.append(" > ");
                sb.append(length2);
                throw new SignatureException(sb.toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void engineUpdate(byte[] bArr, int i, int i2) {
        int i3 = this.inputOffset;
        int i4 = i3 + i2;
        this.inputOffset = i4;
        byte[] bArr2 = this.inputBuffer;
        if (i4 > bArr2.length) {
            this.inputIsTooLong = true;
        } else {
            System.arraycopy(bArr, i, bArr2, i3, i2);
        }
    }
}
