package p000;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.logging.Level;

/* renamed from: cidv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cidv {
    /* renamed from: a */
    public static final PasswordAuthentication m150096a(String str, InetAddress inetAddress, int i, String str2, String str3) {
        URL url;
        try {
            url = new URL(str2, str, i, "");
        } catch (MalformedURLException e) {
            cidx.f189935a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl$1", "requestPasswordAuthentication", String.format("failed to create URL for Authenticator: %s %s", str2, str));
            url = null;
        }
        return Authenticator.requestPasswordAuthentication(str, inetAddress, i, str2, str3, null, url, Authenticator.RequestorType.PROXY);
    }
}
