package p000;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;

/* renamed from: bcjs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcjs {
    /* renamed from: a */
    public static final void m89169a(cifv cifv) {
        try {
            SSLContext instance = SSLContext.getInstance("TLS");
            instance.init(null, null, null);
            cifv.sslSocketFactory(instance.getSocketFactory());
        } catch (KeyManagementException | NoSuchAlgorithmException e) {
            bbos.m88294d("OkHttpChannelBuilder", "Failed to set SocketFactory");
        }
    }
}
