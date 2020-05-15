package p000;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: bdbh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdbh implements bdbj {

    /* renamed from: a */
    private static final long f105262a = TimeUnit.SECONDS.toMillis(15);

    /* renamed from: b */
    private static final long f105263b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c */
    private final SSLSocketFactory f105264c;

    public bdbh(SSLSocketFactory sSLSocketFactory) {
        this.f105264c = sSLSocketFactory;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{javax.net.ssl.SSLSocketFactory.createSocket(java.net.Socket, java.lang.String, int, boolean):java.net.Socket throws java.io.IOException}
     arg types: [java.net.Socket, java.lang.String, int, int]
     candidates:
      ClspMth{javax.net.SocketFactory.createSocket(java.lang.String, int, java.net.InetAddress, int):java.net.Socket throws java.io.IOException, java.net.UnknownHostException}
      ClspMth{javax.net.SocketFactory.createSocket(java.net.InetAddress, int, java.net.InetAddress, int):java.net.Socket throws java.io.IOException}
      ClspMth{javax.net.ssl.SSLSocketFactory.createSocket(java.net.Socket, java.lang.String, int, boolean):java.net.Socket throws java.io.IOException} */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005b A[SYNTHETIC, Splitter:B:32:0x005b] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0062 A[SYNTHETIC, Splitter:B:36:0x0062] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x006c A[SYNTHETIC, Splitter:B:43:0x006c] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0073 A[SYNTHETIC, Splitter:B:47:0x0073] */
    /* renamed from: a */
    public final boolean mo57845a(String str, InetAddress inetAddress) {
        Socket socket;
        SSLSocket sSLSocket;
        SSLSocket sSLSocket2 = null;
        try {
            socket = new Socket();
            try {
                socket.connect(new InetSocketAddress(inetAddress, 443), (int) f105262a);
                socket.setSoTimeout((int) f105263b);
                sSLSocket = (SSLSocket) this.f105264c.createSocket(socket, str, 443, false);
            } catch (IOException e) {
                if (sSLSocket2 != null) {
                    try {
                        sSLSocket2.close();
                    } catch (IOException e2) {
                    }
                }
                if (socket != null) {
                    socket.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                if (sSLSocket2 != null) {
                    try {
                        sSLSocket2.close();
                    } catch (IOException e3) {
                    }
                }
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException e4) {
                    }
                }
                throw th;
            }
            try {
                SSLSession session = sSLSocket.getSession();
                if (!session.isValid() || !cayn.f176430a.verify(str, session)) {
                    if (sSLSocket != null) {
                        try {
                            sSLSocket.close();
                        } catch (IOException e5) {
                        }
                    }
                    try {
                        socket.close();
                    } catch (IOException e6) {
                    }
                    return false;
                }
                if (sSLSocket != null) {
                    try {
                        sSLSocket.close();
                    } catch (IOException e7) {
                    }
                }
                try {
                    socket.close();
                    return true;
                } catch (IOException e8) {
                    return true;
                }
            } catch (IOException e9) {
                sSLSocket2 = sSLSocket;
                if (sSLSocket2 != null) {
                }
                if (socket != null) {
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                sSLSocket2 = sSLSocket;
                if (sSLSocket2 != null) {
                }
                if (socket != null) {
                }
                throw th;
            }
        } catch (IOException e10) {
            socket = null;
            if (sSLSocket2 != null) {
            }
            if (socket != null) {
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            socket = null;
            if (sSLSocket2 != null) {
            }
            if (socket != null) {
            }
            throw th;
        }
    }
}
