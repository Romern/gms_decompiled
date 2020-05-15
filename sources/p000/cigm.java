package p000;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;

/* renamed from: cigm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class cigm {

    /* renamed from: a */
    public static final Logger f190148a = Logger.getLogger(cigm.class.getName());

    /* renamed from: b */
    public static final cigm f190149b;

    /* renamed from: d */
    private static final cihi f190150d = cihi.f190306b;

    /* renamed from: c */
    protected final cihi f190151c;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.ClassNotFoundException]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    static {
        cigm cigm;
        ClassLoader classLoader = cigm.class.getClassLoader();
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e) {
            f190148a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator", "createNegotiator", "Unable to find Conscrypt. Skipping", (Throwable) e);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e2) {
                f190148a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator", "createNegotiator", "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e2);
                cigm = new cigm(f190150d);
            }
        }
        cigm = new cigl(f190150d);
        f190149b = cigm;
    }

    public cigm(cihi cihi) {
        bmxy.m108582a(cihi, "platform");
        this.f190151c = cihi;
    }

    /* renamed from: a */
    public String mo86074a(SSLSocket sSLSocket) {
        return this.f190151c.mo86108a(sSLSocket);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo86076b(SSLSocket sSLSocket, String str, List list) {
        this.f190151c.mo86109a(sSLSocket, str, list);
    }

    /* renamed from: a */
    public String mo86075a(SSLSocket sSLSocket, String str, List list) {
        if (list != null) {
            mo86076b(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String a = mo86074a(sSLSocket);
            if (a != null) {
                return a;
            }
            String valueOf = String.valueOf(list);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
            sb.append("TLS ALPN negotiation failed with protocols: ");
            sb.append(valueOf);
            throw new RuntimeException(sb.toString());
        } finally {
            this.f190151c.mo86110b(sSLSocket);
        }
    }
}
