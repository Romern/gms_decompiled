package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.OpenSSLCipher;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import javax.crypto.NoSuchPaddingException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class OpenSSLEvpCipherDESEDE extends OpenSSLEvpCipher {
    private static final int DES_BLOCK_SIZE = 8;

    /* renamed from: com.google.android.gms.org.conscrypt.OpenSSLEvpCipherDESEDE$1 */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    /* synthetic */ class C16461 {
        static final /* synthetic */ int[] $SwitchMap$org$conscrypt$OpenSSLCipher$Padding;

        static {
            int[] iArr = new int[OpenSSLCipher.Padding.values().length];
            $SwitchMap$org$conscrypt$OpenSSLCipher$Padding = iArr;
            try {
                iArr[OpenSSLCipher.Padding.NOPADDING.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$org$conscrypt$OpenSSLCipher$Padding[OpenSSLCipher.Padding.PKCS5PADDING.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class CBC extends OpenSSLEvpCipherDESEDE {

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public class NoPadding extends CBC {
            public NoPadding() {
                super(OpenSSLCipher.Padding.NOPADDING);
            }
        }

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public class PKCS5Padding extends CBC {
            public PKCS5Padding() {
                super(OpenSSLCipher.Padding.PKCS5PADDING);
            }
        }

        public CBC(OpenSSLCipher.Padding padding) {
            super(OpenSSLCipher.Mode.CBC, padding);
        }
    }

    public OpenSSLEvpCipherDESEDE(OpenSSLCipher.Mode mode, OpenSSLCipher.Padding padding) {
        super(mode, padding);
    }

    public void checkSupportedKeySize(int i) {
        if (i != 16 && i != 24) {
            throw new InvalidKeyException("key size must be 128 or 192 bits");
        }
    }

    public void checkSupportedMode(OpenSSLCipher.Mode mode) {
        if (mode != OpenSSLCipher.Mode.CBC) {
            String valueOf = String.valueOf(mode.toString());
            throw new NoSuchAlgorithmException(valueOf.length() == 0 ? new String("Unsupported mode ") : "Unsupported mode ".concat(valueOf));
        }
    }

    public void checkSupportedPadding(OpenSSLCipher.Padding padding) {
        OpenSSLCipher.Padding padding2 = OpenSSLCipher.Padding.NOPADDING;
        int ordinal = padding.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            String valueOf = String.valueOf(padding.toString());
            throw new NoSuchPaddingException(valueOf.length() == 0 ? new String("Unsupported padding ") : "Unsupported padding ".concat(valueOf));
        }
    }

    public String getBaseCipherName() {
        return "DESede";
    }

    public int getCipherBlockSize() {
        return 8;
    }

    public String getCipherName(int i, OpenSSLCipher.Mode mode) {
        String str = i != 16 ? "des-ede3" : "des-ede";
        String lowerCase = mode.toString().toLowerCase(Locale.US);
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(lowerCase).length());
        sb.append(str);
        sb.append("-");
        sb.append(lowerCase);
        return sb.toString();
    }
}
