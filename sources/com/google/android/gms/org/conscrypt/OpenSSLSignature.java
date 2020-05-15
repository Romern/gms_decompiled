package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.EvpMdRef;
import com.google.android.gms.org.conscrypt.NativeRef;
import java.nio.ByteBuffer;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.ProviderException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OpenSSLSignature extends SignatureSpi {
    private NativeRef.EVP_MD_CTX ctx;
    private final EngineType engineType;
    private final long evpMdRef;
    private long evpPkeyCtx;
    private OpenSSLKey key;
    private boolean signing;
    private final byte[] singleByte;

    /* renamed from: com.google.android.gms.org.conscrypt.OpenSSLSignature$1 */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    /* synthetic */ class C16491 {
        static final /* synthetic */ int[] $SwitchMap$org$conscrypt$OpenSSLSignature$EngineType;

        static {
            int[] iArr = new int[EngineType.values().length];
            $SwitchMap$org$conscrypt$OpenSSLSignature$EngineType = iArr;
            try {
                iArr[EngineType.RSA.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$org$conscrypt$OpenSSLSignature$EngineType[EngineType.EC.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    enum EngineType {
        RSA,
        EC
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class MD5RSA extends RSAPKCS1Padding {
        public MD5RSA() {
            super(EvpMdRef.MD5.EVP_MD);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    abstract class RSAPKCS1Padding extends OpenSSLSignature {
        public RSAPKCS1Padding(long j) {
            super(j, EngineType.RSA, null);
        }

        /* access modifiers changed from: protected */
        public final void configureEVP_PKEY_CTX(long j) {
            NativeCrypto.EVP_PKEY_CTX_set_rsa_padding(j, 1);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    abstract class RSAPSSPadding extends OpenSSLSignature {
        private static final int TRAILER_FIELD_BC_ID = 1;
        private final String contentDigestAlgorithm;
        private String mgf1DigestAlgorithm;
        private long mgf1EvpMdRef;
        private int saltSizeBytes;

        public RSAPSSPadding(long j, String str, int i) {
            super(j, EngineType.RSA, null);
            this.contentDigestAlgorithm = str;
            this.mgf1DigestAlgorithm = str;
            this.mgf1EvpMdRef = j;
            this.saltSizeBytes = i;
        }

        /* access modifiers changed from: protected */
        public final void configureEVP_PKEY_CTX(long j) {
            NativeCrypto.EVP_PKEY_CTX_set_rsa_padding(j, 6);
            NativeCrypto.EVP_PKEY_CTX_set_rsa_mgf1_md(j, this.mgf1EvpMdRef);
            NativeCrypto.EVP_PKEY_CTX_set_rsa_pss_saltlen(j, this.saltSizeBytes);
        }

        /* access modifiers changed from: protected */
        public final AlgorithmParameters engineGetParameters() {
            try {
                AlgorithmParameters instance = AlgorithmParameters.getInstance("PSS");
                instance.init(new PSSParameterSpec(this.contentDigestAlgorithm, "MGF1", new MGF1ParameterSpec(this.mgf1DigestAlgorithm), this.saltSizeBytes, 1));
                return instance;
            } catch (NoSuchAlgorithmException e) {
                throw new ProviderException("Failed to create PSS AlgorithmParameters", e);
            } catch (InvalidParameterSpecException e2) {
                throw new ProviderException("Failed to create PSS AlgorithmParameters", e2);
            }
        }

        /* access modifiers changed from: protected */
        public final void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
            if (algorithmParameterSpec instanceof PSSParameterSpec) {
                PSSParameterSpec pSSParameterSpec = (PSSParameterSpec) algorithmParameterSpec;
                String jcaDigestAlgorithmStandardName = EvpMdRef.getJcaDigestAlgorithmStandardName(pSSParameterSpec.getDigestAlgorithm());
                if (jcaDigestAlgorithmStandardName == null) {
                    String valueOf = String.valueOf(pSSParameterSpec.getDigestAlgorithm());
                    throw new InvalidAlgorithmParameterException(valueOf.length() == 0 ? new String("Unsupported content digest algorithm: ") : "Unsupported content digest algorithm: ".concat(valueOf));
                } else if (this.contentDigestAlgorithm.equalsIgnoreCase(jcaDigestAlgorithmStandardName)) {
                    String mGFAlgorithm = pSSParameterSpec.getMGFAlgorithm();
                    if ("MGF1".equalsIgnoreCase(mGFAlgorithm) || "1.2.840.113549.1.1.8".equals(mGFAlgorithm)) {
                        AlgorithmParameterSpec mGFParameters = pSSParameterSpec.getMGFParameters();
                        if (mGFParameters instanceof MGF1ParameterSpec) {
                            MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) pSSParameterSpec.getMGFParameters();
                            String jcaDigestAlgorithmStandardName2 = EvpMdRef.getJcaDigestAlgorithmStandardName(mGF1ParameterSpec.getDigestAlgorithm());
                            if (jcaDigestAlgorithmStandardName2 == null) {
                                String valueOf2 = String.valueOf(mGF1ParameterSpec.getDigestAlgorithm());
                                throw new InvalidAlgorithmParameterException(valueOf2.length() == 0 ? new String("Unsupported MGF1 digest algorithm: ") : "Unsupported MGF1 digest algorithm: ".concat(valueOf2));
                            }
                            try {
                                long eVP_MDByJcaDigestAlgorithmStandardName = EvpMdRef.getEVP_MDByJcaDigestAlgorithmStandardName(jcaDigestAlgorithmStandardName2);
                                int saltLength = pSSParameterSpec.getSaltLength();
                                if (saltLength >= 0) {
                                    int trailerField = pSSParameterSpec.getTrailerField();
                                    if (trailerField == 1) {
                                        this.mgf1DigestAlgorithm = jcaDigestAlgorithmStandardName2;
                                        this.mgf1EvpMdRef = eVP_MDByJcaDigestAlgorithmStandardName;
                                        this.saltSizeBytes = saltLength;
                                        long evp_pkey_ctx = getEVP_PKEY_CTX();
                                        if (evp_pkey_ctx != 0) {
                                            configureEVP_PKEY_CTX(evp_pkey_ctx);
                                            return;
                                        }
                                        return;
                                    }
                                    StringBuilder sb = new StringBuilder(56);
                                    sb.append("Unsupported trailer field: ");
                                    sb.append(trailerField);
                                    sb.append(". Only 1 supported");
                                    throw new InvalidAlgorithmParameterException(sb.toString());
                                }
                                StringBuilder sb2 = new StringBuilder(45);
                                sb2.append("Salt length must be non-negative: ");
                                sb2.append(saltLength);
                                throw new InvalidAlgorithmParameterException(sb2.toString());
                            } catch (NoSuchAlgorithmException e) {
                                throw new ProviderException(jcaDigestAlgorithmStandardName2.length() == 0 ? new String("Failed to obtain EVP_MD for ") : "Failed to obtain EVP_MD for ".concat(jcaDigestAlgorithmStandardName2), e);
                            }
                        } else {
                            String valueOf3 = String.valueOf(mGFParameters);
                            String name = MGF1ParameterSpec.class.getName();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 45 + String.valueOf(name).length());
                            sb3.append("Unsupported MGF parameters: ");
                            sb3.append(valueOf3);
                            sb3.append(". Only ");
                            sb3.append(name);
                            sb3.append(" supported");
                            throw new InvalidAlgorithmParameterException(sb3.toString());
                        }
                    } else {
                        StringBuilder sb4 = new StringBuilder(String.valueOf(mGFAlgorithm).length() + 48);
                        sb4.append("Unsupported MGF algorithm: ");
                        sb4.append(mGFAlgorithm);
                        sb4.append(". Only MGF1 supported");
                        throw new InvalidAlgorithmParameterException(sb4.toString());
                    }
                } else {
                    throw new InvalidAlgorithmParameterException("Changing content digest algorithm not supported");
                }
            } else {
                String valueOf4 = String.valueOf(algorithmParameterSpec);
                String name2 = PSSParameterSpec.class.getName();
                StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf4).length() + 40 + String.valueOf(name2).length());
                sb5.append("Unsupported parameter: ");
                sb5.append(valueOf4);
                sb5.append(". Only ");
                sb5.append(name2);
                sb5.append(" supported");
                throw new InvalidAlgorithmParameterException(sb5.toString());
            }
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class SHA1ECDSA extends OpenSSLSignature {
        public SHA1ECDSA() {
            super(EvpMdRef.SHA1.EVP_MD, EngineType.EC, null);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class SHA1RSA extends RSAPKCS1Padding {
        public SHA1RSA() {
            super(EvpMdRef.SHA1.EVP_MD);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class SHA1RSAPSS extends RSAPSSPadding {
        public SHA1RSAPSS() {
            super(EvpMdRef.SHA1.EVP_MD, "SHA-1", EvpMdRef.SHA1.SIZE_BYTES);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class SHA224ECDSA extends OpenSSLSignature {
        public SHA224ECDSA() {
            super(EvpMdRef.SHA224.EVP_MD, EngineType.EC, null);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class SHA224RSA extends RSAPKCS1Padding {
        public SHA224RSA() {
            super(EvpMdRef.SHA224.EVP_MD);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class SHA224RSAPSS extends RSAPSSPadding {
        public SHA224RSAPSS() {
            super(EvpMdRef.SHA224.EVP_MD, "SHA-224", EvpMdRef.SHA224.SIZE_BYTES);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class SHA256ECDSA extends OpenSSLSignature {
        public SHA256ECDSA() {
            super(EvpMdRef.SHA256.EVP_MD, EngineType.EC, null);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class SHA256RSA extends RSAPKCS1Padding {
        public SHA256RSA() {
            super(EvpMdRef.SHA256.EVP_MD);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class SHA256RSAPSS extends RSAPSSPadding {
        public SHA256RSAPSS() {
            super(EvpMdRef.SHA256.EVP_MD, "SHA-256", EvpMdRef.SHA256.SIZE_BYTES);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class SHA384ECDSA extends OpenSSLSignature {
        public SHA384ECDSA() {
            super(EvpMdRef.SHA384.EVP_MD, EngineType.EC, null);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class SHA384RSA extends RSAPKCS1Padding {
        public SHA384RSA() {
            super(EvpMdRef.SHA384.EVP_MD);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class SHA384RSAPSS extends RSAPSSPadding {
        public SHA384RSAPSS() {
            super(EvpMdRef.SHA384.EVP_MD, "SHA-384", EvpMdRef.SHA384.SIZE_BYTES);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class SHA512ECDSA extends OpenSSLSignature {
        public SHA512ECDSA() {
            super(EvpMdRef.SHA512.EVP_MD, EngineType.EC, null);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class SHA512RSA extends RSAPKCS1Padding {
        public SHA512RSA() {
            super(EvpMdRef.SHA512.EVP_MD);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class SHA512RSAPSS extends RSAPSSPadding {
        public SHA512RSAPSS() {
            super(EvpMdRef.SHA512.EVP_MD, "SHA-512", EvpMdRef.SHA512.SIZE_BYTES);
        }
    }

    private OpenSSLSignature(long j, EngineType engineType2) {
        this.singleByte = new byte[1];
        this.engineType = engineType2;
        this.evpMdRef = j;
    }

    private void checkEngineType(OpenSSLKey openSSLKey) {
        int EVP_PKEY_type = NativeCrypto.EVP_PKEY_type(openSSLKey.getNativeRef());
        EngineType engineType2 = EngineType.RSA;
        int ordinal = this.engineType.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                String valueOf = String.valueOf(this.engineType);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("Key must be of type ");
                sb.append(valueOf);
                throw new InvalidKeyException(sb.toString());
            } else if (EVP_PKEY_type != 408) {
                String valueOf2 = String.valueOf(this.engineType);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 34);
                sb2.append("Signature initialized as ");
                sb2.append(valueOf2);
                sb2.append(" (not EC)");
                throw new InvalidKeyException(sb2.toString());
            }
        } else if (EVP_PKEY_type != 6) {
            String valueOf3 = String.valueOf(this.engineType);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 35);
            sb3.append("Signature initialized as ");
            sb3.append(valueOf3);
            sb3.append(" (not RSA)");
            throw new InvalidKeyException(sb3.toString());
        }
    }

    private void initInternal(OpenSSLKey openSSLKey, boolean z) {
        checkEngineType(openSSLKey);
        this.key = openSSLKey;
        this.signing = z;
        try {
            resetContext();
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException(e);
        }
    }

    private void resetContext() {
        long j;
        NativeRef.EVP_MD_CTX evp_md_ctx = new NativeRef.EVP_MD_CTX(NativeCrypto.EVP_MD_CTX_create());
        if (this.signing) {
            j = NativeCrypto.EVP_DigestSignInit(evp_md_ctx, this.evpMdRef, this.key.getNativeRef());
            this.evpPkeyCtx = j;
        } else {
            j = NativeCrypto.EVP_DigestVerifyInit(evp_md_ctx, this.evpMdRef, this.key.getNativeRef());
            this.evpPkeyCtx = j;
        }
        configureEVP_PKEY_CTX(j);
        this.ctx = evp_md_ctx;
    }

    /* access modifiers changed from: protected */
    public void configureEVP_PKEY_CTX(long j) {
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public Object engineGetParameter(String str) {
        return null;
    }

    /* access modifiers changed from: protected */
    public void engineInitSign(PrivateKey privateKey) {
        initInternal(OpenSSLKey.fromPrivateKey(privateKey), true);
    }

    /* access modifiers changed from: protected */
    public void engineInitVerify(PublicKey publicKey) {
        initInternal(OpenSSLKey.fromPublicKey(publicKey), false);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void engineSetParameter(String str, Object obj) {
    }

    /* access modifiers changed from: protected */
    public byte[] engineSign() {
        try {
            byte[] EVP_DigestSignFinal = NativeCrypto.EVP_DigestSignFinal(this.ctx);
            try {
                resetContext();
                return EVP_DigestSignFinal;
            } catch (InvalidAlgorithmParameterException e) {
                throw new AssertionError("Reset of context failed after it was successful once");
            }
        } catch (Exception e2) {
            throw new SignatureException(e2);
        } catch (Throwable th) {
            try {
                resetContext();
                throw th;
            } catch (InvalidAlgorithmParameterException e3) {
                throw new AssertionError("Reset of context failed after it was successful once");
            }
        }
    }

    /* access modifiers changed from: protected */
    public void engineUpdate(byte b) {
        byte[] bArr = this.singleByte;
        bArr[0] = b;
        engineUpdate(bArr, 0, 1);
    }

    /* access modifiers changed from: protected */
    public boolean engineVerify(byte[] bArr) {
        try {
            boolean EVP_DigestVerifyFinal = NativeCrypto.EVP_DigestVerifyFinal(this.ctx, bArr, 0, bArr.length);
            try {
                resetContext();
                return EVP_DigestVerifyFinal;
            } catch (InvalidAlgorithmParameterException e) {
                throw new AssertionError("Reset of context failed after it was successful once");
            }
        } catch (Exception e2) {
            throw new SignatureException(e2);
        } catch (Throwable th) {
            try {
                resetContext();
                throw th;
            } catch (InvalidAlgorithmParameterException e3) {
                throw new AssertionError("Reset of context failed after it was successful once");
            }
        }
    }

    /* access modifiers changed from: protected */
    public final long getEVP_PKEY_CTX() {
        return this.evpPkeyCtx;
    }

    /* access modifiers changed from: protected */
    public void engineUpdate(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        if (!byteBuffer.isDirect()) {
            super.engineUpdate(byteBuffer);
            return;
        }
        long directBufferAddress = NativeCrypto.getDirectBufferAddress(byteBuffer);
        if (directBufferAddress == 0) {
            super.engineUpdate(byteBuffer);
            return;
        }
        int position = byteBuffer.position();
        if (position >= 0) {
            long j = directBufferAddress + ((long) position);
            int remaining = byteBuffer.remaining();
            if (remaining >= 0) {
                NativeRef.EVP_MD_CTX evp_md_ctx = this.ctx;
                if (this.signing) {
                    NativeCrypto.EVP_DigestSignUpdateDirect(evp_md_ctx, j, remaining);
                } else {
                    NativeCrypto.EVP_DigestVerifyUpdateDirect(evp_md_ctx, j, remaining);
                }
                byteBuffer.position(position + remaining);
                return;
            }
            throw new RuntimeException("Negative remaining amount");
        }
        throw new RuntimeException("Negative position");
    }

    public /* synthetic */ OpenSSLSignature(long j, EngineType engineType2, C16491 r4) {
        this(j, engineType2);
    }

    /* access modifiers changed from: protected */
    public void engineUpdate(byte[] bArr, int i, int i2) {
        NativeRef.EVP_MD_CTX evp_md_ctx = this.ctx;
        if (this.signing) {
            NativeCrypto.EVP_DigestSignUpdate(evp_md_ctx, bArr, i, i2);
        } else {
            NativeCrypto.EVP_DigestVerifyUpdate(evp_md_ctx, bArr, i, i2);
        }
    }
}
