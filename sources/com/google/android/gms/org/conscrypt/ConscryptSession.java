package com.google.android.gms.org.conscrypt;

import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLSession;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
interface ConscryptSession extends SSLSession {
    X509Certificate[] getPeerCertificates();

    byte[] getPeerSignedCertificateTimestamp();

    String getRequestedServerName();

    List getStatusResponses();
}
