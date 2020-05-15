package p000;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;

/* renamed from: cayl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cayl implements catr {

    /* renamed from: a */
    public final caup f176411a;

    /* renamed from: b */
    public Socket f176412b;

    /* renamed from: c */
    public Socket f176413c;

    /* renamed from: d */
    public caua f176414d;

    /* renamed from: e */
    public caui f176415e;

    /* renamed from: f */
    public volatile cawc f176416f;

    /* renamed from: g */
    public int f176417g;

    /* renamed from: h */
    public cipw f176418h;

    /* renamed from: i */
    public cipv f176419i;

    /* renamed from: j */
    public final List f176420j = new ArrayList();

    /* renamed from: k */
    public boolean f176421k;

    /* renamed from: l */
    public long f176422l = Long.MAX_VALUE;

    public cayl(caup caup) {
        this.f176411a = caup;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{javax.net.ssl.SSLSocketFactory.createSocket(java.net.Socket, java.lang.String, int, boolean):java.net.Socket throws java.io.IOException}
     arg types: [java.net.Socket, java.lang.String, int, int]
     candidates:
      ClspMth{javax.net.SocketFactory.createSocket(java.lang.String, int, java.net.InetAddress, int):java.net.Socket throws java.io.IOException, java.net.UnknownHostException}
      ClspMth{javax.net.SocketFactory.createSocket(java.net.InetAddress, int, java.net.InetAddress, int):java.net.Socket throws java.io.IOException}
      ClspMth{javax.net.ssl.SSLSocketFactory.createSocket(java.net.Socket, java.lang.String, int, boolean):java.net.Socket throws java.io.IOException} */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x03ff A[Catch:{ all -> 0x0406 }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0405 A[Catch:{ all -> 0x0406 }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0409  */
    /* renamed from: a */
    private final void m127560a(int i, int i2, caur caur) {
        catv catv;
        int i3;
        boolean z;
        Set set;
        caup caup = this.f176411a;
        SSLSocket sSLSocket = null;
        String str = null;
        sSLSocket = null;
        if (caup.f176065a.f175833h != null && caup.f176066b.type() == Proxy.Type.HTTP) {
            cauj cauj = new cauj();
            cauj.mo74905a(this.f176411a.f176065a.f175826a);
            cauj.mo74909b("Host", cavk.m127304a(this.f176411a.f176065a.f175826a));
            cauj.mo74909b("Proxy-Connection", "Keep-Alive");
            cauj.mo74909b("User-Agent", "okhttp/2.7.2");
            cauk a = cauj.mo74904a();
            caue caue = a.f176037a;
            String str2 = caue.f175991b;
            int i4 = caue.f175992c;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 29);
            sb.append("CONNECT ");
            sb.append(str2);
            sb.append(":");
            sb.append(i4);
            sb.append(" HTTP/1.1");
            String sb2 = sb.toString();
            do {
                caxn caxn = new caxn(null, this.f176418h, this.f176419i);
                this.f176418h.mo74997df().mo86354a((long) i, TimeUnit.MILLISECONDS);
                this.f176419i.mo74932df().mo86354a((long) i2, TimeUnit.MILLISECONDS);
                caxn.mo75046a(a.f176039c, sb2);
                caxn.mo75051c();
                caum d = caxn.mo75052d();
                d.f176045a = a;
                caun a2 = d.mo74915a();
                long a3 = caxx.m127518a(a2);
                if (a3 == -1) {
                    a3 = 0;
                }
                ciqr a4 = caxn.mo75044a(a3);
                cavk.m127313a(a4, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
                a4.close();
                int i5 = a2.f176057c;
                if (i5 != 200) {
                    if (i5 == 407) {
                        caup caup2 = this.f176411a;
                        catk catk = caup2.f176065a;
                        a = caxx.m127519a(a2, caup2.f176066b);
                    } else {
                        StringBuilder sb3 = new StringBuilder(49);
                        sb3.append("Unexpected response code for CONNECT: ");
                        sb3.append(i5);
                        throw new IOException(sb3.toString());
                    }
                } else if (!((ciqm) this.f176418h).f191247a.mo86295b() || !((ciqk) this.f176419i).f191243a.mo86295b()) {
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
            } while (a != null);
            throw new IOException("Failed to authenticate with proxy");
        }
        catk catk2 = this.f176411a.f176065a;
        try {
            SSLSocket sSLSocket2 = (SSLSocket) catk2.f175833h.createSocket(this.f176412b, catk2.mo74845a(), catk2.mo74846b(), true);
            try {
                int i6 = caur.f176075b;
                int size = caur.f176074a.size();
                while (true) {
                    if (i6 >= size) {
                        catv = null;
                        break;
                    }
                    catv = (catv) caur.f176074a.get(i6);
                    if (catv.mo74860a(sSLSocket2)) {
                        caur.f176075b = i6 + 1;
                        break;
                    }
                    i6++;
                }
                if (catv != null) {
                    int i7 = caur.f176075b;
                    while (true) {
                        if (i7 < caur.f176074a.size()) {
                            if (((catv) caur.f176074a.get(i7)).mo74860a(sSLSocket2)) {
                                z = true;
                                break;
                            }
                            i7++;
                        } else {
                            z = false;
                            break;
                        }
                    }
                    caur.f176076c = z;
                    Logger logger = cavb.f176115a;
                    boolean z2 = caur.f176077d;
                    String[] strArr = catv.f175973f;
                    String[] enabledCipherSuites = strArr != null ? (String[]) cavk.m127318a(String.class, strArr, sSLSocket2.getEnabledCipherSuites()) : sSLSocket2.getEnabledCipherSuites();
                    String[] strArr2 = catv.f175974g;
                    String[] enabledProtocols = strArr2 != null ? (String[]) cavk.m127318a(String.class, strArr2, sSLSocket2.getEnabledProtocols()) : sSLSocket2.getEnabledProtocols();
                    if (z2) {
                        if (cavk.m127317a(sSLSocket2.getSupportedCipherSuites(), "TLS_FALLBACK_SCSV")) {
                            enabledCipherSuites = cavk.m127320b(enabledCipherSuites, "TLS_FALLBACK_SCSV");
                        }
                    }
                    catu catu = new catu(catv);
                    catu.mo74857a(enabledCipherSuites);
                    catu.mo74859b(enabledProtocols);
                    catv a5 = catu.mo74855a();
                    String[] strArr3 = a5.f175974g;
                    if (strArr3 != null) {
                        sSLSocket2.setEnabledProtocols(strArr3);
                    }
                    String[] strArr4 = a5.f175973f;
                    if (strArr4 != null) {
                        sSLSocket2.setEnabledCipherSuites(strArr4);
                    }
                    if (catv.f175972e) {
                        cavh.f176134a.mo74956a(sSLSocket2, catk2.mo74845a(), catk2.f175829d);
                    }
                    sSLSocket2.startHandshake();
                    caua a6 = caua.m127195a(sSLSocket2.getSession());
                    if (catk2.f175834i.verify(catk2.mo74845a(), sSLSocket2.getSession())) {
                        cato cato = catk2.f175835j;
                        String a7 = catk2.mo74845a();
                        List list = a6.f175977b;
                        Set<cipx> set2 = (Set) cato.f175854b.get(a7);
                        int indexOf = a7.indexOf(46);
                        if (indexOf != a7.lastIndexOf(46)) {
                            Map map = cato.f175854b;
                            String valueOf = String.valueOf(a7.substring(indexOf + 1));
                            set = (Set) map.get(valueOf.length() == 0 ? new String("*.") : "*.".concat(valueOf));
                        } else {
                            set = null;
                        }
                        if (set2 == null && set == null) {
                            set2 = null;
                        } else if (set2 != null && set != null) {
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            linkedHashSet.addAll(set2);
                            linkedHashSet.addAll(set);
                            set2 = linkedHashSet;
                        } else if (set2 == null) {
                            set2 = set;
                        }
                        if (set2 != null) {
                            int size2 = list.size();
                            int i8 = 0;
                            while (i8 < size2) {
                                if (!set2.contains(cato.m127181a((X509Certificate) list.get(i8)))) {
                                    i8++;
                                }
                            }
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("Certificate pinning failure!\n  Peer certificate chain:");
                            int size3 = list.size();
                            for (i3 = 0; i3 < size3; i3++) {
                                X509Certificate x509Certificate = (X509Certificate) list.get(i3);
                                sb4.append("\n    ");
                                sb4.append(cato.m127182a((Certificate) x509Certificate));
                                sb4.append(": ");
                                sb4.append(x509Certificate.getSubjectDN().getName());
                            }
                            sb4.append("\n  Pinned certificates for ");
                            sb4.append(a7);
                            sb4.append(":");
                            for (cipx cipx : set2) {
                                sb4.append("\n    sha1/");
                                sb4.append(cipx.mo86341b());
                            }
                            throw new SSLPeerUnverifiedException(sb4.toString());
                        }
                        if (catv.f175972e) {
                            str = cavh.f176134a.mo74954a(sSLSocket2);
                        }
                        this.f176413c = sSLSocket2;
                        this.f176418h = ciqh.m150828a(ciqh.m150837b(sSLSocket2));
                        this.f176419i = ciqh.m150827a(ciqh.m150831a(this.f176413c));
                        this.f176414d = a6;
                        this.f176415e = str == null ? caui.HTTP_1_1 : caui.m127235a(str);
                        if (sSLSocket2 != null) {
                            cavh.f176134a.mo74957b(sSLSocket2);
                            return;
                        }
                        return;
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) a6.f175977b.get(0);
                    String a8 = catk2.mo74845a();
                    String a9 = cato.m127182a((Certificate) x509Certificate2);
                    String name = x509Certificate2.getSubjectDN().getName();
                    List a10 = cayn.m127567a(x509Certificate2, 7);
                    List a11 = cayn.m127567a(x509Certificate2, 2);
                    ArrayList arrayList = new ArrayList(a10.size() + a11.size());
                    arrayList.addAll(a10);
                    arrayList.addAll(a11);
                    String valueOf2 = String.valueOf(arrayList);
                    StringBuilder sb5 = new StringBuilder(String.valueOf(a8).length() + 72 + String.valueOf(a9).length() + String.valueOf(name).length() + String.valueOf(valueOf2).length());
                    sb5.append("Hostname ");
                    sb5.append(a8);
                    sb5.append(" not verified:\n    certificate: ");
                    sb5.append(a9);
                    sb5.append("\n    DN: ");
                    sb5.append(name);
                    sb5.append("\n    subjectAltNames: ");
                    sb5.append(valueOf2);
                    throw new SSLPeerUnverifiedException(sb5.toString());
                }
                boolean z3 = caur.f176077d;
                String valueOf3 = String.valueOf(caur.f176074a);
                String arrays = Arrays.toString(sSLSocket2.getEnabledProtocols());
                StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf3).length() + 83 + String.valueOf(arrays).length());
                sb6.append("Unable to find acceptable protocols. isFallback=");
                sb6.append(z3);
                sb6.append(", modes=");
                sb6.append(valueOf3);
                sb6.append(", supported protocols=");
                sb6.append(arrays);
                throw new UnknownServiceException(sb6.toString());
            } catch (AssertionError e) {
                e = e;
                sSLSocket = sSLSocket2;
                try {
                    if (!cavk.m127315a(e)) {
                        throw new IOException(e);
                    }
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    if (sSLSocket != null) {
                        cavh.f176134a.mo74957b(sSLSocket);
                    }
                    cavk.m127312a((Socket) sSLSocket);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                }
                cavk.m127312a((Socket) sSLSocket);
                throw th;
            }
        } catch (AssertionError e2) {
            e = e2;
            if (!cavk.m127315a(e)) {
            }
        } catch (Throwable th3) {
            th = th3;
            if (sSLSocket != null) {
            }
            cavk.m127312a((Socket) sSLSocket);
            throw th;
        }
    }

    public final String toString() {
        String str;
        caup caup = this.f176411a;
        caue caue = caup.f176065a.f175826a;
        String str2 = caue.f175991b;
        int i = caue.f175992c;
        String valueOf = String.valueOf(caup.f176066b);
        String valueOf2 = String.valueOf(this.f176411a.f176067c);
        caua caua = this.f176414d;
        if (caua != null) {
            str = caua.f175976a;
        } else {
            str = "none";
        }
        String valueOf3 = String.valueOf(this.f176415e);
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 68 + length2 + length3 + str.length() + String.valueOf(valueOf3).length());
        sb.append("Connection{");
        sb.append(str2);
        sb.append(":");
        sb.append(i);
        sb.append(", proxy=");
        sb.append(valueOf);
        sb.append(" hostAddress=");
        sb.append(valueOf2);
        sb.append(" cipherSuite=");
        sb.append(str);
        sb.append(" protocol=");
        sb.append(valueOf3);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo75175a() {
        cavk.m127312a(this.f176412b);
    }

    /* renamed from: a */
    public final void mo75176a(int i, int i2, int i3, caur caur) {
        this.f176412b.setSoTimeout(i2);
        try {
            cavh.f176134a.mo74955a(this.f176412b, this.f176411a.f176067c, i);
            this.f176418h = ciqh.m150828a(ciqh.m150837b(this.f176412b));
            this.f176419i = ciqh.m150827a(ciqh.m150831a(this.f176412b));
            if (this.f176411a.f176065a.f175833h != null) {
                m127560a(i2, i3, caur);
            } else {
                this.f176415e = caui.HTTP_1_1;
                this.f176413c = this.f176412b;
            }
            if (this.f176415e == caui.SPDY_3 || this.f176415e == caui.HTTP_2) {
                this.f176413c.setSoTimeout(0);
                cavw cavw = new cavw();
                Socket socket = this.f176413c;
                String str = this.f176411a.f176065a.f175826a.f175991b;
                cipw cipw = this.f176418h;
                cipv cipv = this.f176419i;
                cavw.f176181a = socket;
                cavw.f176182b = str;
                cavw.f176183c = cipw;
                cavw.f176184d = cipv;
                cavw.f176186f = this.f176415e;
                cawc cawc = new cawc(cavw);
                cawc.f176211q.mo74973a();
                cawc.f176211q.mo74982b(cawc.f176206l);
                int c = cawc.f176206l.mo75036c();
                if (c != 65536) {
                    cawc.f176211q.mo74975a(0, (long) (c - 65536));
                }
                this.f176416f = cawc;
            }
        } catch (ConnectException e) {
            String valueOf = String.valueOf(this.f176411a.f176067c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
            sb.append("Failed to connect to ");
            sb.append(valueOf);
            throw new ConnectException(sb.toString());
        }
    }

    /* renamed from: a */
    public final boolean mo75177a(boolean z) {
        int soTimeout;
        if (this.f176413c.isClosed() || this.f176413c.isInputShutdown() || this.f176413c.isOutputShutdown()) {
            return false;
        }
        if (this.f176416f == null && z) {
            try {
                soTimeout = this.f176413c.getSoTimeout();
                this.f176413c.setSoTimeout(1);
                if (!this.f176418h.mo86295b()) {
                    this.f176413c.setSoTimeout(soTimeout);
                    return true;
                }
                this.f176413c.setSoTimeout(soTimeout);
                return false;
            } catch (SocketTimeoutException e) {
            } catch (IOException e2) {
                return false;
            } catch (Throwable th) {
                this.f176413c.setSoTimeout(soTimeout);
                throw th;
            }
        }
        return true;
    }
}
