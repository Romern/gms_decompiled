package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.OpenSSLCipher;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OpenSSLAeadCipherChaCha20 extends OpenSSLAeadCipher {
    public OpenSSLAeadCipherChaCha20() {
        super(OpenSSLCipher.Mode.POLY1305);
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
        if (mode != OpenSSLCipher.Mode.POLY1305) {
            throw new NoSuchAlgorithmException("Mode must be Poly1305");
        }
    }

    public String getBaseCipherName() {
        return "ChaCha20";
    }

    public int getCipherBlockSize() {
        return 0;
    }

    public long getEVP_AEAD(int i) {
        if (i == 32) {
            return NativeCrypto.EVP_aead_chacha20_poly1305();
        }
        StringBuilder sb = new StringBuilder(34);
        sb.append("Unexpected key length: ");
        sb.append(i);
        throw new RuntimeException(sb.toString());
    }

    public int getOutputSizeForFinal(int i) {
        return !isEncrypting() ? Math.max(0, (this.bufCount + i) - 16) : this.bufCount + i + 16;
    }
}
