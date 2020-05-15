package com.google.android.gms.org.conscrypt.p058ct;

import com.google.android.gms.org.conscrypt.p058ct.VerifiedSCT;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.org.conscrypt.ct.CTLogInfo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CTLogInfo {
    private final String description;
    private final byte[] logId;
    private final PublicKey publicKey;
    private final String url;

    public CTLogInfo(PublicKey publicKey2, String str, String str2) {
        try {
            this.logId = MessageDigest.getInstance("SHA-256").digest(publicKey2.getEncoded());
            this.publicKey = publicKey2;
            this.description = str;
            this.url = str2;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CTLogInfo) {
            CTLogInfo cTLogInfo = (CTLogInfo) obj;
            return this.publicKey.equals(cTLogInfo.publicKey) && this.description.equals(cTLogInfo.description) && this.url.equals(cTLogInfo.url);
        }
    }

    public String getDescription() {
        return this.description;
    }

    public byte[] getID() {
        return this.logId;
    }

    public PublicKey getPublicKey() {
        return this.publicKey;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return ((((this.publicKey.hashCode() + 31) * 31) + this.description.hashCode()) * 31) + this.url.hashCode();
    }

    public VerifiedSCT.Status verifySingleSCT(SignedCertificateTimestamp signedCertificateTimestamp, CertificateEntry certificateEntry) {
        if (!Arrays.equals(signedCertificateTimestamp.getLogID(), getID())) {
            return VerifiedSCT.Status.UNKNOWN_LOG;
        }
        try {
            byte[] encodeTBS = signedCertificateTimestamp.encodeTBS(certificateEntry);
            try {
                Signature instance = Signature.getInstance(signedCertificateTimestamp.getSignature().getAlgorithm());
                try {
                    instance.initVerify(this.publicKey);
                    try {
                        instance.update(encodeTBS);
                        if (instance.verify(signedCertificateTimestamp.getSignature().getSignature())) {
                            return VerifiedSCT.Status.VALID;
                        }
                        return VerifiedSCT.Status.INVALID_SIGNATURE;
                    } catch (SignatureException e) {
                        throw new RuntimeException(e);
                    }
                } catch (InvalidKeyException e2) {
                    return VerifiedSCT.Status.INVALID_SCT;
                }
            } catch (NoSuchAlgorithmException e3) {
                return VerifiedSCT.Status.INVALID_SCT;
            }
        } catch (SerializationException e4) {
            return VerifiedSCT.Status.INVALID_SCT;
        }
    }
}
