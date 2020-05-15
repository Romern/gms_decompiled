package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.EvpMdRef;
import com.google.android.gms.org.conscrypt.NativeRef;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class OpenSSLCipherRSA extends CipherSpi {
    private byte[] buffer;
    private int bufferOffset;
    boolean encrypting;
    private boolean inputTooLarge;
    OpenSSLKey key;
    int padding;
    boolean usingPrivateKey;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public abstract class DirectRSA extends OpenSSLCipherRSA {
        public DirectRSA(int i) {
            super(i);
        }

        public int doCryptoOperation(byte[] bArr, byte[] bArr2) {
            if (!this.encrypting) {
                try {
                    if (!this.usingPrivateKey) {
                        return NativeCrypto.RSA_public_decrypt(bArr.length, bArr, bArr2, this.key.getNativeRef(), this.padding);
                    }
                    return NativeCrypto.RSA_private_decrypt(bArr.length, bArr, bArr2, this.key.getNativeRef(), this.padding);
                } catch (SignatureException e) {
                    IllegalBlockSizeException illegalBlockSizeException = new IllegalBlockSizeException();
                    illegalBlockSizeException.initCause(e);
                    throw illegalBlockSizeException;
                }
            } else if (this.usingPrivateKey) {
                return NativeCrypto.RSA_private_encrypt(bArr.length, bArr, bArr2, this.key.getNativeRef(), this.padding);
            } else {
                return NativeCrypto.RSA_public_encrypt(bArr.length, bArr, bArr2, this.key.getNativeRef(), this.padding);
            }
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class PKCS1 extends DirectRSA {
        public PKCS1() {
            super(1);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class Raw extends DirectRSA {
        public Raw() {
            super(3);
        }
    }

    public OpenSSLCipherRSA(int i) {
        this.padding = i;
    }

    public void doCryptoInit(AlgorithmParameterSpec algorithmParameterSpec) {
    }

    public abstract int doCryptoOperation(byte[] bArr, byte[] bArr2);

    /* access modifiers changed from: protected */
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte[] engineDoFinal = engineDoFinal(bArr, i, i2);
        int length = engineDoFinal.length;
        int i4 = i3 + length;
        int length2 = bArr2.length;
        if (i4 <= length2) {
            System.arraycopy(engineDoFinal, 0, bArr2, i3, length);
            return length;
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("output buffer is too small ");
        sb.append(length2);
        sb.append(" < ");
        sb.append(i4);
        throw new ShortBufferException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public int engineGetBlockSize() {
        if (this.encrypting) {
            return paddedBlockSizeBytes();
        }
        return keySizeBytes();
    }

    /* access modifiers changed from: protected */
    public byte[] engineGetIV() {
        return null;
    }

    /* access modifiers changed from: protected */
    public int engineGetKeySize(Key key2) {
        if (key2 instanceof OpenSSLRSAPrivateKey) {
            return ((OpenSSLRSAPrivateKey) key2).getModulus().bitLength();
        }
        if (key2 instanceof RSAPrivateCrtKey) {
            return ((RSAPrivateCrtKey) key2).getModulus().bitLength();
        }
        if (key2 instanceof RSAPrivateKey) {
            return ((RSAPrivateKey) key2).getModulus().bitLength();
        }
        if (key2 instanceof OpenSSLRSAPublicKey) {
            return ((OpenSSLRSAPublicKey) key2).getModulus().bitLength();
        }
        if (key2 instanceof RSAPublicKey) {
            return ((RSAPublicKey) key2).getModulus().bitLength();
        }
        if (key2 == null) {
            throw new InvalidKeyException("RSA private or public key is null");
        }
        throw new InvalidKeyException("Need RSA private or public key");
    }

    /* access modifiers changed from: protected */
    public int engineGetOutputSize(int i) {
        if (this.encrypting) {
            return keySizeBytes();
        }
        return paddedBlockSizeBytes();
    }

    /* access modifiers changed from: protected */
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void engineInit(int i, Key key2, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) {
        if (algorithmParameters != null) {
            String valueOf = String.valueOf(algorithmParameters.getClass().getName());
            throw new InvalidAlgorithmParameterException(valueOf.length() == 0 ? new String("unknown param type: ") : "unknown param type: ".concat(valueOf));
        } else {
            engineInitInternal(i, key2, null);
        }
    }

    public void engineInitInternal(int i, Key key2, AlgorithmParameterSpec algorithmParameterSpec) {
        if (i == 1 || i == 3) {
            this.encrypting = true;
        } else if (i == 2 || i == 4) {
            this.encrypting = false;
        } else {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Unsupported opmode ");
            sb.append(i);
            throw new InvalidParameterException(sb.toString());
        }
        if (key2 instanceof OpenSSLRSAPrivateKey) {
            this.usingPrivateKey = true;
            this.key = ((OpenSSLRSAPrivateKey) key2).getOpenSSLKey();
        } else if (key2 instanceof RSAPrivateCrtKey) {
            this.usingPrivateKey = true;
            this.key = OpenSSLRSAPrivateCrtKey.getInstance((RSAPrivateCrtKey) key2);
        } else if (key2 instanceof RSAPrivateKey) {
            this.usingPrivateKey = true;
            this.key = OpenSSLRSAPrivateKey.getInstance((RSAPrivateKey) key2);
        } else if (key2 instanceof OpenSSLRSAPublicKey) {
            this.usingPrivateKey = false;
            this.key = ((OpenSSLRSAPublicKey) key2).getOpenSSLKey();
        } else if (key2 instanceof RSAPublicKey) {
            this.usingPrivateKey = false;
            this.key = OpenSSLRSAPublicKey.getInstance((RSAPublicKey) key2);
        } else if (key2 == null) {
            throw new InvalidKeyException("RSA private or public key is null");
        } else {
            throw new InvalidKeyException("Need RSA private or public key");
        }
        this.buffer = new byte[NativeCrypto.RSA_size(this.key.getNativeRef())];
        this.bufferOffset = 0;
        this.inputTooLarge = false;
        doCryptoInit(algorithmParameterSpec);
    }

    /* access modifiers changed from: protected */
    public void engineSetMode(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        if (!"NONE".equals(upperCase) && !"ECB".equals(upperCase)) {
            String valueOf = String.valueOf(str);
            throw new NoSuchAlgorithmException(valueOf.length() == 0 ? new String("mode not supported: ") : "mode not supported: ".concat(valueOf));
        }
    }

    /* access modifiers changed from: protected */
    public void engineSetPadding(String str) {
        int i;
        String upperCase = str.toUpperCase(Locale.ROOT);
        if ("PKCS1PADDING".equals(upperCase)) {
            i = 1;
        } else if (!"NOPADDING".equals(upperCase)) {
            String valueOf = String.valueOf(str);
            throw new NoSuchPaddingException(valueOf.length() == 0 ? new String("padding not supported: ") : "padding not supported: ".concat(valueOf));
        } else {
            i = 3;
        }
        this.padding = i;
    }

    /* access modifiers changed from: protected */
    public Key engineUnwrap(byte[] bArr, String str, int i) {
        try {
            byte[] engineDoFinal = engineDoFinal(bArr, 0, bArr.length);
            if (i == 1) {
                return KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(engineDoFinal));
            }
            if (i == 2) {
                return KeyFactory.getInstance(str).generatePrivate(new PKCS8EncodedKeySpec(engineDoFinal));
            }
            if (i == 3) {
                return new SecretKeySpec(engineDoFinal, str);
            }
            StringBuilder sb = new StringBuilder(29);
            sb.append("wrappedKeyType == ");
            sb.append(i);
            throw new UnsupportedOperationException(sb.toString());
        } catch (IllegalBlockSizeException e) {
            throw new InvalidKeyException(e);
        } catch (BadPaddingException e2) {
            throw new InvalidKeyException(e2);
        } catch (InvalidKeySpecException e3) {
            throw new InvalidKeyException(e3);
        }
    }

    /* access modifiers changed from: protected */
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        engineUpdate(bArr, i, i2);
        return 0;
    }

    /* access modifiers changed from: protected */
    public byte[] engineWrap(Key key2) {
        try {
            byte[] encoded = key2.getEncoded();
            return engineDoFinal(encoded, 0, encoded.length);
        } catch (BadPaddingException e) {
            IllegalBlockSizeException illegalBlockSizeException = new IllegalBlockSizeException();
            illegalBlockSizeException.initCause(e);
            throw illegalBlockSizeException;
        }
    }

    public boolean isInitialized() {
        return this.key != null;
    }

    public int keySizeBytes() {
        if (isInitialized()) {
            return NativeCrypto.RSA_size(this.key.getNativeRef());
        }
        throw new IllegalStateException("cipher is not initialized");
    }

    public int paddedBlockSizeBytes() {
        int keySizeBytes = keySizeBytes();
        return this.padding == 1 ? keySizeBytes - 11 : keySizeBytes;
    }

    /* access modifiers changed from: protected */
    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        int i3 = this.bufferOffset;
        byte[] bArr2 = this.buffer;
        if (i3 + i2 <= bArr2.length) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.bufferOffset += i2;
        } else {
            this.inputTooLarge = true;
        }
        return EmptyArray.BYTE;
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class OAEP extends OpenSSLCipherRSA {
        private byte[] label;
        private long mgf1Md;
        private long oaepMd;
        private int oaepMdSizeBytes;
        private NativeRef.EVP_PKEY_CTX pkeyCtx;

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public final class SHA1 extends OAEP {
            public SHA1() {
                super(EvpMdRef.SHA1.EVP_MD, EvpMdRef.SHA1.SIZE_BYTES);
            }
        }

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public final class SHA224 extends OAEP {
            public SHA224() {
                super(EvpMdRef.SHA224.EVP_MD, EvpMdRef.SHA224.SIZE_BYTES);
            }
        }

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public final class SHA256 extends OAEP {
            public SHA256() {
                super(EvpMdRef.SHA256.EVP_MD, EvpMdRef.SHA256.SIZE_BYTES);
            }
        }

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public final class SHA384 extends OAEP {
            public SHA384() {
                super(EvpMdRef.SHA384.EVP_MD, EvpMdRef.SHA384.SIZE_BYTES);
            }
        }

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public final class SHA512 extends OAEP {
            public SHA512() {
                super(EvpMdRef.SHA512.EVP_MD, EvpMdRef.SHA512.SIZE_BYTES);
            }
        }

        public OAEP(long j, int i) {
            super(4);
            this.mgf1Md = j;
            this.oaepMd = j;
            this.oaepMdSizeBytes = i;
        }

        private void readOAEPParameters(OAEPParameterSpec oAEPParameterSpec) {
            String upperCase = oAEPParameterSpec.getMGFAlgorithm().toUpperCase(Locale.US);
            AlgorithmParameterSpec mGFParameters = oAEPParameterSpec.getMGFParameters();
            if (("MGF1".equals(upperCase) || "1.2.840.113549.1.1.8".equals(upperCase)) && (mGFParameters instanceof MGF1ParameterSpec)) {
                MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) mGFParameters;
                String upperCase2 = oAEPParameterSpec.getDigestAlgorithm().toUpperCase(Locale.US);
                try {
                    this.oaepMd = EvpMdRef.getEVP_MDByJcaDigestAlgorithmStandardName(upperCase2);
                    this.oaepMdSizeBytes = EvpMdRef.getDigestSizeBytesByJcaDigestAlgorithmStandardName(upperCase2);
                    this.mgf1Md = EvpMdRef.getEVP_MDByJcaDigestAlgorithmStandardName(mGF1ParameterSpec.getDigestAlgorithm());
                    PSource pSource = oAEPParameterSpec.getPSource();
                    if (!"PSpecified".equals(pSource.getAlgorithm()) || !(pSource instanceof PSource.PSpecified)) {
                        throw new InvalidAlgorithmParameterException("Only PSpecified accepted for PSource");
                    }
                    this.label = ((PSource.PSpecified) pSource).getValue();
                } catch (NoSuchAlgorithmException e) {
                    throw new InvalidAlgorithmParameterException(e);
                }
            } else {
                throw new InvalidAlgorithmParameterException("Only MGF1 supported as mask generation function");
            }
        }

        public void doCryptoInit(AlgorithmParameterSpec algorithmParameterSpec) {
            long j;
            if (this.encrypting) {
                j = NativeCrypto.EVP_PKEY_encrypt_init(this.key.getNativeRef());
            } else {
                j = NativeCrypto.EVP_PKEY_decrypt_init(this.key.getNativeRef());
            }
            this.pkeyCtx = new NativeRef.EVP_PKEY_CTX(j);
            if (algorithmParameterSpec instanceof OAEPParameterSpec) {
                readOAEPParameters((OAEPParameterSpec) algorithmParameterSpec);
            }
            NativeCrypto.EVP_PKEY_CTX_set_rsa_padding(this.pkeyCtx.address, 4);
            NativeCrypto.EVP_PKEY_CTX_set_rsa_oaep_md(this.pkeyCtx.address, this.oaepMd);
            NativeCrypto.EVP_PKEY_CTX_set_rsa_mgf1_md(this.pkeyCtx.address, this.mgf1Md);
            byte[] bArr = this.label;
            if (bArr != null && bArr.length > 0) {
                NativeCrypto.EVP_PKEY_CTX_set_rsa_oaep_label(this.pkeyCtx.address, bArr);
            }
        }

        public int doCryptoOperation(byte[] bArr, byte[] bArr2) {
            if (this.encrypting) {
                return NativeCrypto.EVP_PKEY_encrypt(this.pkeyCtx, bArr2, 0, bArr, 0, bArr.length);
            }
            return NativeCrypto.EVP_PKEY_decrypt(this.pkeyCtx, bArr2, 0, bArr, 0, bArr.length);
        }

        /* access modifiers changed from: protected */
        public AlgorithmParameters engineGetParameters() {
            PSource.PSpecified pSpecified;
            if (!isInitialized()) {
                return null;
            }
            try {
                AlgorithmParameters instance = AlgorithmParameters.getInstance("OAEP");
                byte[] bArr = this.label;
                if (bArr != null) {
                    pSpecified = new PSource.PSpecified(bArr);
                } else {
                    pSpecified = PSource.PSpecified.DEFAULT;
                }
                instance.init(new OAEPParameterSpec(EvpMdRef.getJcaDigestAlgorithmStandardNameFromEVP_MD(this.oaepMd), "MGF1", new MGF1ParameterSpec(EvpMdRef.getJcaDigestAlgorithmStandardNameFromEVP_MD(this.mgf1Md)), pSpecified));
                return instance;
            } catch (NoSuchAlgorithmException e) {
                throw ((Error) new AssertionError("OAEP not supported").initCause(e));
            } catch (InvalidParameterSpecException e2) {
                throw new RuntimeException("No providers of AlgorithmParameters.OAEP available");
            }
        }

        /* access modifiers changed from: protected */
        public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) {
            OAEPParameterSpec oAEPParameterSpec;
            if (algorithmParameters != null) {
                try {
                    oAEPParameterSpec = (OAEPParameterSpec) algorithmParameters.getParameterSpec(OAEPParameterSpec.class);
                } catch (InvalidParameterSpecException e) {
                    throw new InvalidAlgorithmParameterException("Only OAEP parameters are supported", e);
                }
            } else {
                oAEPParameterSpec = null;
            }
            engineInitInternal(i, key, oAEPParameterSpec);
        }

        public void engineInitInternal(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec) {
            if (i == 1 || i == 3) {
                if (!(key instanceof PublicKey)) {
                    throw new InvalidKeyException("Only public keys may be used to encrypt");
                }
            } else if ((i == 2 || i == 4) && !(key instanceof PrivateKey)) {
                throw new InvalidKeyException("Only private keys may be used to decrypt");
            }
            OpenSSLCipherRSA.super.engineInitInternal(i, key, algorithmParameterSpec);
        }

        /* access modifiers changed from: protected */
        public void engineSetPadding(String str) {
            if (str.toUpperCase(Locale.US).equals("OAEPPADDING")) {
                this.padding = 4;
                return;
            }
            throw new NoSuchPaddingException("Only OAEP padding is supported");
        }

        public int paddedBlockSizeBytes() {
            int keySizeBytes = keySizeBytes();
            int i = this.oaepMdSizeBytes;
            return keySizeBytes - ((i + i) + 2);
        }

        /* access modifiers changed from: protected */
        public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
            if (algorithmParameterSpec == null || (algorithmParameterSpec instanceof OAEPParameterSpec)) {
                engineInitInternal(i, key, algorithmParameterSpec);
                return;
            }
            throw new InvalidAlgorithmParameterException("Only OAEPParameterSpec accepted in OAEP mode");
        }
    }

    /* access modifiers changed from: protected */
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            engineUpdate(bArr, i, i2);
        }
        if (!this.inputTooLarge) {
            int i3 = this.bufferOffset;
            byte[] bArr2 = this.buffer;
            int length = bArr2.length;
            if (i3 != length) {
                if (this.padding == 3) {
                    byte[] bArr3 = new byte[length];
                    System.arraycopy(bArr2, 0, bArr3, length - i3, i3);
                    bArr2 = bArr3;
                } else {
                    bArr2 = Arrays.copyOf(bArr2, i3);
                }
            }
            int length2 = this.buffer.length;
            byte[] bArr4 = new byte[length2];
            int doCryptoOperation = doCryptoOperation(bArr2, bArr4);
            if (!this.encrypting && doCryptoOperation != length2) {
                bArr4 = Arrays.copyOf(bArr4, doCryptoOperation);
            }
            this.bufferOffset = 0;
            return bArr4;
        }
        int length3 = this.buffer.length;
        StringBuilder sb = new StringBuilder(37);
        sb.append("input must be under ");
        sb.append(length3);
        sb.append(" bytes");
        throw new IllegalBlockSizeException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public void engineInit(int i, Key key2, SecureRandom secureRandom) {
        try {
            engineInitInternal(i, key2, null);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException("Algorithm parameters rejected when none supplied", e);
        }
    }

    /* access modifiers changed from: protected */
    public void engineInit(int i, Key key2, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        if (algorithmParameterSpec != null) {
            String valueOf = String.valueOf(algorithmParameterSpec.getClass().getName());
            throw new InvalidAlgorithmParameterException(valueOf.length() == 0 ? new String("unknown param type: ") : "unknown param type: ".concat(valueOf));
        } else {
            engineInitInternal(i, key2, null);
        }
    }
}
