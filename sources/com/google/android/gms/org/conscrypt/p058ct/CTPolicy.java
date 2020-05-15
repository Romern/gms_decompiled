package com.google.android.gms.org.conscrypt.p058ct;

import java.security.cert.X509Certificate;

/* renamed from: com.google.android.gms.org.conscrypt.ct.CTPolicy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface CTPolicy {
    boolean doesResultConformToPolicy(CTVerificationResult cTVerificationResult, String str, X509Certificate[] x509CertificateArr);
}
