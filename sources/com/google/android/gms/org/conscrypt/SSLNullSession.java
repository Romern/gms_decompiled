package com.google.android.gms.org.conscrypt;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class SSLNullSession implements ConscryptSession, Cloneable {
    static final String INVALID_CIPHER = "SSL_NULL_WITH_NULL_NULL";
    private long creationTime;
    private long lastAccessedTime;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class DefaultHolder {
        static final SSLNullSession NULL_SESSION = new SSLNullSession();

        private DefaultHolder() {
        }
    }

    private SSLNullSession() {
        long currentTimeMillis = System.currentTimeMillis();
        this.creationTime = currentTimeMillis;
        this.lastAccessedTime = currentTimeMillis;
    }

    static ConscryptSession getNullSession() {
        return DefaultHolder.NULL_SESSION;
    }

    public int getApplicationBufferSize() {
        return AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
    }

    public String getCipherSuite() {
        return INVALID_CIPHER;
    }

    public long getCreationTime() {
        return this.creationTime;
    }

    public byte[] getId() {
        return EmptyArray.BYTE;
    }

    public long getLastAccessedTime() {
        return this.lastAccessedTime;
    }

    public Certificate[] getLocalCertificates() {
        return null;
    }

    public Principal getLocalPrincipal() {
        return null;
    }

    public int getPacketBufferSize() {
        return 16709;
    }

    public X509Certificate[] getPeerCertificateChain() {
        throw new SSLPeerUnverifiedException("No peer certificate");
    }

    public String getPeerHost() {
        return null;
    }

    public int getPeerPort() {
        return -1;
    }

    public Principal getPeerPrincipal() {
        throw new SSLPeerUnverifiedException("No peer certificate");
    }

    public byte[] getPeerSignedCertificateTimestamp() {
        return EmptyArray.BYTE;
    }

    public String getProtocol() {
        return "NONE";
    }

    public String getRequestedServerName() {
        return null;
    }

    public SSLSessionContext getSessionContext() {
        return null;
    }

    public List getStatusResponses() {
        return Collections.emptyList();
    }

    public Object getValue(String str) {
        throw new UnsupportedOperationException("All calls to this method should be intercepted by ProvidedSessionDecorator.");
    }

    public String[] getValueNames() {
        throw new UnsupportedOperationException("All calls to this method should be intercepted by ProvidedSessionDecorator.");
    }

    public void invalidate() {
    }

    public boolean isValid() {
        return false;
    }

    public void putValue(String str, Object obj) {
        throw new UnsupportedOperationException("All calls to this method should be intercepted by ProvidedSessionDecorator.");
    }

    public void removeValue(String str) {
        throw new UnsupportedOperationException("All calls to this method should be intercepted by ProvidedSessionDecorator.");
    }

    public java.security.cert.X509Certificate[] getPeerCertificates() {
        throw new SSLPeerUnverifiedException("No peer certificate");
    }
}
