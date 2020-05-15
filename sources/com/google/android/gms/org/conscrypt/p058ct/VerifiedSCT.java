package com.google.android.gms.org.conscrypt.p058ct;

/* renamed from: com.google.android.gms.org.conscrypt.ct.VerifiedSCT */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class VerifiedSCT {
    public final SignedCertificateTimestamp sct;
    public final Status status;

    /* renamed from: com.google.android.gms.org.conscrypt.ct.VerifiedSCT$Status */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum Status {
        VALID,
        INVALID_SIGNATURE,
        UNKNOWN_LOG,
        INVALID_SCT
    }

    public VerifiedSCT(SignedCertificateTimestamp signedCertificateTimestamp, Status status2) {
        this.sct = signedCertificateTimestamp;
        this.status = status2;
    }
}
