package com.google.android.gms.org.conscrypt.p058ct;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* renamed from: com.google.android.gms.org.conscrypt.ct.DigitallySigned */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DigitallySigned {
    private final HashAlgorithm hashAlgorithm;
    private final byte[] signature;
    private final SignatureAlgorithm signatureAlgorithm;

    /* renamed from: com.google.android.gms.org.conscrypt.ct.DigitallySigned$HashAlgorithm */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum HashAlgorithm {
        NONE,
        MD5,
        SHA1,
        SHA224,
        SHA256,
        SHA384,
        SHA512;
        
        private static HashAlgorithm[] values = values();

        public static HashAlgorithm valueOf(int i) {
            try {
                return values[i];
            } catch (IndexOutOfBoundsException e) {
                StringBuilder sb = new StringBuilder(34);
                sb.append("Invalid hash algorithm ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString(), e);
            }
        }
    }

    /* renamed from: com.google.android.gms.org.conscrypt.ct.DigitallySigned$SignatureAlgorithm */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum SignatureAlgorithm {
        ANONYMOUS,
        RSA,
        DSA,
        ECDSA;
        
        private static SignatureAlgorithm[] values = values();

        public static SignatureAlgorithm valueOf(int i) {
            try {
                return values[i];
            } catch (IndexOutOfBoundsException e) {
                StringBuilder sb = new StringBuilder(39);
                sb.append("Invalid signature algorithm ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString(), e);
            }
        }
    }

    public DigitallySigned(int i, int i2, byte[] bArr) {
        this(HashAlgorithm.valueOf(i), SignatureAlgorithm.valueOf(i2), bArr);
    }

    public static DigitallySigned decode(InputStream inputStream) {
        try {
            return new DigitallySigned(Serialization.readNumber(inputStream, 1), Serialization.readNumber(inputStream, 1), Serialization.readVariableBytes(inputStream, 2));
        } catch (IllegalArgumentException e) {
            throw new SerializationException(e);
        }
    }

    public String getAlgorithm() {
        return String.format("%swith%s", this.hashAlgorithm, this.signatureAlgorithm);
    }

    public HashAlgorithm getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    public byte[] getSignature() {
        return this.signature;
    }

    public SignatureAlgorithm getSignatureAlgorithm() {
        return this.signatureAlgorithm;
    }

    public DigitallySigned(HashAlgorithm hashAlgorithm2, SignatureAlgorithm signatureAlgorithm2, byte[] bArr) {
        this.hashAlgorithm = hashAlgorithm2;
        this.signatureAlgorithm = signatureAlgorithm2;
        this.signature = bArr;
    }

    public static DigitallySigned decode(byte[] bArr) {
        return decode(new ByteArrayInputStream(bArr));
    }
}
