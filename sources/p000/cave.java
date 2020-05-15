package p000;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: cave */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cave extends cavh {

    /* renamed from: b */
    private final cavd f176121b;

    /* renamed from: c */
    private final cavd f176122c;

    /* renamed from: d */
    private final cavd f176123d;

    /* renamed from: e */
    private final cavd f176124e;

    public cave(cavd cavd, cavd cavd2, cavd cavd3, cavd cavd4) {
        this.f176121b = cavd;
        this.f176122c = cavd2;
        this.f176123d = cavd3;
        this.f176124e = cavd4;
    }

    /* renamed from: a */
    public final String mo74954a(SSLSocket sSLSocket) {
        byte[] bArr;
        cavd cavd = this.f176123d;
        if (cavd == null || !cavd.mo74952a(sSLSocket) || (bArr = (byte[]) this.f176123d.mo74951a(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, cavk.f176139c);
    }

    /* renamed from: a */
    public final void mo74955a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (cavk.m127315a(e)) {
                throw new IOException(e);
            }
            throw e;
        } catch (SecurityException e2) {
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e2);
            throw iOException;
        }
    }

    /* renamed from: a */
    public final void mo74956a(SSLSocket sSLSocket, String str, List list) {
        if (str != null) {
            this.f176121b.mo74953b(sSLSocket, true);
            this.f176122c.mo74953b(sSLSocket, str);
        }
        cavd cavd = this.f176124e;
        if (cavd != null && cavd.mo74952a(sSLSocket)) {
            Object[] objArr = new Object[1];
            cipu cipu = new cipu();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                caui caui = (caui) list.get(i);
                if (caui != caui.HTTP_1_0) {
                    cipu.mo86316h(caui.f176031e.length());
                    cipu.mo86293b(caui.f176031e);
                }
            }
            objArr[0] = cipu.mo86327m();
            this.f176124e.mo74951a(sSLSocket, objArr);
        }
    }
}
