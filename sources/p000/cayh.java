package p000;

import com.android.volley.toolbox.HttpClientStack;
import com.felicanetworks.cmnctrl.net.DataParser;
import com.felicanetworks.sdu.ErrorInfo;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.CookieHandler;
import java.net.HttpRetryException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketPermission;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.Permission;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* renamed from: cayh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cayh extends HttpURLConnection {

    /* renamed from: e */
    private static final Set f176398e = new LinkedHashSet(Arrays.asList("OPTIONS", "GET", "HEAD", DataParser.CONNECT_TYPE_POST, "PUT", "DELETE", "TRACE", HttpClientStack.HttpPatch.METHOD_NAME));

    /* renamed from: f */
    private static final caul f176399f = new caul();

    /* renamed from: a */
    final cauf f176400a;

    /* renamed from: b */
    protected IOException f176401b;

    /* renamed from: c */
    protected caxt f176402c;

    /* renamed from: d */
    caua f176403d;

    /* renamed from: g */
    private caub f176404g = new caub();

    /* renamed from: h */
    private long f176405h = -1;

    /* renamed from: i */
    private int f176406i;

    /* renamed from: j */
    private cauc f176407j;

    /* renamed from: k */
    private caup f176408k;

    static {
        cavk.m127309a(0, 0);
    }

    public cayh(URL url, cauf cauf) {
        super(url);
        this.f176400a = cauf;
    }

    /* renamed from: a */
    private final cauc m127545a() {
        String str;
        if (this.f176407j == null) {
            caun d = m127550c().mo75062d();
            caub b = d.f176060f.mo74874b();
            b.mo74870c(caxx.f176369d, d.f176056b.f176031e);
            String str2 = caxx.f176370e;
            caun caun = d.f176062h;
            if (caun == null) {
                if (d.f176063i != null) {
                    int i = d.f176057c;
                    StringBuilder sb = new StringBuilder(17);
                    sb.append("CACHE ");
                    sb.append(i);
                    str = sb.toString();
                } else {
                    str = "NONE";
                }
            } else if (d.f176063i == null) {
                int i2 = d.f176057c;
                StringBuilder sb2 = new StringBuilder(19);
                sb2.append("NETWORK ");
                sb2.append(i2);
                str = sb2.toString();
            } else {
                int i3 = caun.f176057c;
                StringBuilder sb3 = new StringBuilder(29);
                sb3.append("CONDITIONAL_CACHE ");
                sb3.append(i3);
                str = sb3.toString();
            }
            b.mo74870c(str2, str);
            this.f176407j = b.mo74866a();
        }
        return this.f176407j;
    }

    /* renamed from: b */
    private final void m127549b() {
        IOException iOException = this.f176401b;
        if (iOException != null) {
            throw iOException;
        } else if (this.f176402c == null) {
            this.connected = true;
            try {
                if (this.doOutput) {
                    if (this.method.equals("GET")) {
                        this.method = DataParser.CONNECT_TYPE_POST;
                    } else if (!caxu.m127507b(this.method)) {
                        throw new ProtocolException(String.valueOf(this.method).concat(" does not support writing"));
                    }
                }
                this.f176402c = m127546a(this.method, null, null, null);
            } catch (IOException e) {
                this.f176401b = e;
                throw e;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007f, code lost:
        if (r6.equals("HEAD") == false) goto L_0x00fd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x017d A[SYNTHETIC] */
    /* renamed from: c */
    private final caxt m127550c() {
        caup caup;
        Proxy proxy;
        cauk cauk;
        String a;
        caue caue;
        m127549b();
        if (this.f176402c.mo75061c()) {
            return this.f176402c;
        }
        while (true) {
            if (m127548a(true)) {
                caun d = this.f176402c.mo75062d();
                caxt caxt = this.f176402c;
                if (caxt.f176361l != null) {
                    cayl b = caxt.f176352c.mo75075b();
                    cayf cayf = null;
                    if (b != null) {
                        caup = b.f176411a;
                    } else {
                        caup = null;
                    }
                    if (caup == null) {
                        proxy = caxt.f176351b.f176001c;
                    } else {
                        proxy = caup.f176066b;
                    }
                    int i = caxt.f176361l.f176057c;
                    String str = caxt.f176358i.f176038b;
                    if (i != 307 && i != 308) {
                        if (i != 401) {
                            if (i != 407) {
                                switch (i) {
                                    case 300:
                                    case ErrorInfo.TYPE_FSC_HTTP_ERROR:
                                    case 302:
                                    case 303:
                                        break;
                                    default:
                                        cauk = null;
                                        break;
                                }
                                if (cauk == null) {
                                    int i2 = this.f176406i + 1;
                                    this.f176406i = i2;
                                    if (i2 <= 20) {
                                        URL url = cauk.f176042f;
                                        if (url == null) {
                                            url = cauk.f176037a.mo74885a();
                                            cauk.f176042f = url;
                                        }
                                        this.url = url;
                                        this.f176404g = cauk.f176039c.mo74874b();
                                        ciqq b2 = this.f176402c.mo75060b();
                                        if (!cauk.f176038b.equals(this.method)) {
                                            b2 = null;
                                        }
                                        if (b2 != null && !(b2 instanceof cayb)) {
                                            throw new HttpRetryException("Cannot retry streamed HTTP body", this.responseCode);
                                        }
                                        cayf f = this.f176402c.mo75064f();
                                        if (this.f176402c.mo75057a(cauk.f176037a)) {
                                            cayf = f;
                                        } else {
                                            f.mo75076c();
                                        }
                                        this.f176402c = m127546a(cauk.f176038b, cayf, (cayb) b2, d);
                                    } else {
                                        StringBuilder sb = new StringBuilder(40);
                                        sb.append("Too many follow-up requests: ");
                                        sb.append(i2);
                                        throw new ProtocolException(sb.toString());
                                    }
                                } else {
                                    this.f176402c.f176352c.mo75076c();
                                    return this.f176402c;
                                }
                            } else if (proxy.type() != Proxy.Type.HTTP) {
                                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                            }
                        }
                        caxc caxc = caxt.f176351b.f176018t;
                        cauk = caxx.m127519a(caxt.f176361l, proxy);
                        if (cauk == null) {
                        }
                    } else if (!str.equals("GET")) {
                    }
                    if (caxt.f176351b.f176013o && (a = caxt.f176361l.mo74920a("Location")) != null) {
                        caue caue2 = caxt.f176358i.f176037a;
                        caud caud = new caud();
                        if (caud.mo74878a(caue2, a) == 1) {
                            caue = caud.mo74881b();
                        } else {
                            caue = null;
                        }
                        if (caue != null && (caue.f175990a.equals(caxt.f176358i.f176037a.f175990a) || caxt.f176351b.f176012n)) {
                            cauj b3 = caxt.f176358i.mo74912b();
                            if (caxu.m127507b(str)) {
                                if (!str.equals("PROPFIND")) {
                                    b3.mo74907a("GET", (caul) null);
                                } else {
                                    b3.mo74907a(str, (caul) null);
                                }
                                b3.mo74906a("Transfer-Encoding");
                                b3.mo74906a("Content-Length");
                                b3.mo74906a("Content-Type");
                            }
                            if (!caxt.mo75057a(caue)) {
                                b3.mo74906a("Authorization");
                            }
                            b3.mo74905a(caue);
                            cauk = b3.mo74904a();
                            if (cauk == null) {
                            }
                        }
                    }
                    cauk = null;
                    if (cauk == null) {
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }

    public final void addRequestProperty(String str, String str2) {
        if (this.connected) {
            throw new IllegalStateException("Cannot add request property after connection is made");
        } else if (str == null) {
            throw new NullPointerException("field == null");
        } else if (str2 == null) {
            cavh cavh = cavh.f176134a;
            StringBuilder sb = new StringBuilder(str.length() + 44);
            sb.append("Ignoring header ");
            sb.append(str);
            sb.append(" because its value was null.");
            cavh.mo74959a(sb.toString());
        } else if ("X-Android-Transports".equals(str) || "X-Android-Protocols".equals(str)) {
            m127547a(str2, true);
        } else {
            this.f176404g.mo74870c(str, str2);
        }
    }

    public final void connect() {
        m127549b();
        do {
        } while (!m127548a(false));
    }

    public final void disconnect() {
        caxv caxv;
        cayl cayl;
        caxt caxt = this.f176402c;
        if (caxt != null) {
            cayf cayf = caxt.f176352c;
            synchronized (cayf.f176391b) {
                cayf.f176395f = true;
                caxv = cayf.f176396g;
                cayl = cayf.f176393d;
            }
            if (caxv != null) {
                caxv.mo75045a();
            } else if (cayl != null) {
                cayl.mo75175a();
            }
        }
    }

    public final int getConnectTimeout() {
        return this.f176400a.f176015q;
    }

    public final InputStream getErrorStream() {
        try {
            caxt c = m127550c();
            if (!caxt.m127495c(c.mo75062d()) || c.mo75062d().f176057c < 400) {
                return null;
            }
            return c.mo75062d().f176061g.mo74923a();
        } catch (IOException e) {
            return null;
        }
    }

    public final String getHeaderField(int i) {
        try {
            return m127545a().mo74875b(i);
        } catch (IOException e) {
            return null;
        }
    }

    public final String getHeaderFieldKey(int i) {
        try {
            return m127545a().mo74872a(i);
        } catch (IOException e) {
            return null;
        }
    }

    public final Map getHeaderFields() {
        try {
            return caxx.m127520a(m127545a(), caye.m127533a(m127550c().mo75062d()).toString());
        } catch (IOException e) {
            return Collections.emptyMap();
        }
    }

    public final InputStream getInputStream() {
        if (this.doInput) {
            caxt c = m127550c();
            if (getResponseCode() < 400) {
                return c.mo75062d().f176061g.mo74923a();
            }
            throw new FileNotFoundException(this.url.toString());
        }
        throw new ProtocolException("This protocol does not support input");
    }

    public final boolean getInstanceFollowRedirects() {
        return this.f176400a.f176013o;
    }

    public final OutputStream getOutputStream() {
        connect();
        caxt caxt = this.f176402c;
        cipv cipv = caxt.f176363n;
        if (cipv == null) {
            ciqq b = caxt.mo75060b();
            if (b != null) {
                cipv = ciqh.m150827a(b);
                caxt.f176363n = cipv;
            } else {
                cipv = null;
            }
        }
        if (cipv == null) {
            String valueOf = String.valueOf(this.method);
            throw new ProtocolException(valueOf.length() == 0 ? new String("method does not support a request body: ") : "method does not support a request body: ".concat(valueOf));
        } else if (!this.f176402c.mo75061c()) {
            return new ciqj((ciqk) cipv);
        } else {
            throw new ProtocolException("cannot write request body after response has been read");
        }
    }

    public final Permission getPermission() {
        URL url = getURL();
        String host = url.getHost();
        int port = url.getPort() != -1 ? url.getPort() : caue.m127217a(url.getProtocol());
        if (usingProxy()) {
            InetSocketAddress inetSocketAddress = (InetSocketAddress) this.f176400a.f176001c.address();
            host = inetSocketAddress.getHostName();
            port = inetSocketAddress.getPort();
        }
        StringBuilder sb = new StringBuilder(String.valueOf(host).length() + 12);
        sb.append(host);
        sb.append(":");
        sb.append(port);
        return new SocketPermission(sb.toString(), "connect, resolve");
    }

    public final int getReadTimeout() {
        return this.f176400a.f176016r;
    }

    public final Map getRequestProperties() {
        if (!this.connected) {
            return caxx.m127520a(this.f176404g.mo74866a(), (String) null);
        }
        throw new IllegalStateException("Cannot access request header fields after connection is set");
    }

    public final String getRequestProperty(String str) {
        if (str == null) {
            return null;
        }
        caub caub = this.f176404g;
        for (int size = caub.f175979a.size() - 2; size >= 0; size -= 2) {
            if (str.equalsIgnoreCase((String) caub.f175979a.get(size))) {
                return (String) caub.f175979a.get(size + 1);
            }
        }
        return null;
    }

    public final int getResponseCode() {
        return m127550c().mo75062d().f176057c;
    }

    public final String getResponseMessage() {
        return m127550c().mo75062d().f176058d;
    }

    public final void setConnectTimeout(int i) {
        cauf cauf = this.f176400a;
        long j = (long) i;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0");
        } else if (timeUnit != null) {
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException("Timeout too large.");
            } else if (millis == 0 && j > 0) {
                throw new IllegalArgumentException("Timeout too small.");
            } else {
                cauf.f176015q = (int) millis;
            }
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    public final void setFixedLengthStreamingMode(int i) {
        setFixedLengthStreamingMode((long) i);
    }

    public final void setIfModifiedSince(long j) {
        super.setIfModifiedSince(j);
        if (this.ifModifiedSince != 0) {
            this.f176404g.mo74869b("If-Modified-Since", ((DateFormat) caxr.f176348b.get()).format(new Date(this.ifModifiedSince)));
            return;
        }
        this.f176404g.mo74867a("If-Modified-Since");
    }

    public final void setInstanceFollowRedirects(boolean z) {
        this.f176400a.f176013o = z;
    }

    public final void setReadTimeout(int i) {
        cauf cauf = this.f176400a;
        long j = (long) i;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0");
        } else if (timeUnit != null) {
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException("Timeout too large.");
            } else if (millis == 0 && j > 0) {
                throw new IllegalArgumentException("Timeout too small.");
            } else {
                cauf.f176016r = (int) millis;
            }
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    public final void setRequestMethod(String str) {
        if (f176398e.contains(str)) {
            this.method = str;
            return;
        }
        String valueOf = String.valueOf(f176398e);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25 + String.valueOf(str).length());
        sb.append("Expected one of ");
        sb.append(valueOf);
        sb.append(" but was ");
        sb.append(str);
        throw new ProtocolException(sb.toString());
    }

    public final void setRequestProperty(String str, String str2) {
        if (this.connected) {
            throw new IllegalStateException("Cannot set request property after connection is made");
        } else if (str == null) {
            throw new NullPointerException("field == null");
        } else if (str2 == null) {
            cavh cavh = cavh.f176134a;
            StringBuilder sb = new StringBuilder(str.length() + 44);
            sb.append("Ignoring header ");
            sb.append(str);
            sb.append(" because its value was null.");
            cavh.mo74959a(sb.toString());
        } else if ("X-Android-Transports".equals(str) || "X-Android-Protocols".equals(str)) {
            m127547a(str2, false);
        } else {
            this.f176404g.mo74869b(str, str2);
        }
    }

    public final boolean usingProxy() {
        caup caup = this.f176408k;
        Proxy proxy = caup == null ? this.f176400a.f176001c : caup.f176066b;
        return (proxy == null || proxy.type() == Proxy.Type.DIRECT) ? false : true;
    }

    public final String getHeaderField(String str) {
        if (str != null) {
            return m127545a().mo74873a(str);
        }
        try {
            return caye.m127533a(m127550c().mo75062d()).toString();
        } catch (IOException e) {
            return null;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    public final void setFixedLengthStreamingMode(long j) {
        if (this.connected) {
            throw new IllegalStateException("Already connected");
        } else if (this.chunkLength > 0) {
            throw new IllegalStateException("Already in chunked mode");
        } else if (j >= 0) {
            this.f176405h = j;
            this.fixedContentLength = (int) Math.min(j, 2147483647L);
        } else {
            throw new IllegalArgumentException("contentLength < 0");
        }
    }

    /* renamed from: a */
    private final caxt m127546a(String str, cayf cayf, cayb cayb, caun caun) {
        caul caul;
        boolean z;
        String str2;
        if (caxu.m127506a(str)) {
            caul = f176399f;
        } else {
            caul = null;
        }
        URL url = getURL();
        Logger logger = cavb.f176115a;
        String url2 = url.toString();
        caud caud = new caud();
        int a = caud.mo74878a((caue) null, url2);
        int i = a - 1;
        boolean z2 = true;
        if (i == 0) {
            caue b = caud.mo74881b();
            cauj cauj = new cauj();
            cauj.mo74905a(b);
            cauj.mo74907a(str, caul);
            cauc a2 = this.f176404g.mo74866a();
            int a3 = a2.mo74871a();
            for (int i2 = 0; i2 < a3; i2++) {
                cauj.mo74908a(a2.mo74872a(i2), a2.mo74875b(i2));
            }
            if (caxu.m127507b(str)) {
                long j = this.f176405h;
                if (j != -1) {
                    cauj.mo74909b("Content-Length", Long.toString(j));
                    z2 = false;
                } else if (this.chunkLength > 0) {
                    cauj.mo74909b("Transfer-Encoding", "chunked");
                    z2 = false;
                }
                if (a2.mo74873a("Content-Type") == null) {
                    cauj.mo74909b("Content-Type", DataParser.CONTENT_TYPE_VALUE);
                }
                z = z2;
            } else {
                z = false;
            }
            if (a2.mo74873a("User-Agent") == null) {
                String property = System.getProperty("http.agent");
                cauj.mo74909b("User-Agent", property == null ? "okhttp/2.7.2" : cavk.m127305a(property));
            }
            return new caxt(this.f176400a, cauj.mo74904a(), z, cayf, cayb, caun);
        } else if (i != 4) {
            if (a != 1) {
                str2 = a != 2 ? a != 3 ? a != 4 ? "INVALID_HOST" : "INVALID_PORT" : "UNSUPPORTED_SCHEME" : "MISSING_SCHEME";
            } else {
                str2 = "SUCCESS";
            }
            StringBuilder sb = new StringBuilder(str2.length() + 18 + String.valueOf(url2).length());
            sb.append("Invalid URL: ");
            sb.append(str2);
            sb.append(" for ");
            sb.append(url2);
            throw new MalformedURLException(sb.toString());
        } else {
            String valueOf = String.valueOf(url2);
            throw new UnknownHostException(valueOf.length() == 0 ? new String("Invalid host: ") : "Invalid host: ".concat(valueOf));
        }
    }

    /* renamed from: a */
    private final void m127547a(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.addAll(this.f176400a.f176002d);
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        int i = 0;
        while (i < length) {
            try {
                arrayList.add(caui.m127235a(split[i]));
                i++;
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        cauf cauf = this.f176400a;
        List a = cavk.m127306a(arrayList);
        if (!a.contains(caui.HTTP_1_1)) {
            String valueOf = String.valueOf(a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
            sb.append("protocols doesn't contain http/1.1: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        } else if (a.contains(caui.HTTP_1_0)) {
            String valueOf2 = String.valueOf(a);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 37);
            sb2.append("protocols must not contain http/1.0: ");
            sb2.append(valueOf2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!a.contains(null)) {
            cauf.f176002d = cavk.m127306a(a);
        } else {
            throw new IllegalArgumentException("protocols must not contain null");
        }
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:440:0x0651 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:363:0x0583 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:238:0x0399 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:60:0x010c */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:348:0x0567 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:342:0x0561 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:315:0x0528 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:307:0x0520 */
    /* JADX WARN: Type inference failed for: r3v0, assign insn: 0x0002: CONST  (r3v0 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r3v3, assign insn: PHI: (r3v3 ?) = (r3v10 ?), (r3v35 ?), (r3v80 ?) binds: [B:403:0x05e6, B:201:0x02e6, B:446:0x065b] */
    /* JADX WARN: Type inference failed for: r3v4, assign insn: PHI: (r3v4 ?) = (r3v0 ?), (r3v7 ?), (r3v10 ?), (r3v10 ?), (r3v10 ?) binds: [B:1:0x0004, B:440:0x0651, B:363:0x0583, B:399:0x05e2, B:372:0x059a] */
    /* JADX WARN: Type inference failed for: r3v6, assign insn: PHI: (r3v6 ?) = (r3v7 ?), (r3v10 ?) binds: [B:438:0x064c, B:398:0x05de] */
    /* JADX WARN: Type inference failed for: r3v7, types: [cayh], assign insn: PHI: (r3v7 ?) = (r3v82 ?), (r3v85 ?) binds: [B:406:0x05ec, B:355:0x0576] */
    /* JADX WARN: Type inference failed for: r3v10, types: [cayh], assign insn: PHI: (r3v10 ?) = (r3v11 ?), (r3v43 ?), (r3v87 ?) binds: [B:361:0x0581, B:301:0x0517, B:297:0x050d] */
    /* JADX WARN: Type inference failed for: r3v11, assign insn: 0x0581: MOVE  (r3v11 ? I:?[OBJECT, ARRAY]) = (r1v0 cayh) */
    /* JADX WARN: Type inference failed for: r3v22, assign insn: PHI: (r3v22 ?) = (r3v56 ?), (r3v77 ? I:?[boolean, int, float, short, byte, char]) binds: [B:199:0x02dd, B:56:?] */
    /* JADX WARN: Type inference failed for: r3v28, assign insn: PHI: (r3v28 ?) = (r3v22 ?), (r3v31 cayh) binds: [B:60:0x010c, B:329:0x0541] */
    /* JADX WARN: Type inference failed for: r3v35, assign insn: 0x02e7: MOVE  (r3v35 ? I:?[OBJECT, ARRAY]) = (r20v0 'this' cayh A[THIS]) */
    /* JADX WARN: Type inference failed for: r3v43, assign insn: 0x0517: MOVE  (r3v43 ? I:?[OBJECT, ARRAY]) = (r20v0 'this' cayh A[THIS]) */
    /* JADX WARN: Type inference failed for: r3v56, assign insn: 0x02df: CONST  (r3v56 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r3v77, assign insn: 0x0002: CONST  (r3v77 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r3v80, assign insn: ?: MOVE  (r3v80 ?) = (r3v4 ?) */
    /* JADX WARN: Type inference failed for: r3v82, assign insn: ?: MOVE  (r3v82 ?) = (r3v8 cayh) */
    /* JADX WARN: Type inference failed for: r3v85, assign insn: ?: MOVE  (r3v85 ?) = (r3v15 cayh) */
    /* JADX WARN: Type inference failed for: r3v87, assign insn: ?: MOVE  (r3v87 ?) = (r3v18 cayh) */
    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        r7 = new p000.cayl(r10.f176392c.mo75069b());
        r10.mo75073a(r7);
        r2 = r10.f176391b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x018e, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        r3 = r10.f176391b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0197, code lost:
        if (r3.f175961f.isEmpty() != false) goto L_0x019a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x019a, code lost:
        r3.f175957b.execute(r3.f175960e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01a1, code lost:
        r3.f175961f.add(r7);
        r10.f176393d = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01aa, code lost:
        if (r10.f176395f != false) goto L_0x02ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01ac, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        r2 = r10.f176390a.f175830e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01b3, code lost:
        if (r7.f176415e != null) goto L_0x02b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01b5, code lost:
        r3 = new p000.caur(r2);
        r4 = r7.f176411a;
        r8 = r4.f176066b;
        r4 = r4.f176065a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01c2, code lost:
        if (r4.f175833h != null) goto L_0x01f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01ca, code lost:
        if (r2.contains(p000.catv.f175969c) == false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01cc, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01ce, code lost:
        r2 = java.lang.String.valueOf(r2);
        r6 = new java.lang.StringBuilder(java.lang.String.valueOf(r2).length() + 39);
        r6.append("CLEARTEXT communication not supported: ");
        r6.append(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01f7, code lost:
        throw new p000.cayc(new java.net.UnknownServiceException(r6.toString()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01f8, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01fb, code lost:
        if (r7.f176415e != null) goto L_0x02a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0203, code lost:
        if (r8.type() == java.net.Proxy.Type.DIRECT) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x020b, code lost:
        if (r8.type() == java.net.Proxy.Type.HTTP) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x020d, code lost:
        r1 = new java.net.Socket(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0213, code lost:
        r1 = r4.f175828c.createSocket();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0219, code lost:
        r7.f176412b = r1;
        r7.mo75176a(r12, r13, r14, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0221, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0222, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        p000.cavk.m127312a(r7.f176413c);
        p000.cavk.m127312a(r7.f176412b);
        r7.f176413c = null;
        r7.f176412b = null;
        r7.f176418h = null;
        r7.f176419i = null;
        r7.f176414d = null;
        r7.f176415e = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x023a, code lost:
        if (r2 == null) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x023c, code lost:
        r2 = new p000.cayc(r1);
        r17 = r4;
        r18 = r8;
        r19 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0248, code lost:
        r15 = r2.f176377b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x024c, code lost:
        if (p000.cayc.f176376a != null) goto L_0x024e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x024e, code lost:
        r17 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0252, code lost:
        r18 = r8;
        r19 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:?, code lost:
        p000.cayc.f176376a.invoke(r1, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0267, code lost:
        r18 = r8;
        r19 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x026c, code lost:
        r17 = r4;
        r18 = r8;
        r19 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:?, code lost:
        r2.f176377b = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0274, code lost:
        if (r11 != false) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0276, code lost:
        r3.f176077d = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        r2 = r0;
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x029b, code lost:
        r4 = r17;
        r8 = r18;
        r12 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02a5, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x02a6, code lost:
        r19 = r12;
        r10.mo75071a().mo74961b(r7.f176411a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x02b9, code lost:
        throw new java.lang.IllegalStateException("already connected");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x02c1, code lost:
        throw new java.io.IOException("Canceled");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x02c2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:?, code lost:
        r1 = r10.f176391b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x02cd, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x02d0, code lost:
        if (r7.f176417g == 0) goto L_0x02f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x02d2, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x02d7, code lost:
        if (r7.mo75177a(r9) == false) goto L_0x02da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x02da, code lost:
        r10.mo75078e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x02e5, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x02e6, code lost:
        r3 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x02eb, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x02ec, code lost:
        r3 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:?, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x050a, code lost:
        r0 = th;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0510, code lost:
        r0 = e;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0516, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0517, code lost:
        r3 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x051b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x051c, code lost:
        r3 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0521, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0523, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0524, code lost:
        r3 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0529, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x052b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x052c, code lost:
        r3 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x052f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0530, code lost:
        r3 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0538, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0539, code lost:
        r3 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0562, code lost:
        r0 = e;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0574, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0575, code lost:
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0576, code lost:
        r1 = r0;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x057a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x057b, code lost:
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x057c, code lost:
        r2 = r0;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x057d, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0580, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0581, code lost:
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x058d, code lost:
        r6 = r6.f176417g;
        r5.mo75074a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0593, code lost:
        if (r6 == 1) goto L_0x0595;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0595, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x059c, code lost:
        if ((r4 instanceof p000.cayb) == false) goto L_0x059e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x059e, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x05b3, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x05b5, code lost:
        if (r6 == false) goto L_0x05d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x05d2, code lost:
        r4 = new p000.caxt(r2.f176351b, r2.f176358i, r2.f176357h, r2.mo75064f(), (p000.cayb) r4, r2.f176353d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x05d4, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x05d6, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:?, code lost:
        r3.f176402c = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x05db, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x05dd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x05de, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:?, code lost:
        r3.f176401b = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x05e4, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x05e9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x05ea, code lost:
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x05ec, code lost:
        r1 = r0;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x05ed, code lost:
        r2 = r3.f176402c;
        r4 = r2.f176352c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x05f3, code lost:
        if (r4.f176393d != null) goto L_0x05f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x05f5, code lost:
        r4.mo75074a(r1.f176377b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x05fa, code lost:
        r4 = r4.f176392c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x05fc, code lost:
        if (r4 == null) goto L_0x05fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x0603, code lost:
        if (r4.mo75068a() == false) goto L_0x0605;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0605, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0607, code lost:
        r4 = r1.f176377b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x060b, code lost:
        if ((r4 instanceof java.net.ProtocolException) == false) goto L_0x060d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x060f, code lost:
        if ((r4 instanceof java.io.InterruptedIOException) == false) goto L_0x0611;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x0624, code lost:
        if ((r4 instanceof java.net.SocketTimeoutException) == false) goto L_0x0626;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x0626, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x062c, code lost:
        if (r2.f176351b.f176014p != false) goto L_0x062e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x062e, code lost:
        r4 = new p000.caxt(r2.f176351b, r2.f176358i, r2.f176357h, r2.mo75064f(), (p000.cayb) r2.f176362m, r2.f176353d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x0645, code lost:
        if (r4 != null) goto L_0x0647;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:?, code lost:
        r3.f176402c = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x0649, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x064b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x064c, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x064e, code lost:
        r1 = r2;
        r2 = false;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:?, code lost:
        r1 = r1.f176377b;
        r3.f176401b = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x0655, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x065b, code lost:
        r0 = th;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x0661, code lost:
        r3.f176402c.mo75064f().mo75076c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:?, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:?, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0122, code lost:
        r19 = r12;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x02e5 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:152:0x0272] */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x02eb A[ExcHandler: cayc (e cayc), Splitter:B:99:0x017e] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x02f1 A[ExcHandler: caxz (e caxz), Splitter:B:99:0x017e] */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x050a A[ExcHandler: all (th java.lang.Throwable), PHI: r3 10  PHI: (r3v19 cayh) = (r3v20 cayh), (r3v23 cayh), (r3v26 cayh), (r3v26 cayh), (r3v39 cayh), (r3v39 cayh), (r3v40 cayh), (r3v40 cayh) binds: [B:238:0x0399, B:348:0x0567, B:342:0x0561, B:343:?, B:315:0x0528, B:316:?, B:307:0x0520, B:308:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:238:0x0399] */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0510 A[ExcHandler: cayc (e cayc), PHI: r3 10  PHI: (r3v17 cayh) = (r3v20 cayh), (r3v23 cayh), (r3v26 cayh), (r3v26 cayh), (r3v39 cayh), (r3v39 cayh), (r3v40 cayh), (r3v40 cayh) binds: [B:238:0x0399, B:348:0x0567, B:342:0x0561, B:343:?, B:315:0x0528, B:316:?, B:307:0x0520, B:308:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:238:0x0399] */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0513 A[ExcHandler: caxz (e caxz), Splitter:B:238:0x0399] */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x0538 A[ExcHandler: IOException (e java.io.IOException), Splitter:B:152:0x0272] */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x0574 A[ExcHandler: cayc (e cayc), PHI: r1 10  PHI: (r1v17 cayh) = (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v32 cayh) binds: [B:3:0x0006, B:17:0x0032, B:24:0x0041, B:29:0x0050, B:30:?, B:35:0x006d, B:49:0x00af, B:50:?, B:55:0x00f4, B:56:?, B:57:0x0109] A[DONT_GENERATE, DONT_INLINE], Splitter:B:29:0x0050] */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x057a A[ExcHandler: all (th java.lang.Throwable), PHI: r1 10  PHI: (r1v15 cayh) = (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v32 cayh) binds: [B:1:0x0004, B:2:?, B:3:0x0006, B:17:0x0032, B:24:0x0041, B:29:0x0050, B:30:?, B:35:0x006d, B:49:0x00af, B:50:?, B:55:0x00f4, B:56:?, B:57:0x0109] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x0004] */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x0580 A[ExcHandler: IOException (e java.io.IOException), Splitter:B:1:0x0004] */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x058d A[Catch:{ all -> 0x05e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:370:0x0597  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x059a A[SYNTHETIC, Splitter:B:372:0x059a] */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x05a5 A[Catch:{ caxz -> 0x02f1, cayc -> 0x02eb, IOException -> 0x0516, all -> 0x02e5, all -> 0x065b }] */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x05b3 A[Catch:{ caxz -> 0x02f1, cayc -> 0x02eb, IOException -> 0x0516, all -> 0x02e5, all -> 0x065b }] */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x05b5 A[Catch:{ caxz -> 0x02f1, cayc -> 0x02eb, IOException -> 0x0516, all -> 0x02e5, all -> 0x065b }] */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x05d9 A[SYNTHETIC, Splitter:B:394:0x05d9] */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x05e2 A[SYNTHETIC, Splitter:B:399:0x05e2] */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x05e9 A[Catch:{ caxz -> 0x02f1, cayc -> 0x02eb, IOException -> 0x0516, all -> 0x02e5, all -> 0x065b }, ExcHandler: cayc (e cayc), PHI: r1 10  PHI: (r1v11 cayh) = (r1v0 cayh), (r1v0 cayh), (r1v32 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh) binds: [B:1:0x0004, B:2:?, B:115:0x01c4, B:52:0x00bf, B:53:?, B:42:0x0094, B:32:0x0056, B:33:?, B:27:0x0047, B:28:?, B:21:0x003c, B:22:?, B:12:0x0021, B:13:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x0004] */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x05f5 A[Catch:{ caxz -> 0x02f1, cayc -> 0x02eb, IOException -> 0x0516, all -> 0x02e5, all -> 0x065b }] */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x05fe A[Catch:{ caxz -> 0x02f1, cayc -> 0x02eb, IOException -> 0x0516, all -> 0x02e5, all -> 0x065b }] */
    /* JADX WARNING: Removed duplicated region for block: B:413:0x05ff A[Catch:{ caxz -> 0x02f1, cayc -> 0x02eb, IOException -> 0x0516, all -> 0x02e5, all -> 0x065b }] */
    /* JADX WARNING: Removed duplicated region for block: B:434:0x0647 A[SYNTHETIC, Splitter:B:434:0x0647] */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x0651 A[SYNTHETIC, Splitter:B:440:0x0651] */
    /* JADX WARNING: Removed duplicated region for block: B:443:0x0656 A[Catch:{ caxz -> 0x02f1, cayc -> 0x02eb, IOException -> 0x0516, all -> 0x02e5, all -> 0x065b }, ExcHandler: caxz (e caxz), PHI: r1 10  PHI: (r1v4 cayh) = (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v32 cayh), (r1v32 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh), (r1v0 cayh) binds: [B:1:0x0004, B:2:?, B:3:0x0006, B:17:0x0032, B:24:0x0041, B:29:0x0050, B:30:?, B:35:0x006d, B:49:0x00af, B:50:?, B:55:0x00f4, B:56:?, B:57:0x0109, B:115:0x01c4, B:52:0x00bf, B:53:?, B:42:0x0094, B:32:0x0056, B:33:?, B:27:0x0047, B:28:?, B:21:0x003c, B:22:?, B:12:0x0021, B:13:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x0004] */
    /* JADX WARNING: Removed duplicated region for block: B:450:0x0661  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    private final boolean m127548a(boolean z) {
        caxt caxt;
        cayh cayh;
        cayh cayh2;
        cayl cayl;
        int i;
        caxv caxv;
        int i2;
        cayh cayh3 = this;
        ? r3 = 1;
        cayh cayh4 = 1;
        try {
            caxt caxt2 = cayh3.f176402c;
            if (caxt2.f176365p != null) {
                cayh = cayh3;
            } else if (caxt2.f176354e == null) {
                cauk cauk = caxt2.f176358i;
                cauj b = cauk.mo74912b();
                if (cauk.mo74910a("Host") == null) {
                    b.mo74909b("Host", cavk.m127304a(cauk.f176037a));
                }
                if (cauk.mo74910a("Connection") == null) {
                    b.mo74909b("Connection", "Keep-Alive");
                }
                if (cauk.mo74910a("Accept-Encoding") == null) {
                    caxt2.f176356g = true;
                    b.mo74909b("Accept-Encoding", "gzip");
                }
                CookieHandler cookieHandler = caxt2.f176351b.f176005g;
                if (cookieHandler != null) {
                    caxx.m127521a(b, cookieHandler.get(cauk.mo74911a(), caxx.m127520a(b.mo74904a().f176039c, (String) null)));
                }
                if (cauk.mo74910a("User-Agent") == null) {
                    b.mo74909b("User-Agent", "okhttp/2.7.2");
                }
                cauk a = b.mo74904a();
                Logger logger = cavb.f176115a;
                System.currentTimeMillis();
                caxe caxe = new caxe(a);
                caxf caxf = new caxf(caxe.f176304a);
                if (caxf.f176305a != null) {
                    cauk cauk2 = caxe.f176304a;
                    catm catm = cauk2.f176043g;
                    if (catm == null) {
                        catm = catm.m127180a(cauk2.f176039c);
                        cauk2.f176043g = catm;
                    }
                    if (catm.f175848i) {
                        caxf = new caxf(null);
                    }
                }
                caxt2.f176365p = caxf;
                caxf caxf2 = caxt2.f176365p;
                caxt2.f176359j = caxf2.f176305a;
                caun caun = caxf2.f176306b;
                caxt2.f176360k = null;
                cauk cauk3 = caxt2.f176359j;
                if (cauk3 == null) {
                    caun caun2 = caxt2.f176360k;
                    caum caum = new caum();
                    caum.f176045a = caxt2.f176358i;
                    caum.mo74917a(caxt.m127494a(caxt2.f176353d));
                    caum.f176046b = caui.HTTP_1_1;
                    caum.f176047c = 504;
                    caum.f176048d = "Unsatisfiable Request (only-if-cached)";
                    caum.f176051g = caxt.f176350a;
                    caxt2.f176361l = caum.mo74915a();
                    caxt2.f176361l = caxt2.mo75059b(caxt2.f176361l);
                    cayh = cayh3;
                } else {
                    boolean z2 = !cauk3.f176038b.equals("GET");
                    cayf cayf = caxt2.f176352c;
                    cauf cauf = caxt2.f176351b;
                    int i3 = cauf.f176015q;
                    int i4 = cauf.f176016r;
                    int i5 = cauf.f176017s;
                    boolean z3 = cauf.f176014p;
                    loop0:
                    while (true) {
                        synchronized (cayf.f176391b) {
                            try {
                                if (cayf.f176394e) {
                                    throw new IllegalStateException("released");
                                } else if (cayf.f176396g != null) {
                                    throw new IllegalStateException("stream != null");
                                } else if (!cayf.f176395f) {
                                    cayl = cayf.f176393d;
                                    if (cayl != null) {
                                        if (!cayl.f176421k) {
                                        }
                                    }
                                    catt catt = cayf.f176391b;
                                    catk catk = cayf.f176390a;
                                    Iterator it = catt.f175961f.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            cayl = null;
                                            break;
                                        }
                                        cayl cayl2 = (cayl) it.next();
                                        int size = cayl2.f176420j.size();
                                        cawc cawc = cayl2.f176416f;
                                        if (cawc != null) {
                                            i2 = cawc.mo74984a();
                                        } else {
                                            i2 = 1;
                                        }
                                        if (size < i2) {
                                            if (catk.equals(cayl2.f176411a.f176065a) && !cayl2.f176421k) {
                                                cayf.mo75073a(cayl2);
                                                cayl = cayl2;
                                                break;
                                            }
                                        }
                                    }
                                    if (cayl == null) {
                                        try {
                                            if (cayf.f176392c == null) {
                                                cayf.f176392c = new cayd(cayf.f176390a, cayf.mo75071a());
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            cayh2 = this;
                                            Throwable th2 = th;
                                            throw th2;
                                        }
                                    } else {
                                        i = i3;
                                        cayf.f176393d = cayl;
                                    }
                                } else {
                                    cayh4 = cayh3;
                                    throw new IOException("Canceled");
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                cayh2 = cayh4;
                                Throwable th22 = th;
                                throw th22;
                            }
                        }
                        i3 = i;
                        cayh4 = 1;
                        cayh3 = this;
                    }
                    if (cayl.f176416f != null) {
                        caxv = new caxp(cayf, cayl.f176416f);
                    } else {
                        cayl.f176413c.setSoTimeout(i4);
                        cayl.f176418h.mo74997df().mo86354a((long) i4, TimeUnit.MILLISECONDS);
                        cayl.f176419i.mo74932df().mo86354a((long) i5, TimeUnit.MILLISECONDS);
                        caxv = new caxn(cayf, cayl.f176418h, cayl.f176419i);
                    }
                    synchronized (cayf.f176391b) {
                        cayl.f176417g++;
                        cayf.f176396g = caxv;
                    }
                    caxt2.f176354e = caxv;
                    caxt2.f176354e.mo75048a(caxt2);
                    if (caxt2.mo75058a(caxt2.f176359j)) {
                        if (caxt2.f176362m == null) {
                            long a2 = caxx.m127517a(a);
                            if (!caxt2.f176357h) {
                                caxt2.f176354e.mo75047a(caxt2.f176359j);
                                caxt2.f176362m = caxt2.f176354e.mo75043a(caxt2.f176359j, a2);
                                cayh = this;
                            } else if (a2 > 2147483647L) {
                                throw new IllegalStateException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2 GiB.");
                            } else if (a2 == -1) {
                                caxt2.f176362m = new cayb(-1);
                                cayh = this;
                            } else {
                                caxt2.f176354e.mo75047a(caxt2.f176359j);
                                caxt2.f176362m = new cayb((int) a2);
                                cayh = this;
                            }
                        }
                    }
                    cayh = this;
                }
            } else {
                throw new IllegalStateException();
            }
            try {
                catr e = cayh.f176402c.mo75063e();
                if (e != null) {
                    cayh.f176408k = ((cayl) e).f176411a;
                    cayh.f176403d = ((cayl) e).f176414d;
                } else {
                    cayh.f176408k = null;
                    cayh.f176403d = null;
                }
                if (!z) {
                    return true;
                }
                caxt caxt3 = cayh.f176402c;
                if (caxt3.f176361l != null) {
                    return true;
                }
                if (caxt3.f176359j != null) {
                    cipv cipv = caxt3.f176363n;
                    if (cipv != null) {
                        cipu cipu = ((ciqk) cipv).f191243a;
                        long j = cipu.f191213b;
                        if (j > 0) {
                            if (((ciqk) cipv).f191245c) {
                                throw new IllegalStateException("closed");
                            } else if (j > 0) {
                                ((ciqk) cipv).f191244b.mo74930a(cipu, j);
                            }
                        }
                    }
                    if (caxt3.f176355f == -1) {
                        if (caxx.m127517a(caxt3.f176359j) == -1) {
                            ciqq ciqq = caxt3.f176362m;
                            if (ciqq instanceof cayb) {
                                long j2 = ((cayb) ciqq).f176373a.f191213b;
                                cauj b2 = caxt3.f176359j.mo74912b();
                                b2.mo74909b("Content-Length", Long.toString(j2));
                                caxt3.f176359j = b2.mo74904a();
                            }
                        }
                        caxt3.f176354e.mo75047a(caxt3.f176359j);
                    }
                    ciqq ciqq2 = caxt3.f176362m;
                    if (ciqq2 != null) {
                        cipv cipv2 = caxt3.f176363n;
                        if (cipv2 != null) {
                            cipv2.close();
                        } else {
                            ciqq2.close();
                        }
                        ciqq ciqq3 = caxt3.f176362m;
                        if (ciqq3 instanceof cayb) {
                            caxt3.f176354e.mo75049a((cayb) ciqq3);
                        }
                    }
                    caxt3.f176354e.mo75051c();
                    caum b3 = caxt3.f176354e.mo75050b();
                    b3.f176045a = caxt3.f176359j;
                    b3.f176049e = caxt3.f176352c.mo75075b().f176414d;
                    b3.mo74918a(caxx.f176367b, Long.toString(caxt3.f176355f));
                    b3.mo74918a(caxx.f176368c, Long.toString(System.currentTimeMillis()));
                    caun a3 = b3.mo74915a();
                    caum a4 = a3.mo74919a();
                    a4.f176051g = caxt3.f176354e.mo75042a(a3);
                    caun a5 = a4.mo74915a();
                    if ("close".equalsIgnoreCase(a5.f176055a.mo74910a("Connection")) || "close".equalsIgnoreCase(a5.mo74920a("Connection"))) {
                        caxt3.f176352c.mo75077d();
                    }
                    caxt3.mo75056a(a5.f176060f);
                    caun caun3 = caxt3.f176360k;
                    caum a6 = a5.mo74919a();
                    a6.f176045a = caxt3.f176358i;
                    a6.mo74917a(caxt.m127494a(caxt3.f176353d));
                    caun caun4 = caxt3.f176360k;
                    caun a7 = caxt.m127494a((caun) null);
                    if (a7 != null) {
                        caum.m127246a("cacheResponse", a7);
                    }
                    a6.f176053i = a7;
                    caun a8 = caxt.m127494a(a5);
                    if (a8 != null) {
                        caum.m127246a("networkResponse", a8);
                    }
                    a6.f176052h = a8;
                    caxt3.f176361l = a6.mo74915a();
                    if (!caxt.m127495c(caxt3.f176361l)) {
                        return true;
                    }
                    Logger logger2 = cavb.f176115a;
                    caxd caxd = caxt3.f176364o;
                    caxt3.f176361l = caxt3.mo75059b(caxt3.f176361l);
                    return true;
                }
                caun caun5 = caxt3.f176360k;
                throw new IllegalStateException("call sendRequest() first!");
            } catch (caxz e2) {
            } catch (cayc e3) {
            } catch (IOException e4) {
                e = e4;
                ? r32 = cayh;
                IOException iOException = e;
                try {
                    caxt caxt4 = r3.f176402c;
                    ciqq ciqq4 = caxt4.f176362m;
                    cayf cayf2 = caxt4.f176352c;
                    cayl cayl3 = cayf2.f176393d;
                    if (cayl3 != null) {
                    }
                    if (ciqq4 != null) {
                    }
                    boolean z4 = true;
                    cayd cayd = cayf2.f176392c;
                    if (cayd != null) {
                    }
                    if (!(iOException instanceof InterruptedIOException)) {
                    }
                    if (caxt == null) {
                    }
                } catch (Throwable th4) {
                    th = th4;
                    Throwable th5 = th;
                    cayh cayh5 = r3;
                    Throwable th6 = th5;
                    boolean z5 = true;
                    cayh cayh6 = cayh5;
                    if (z5) {
                    }
                    throw th6;
                }
            } catch (Throwable th7) {
            }
        } catch (IOException e5) {
            e = e5;
            cayh cayh7 = cayh3;
            throw new cayc(e);
        } catch (caxz e6) {
        } catch (cayc e7) {
        } catch (Throwable th8) {
        }
    }
}
