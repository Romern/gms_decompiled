package com.google.android.gms.org.conscrypt;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSocket;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ApplicationProtocolSelectorAdapter {
    private static final int NO_PROTOCOL_SELECTED = -1;
    private final SSLEngine engine;
    private final ApplicationProtocolSelector selector;
    private final SSLSocket socket;

    public ApplicationProtocolSelectorAdapter(SSLEngine sSLEngine, ApplicationProtocolSelector applicationProtocolSelector) {
        Preconditions.checkNotNull(sSLEngine, "engine");
        this.engine = sSLEngine;
        this.socket = null;
        Preconditions.checkNotNull(applicationProtocolSelector, "selector");
        this.selector = applicationProtocolSelector;
    }

    /* access modifiers changed from: package-private */
    public int selectApplicationProtocol(byte[] bArr) {
        String str;
        if (bArr == null || bArr.length == 0) {
            return -1;
        }
        List<String> asList = Arrays.asList(SSLUtils.decodeProtocols(bArr));
        SSLEngine sSLEngine = this.engine;
        if (sSLEngine != null) {
            str = this.selector.selectApplicationProtocol(sSLEngine, asList);
        } else {
            str = this.selector.selectApplicationProtocol(this.socket, asList);
        }
        if (str != null && !str.isEmpty()) {
            int i = 0;
            for (String str2 : asList) {
                if (str.equals(str2)) {
                    return i;
                }
                i += str2.length() + 1;
            }
        }
        return -1;
    }

    public ApplicationProtocolSelectorAdapter(SSLSocket sSLSocket, ApplicationProtocolSelector applicationProtocolSelector) {
        this.engine = null;
        Preconditions.checkNotNull(sSLSocket, "socket");
        this.socket = sSLSocket;
        Preconditions.checkNotNull(applicationProtocolSelector, "selector");
        this.selector = applicationProtocolSelector;
    }
}
