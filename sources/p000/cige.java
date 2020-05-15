package p000;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URI;
import java.util.concurrent.CountDownLatch;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: cige */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cige implements Runnable {

    /* renamed from: a */
    final /* synthetic */ CountDownLatch f190082a;

    /* renamed from: b */
    final /* synthetic */ cifo f190083b;

    /* renamed from: c */
    final /* synthetic */ ciib f190084c;

    /* renamed from: d */
    final /* synthetic */ cigh f190085d;

    public cige(cigh cigh, CountDownLatch countDownLatch, cifo cifo, ciib ciib) {
        this.f190085d = cigh;
        this.f190082a = countDownLatch;
        this.f190083b = cifo;
        this.f190084c = ciib;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:99:0x02c0=Splitter:B:99:0x02c0, B:105:0x02d6=Splitter:B:105:0x02d6} */
    public final void run() {
        cigh cigh;
        cigg cigg;
        Socket socket;
        SSLSocket sSLSocket;
        SSLSession sSLSession;
        String str;
        int i;
        Socket socket2;
        try {
            this.f190082a.await();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        cipw a = ciqh.m150828a(new cigd());
        try {
            cigh cigh2 = this.f190085d;
            chrw chrw = cigh2.f190098E;
            boolean z = true;
            if (chrw != null) {
                SocketAddress socketAddress = chrw.f189063a;
                if (socketAddress instanceof InetSocketAddress) {
                    InetSocketAddress inetSocketAddress = chrw.f189064b;
                    String str2 = chrw.f189065c;
                    String str3 = chrw.f189066d;
                    if (((InetSocketAddress) socketAddress).getAddress() == null) {
                        socket2 = cigh2.f190124s.createSocket(((InetSocketAddress) socketAddress).getHostName(), ((InetSocketAddress) socketAddress).getPort());
                    } else {
                        socket2 = cigh2.f190124s.createSocket(((InetSocketAddress) socketAddress).getAddress(), ((InetSocketAddress) socketAddress).getPort());
                    }
                    socket2.setTcpNoDelay(true);
                    ciqr b = ciqh.m150837b(socket2);
                    cipv a2 = ciqh.m150827a(ciqh.m150831a(socket2));
                    caud caud = new caud();
                    caud.mo74883c("https");
                    caud.mo74882b(inetSocketAddress.getHostName());
                    caud.mo74879a(inetSocketAddress.getPort());
                    caue b2 = caud.mo74881b();
                    cauj cauj = new cauj();
                    cauj.mo74905a(b2);
                    String str4 = b2.f175991b;
                    int i2 = b2.f175992c;
                    StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 12);
                    sb.append(str4);
                    sb.append(":");
                    sb.append(i2);
                    cauj.mo74909b("Host", sb.toString());
                    cauj.mo74909b("User-Agent", cigh2.f190109d);
                    if (str2 != null) {
                        if (str3 != null) {
                            cauj.mo74909b("Proxy-Authorization", catw.m127192a(str2, str3));
                        }
                    }
                    cauk a3 = cauj.mo74904a();
                    caue caue = a3.f176037a;
                    a2.mo86293b(String.format("CONNECT %s:%d HTTP/1.1", caue.f175991b, Integer.valueOf(caue.f175992c)));
                    a2.mo86293b("\r\n");
                    int a4 = a3.f176039c.mo74871a();
                    for (int i3 = 0; i3 < a4; i3++) {
                        a2.mo86293b(a3.f176039c.mo74872a(i3));
                        a2.mo86293b(": ");
                        a2.mo86293b(a3.f176039c.mo74875b(i3));
                        a2.mo86293b("\r\n");
                    }
                    a2.mo86293b("\r\n");
                    a2.flush();
                    caye a5 = caye.m127534a(cigh.m150219a(b));
                    do {
                    } while (!cigh.m150219a(b).equals(""));
                    int i4 = a5.f176388b;
                    if (i4 < 200 || i4 >= 300) {
                        cipu cipu = new cipu();
                        try {
                            socket2.shutdownOutput();
                            b.mo74995c(cipu, 1024);
                        } catch (IOException e2) {
                            String valueOf = String.valueOf(e2.toString());
                            cipu.mo86293b(valueOf.length() == 0 ? new String("Unable to read body: ") : "Unable to read body: ".concat(valueOf));
                        }
                        try {
                            socket2.close();
                        } catch (IOException e3) {
                        }
                        throw chuv.f189229p.mo85687a(String.format("Response returned from proxy was not successful (expected 2xx, got %d %s). Response body:\n%s", Integer.valueOf(a5.f176388b), a5.f176389c, cipu.mo86324k())).mo85693c();
                    }
                    socket = socket2;
                } else {
                    chuv chuv = chuv.f189228o;
                    String valueOf2 = String.valueOf(this.f190085d.f190098E.f189063a.getClass());
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 41);
                    sb2.append("Unsupported SocketAddress implementation ");
                    sb2.append(valueOf2);
                    throw chuv.mo85687a(sb2.toString()).mo85693c();
                }
            } else {
                socket = cigh2.f190124s.createSocket(cigh2.f190107b.getAddress(), this.f190085d.f190107b.getPort());
            }
            cigh cigh3 = this.f190085d;
            SSLSocketFactory sSLSocketFactory = cigh3.f190125t;
            if (sSLSocketFactory != null) {
                URI b3 = ciag.m149917b(cigh3.f190108c);
                if (b3.getHost() != null) {
                    str = b3.getHost();
                } else {
                    str = cigh3.f190108c;
                }
                cigh cigh4 = this.f190085d;
                URI b4 = ciag.m149917b(cigh4.f190108c);
                if (b4.getPort() == -1) {
                    i = cigh4.f190107b.getPort();
                } else {
                    i = b4.getPort();
                }
                SSLSocket a6 = cigo.m150258a(sSLSocketFactory, socket, str, i, this.f190085d.f190128w);
                sSLSession = a6.getSession();
                sSLSocket = a6;
            } else {
                sSLSession = null;
                sSLSocket = socket;
            }
            sSLSocket.setTcpNoDelay(true);
            a = ciqh.m150828a(ciqh.m150837b(sSLSocket));
            try {
                cifo cifo = this.f190083b;
                ciqq a7 = ciqh.m150831a(sSLSocket);
                if (cifo.f190017f != null) {
                    z = false;
                }
                bmxy.m108601b(z, "AsyncSink's becomeConnected should only be called once.");
                bmxy.m108582a(a7, "sink");
                cifo.f190017f = a7;
                bmxy.m108582a(sSLSocket, "socket");
                cifo.f190018g = sSLSocket;
                cigh cigh5 = this.f190085d;
                chqf b5 = cigh5.f190120o.mo85535b();
                b5.mo85532a(chru.f189056a, sSLSocket.getRemoteSocketAddress());
                b5.mo85532a(chru.f189057b, sSLSocket.getLocalSocketAddress());
                b5.mo85532a(chru.f189058c, sSLSession);
                b5.mo85532a(chzz.f189624a, sSLSession != null ? chuo.PRIVACY_AND_INTEGRITY : chuo.NONE);
                cigh5.f190120o = b5.mo85531a();
                cigh cigh6 = this.f190085d;
                cigh6.f190119n = new cigg(cigh6, this.f190084c.mo86129b(a));
                synchronized (this.f190085d.f190115j) {
                    bmxy.m108582a(sSLSocket, "socket");
                    if (sSLSession != null) {
                        new chsa(new chsb(sSLSession));
                    }
                }
            } catch (chuw e4) {
                e = e4;
                this.f190085d.mo86056a(0, cihm.INTERNAL_ERROR, e.f189236a);
                cigh = this.f190085d;
                cigg = new cigg(cigh, this.f190084c.mo86129b(a));
                cigh.f190119n = cigg;
            } catch (Exception e5) {
                e = e5;
                try {
                    this.f190085d.mo86031a(e);
                    cigh = this.f190085d;
                    cigg = new cigg(cigh, this.f190084c.mo86129b(a));
                    cigh.f190119n = cigg;
                } catch (Throwable th) {
                    th = th;
                    cigh cigh7 = this.f190085d;
                    cigh7.f190119n = new cigg(cigh7, this.f190084c.mo86129b(a));
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cigh cigh72 = this.f190085d;
                cigh72.f190119n = new cigg(cigh72, this.f190084c.mo86129b(a));
                throw th;
            }
        } catch (IOException e6) {
            throw chuv.f189229p.mo85687a("Failed trying to connect with proxy").mo85692c(e6).mo85693c();
        } catch (chuw e7) {
            e = e7;
            this.f190085d.mo86056a(0, cihm.INTERNAL_ERROR, e.f189236a);
            cigh = this.f190085d;
            cigg = new cigg(cigh, this.f190084c.mo86129b(a));
            cigh.f190119n = cigg;
        } catch (Exception e8) {
            e = e8;
            this.f190085d.mo86031a(e);
            cigh = this.f190085d;
            cigg = new cigg(cigh, this.f190084c.mo86129b(a));
            cigh.f190119n = cigg;
        } catch (Throwable th3) {
            th = th3;
            cigh cigh722 = this.f190085d;
            cigh722.f190119n = new cigg(cigh722, this.f190084c.mo86129b(a));
            throw th;
        }
    }
}
