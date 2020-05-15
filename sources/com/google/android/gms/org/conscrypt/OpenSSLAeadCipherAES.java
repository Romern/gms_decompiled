package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.OpenSSLCipher;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class OpenSSLAeadCipherAES extends OpenSSLAeadCipher {
    private static final int AES_BLOCK_SIZE = 16;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class GCM extends OpenSSLAeadCipherAES {

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public class AES_128 extends GCM {
            public void checkSupportedKeySize(int i) {
                if (i != 16) {
                    StringBuilder sb = new StringBuilder(52);
                    sb.append("Unsupported key size: ");
                    sb.append(i);
                    sb.append(" bytes (must be 16)");
                    throw new InvalidKeyException(sb.toString());
                }
            }
        }

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public class AES_256 extends GCM {
            public void checkSupportedKeySize(int i) {
                if (i != 32) {
                    StringBuilder sb = new StringBuilder(52);
                    sb.append("Unsupported key size: ");
                    sb.append(i);
                    sb.append(" bytes (must be 32)");
                    throw new InvalidKeyException(sb.toString());
                }
            }
        }

        public GCM() {
            super(OpenSSLCipher.Mode.GCM);
        }

        public void checkSupportedMode(OpenSSLCipher.Mode mode) {
            if (mode != OpenSSLCipher.Mode.GCM) {
                throw new NoSuchAlgorithmException("Mode must be GCM");
            }
        }

        public long getEVP_AEAD(int i) {
            if (i == 16) {
                return NativeCrypto.EVP_aead_aes_128_gcm();
            }
            if (i == 32) {
                return NativeCrypto.EVP_aead_aes_256_gcm();
            }
            StringBuilder sb = new StringBuilder(34);
            sb.append("Unexpected key length: ");
            sb.append(i);
            throw new RuntimeException(sb.toString());
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class GCM_SIV extends OpenSSLAeadCipherAES {

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public class AES_128 extends GCM_SIV {
            public void checkSupportedKeySize(int i) {
                if (i != 16) {
                    StringBuilder sb = new StringBuilder(52);
                    sb.append("Unsupported key size: ");
                    sb.append(i);
                    sb.append(" bytes (must be 16)");
                    throw new InvalidKeyException(sb.toString());
                }
            }
        }

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public class AES_256 extends GCM_SIV {
            public void checkSupportedKeySize(int i) {
                if (i != 32) {
                    StringBuilder sb = new StringBuilder(52);
                    sb.append("Unsupported key size: ");
                    sb.append(i);
                    sb.append(" bytes (must be 32)");
                    throw new InvalidKeyException(sb.toString());
                }
            }
        }

        public GCM_SIV() {
            super(OpenSSLCipher.Mode.GCM_SIV);
        }

        public boolean allowsNonceReuse() {
            return true;
        }

        public void checkSupportedMode(OpenSSLCipher.Mode mode) {
            if (mode != OpenSSLCipher.Mode.GCM_SIV) {
                throw new NoSuchAlgorithmException("Mode must be GCM-SIV");
            }
        }

        public void checkSupportedTagLength(int i) {
            if (i != 128) {
                throw new InvalidAlgorithmParameterException("Tag length must be 128 bits");
            }
        }

        public long getEVP_AEAD(int i) {
            if (i == 16) {
                return NativeCrypto.EVP_aead_aes_128_gcm_siv();
            }
            if (i == 32) {
                return NativeCrypto.EVP_aead_aes_256_gcm_siv();
            }
            StringBuilder sb = new StringBuilder(34);
            sb.append("Unexpected key length: ");
            sb.append(i);
            throw new RuntimeException(sb.toString());
        }
    }

    public OpenSSLAeadCipherAES(OpenSSLCipher.Mode mode) {
        super(mode);
    }

    public void checkSupportedKeySize(int i) {
        if (i != 16 && i != 32) {
            StringBuilder sb = new StringBuilder(58);
            sb.append("Unsupported key size: ");
            sb.append(i);
            sb.append(" bytes (must be 16 or 32)");
            throw new InvalidKeyException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public AlgorithmParameters engineGetParameters() {
        byte[] bArr = this.f81429iv;
        if (bArr == null) {
            return null;
        }
        AlgorithmParameterSpec gCMParameterSpec = Platform.toGCMParameterSpec(this.tagLengthInBytes * 8, bArr);
        if (gCMParameterSpec == null) {
            return super.engineGetParameters();
        }
        try {
            AlgorithmParameters instance = AlgorithmParameters.getInstance("GCM");
            instance.init(gCMParameterSpec);
            return instance;
        } catch (NoSuchAlgorithmException e) {
            throw ((Error) new AssertionError("GCM not supported").initCause(e));
        } catch (InvalidParameterSpecException e2) {
            return null;
        }
    }

    public String getBaseCipherName() {
        return "AES";
    }

    public int getCipherBlockSize() {
        return 16;
    }

    public int getOutputSizeForFinal(int i) {
        return !isEncrypting() ? Math.max(0, (this.bufCount + i) - this.tagLengthInBytes) : this.bufCount + i + this.tagLengthInBytes;
    }

    /* access modifiers changed from: protected */
    public AlgorithmParameterSpec getParameterSpec(AlgorithmParameters algorithmParameters) {
        if (algorithmParameters == null) {
            return null;
        }
        AlgorithmParameterSpec fromGCMParameters = Platform.fromGCMParameters(algorithmParameters);
        return fromGCMParameters == null ? super.getParameterSpec(algorithmParameters) : fromGCMParameters;
    }
}
