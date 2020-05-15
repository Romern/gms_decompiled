package com.google.android.gms.org.conscrypt;

import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.ExtendedSSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class Java7ExtendedSSLSession extends ExtendedSSLSession implements ConscryptSession {
    private static final String[] LOCAL_SUPPORTED_SIGNATURE_ALGORITHMS = {"SHA512withRSA", "SHA512withECDSA", "SHA384withRSA", "SHA384withECDSA", "SHA256withRSA", "SHA256withECDSA", "SHA224withRSA", "SHA224withECDSA", "SHA1withRSA", "SHA1withECDSA"};
    private static final String[] PEER_SUPPORTED_SIGNATURE_ALGORITHMS = {"SHA1withRSA", "SHA1withECDSA"};
    protected final ExternalSession delegate;

    public Java7ExtendedSSLSession(ExternalSession externalSession) {
        this.delegate = externalSession;
    }

    public final int getApplicationBufferSize() {
        return this.delegate.getApplicationBufferSize();
    }

    public final String getCipherSuite() {
        return this.delegate.getCipherSuite();
    }

    public final long getCreationTime() {
        return this.delegate.getCreationTime();
    }

    public final byte[] getId() {
        return this.delegate.getId();
    }

    public final long getLastAccessedTime() {
        return this.delegate.getLastAccessedTime();
    }

    public final Certificate[] getLocalCertificates() {
        return this.delegate.getLocalCertificates();
    }

    public final Principal getLocalPrincipal() {
        return this.delegate.getLocalPrincipal();
    }

    public final String[] getLocalSupportedSignatureAlgorithms() {
        return (String[]) LOCAL_SUPPORTED_SIGNATURE_ALGORITHMS.clone();
    }

    public final int getPacketBufferSize() {
        return this.delegate.getPacketBufferSize();
    }

    public final X509Certificate[] getPeerCertificateChain() {
        return this.delegate.getPeerCertificateChain();
    }

    public final String getPeerHost() {
        return this.delegate.getPeerHost();
    }

    public final int getPeerPort() {
        return this.delegate.getPeerPort();
    }

    public final Principal getPeerPrincipal() {
        return this.delegate.getPeerPrincipal();
    }

    public final byte[] getPeerSignedCertificateTimestamp() {
        return this.delegate.getPeerSignedCertificateTimestamp();
    }

    public final String[] getPeerSupportedSignatureAlgorithms() {
        return (String[]) PEER_SUPPORTED_SIGNATURE_ALGORITHMS.clone();
    }

    public final String getProtocol() {
        return this.delegate.getProtocol();
    }

    public final String getRequestedServerName() {
        return this.delegate.getRequestedServerName();
    }

    public final SSLSessionContext getSessionContext() {
        return this.delegate.getSessionContext();
    }

    public final List getStatusResponses() {
        return this.delegate.getStatusResponses();
    }

    public final Object getValue(String str) {
        return this.delegate.getValue(str);
    }

    public final String[] getValueNames() {
        return this.delegate.getValueNames();
    }

    public final void invalidate() {
        this.delegate.invalidate();
    }

    public final boolean isValid() {
        return this.delegate.isValid();
    }

    public final void putValue(String str, Object obj) {
        this.delegate.putValue(this, str, obj);
    }

    public final void removeValue(String str) {
        this.delegate.removeValue(this, str);
    }

    public java.security.cert.X509Certificate[] getPeerCertificates() {
        return this.delegate.getPeerCertificates();
    }
}
