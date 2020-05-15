package com.google.android.gms.org.conscrypt.p058ct;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.google.android.gms.org.conscrypt.ct.SignedCertificateTimestamp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SignedCertificateTimestamp {
    private final byte[] extensions;
    private final byte[] logId;
    private final Origin origin;
    private final DigitallySigned signature;
    private final long timestamp;
    private final Version version;

    /* renamed from: com.google.android.gms.org.conscrypt.ct.SignedCertificateTimestamp$Origin */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum Origin {
        EMBEDDED,
        TLS_EXTENSION,
        OCSP_RESPONSE
    }

    /* renamed from: com.google.android.gms.org.conscrypt.ct.SignedCertificateTimestamp$SignatureType */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum SignatureType {
        CERTIFICATE_TIMESTAMP,
        TREE_HASH
    }

    /* renamed from: com.google.android.gms.org.conscrypt.ct.SignedCertificateTimestamp$Version */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum Version {
        V1
    }

    public SignedCertificateTimestamp(Version version2, byte[] bArr, long j, byte[] bArr2, DigitallySigned digitallySigned, Origin origin2) {
        this.version = version2;
        this.logId = bArr;
        this.timestamp = j;
        this.extensions = bArr2;
        this.signature = digitallySigned;
        this.origin = origin2;
    }

    public static SignedCertificateTimestamp decode(InputStream inputStream, Origin origin2) {
        int readNumber = Serialization.readNumber(inputStream, 1);
        if (readNumber == Version.V1.ordinal()) {
            return new SignedCertificateTimestamp(Version.V1, Serialization.readFixedBytes(inputStream, 32), Serialization.readLong(inputStream, 8), Serialization.readVariableBytes(inputStream, 2), DigitallySigned.decode(inputStream), origin2);
        }
        StringBuilder sb = new StringBuilder(35);
        sb.append("Unsupported SCT version ");
        sb.append(readNumber);
        throw new SerializationException(sb.toString());
    }

    public void encodeTBS(OutputStream outputStream, CertificateEntry certificateEntry) {
        Serialization.writeNumber(outputStream, (long) this.version.ordinal(), 1);
        Serialization.writeNumber(outputStream, (long) SignatureType.CERTIFICATE_TIMESTAMP.ordinal(), 1);
        Serialization.writeNumber(outputStream, this.timestamp, 8);
        certificateEntry.encode(outputStream);
        Serialization.writeVariableBytes(outputStream, this.extensions, 2);
    }

    public byte[] getExtensions() {
        return this.extensions;
    }

    public byte[] getLogID() {
        return this.logId;
    }

    public Origin getOrigin() {
        return this.origin;
    }

    public DigitallySigned getSignature() {
        return this.signature;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public Version getVersion() {
        return this.version;
    }

    public static SignedCertificateTimestamp decode(byte[] bArr, Origin origin2) {
        return decode(new ByteArrayInputStream(bArr), origin2);
    }

    public byte[] encodeTBS(CertificateEntry certificateEntry) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        encodeTBS(byteArrayOutputStream, certificateEntry);
        return byteArrayOutputStream.toByteArray();
    }
}
