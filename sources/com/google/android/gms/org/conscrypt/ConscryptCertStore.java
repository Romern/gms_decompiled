package com.google.android.gms.org.conscrypt;

import java.security.cert.X509Certificate;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface ConscryptCertStore {
    Set findAllIssuers(X509Certificate x509Certificate);

    X509Certificate getTrustAnchor(X509Certificate x509Certificate);
}
