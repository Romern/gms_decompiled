package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.Provider;
import java.security.Security;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;

/* renamed from: cihi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class cihi {

    /* renamed from: a */
    public static final Logger f190305a = Logger.getLogger(cihi.class.getName());

    /* renamed from: b */
    public static final cihi f190306b = m150306b();

    /* renamed from: d */
    private static final String[] f190307d = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};

    /* renamed from: c */
    public final Provider f190308c;

    public cihi(Provider provider) {
        this.f190308c = provider;
    }

    /* renamed from: a */
    public static byte[] m150305a(List list) {
        cipu cipu = new cipu();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            cihj cihj = (cihj) list.get(i);
            if (cihj != cihj.HTTP_1_0) {
                cipu.mo86316h(cihj.f190314e.length());
                cipu.mo86293b(cihj.f190314e);
            }
        }
        return cipu.mo86327m();
    }

    /* renamed from: a */
    public int mo86107a() {
        return 3;
    }

    /* renamed from: a */
    public String mo86108a(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: a */
    public void mo86109a(SSLSocket sSLSocket, String str, List list) {
    }

    /* renamed from: b */
    public void mo86110b(SSLSocket sSLSocket) {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.ClassNotFoundException]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    /* renamed from: b */
    private static cihi m150306b() {
        Provider provider;
        int i;
        Provider[] providers = Security.getProviders();
        int length = providers.length;
        int i2 = 0;
        loop0:
        while (true) {
            if (i2 >= length) {
                f190305a.logp(Level.WARNING, "io.grpc.okhttp.internal.Platform", "getAndroidSecurityProvider", "Unable to find Conscrypt");
                provider = null;
                break;
            }
            Provider provider2 = providers[i2];
            String[] strArr = f190307d;
            for (String str : strArr) {
                if (str.equals(provider2.getClass().getName())) {
                    f190305a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "getAndroidSecurityProvider", "Found registered provider {0}", str);
                    provider = provider2;
                    break loop0;
                }
            }
            i2++;
        }
        if (provider != null) {
            ciha ciha = new ciha(null, "setUseSessionTickets", Boolean.TYPE);
            ciha ciha2 = new ciha(null, "setHostname", String.class);
            ciha ciha3 = new ciha(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            ciha ciha4 = new ciha(null, "setAlpnProtocols", byte[].class);
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                cls.getMethod("tagSocket", Socket.class);
                cls.getMethod("untagSocket", Socket.class);
            } catch (ClassNotFoundException | NoSuchMethodException e) {
            }
            if (provider.getName().equals("GmsCore_OpenSSL") || provider.getName().equals("Conscrypt") || provider.getName().equals("Ssl_Guard")) {
                i = 1;
            } else {
                try {
                    cihi.class.getClassLoader().loadClass("android.net.Network");
                    i = 1;
                } catch (ClassNotFoundException e2) {
                    f190305a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid5", "Can't find class", (Throwable) e2);
                    try {
                        cihi.class.getClassLoader().loadClass("android.app.ActivityOptions");
                        i = 2;
                    } catch (ClassNotFoundException e3) {
                        f190305a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid41", "Can't find class", (Throwable) e3);
                        i = 3;
                    }
                }
            }
            return new cihe(ciha, ciha2, ciha3, ciha4, provider, i);
        }
        try {
            Provider provider3 = SSLContext.getDefault().getProvider();
            try {
                SSLContext instance = SSLContext.getInstance("TLS", provider3);
                instance.init(null, null, null);
                ((Method) AccessController.doPrivileged(new cihb())).invoke(instance.createSSLEngine(), new Object[0]);
                return new cihf(provider3, (Method) AccessController.doPrivileged(new cihc()), (Method) AccessController.doPrivileged(new cihd()));
            } catch (IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException e4) {
                try {
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                    return new cihg(cls2.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider3);
                } catch (ClassNotFoundException | NoSuchMethodException e5) {
                    return new cihi(provider3);
                }
            }
        } catch (NoSuchAlgorithmException e6) {
            throw new RuntimeException(e6);
        }
    }
}
