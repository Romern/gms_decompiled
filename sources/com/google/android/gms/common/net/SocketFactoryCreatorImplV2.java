package com.google.android.gms.common.net;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.org.conscrypt.ClientSessionContext;
import com.google.android.gms.org.conscrypt.FileClientSessionCache;
import com.google.android.gms.org.conscrypt.OpenSSLContextImpl;
import com.google.android.gms.org.conscrypt.SSLClientSessionCache;
import java.io.File;
import java.io.IOException;
import java.security.KeyManagementException;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SocketFactoryCreatorImplV2 extends set {
    /* renamed from: a */
    private static final SSLClientSessionCache m22635a(Context context, String str) {
        File dir = context.getDir(str, 0);
        try {
            return FileClientSessionCache.usingDirectory(dir);
        } catch (IOException e) {
            String valueOf = String.valueOf(dir);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
            sb.append("Unable to create SSL session cache in ");
            sb.append(valueOf);
            Log.w("SSLCertSocketFactory", sb.toString(), e);
            return null;
        }
    }

    public vzr newSocketFactory(vzr vzr, vzr vzr2, vzr vzr3, boolean z) {
        SSLClientSessionCache sSLClientSessionCache;
        Context context = (Context) vzs.m41641a(vzr);
        if (z) {
            sSLClientSessionCache = m22635a(context, "sslcache");
        } else {
            sSLClientSessionCache = null;
        }
        return vzs.m41642a(m22636a((KeyManager[]) vzs.m41641a(vzr2), (TrustManager[]) vzs.m41641a(vzr3), sSLClientSessionCache));
    }

    public vzr newSocketFactoryWithCacheDir(vzr vzr, vzr vzr2, vzr vzr3, String str) {
        return vzs.m41642a(m22636a((KeyManager[]) vzs.m41641a(vzr2), (TrustManager[]) vzs.m41641a(vzr3), m22635a((Context) vzs.m41641a(vzr), str)));
    }

    /* renamed from: a */
    private static final SSLSocketFactory m22636a(KeyManager[] keyManagerArr, TrustManager[] trustManagerArr, SSLClientSessionCache sSLClientSessionCache) {
        try {
            OpenSSLContextImpl preferred = OpenSSLContextImpl.getPreferred();
            preferred.engineInit(keyManagerArr, trustManagerArr, null);
            ((ClientSessionContext) preferred.engineGetClientSessionContext()).setPersistentCache(sSLClientSessionCache);
            return preferred.engineGetSocketFactory();
        } catch (KeyManagementException e) {
            Log.wtf("SSLCertSocketFactory", e);
            return (SSLSocketFactory) SSLSocketFactory.getDefault();
        }
    }
}
