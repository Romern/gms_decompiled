package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.OpenSSLCipher;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OpenSSLCipherChaCha20 extends OpenSSLCipher {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int BLOCK_SIZE_BYTES = 64;
    private static final int NONCE_SIZE_BYTES = 12;
    private int blockCounter = 0;
    private int currentBlockConsumedBytes = 0;

    private void reset() {
        this.blockCounter = 0;
        this.currentBlockConsumedBytes = 0;
    }

    public void checkSupportedKeySize(int i) {
        if (i != 32) {
            StringBuilder sb = new StringBuilder(52);
            sb.append("Unsupported key size: ");
            sb.append(i);
            sb.append(" bytes (must be 32)");
            throw new InvalidKeyException(sb.toString());
        }
    }

    public void checkSupportedMode(OpenSSLCipher.Mode mode) {
        if (mode != OpenSSLCipher.Mode.NONE) {
            throw new NoSuchAlgorithmException("Mode must be NONE");
        }
    }

    public void checkSupportedPadding(OpenSSLCipher.Padding padding) {
        if (padding != OpenSSLCipher.Padding.NOPADDING) {
            throw new NoSuchPaddingException("Must be NoPadding");
        }
    }

    public int doFinalInternal(byte[] bArr, int i, int i2) {
        reset();
        return 0;
    }

    public void engineInitInternal(byte[] bArr, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            IvParameterSpec ivParameterSpec = (IvParameterSpec) algorithmParameterSpec;
            if (ivParameterSpec.getIV().length == 12) {
                this.f81429iv = ivParameterSpec.getIV();
                return;
            }
            throw new InvalidAlgorithmParameterException("IV must be 12 bytes long");
        } else if (isEncrypting()) {
            this.f81429iv = new byte[12];
            if (secureRandom != null) {
                secureRandom.nextBytes(this.f81429iv);
            } else {
                NativeCrypto.RAND_bytes(this.f81429iv);
            }
        } else {
            throw new InvalidAlgorithmParameterException("IV must be specified when decrypting");
        }
    }

    public String getBaseCipherName() {
        return "ChaCha20";
    }

    public int getCipherBlockSize() {
        return 0;
    }

    public int getOutputSizeForFinal(int i) {
        return i;
    }

    public int getOutputSizeForUpdate(int i) {
        return i;
    }

    public int updateInternal(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8 = i;
        int i9 = i2;
        byte[] bArr3 = bArr2;
        int i10 = i3;
        if (i9 <= bArr3.length - i10) {
            int i11 = this.currentBlockConsumedBytes;
            if (i11 > 0) {
                int min = Math.min(64 - i11, i9);
                byte[] bArr4 = new byte[64];
                byte[] bArr5 = new byte[64];
                System.arraycopy(bArr, i8, bArr4, this.currentBlockConsumedBytes, min);
                NativeCrypto.chacha20_encrypt_decrypt(bArr4, 0, bArr5, 0, 64, this.encodedKey, this.f81429iv, this.blockCounter);
                System.arraycopy(bArr5, this.currentBlockConsumedBytes, bArr3, i10, min);
                int i12 = this.currentBlockConsumedBytes + min;
                this.currentBlockConsumedBytes = i12;
                if (i12 < 64) {
                    return min;
                }
                this.currentBlockConsumedBytes = 0;
                int i13 = i8 + min;
                int i14 = i10 + min;
                int i15 = i9 - min;
                this.blockCounter++;
                i5 = i14;
                i6 = i13;
                i7 = i15;
            } else {
                i6 = i8;
                i7 = i9;
                i5 = i10;
            }
            NativeCrypto.chacha20_encrypt_decrypt(bArr, i6, bArr2, i5, i7, this.encodedKey, this.f81429iv, this.blockCounter);
            this.currentBlockConsumedBytes = i7 % 64;
            this.blockCounter += i7 / 64;
            return i9;
        }
        throw new ShortBufferException("Insufficient output space");
    }
}
