package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.OpenSSLCipher;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import javax.crypto.NoSuchPaddingException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class OpenSSLEvpCipherAES extends OpenSSLEvpCipher {
    private static final int AES_BLOCK_SIZE = 16;

    /* renamed from: com.google.android.gms.org.conscrypt.OpenSSLEvpCipherAES$1 */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    /* synthetic */ class C16451 {
        static final /* synthetic */ int[] $SwitchMap$org$conscrypt$OpenSSLCipher$Mode;
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
            int[] iArr2 = new int[OpenSSLCipher.Mode.values().length];
            $SwitchMap$org$conscrypt$OpenSSLCipher$Mode = iArr2;
            try {
                iArr2[OpenSSLCipher.Mode.CBC.ordinal()] = 1;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$org$conscrypt$OpenSSLCipher$Mode[OpenSSLCipher.Mode.CTR.ordinal()] = 2;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$org$conscrypt$OpenSSLCipher$Mode[OpenSSLCipher.Mode.ECB.ordinal()] = 3;
            } catch (NoSuchFieldError e5) {
            }
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class AES extends OpenSSLEvpCipherAES {

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public class CBC extends AES {

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

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public class CTR extends AES {
            public CTR() {
                super(OpenSSLCipher.Mode.CTR, OpenSSLCipher.Padding.NOPADDING);
            }
        }

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public class ECB extends AES {

            /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
            public class NoPadding extends ECB {
                public NoPadding() {
                    super(OpenSSLCipher.Padding.NOPADDING);
                }
            }

            /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
            public class PKCS5Padding extends ECB {
                public PKCS5Padding() {
                    super(OpenSSLCipher.Padding.PKCS5PADDING);
                }
            }

            public ECB(OpenSSLCipher.Padding padding) {
                super(OpenSSLCipher.Mode.ECB, padding);
            }
        }

        public AES(OpenSSLCipher.Mode mode, OpenSSLCipher.Padding padding) {
            super(mode, padding);
        }

        public void checkSupportedKeySize(int i) {
            if (i != 16 && i != 24 && i != 32) {
                StringBuilder sb = new StringBuilder(39);
                sb.append("Unsupported key size: ");
                sb.append(i);
                sb.append(" bytes");
                throw new InvalidKeyException(sb.toString());
            }
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class AES_128 extends OpenSSLEvpCipherAES {

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public class CBC extends AES_128 {

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

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public class CTR extends AES_128 {
            public CTR() {
                super(OpenSSLCipher.Mode.CTR, OpenSSLCipher.Padding.NOPADDING);
            }
        }

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public class ECB extends AES_128 {

            /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
            public class NoPadding extends ECB {
                public NoPadding() {
                    super(OpenSSLCipher.Padding.NOPADDING);
                }
            }

            /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
            public class PKCS5Padding extends ECB {
                public PKCS5Padding() {
                    super(OpenSSLCipher.Padding.PKCS5PADDING);
                }
            }

            public ECB(OpenSSLCipher.Padding padding) {
                super(OpenSSLCipher.Mode.ECB, padding);
            }
        }

        public AES_128(OpenSSLCipher.Mode mode, OpenSSLCipher.Padding padding) {
            super(mode, padding);
        }

        public void checkSupportedKeySize(int i) {
            if (i != 16) {
                StringBuilder sb = new StringBuilder(39);
                sb.append("Unsupported key size: ");
                sb.append(i);
                sb.append(" bytes");
                throw new InvalidKeyException(sb.toString());
            }
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class AES_256 extends OpenSSLEvpCipherAES {

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public class CBC extends AES_256 {

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

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public class CTR extends AES_256 {
            public CTR() {
                super(OpenSSLCipher.Mode.CTR, OpenSSLCipher.Padding.NOPADDING);
            }
        }

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public class ECB extends AES_256 {

            /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
            public class NoPadding extends ECB {
                public NoPadding() {
                    super(OpenSSLCipher.Padding.NOPADDING);
                }
            }

            /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
            public class PKCS5Padding extends ECB {
                public PKCS5Padding() {
                    super(OpenSSLCipher.Padding.PKCS5PADDING);
                }
            }

            public ECB(OpenSSLCipher.Padding padding) {
                super(OpenSSLCipher.Mode.ECB, padding);
            }
        }

        public AES_256(OpenSSLCipher.Mode mode, OpenSSLCipher.Padding padding) {
            super(mode, padding);
        }

        public void checkSupportedKeySize(int i) {
            if (i != 32) {
                StringBuilder sb = new StringBuilder(39);
                sb.append("Unsupported key size: ");
                sb.append(i);
                sb.append(" bytes");
                throw new InvalidKeyException(sb.toString());
            }
        }
    }

    public OpenSSLEvpCipherAES(OpenSSLCipher.Mode mode, OpenSSLCipher.Padding padding) {
        super(mode, padding);
    }

    public void checkSupportedMode(OpenSSLCipher.Mode mode) {
        OpenSSLCipher.Padding padding = OpenSSLCipher.Padding.NOPADDING;
        OpenSSLCipher.Mode mode2 = OpenSSLCipher.Mode.NONE;
        int ordinal = mode.ordinal();
        if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
            String valueOf = String.valueOf(mode.toString());
            throw new NoSuchAlgorithmException(valueOf.length() == 0 ? new String("Unsupported mode ") : "Unsupported mode ".concat(valueOf));
        }
    }

    public void checkSupportedPadding(OpenSSLCipher.Padding padding) {
        OpenSSLCipher.Padding padding2 = OpenSSLCipher.Padding.NOPADDING;
        OpenSSLCipher.Mode mode = OpenSSLCipher.Mode.NONE;
        int ordinal = padding.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            String valueOf = String.valueOf(padding.toString());
            throw new NoSuchPaddingException(valueOf.length() == 0 ? new String("Unsupported padding ") : "Unsupported padding ".concat(valueOf));
        }
    }

    public String getBaseCipherName() {
        return "AES";
    }

    public int getCipherBlockSize() {
        return 16;
    }

    public String getCipherName(int i, OpenSSLCipher.Mode mode) {
        String lowerCase = mode.toString().toLowerCase(Locale.US);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 16);
        sb.append("aes-");
        sb.append(i * 8);
        sb.append("-");
        sb.append(lowerCase);
        return sb.toString();
    }
}
