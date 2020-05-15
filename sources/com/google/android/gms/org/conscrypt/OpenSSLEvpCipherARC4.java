package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.OpenSSLCipher;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OpenSSLEvpCipherARC4 extends OpenSSLEvpCipher {
    public OpenSSLEvpCipherARC4() {
        super(OpenSSLCipher.Mode.ECB, OpenSSLCipher.Padding.NOPADDING);
    }

    public void checkSupportedKeySize(int i) {
    }

    public void checkSupportedMode(OpenSSLCipher.Mode mode) {
        if (mode != OpenSSLCipher.Mode.NONE && mode != OpenSSLCipher.Mode.ECB) {
            String valueOf = String.valueOf(mode.toString());
            throw new NoSuchAlgorithmException(valueOf.length() == 0 ? new String("Unsupported mode ") : "Unsupported mode ".concat(valueOf));
        }
    }

    public void checkSupportedPadding(OpenSSLCipher.Padding padding) {
        if (padding != OpenSSLCipher.Padding.NOPADDING) {
            String valueOf = String.valueOf(padding.toString());
            throw new NoSuchPaddingException(valueOf.length() == 0 ? new String("Unsupported padding ") : "Unsupported padding ".concat(valueOf));
        }
    }

    public String getBaseCipherName() {
        return "ARCFOUR";
    }

    public int getCipherBlockSize() {
        return 0;
    }

    public String getCipherName(int i, OpenSSLCipher.Mode mode) {
        return "rc4";
    }

    public boolean supportsVariableSizeKey() {
        return true;
    }
}
