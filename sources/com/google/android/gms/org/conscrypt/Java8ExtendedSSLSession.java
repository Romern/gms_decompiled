package com.google.android.gms.org.conscrypt;

import java.util.Collections;
import java.util.List;
import javax.net.ssl.SNIHostName;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class Java8ExtendedSSLSession extends Java7ExtendedSSLSession {
    public Java8ExtendedSSLSession(ExternalSession externalSession) {
        super(externalSession);
    }

    public final List getRequestedServerNames() {
        String requestedServerName = this.delegate.getRequestedServerName();
        if (requestedServerName != null) {
            return Collections.singletonList(new SNIHostName(requestedServerName));
        }
        return null;
    }
}
