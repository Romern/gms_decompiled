package com.google.android.gms.org.conscrypt;

import java.security.Principal;
import java.security.cert.Certificate;
import java.util.HashMap;
import java.util.List;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionBindingEvent;
import javax.net.ssl.SSLSessionBindingListener;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ExternalSession implements ConscryptSession {
    private final Provider provider;
    private final HashMap values = new HashMap(2);

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    interface Provider {
        ConscryptSession provideSession();
    }

    public ExternalSession(Provider provider2) {
        this.provider = provider2;
    }

    public int getApplicationBufferSize() {
        return this.provider.provideSession().getApplicationBufferSize();
    }

    public String getCipherSuite() {
        return this.provider.provideSession().getCipherSuite();
    }

    public long getCreationTime() {
        return this.provider.provideSession().getCreationTime();
    }

    public byte[] getId() {
        return this.provider.provideSession().getId();
    }

    public long getLastAccessedTime() {
        return this.provider.provideSession().getLastAccessedTime();
    }

    public Certificate[] getLocalCertificates() {
        return this.provider.provideSession().getLocalCertificates();
    }

    public Principal getLocalPrincipal() {
        return this.provider.provideSession().getLocalPrincipal();
    }

    public int getPacketBufferSize() {
        return this.provider.provideSession().getPacketBufferSize();
    }

    public X509Certificate[] getPeerCertificateChain() {
        return this.provider.provideSession().getPeerCertificateChain();
    }

    public String getPeerHost() {
        return this.provider.provideSession().getPeerHost();
    }

    public int getPeerPort() {
        return this.provider.provideSession().getPeerPort();
    }

    public Principal getPeerPrincipal() {
        return this.provider.provideSession().getPeerPrincipal();
    }

    public byte[] getPeerSignedCertificateTimestamp() {
        return this.provider.provideSession().getPeerSignedCertificateTimestamp();
    }

    public String getProtocol() {
        return this.provider.provideSession().getProtocol();
    }

    public String getRequestedServerName() {
        return this.provider.provideSession().getRequestedServerName();
    }

    public SSLSessionContext getSessionContext() {
        return this.provider.provideSession().getSessionContext();
    }

    public List getStatusResponses() {
        return this.provider.provideSession().getStatusResponses();
    }

    public Object getValue(String str) {
        if (str != null) {
            return this.values.get(str);
        }
        throw new IllegalArgumentException("name == null");
    }

    public String[] getValueNames() {
        return (String[]) this.values.keySet().toArray(new String[this.values.size()]);
    }

    public void invalidate() {
        this.provider.provideSession().invalidate();
    }

    public boolean isValid() {
        return this.provider.provideSession().isValid();
    }

    public void putValue(String str, Object obj) {
        putValue(this, str, obj);
    }

    public void removeValue(String str) {
        removeValue(this, str);
    }

    public java.security.cert.X509Certificate[] getPeerCertificates() {
        return this.provider.provideSession().getPeerCertificates();
    }

    public void putValue(SSLSession sSLSession, String str, Object obj) {
        if (str == null || obj == null) {
            throw new IllegalArgumentException("name == null || value == null");
        }
        Object put = this.values.put(str, obj);
        if (obj instanceof SSLSessionBindingListener) {
            ((SSLSessionBindingListener) obj).valueBound(new SSLSessionBindingEvent(sSLSession, str));
        }
        if (put instanceof SSLSessionBindingListener) {
            ((SSLSessionBindingListener) put).valueUnbound(new SSLSessionBindingEvent(sSLSession, str));
        }
    }

    public void removeValue(SSLSession sSLSession, String str) {
        if (str != null) {
            Object remove = this.values.remove(str);
            if (remove instanceof SSLSessionBindingListener) {
                ((SSLSessionBindingListener) remove).valueUnbound(new SSLSessionBindingEvent(sSLSession, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("name == null");
    }
}
