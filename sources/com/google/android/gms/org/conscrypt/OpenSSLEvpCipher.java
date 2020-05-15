package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.NativeRef;
import com.google.android.gms.org.conscrypt.OpenSSLCipher;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class OpenSSLEvpCipher extends OpenSSLCipher {
    private boolean calledUpdate;
    private final NativeRef.EVP_CIPHER_CTX cipherCtx = new NativeRef.EVP_CIPHER_CTX(NativeCrypto.EVP_CIPHER_CTX_new());
    private int modeBlockSize;

    public OpenSSLEvpCipher(OpenSSLCipher.Mode mode, OpenSSLCipher.Padding padding) {
        super(mode, padding);
    }

    private void reset() {
        NativeCrypto.EVP_CipherInit_ex(this.cipherCtx, 0, this.encodedKey, this.f81429iv, isEncrypting());
        this.calledUpdate = false;
    }

    public int doFinalInternal(byte[] bArr, int i, int i2) {
        int i3;
        if (!isEncrypting() && !this.calledUpdate) {
            return 0;
        }
        int length = bArr.length - i;
        if (length >= i2) {
            i3 = NativeCrypto.EVP_CipherFinal_ex(this.cipherCtx, bArr, i);
        } else {
            byte[] bArr2 = new byte[i2];
            int EVP_CipherFinal_ex = NativeCrypto.EVP_CipherFinal_ex(this.cipherCtx, bArr2, 0);
            if (EVP_CipherFinal_ex <= length) {
                if (EVP_CipherFinal_ex > 0) {
                    System.arraycopy(bArr2, 0, bArr, i, EVP_CipherFinal_ex);
                }
                i3 = EVP_CipherFinal_ex;
            } else {
                StringBuilder sb = new StringBuilder(46);
                sb.append("buffer is too short: ");
                sb.append(EVP_CipherFinal_ex);
                sb.append(" > ");
                sb.append(length);
                throw new ShortBufferException(sb.toString());
            }
        }
        reset();
        return (i3 + i) - i;
    }

    public void engineInitInternal(byte[] bArr, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        byte[] bArr2;
        int length;
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            bArr2 = ((IvParameterSpec) algorithmParameterSpec).getIV();
        } else {
            bArr2 = null;
        }
        int length2 = bArr.length;
        long EVP_get_cipherbyname = NativeCrypto.EVP_get_cipherbyname(getCipherName(length2, this.mode));
        if (EVP_get_cipherbyname != 0) {
            boolean isEncrypting = isEncrypting();
            int EVP_CIPHER_iv_length = NativeCrypto.EVP_CIPHER_iv_length(EVP_get_cipherbyname);
            if (bArr2 != null || EVP_CIPHER_iv_length == 0) {
                if (EVP_CIPHER_iv_length == 0 && bArr2 != null) {
                    String valueOf = String.valueOf(this.mode);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                    sb.append("IV not used in ");
                    sb.append(valueOf);
                    sb.append(" mode");
                    throw new InvalidAlgorithmParameterException(sb.toString());
                } else if (!(bArr2 == null || (length = bArr2.length) == EVP_CIPHER_iv_length)) {
                    StringBuilder sb2 = new StringBuilder(53);
                    sb2.append("expected IV length of ");
                    sb2.append(EVP_CIPHER_iv_length);
                    sb2.append(" but was ");
                    sb2.append(length);
                    throw new InvalidAlgorithmParameterException(sb2.toString());
                }
            } else if (isEncrypting) {
                bArr2 = new byte[EVP_CIPHER_iv_length];
                if (secureRandom != null) {
                    secureRandom.nextBytes(bArr2);
                } else {
                    NativeCrypto.RAND_bytes(bArr2);
                }
            } else {
                String valueOf2 = String.valueOf(this.mode);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 29);
                sb3.append("IV must be specified in ");
                sb3.append(valueOf2);
                sb3.append(" mode");
                throw new InvalidAlgorithmParameterException(sb3.toString());
            }
            this.f81429iv = bArr2;
            if (supportsVariableSizeKey()) {
                NativeCrypto.EVP_CipherInit_ex(this.cipherCtx, EVP_get_cipherbyname, null, null, isEncrypting);
                NativeCrypto.EVP_CIPHER_CTX_set_key_length(this.cipherCtx, length2);
                NativeCrypto.EVP_CipherInit_ex(this.cipherCtx, 0, bArr, bArr2, isEncrypting());
            } else {
                NativeCrypto.EVP_CipherInit_ex(this.cipherCtx, EVP_get_cipherbyname, bArr, bArr2, isEncrypting);
            }
            NativeCrypto.EVP_CIPHER_CTX_set_padding(this.cipherCtx, getPadding() == OpenSSLCipher.Padding.PKCS5PADDING);
            this.modeBlockSize = NativeCrypto.EVP_CIPHER_CTX_block_size(this.cipherCtx);
            this.calledUpdate = false;
            return;
        }
        String valueOf3 = String.valueOf(this.mode);
        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 57);
        sb4.append("Cannot find name for key length = ");
        sb4.append(length2 * 8);
        sb4.append(" and mode = ");
        sb4.append(valueOf3);
        throw new InvalidAlgorithmParameterException(sb4.toString());
    }

    public abstract String getCipherName(int i, OpenSSLCipher.Mode mode);

    public int getOutputSizeForFinal(int i) {
        int i2;
        if (this.modeBlockSize == 1) {
            return i;
        }
        int i3 = NativeCrypto.get_EVP_CIPHER_CTX_buf_len(this.cipherCtx);
        if (getPadding() == OpenSSLCipher.Padding.NOPADDING) {
            return i3 + i;
        }
        int i4 = i + i3;
        int i5 = 0;
        if (NativeCrypto.get_EVP_CIPHER_CTX_final_used(this.cipherCtx)) {
            i2 = this.modeBlockSize;
        } else {
            i2 = 0;
        }
        int i6 = i4 + i2;
        if (i6 % this.modeBlockSize != 0 || isEncrypting()) {
            i5 = this.modeBlockSize;
        }
        int i7 = i6 + i5;
        return i7 - (i7 % this.modeBlockSize);
    }

    public int getOutputSizeForUpdate(int i) {
        return getOutputSizeForFinal(i);
    }

    public int updateInternal(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        int length = bArr2.length - i3;
        if (length >= i4) {
            int EVP_CipherUpdate = NativeCrypto.EVP_CipherUpdate(this.cipherCtx, bArr2, i3, bArr, i, i2);
            this.calledUpdate = true;
            return (EVP_CipherUpdate + i3) - i3;
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append("output buffer too small during update: ");
        sb.append(length);
        sb.append(" < ");
        sb.append(i4);
        throw new ShortBufferException(sb.toString());
    }
}
