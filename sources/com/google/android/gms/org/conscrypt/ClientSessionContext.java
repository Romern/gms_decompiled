package com.google.android.gms.org.conscrypt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ClientSessionContext extends AbstractSessionContext {
    private SSLClientSessionCache persistentCache;
    private final Map sessionsByHostAndPort = new HashMap();

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    final class HostAndPort {
        final String host;
        final int port;

        public HostAndPort(String str, int i) {
            this.host = str;
            this.port = i;
        }

        public boolean equals(Object obj) {
            if (obj instanceof HostAndPort) {
                HostAndPort hostAndPort = (HostAndPort) obj;
                if (!this.host.equals(hostAndPort.host) || this.port != hostAndPort.port) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.host.hashCode() * 31) + this.port;
        }
    }

    public ClientSessionContext() {
        super(10);
    }

    private NativeSslSession getSession(String str, int i) {
        NativeSslSession nativeSslSession;
        byte[] sessionData;
        NativeSslSession newInstance;
        if (str == null) {
            return null;
        }
        HostAndPort hostAndPort = new HostAndPort(str, i);
        synchronized (this.sessionsByHostAndPort) {
            List list = (List) this.sessionsByHostAndPort.get(hostAndPort);
            if (list == null || list.size() <= 0) {
                nativeSslSession = null;
            } else {
                nativeSslSession = (NativeSslSession) list.get(0);
            }
        }
        if (nativeSslSession != null && nativeSslSession.isValid()) {
            return nativeSslSession;
        }
        SSLClientSessionCache sSLClientSessionCache = this.persistentCache;
        if (sSLClientSessionCache == null || (sessionData = sSLClientSessionCache.getSessionData(str, i)) == null || (newInstance = NativeSslSession.newInstance(this, sessionData, str, i)) == null || !newInstance.isValid()) {
            return null;
        }
        putSession(hostAndPort, newInstance);
        return newInstance;
    }

    private void putSession(HostAndPort hostAndPort, NativeSslSession nativeSslSession) {
        synchronized (this.sessionsByHostAndPort) {
            List list = (List) this.sessionsByHostAndPort.get(hostAndPort);
            if (list == null) {
                list = new ArrayList();
                this.sessionsByHostAndPort.put(hostAndPort, list);
            }
            if (list.size() > 0 && ((NativeSslSession) list.get(0)).isSingleUse() != nativeSslSession.isSingleUse()) {
                while (!list.isEmpty()) {
                    removeSession((NativeSslSession) list.get(0));
                }
                this.sessionsByHostAndPort.put(hostAndPort, list);
            }
            list.add(nativeSslSession);
        }
    }

    private void removeSession(HostAndPort hostAndPort, NativeSslSession nativeSslSession) {
        synchronized (this.sessionsByHostAndPort) {
            List list = (List) this.sessionsByHostAndPort.get(hostAndPort);
            if (list != null) {
                list.remove(nativeSslSession);
                if (list.isEmpty()) {
                    this.sessionsByHostAndPort.remove(hostAndPort);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        return null;
     */
    public synchronized NativeSslSession getCachedSession(String str, int i, SSLParametersImpl sSLParametersImpl) {
        if (str != null) {
            NativeSslSession session = getSession(str, i);
            if (session != null) {
                String protocol = session.getProtocol();
                String[] strArr = sSLParametersImpl.enabledProtocols;
                int length = strArr.length;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    } else if (protocol.equals(strArr[i3])) {
                        String cipherSuite = session.getCipherSuite();
                        String[] enabledCipherSuites = sSLParametersImpl.getEnabledCipherSuites();
                        int length2 = enabledCipherSuites.length;
                        while (i2 < length2) {
                            if (!cipherSuite.equals(enabledCipherSuites[i2])) {
                                i2++;
                            } else if (session.isSingleUse()) {
                                removeSession(session);
                            }
                        }
                    } else {
                        i3++;
                    }
                }
            }
        }
    }

    public NativeSslSession getSessionFromPersistentCache(byte[] bArr) {
        return null;
    }

    public void onBeforeAddSession(NativeSslSession nativeSslSession) {
        byte[] bytes;
        String peerHost = nativeSslSession.getPeerHost();
        int peerPort = nativeSslSession.getPeerPort();
        if (peerHost != null) {
            putSession(new HostAndPort(peerHost, peerPort), nativeSslSession);
            if (this.persistentCache != null && !nativeSslSession.isSingleUse() && (bytes = nativeSslSession.toBytes()) != null) {
                this.persistentCache.putSessionData(nativeSslSession.toSSLSession(), bytes);
            }
        }
    }

    public void onBeforeRemoveSession(NativeSslSession nativeSslSession) {
        String peerHost = nativeSslSession.getPeerHost();
        if (peerHost != null) {
            removeSession(new HostAndPort(peerHost, nativeSslSession.getPeerPort()), nativeSslSession);
        }
    }

    public void setPersistentCache(SSLClientSessionCache sSLClientSessionCache) {
        this.persistentCache = sSLClientSessionCache;
    }

    /* access modifiers changed from: package-private */
    public int size() {
        int i;
        synchronized (this.sessionsByHostAndPort) {
            i = 0;
            for (List list : this.sessionsByHostAndPort.values()) {
                i += list.size();
            }
        }
        return i;
    }
}
