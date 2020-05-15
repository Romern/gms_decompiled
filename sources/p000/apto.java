package p000;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.PrivateKey;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* renamed from: apto */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apto extends SSLSocketFactory {

    /* renamed from: j */
    private static final TrustManager[] f84858j = {new aptn()};

    /* renamed from: a */
    SSLSocketFactory f84859a = null;

    /* renamed from: b */
    SSLSocketFactory f84860b = null;

    /* renamed from: c */
    public byte[] f84861c = null;

    /* renamed from: d */
    public PrivateKey f84862d = null;

    /* renamed from: e */
    final Context f84863e;

    /* renamed from: f */
    final int f84864f;

    /* renamed from: g */
    final boolean f84865g;

    /* renamed from: h */
    final boolean f84866h;

    /* renamed from: i */
    final String f84867i;

    public apto(Context context, int i, boolean z, String str) {
        this.f84863e = context.getApplicationContext();
        this.f84864f = i;
        this.f84865g = z;
        this.f84866h = true;
        this.f84867i = str;
    }

    /* renamed from: a */
    private final synchronized SSLSocketFactory m70979a() {
        if (!this.f84866h) {
            if (this.f84859a == null) {
                Log.w("SSLCertSocketFactory", "Bypassing SSL security checks at caller's request");
                this.f84859a = aptq.m70987a().mo47608a(this.f84863e, f84858j, this.f84865g);
            }
            return this.f84859a;
        }
        if (this.f84867i != null) {
            if (this.f84860b == null) {
                aptq a = aptq.m70987a();
                Context context = this.f84863e;
                try {
                    this.f84860b = (SSLSocketFactory) vzs.m41641a(a.mo47609a(context).newSocketFactoryWithCacheDir(vzs.m41642a(context), vzs.m41642a((Object) null), vzs.m41642a((Object) null), this.f84867i));
                } catch (RemoteException e) {
                    e = e;
                    throw new RuntimeException(e);
                } catch (vzt e2) {
                    e = e2;
                    throw new RuntimeException(e);
                }
            }
        } else if (this.f84860b == null) {
            this.f84860b = aptq.m70987a().mo47608a(this.f84863e, null, this.f84865g);
        }
        return this.f84860b;
    }

    public final Socket createSocket() {
        Socket createSocket = m70979a().createSocket();
        m70981a(createSocket);
        m70985a(createSocket, this.f84861c);
        m70982a(createSocket, this.f84864f);
        m70984a(createSocket, this.f84862d);
        return createSocket;
    }

    public final String[] getDefaultCipherSuites() {
        return m70979a().getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return m70979a().getSupportedCipherSuites();
    }

    public final Socket createSocket(String str, int i) {
        Socket createSocket = m70979a().createSocket(str, i);
        m70981a(createSocket);
        m70985a(createSocket, this.f84861c);
        m70982a(createSocket, this.f84864f);
        m70984a(createSocket, this.f84862d);
        if (this.f84866h) {
            m70983a(createSocket, str);
        }
        return createSocket;
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket createSocket = m70979a().createSocket(str, i, inetAddress, i2);
        m70981a(createSocket);
        m70985a(createSocket, this.f84861c);
        m70982a(createSocket, this.f84864f);
        m70984a(createSocket, this.f84862d);
        if (this.f84866h) {
            m70983a(createSocket, str);
        }
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = m70979a().createSocket(inetAddress, i);
        m70981a(createSocket);
        m70985a(createSocket, this.f84861c);
        m70982a(createSocket, this.f84864f);
        m70984a(createSocket, this.f84862d);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket createSocket = m70979a().createSocket(inetAddress, i, inetAddress2, i2);
        m70981a(createSocket);
        m70985a(createSocket, this.f84861c);
        m70982a(createSocket, this.f84864f);
        m70984a(createSocket, this.f84862d);
        return createSocket;
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket createSocket = m70979a().createSocket(socket, str, i, z);
        m70981a(createSocket);
        m70985a(createSocket, this.f84861c);
        m70982a(createSocket, this.f84864f);
        m70984a(createSocket, this.f84862d);
        if (this.f84866h) {
            m70983a(createSocket, str);
        }
        return createSocket;
    }

    /* renamed from: a */
    public static SSLSocketFactory m70980a(int i, Context context) {
        return new apto(context, i, true, null);
    }

    /* renamed from: a */
    static final void m70981a(Socket socket) {
        if (socket != null) {
            try {
                socket.getClass().getMethod("setNpnProtocols", byte[].class).invoke(socket, null);
            } catch (InvocationTargetException e) {
                Throwable cause = e.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                String valueOf = String.valueOf(socket.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                sb.append("Failed to invoke setNpnProtocols on ");
                sb.append(valueOf);
                throw new RuntimeException(sb.toString(), e);
            } catch (NoSuchMethodException e2) {
                String valueOf2 = String.valueOf(socket.getClass());
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 35);
                sb2.append(valueOf2);
                sb2.append(" does not implement setNpnProtocols");
                throw new IllegalArgumentException(sb2.toString(), e2);
            } catch (IllegalAccessException e3) {
                String valueOf3 = String.valueOf(socket.getClass());
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 35);
                sb3.append(valueOf3);
                sb3.append(" does not implement setNpnProtocols");
                throw new IllegalArgumentException(sb3.toString(), e3);
            }
        }
    }

    /* renamed from: a */
    static final void m70982a(Socket socket, int i) {
        if (socket != null) {
            try {
                socket.getClass().getMethod("setHandshakeTimeout", Integer.TYPE).invoke(socket, Integer.valueOf(i));
            } catch (InvocationTargetException e) {
                Throwable cause = e.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                String valueOf = String.valueOf(socket.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
                sb.append("Failed to invoke setSocketHandshakeTimeout on ");
                sb.append(valueOf);
                throw new RuntimeException(sb.toString(), e);
            } catch (NoSuchMethodException e2) {
                String valueOf2 = String.valueOf(socket.getClass());
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 45);
                sb2.append(valueOf2);
                sb2.append(" does not implement setSocketHandshakeTimeout");
                throw new IllegalArgumentException(sb2.toString(), e2);
            } catch (IllegalAccessException e3) {
                String valueOf3 = String.valueOf(socket.getClass());
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 45);
                sb3.append(valueOf3);
                sb3.append(" does not implement setSocketHandshakeTimeout");
                throw new IllegalArgumentException(sb3.toString(), e3);
            }
        }
    }

    /* renamed from: a */
    public static void m70983a(Socket socket, String str) {
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            if (session == null) {
                throw new SSLException("Cannot verify SSL socket without session");
            } else if (!HttpsURLConnection.getDefaultHostnameVerifier().verify(str, session)) {
                String valueOf = String.valueOf(str);
                throw new SSLPeerUnverifiedException(valueOf.length() == 0 ? new String("Cannot verify hostname: ") : "Cannot verify hostname: ".concat(valueOf));
            }
        } else {
            throw new IllegalArgumentException("Attempt to verify non-SSL socket");
        }
    }

    /* renamed from: a */
    static final void m70984a(Socket socket, PrivateKey privateKey) {
        if (socket != null) {
            try {
                socket.getClass().getMethod("setChannelIdPrivateKey", PrivateKey.class).invoke(socket, privateKey);
            } catch (InvocationTargetException e) {
                Throwable cause = e.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                String valueOf = String.valueOf(socket.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
                sb.append("Failed to invoke setChannelIdPrivateKey on ");
                sb.append(valueOf);
                throw new RuntimeException(sb.toString(), e);
            } catch (NoSuchMethodException e2) {
                String valueOf2 = String.valueOf(socket.getClass());
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 42);
                sb2.append(valueOf2);
                sb2.append(" does not implement setChannelIdPrivateKey");
                throw new IllegalArgumentException(sb2.toString(), e2);
            } catch (IllegalAccessException e3) {
                String valueOf3 = String.valueOf(socket.getClass());
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 42);
                sb3.append(valueOf3);
                sb3.append(" does not implement setChannelIdPrivateKey");
                throw new IllegalArgumentException(sb3.toString(), e3);
            }
        }
    }

    /* renamed from: a */
    static final void m70985a(Socket socket, byte[] bArr) {
        if (socket != null) {
            try {
                socket.getClass().getMethod("setAlpnProtocols", byte[].class).invoke(socket, bArr);
            } catch (InvocationTargetException e) {
                Throwable cause = e.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                String valueOf = String.valueOf(socket.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
                sb.append("Failed to invoke setAlpnProtocols on ");
                sb.append(valueOf);
                throw new RuntimeException(sb.toString(), e);
            } catch (NoSuchMethodException e2) {
                String valueOf2 = String.valueOf(socket.getClass());
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 36);
                sb2.append(valueOf2);
                sb2.append(" does not implement setAlpnProtocols");
                throw new IllegalArgumentException(sb2.toString(), e2);
            } catch (IllegalAccessException e3) {
                String valueOf3 = String.valueOf(socket.getClass());
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 36);
                sb3.append(valueOf3);
                sb3.append(" does not implement setAlpnProtocols");
                throw new IllegalArgumentException(sb3.toString(), e3);
            }
        }
    }
}
