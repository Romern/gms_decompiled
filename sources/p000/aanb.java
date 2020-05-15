package p000;

import android.content.Context;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: aanb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aanb {

    /* renamed from: a */
    private final Context f28521a;

    /* renamed from: b */
    private final SSLSocketFactory f28522b;

    /* renamed from: c */
    private final SSLSocketFactory f28523c;

    /* renamed from: d */
    private final HostnameVerifier f28524d;

    /* renamed from: e */
    private Class f28525e;

    /* renamed from: f */
    private Method f28526f;

    /* renamed from: g */
    private Method f28527g;

    /* renamed from: h */
    private Method f28528h;

    /* renamed from: a */
    public static final int m21605a() {
        return (int) cecz.f182285a.mo6606a().mo78824ap();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        return false;
     */
    /* renamed from: b */
    private final synchronized boolean m21608b(SSLSocket sSLSocket) {
        int i = Build.VERSION.SDK_INT;
        if (cecz.m136060h()) {
            Method method = this.f28528h;
            if (method != null) {
                try {
                    Os.setsockoptInt((FileDescriptor) method.invoke(sSLSocket, new Object[0]), OsConstants.IPPROTO_TCP, OsConstants.TCP_USER_TIMEOUT, (int) cecz.f182285a.mo6606a().mo78827as());
                    return true;
                } catch (Exception e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                    sb.append("TCP timeout failed: ");
                    sb.append(valueOf);
                    Log.w("GCM", sb.toString());
                    return false;
                }
            } else {
                Log.w("GCM", "socket file descriptor unavailable.");
            }
        }
    }

    public aanb(Context context) {
        apto apto = aytw.m84813a(context) ? new apto(context.createDeviceProtectedStorageContext(), (int) cecz.m136072t(), false, null) : null;
        SSLSocketFactory a = apto.m70980a((int) cecz.m136072t(), context);
        this.f28521a = context;
        this.f28522b = apto;
        this.f28523c = a;
        this.f28524d = HttpsURLConnection.getDefaultHostnameVerifier();
    }

    /* renamed from: a */
    private final synchronized void m21606a(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        if (!cls.equals(this.f28525e)) {
            this.f28525e = cls;
            try {
                this.f28526f = cls.getMethod("setUseSessionTickets", Boolean.TYPE);
                this.f28527g = cls.getMethod("setHostname", String.class);
            } catch (NoSuchMethodException e) {
                this.f28526f = null;
                this.f28527g = null;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                if (cecz.m136060h()) {
                    this.f28528h = this.f28525e.getMethod("getFileDescriptor$", new Class[0]);
                }
            } catch (NoSuchMethodException e2) {
                this.f28528h = null;
            }
        }
        return;
    }

    /* renamed from: a */
    private final synchronized void m21607a(SSLSocket sSLSocket, String str) {
        try {
            Method method = this.f28526f;
            if (method != null) {
                method.invoke(sSLSocket, true);
            } else {
                Log.w("GCM", "Tickets unavailable");
            }
            Method method2 = this.f28527g;
            if (method2 != null) {
                method2.invoke(sSLSocket, str);
                return;
            }
            Log.w("GCM", "SNI unavailable");
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Tickets or SNI failed: ");
            sb.append(valueOf);
            Log.w("GCM", sb.toString());
        }
    }

    /* renamed from: a */
    public final aana mo17087a(InetSocketAddress inetSocketAddress, String str, aanh aanh) {
        Socket socket;
        SSLSocketFactory sSLSocketFactory;
        shr.m35316b(1031);
        if (aytw.m84813a(this.f28521a) && (sSLSocketFactory = this.f28522b) != null) {
            socket = sSLSocketFactory.createSocket();
        } else {
            socket = this.f28523c.createSocket();
        }
        SSLSocket sSLSocket = (SSLSocket) socket;
        try {
            shr.m35314a(sSLSocket);
            sSLSocket.setSoTimeout(m21605a());
            m21606a(sSLSocket);
            m21607a(sSLSocket, str);
            boolean b = m21608b(sSLSocket);
            if (aanh != null) {
                int i = Build.VERSION.SDK_INT;
                aanh.f28536a.bindSocket(sSLSocket);
            }
            sSLSocket.connect(inetSocketAddress, m21605a());
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            if (session == null) {
                throw new SSLException("Cannot verify SSL socket without session");
            } else if (!this.f28524d.verify(str, session)) {
                String valueOf = String.valueOf(str);
                throw new SSLException(valueOf.length() == 0 ? new String("Cannot verify hostname: ") : "Cannot verify hostname: ".concat(valueOf));
            } else {
                aana aana = new aana(sSLSocket, b);
                shr.m35312a();
                return aana;
            }
        } catch (IOException e) {
            sSLSocket.close();
            throw e;
        } catch (Throwable th) {
            shr.m35312a();
            throw th;
        }
    }
}
