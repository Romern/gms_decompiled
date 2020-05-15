package p000;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.security.KeyManagementException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* renamed from: pkk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pkk implements pky {

    /* renamed from: G */
    private static SSLContext f39445G;

    /* renamed from: H */
    private static SSLContext f39446H;

    /* renamed from: e */
    private static final int f39447e = ((int) ccxy.f180226a.mo6606a().mo77046h());

    /* renamed from: f */
    private static final ByteBuffer[] f39448f = {ByteBuffer.allocate(0)};

    /* renamed from: A */
    private boolean f39449A;

    /* renamed from: B */
    private byte[] f39450B;

    /* renamed from: C */
    private boolean f39451C;

    /* renamed from: D */
    private InetAddress f39452D;

    /* renamed from: E */
    private String f39453E;

    /* renamed from: F */
    private int f39454F;

    /* renamed from: I */
    private final SSLContext f39455I;

    /* renamed from: J */
    private boolean f39456J;

    /* renamed from: K */
    private SSLEngine f39457K;

    /* renamed from: L */
    private SSLEngineResult.HandshakeStatus f39458L;

    /* renamed from: M */
    private ByteBuffer f39459M;

    /* renamed from: N */
    private ByteBuffer f39460N;

    /* renamed from: O */
    private boolean f39461O;

    /* renamed from: a */
    public final pkx f39462a;

    /* renamed from: b */
    public final String f39463b;

    /* renamed from: c */
    public final boolean f39464c;

    /* renamed from: d */
    public String f39465d;

    /* renamed from: g */
    private final int f39466g;

    /* renamed from: h */
    private final Executor f39467h;

    /* renamed from: i */
    private final phy f39468i;

    /* renamed from: j */
    private final qav f39469j;

    /* renamed from: k */
    private final pkn f39470k;

    /* renamed from: l */
    private final int f39471l;

    /* renamed from: m */
    private final boolean f39472m = ccyh.f180261a.mo6606a().mo77068a();

    /* renamed from: n */
    private plh f39473n;

    /* renamed from: o */
    private pko f39474o;

    /* renamed from: p */
    private bxuc f39475p;

    /* renamed from: q */
    private pkp f39476q;

    /* renamed from: r */
    private pko f39477r;

    /* renamed from: s */
    private bxuk f39478s;

    /* renamed from: t */
    private int f39479t;

    /* renamed from: u */
    private long f39480u;

    /* renamed from: v */
    private long f39481v;

    /* renamed from: w */
    private long f39482w;

    /* renamed from: x */
    private boolean f39483x;

    /* renamed from: y */
    private boolean f39484y;

    /* renamed from: z */
    private String f39485z;

    public pkk(Context context, pkx pkx, ScheduledExecutorService scheduledExecutorService, String str, int i, boolean z, boolean z2, phy phy) {
        SSLContext sSLContext;
        if (context == null) {
            throw new IllegalArgumentException("context cannot be null");
        } else if (pkx != null) {
            if (!z2) {
                m30683a(context);
                sSLContext = f39445G;
            } else {
                m30686b(context);
                sSLContext = f39446H;
            }
            this.f39455I = sSLContext;
            qav qav = new qav("CastSocket");
            this.f39469j = qav;
            qav.mo23669a(str);
            this.f39463b = str;
            this.f39462a = pkx;
            this.f39467h = scheduledExecutorService;
            this.f39466g = i;
            this.f39464c = z;
            this.f39468i = phy;
            this.f39471l = i - 4;
            if (pkn.f39488a == null) {
                pkn.f39488a = new pkn(context, phy, scheduledExecutorService);
            }
            this.f39470k = pkn.f39488a;
            m30688m();
        } else {
            throw new IllegalArgumentException("listener cannot be null");
        }
    }

    /* renamed from: a */
    private static void m30683a(Context context) {
        synchronized (pkk.class) {
            if (f39445G == null) {
                try {
                    f39445G = SSLContext.getInstance("TLS");
                } catch (NoSuchAlgorithmException e) {
                }
                m30684a(context, f39445G, pif.f39208a);
            }
        }
    }

    /* renamed from: b */
    private static void m30686b(Context context) {
        synchronized (pkk.class) {
            if (f39446H == null) {
                try {
                    f39446H = SSLContext.getInstance("TLS");
                } catch (NoSuchAlgorithmException e) {
                }
                m30684a(context, f39446H, plf.f39582a);
            }
        }
    }

    /* renamed from: c */
    public static String m30687c(int i) {
        return String.format(Locale.ROOT, "\"%d %s\"", Integer.valueOf(i), i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown error" : "Relay error" : "SSL Error" : "Connection timed out" : "IO Error" : "Peer disconnected" : "No error");
    }

    /* renamed from: m */
    private final void m30688m() {
        pko pko = this.f39474o;
        if (pko != null) {
            pko.mo23333c();
        }
        pko pko2 = this.f39477r;
        if (pko2 != null) {
            pko2.mo23333c();
        }
        this.f39479t = 0;
        this.f39475p = null;
        this.f39476q = null;
        this.f39478s = null;
        this.f39461O = false;
        this.f39483x = false;
        this.f39457K = null;
        this.f39456J = false;
        this.f39484y = false;
        this.f39449A = false;
        this.f39452D = null;
        this.f39454F = 0;
        this.f39453E = null;
        this.f39465d = null;
    }

    /* renamed from: n */
    private final int m30689n() {
        int i = 1;
        if (!m30690o() || this.f39483x || (this.f39458L != SSLEngineResult.HandshakeStatus.NEED_UNWRAP && this.f39474o.mo23336f())) {
            i = 0;
        }
        return (!m30691p() || (!this.f39483x && this.f39458L != SSLEngineResult.HandshakeStatus.NEED_WRAP && this.f39460N.position() <= 0 && this.f39477r.f39515e)) ? i : i | 4;
    }

    /* renamed from: o */
    private final boolean m30690o() {
        return !this.f39457K.isInboundDone() && !this.f39457K.isOutboundDone();
    }

    /* renamed from: p */
    private final boolean m30691p() {
        return !this.f39457K.isOutboundDone() && !this.f39457K.isInboundDone();
    }

    /* renamed from: q */
    private final void m30692q() {
        this.f39460N.flip();
        int a = this.f39473n.mo23360a(this.f39460N);
        if (a >= 0) {
            new Object[1][0] = Integer.valueOf(a);
            this.f39460N.compact();
            return;
        }
        throw new ClosedChannelException();
    }

    /* renamed from: r */
    private final void m30693r() {
        Executor executor = this.f39467h;
        pkx pkx = this.f39462a;
        pkx.getClass();
        executor.execute(new pke(pkx));
    }

    /* renamed from: s */
    private final void m30694s() {
        this.f39451C = true;
        try {
            plh plh = this.f39473n;
            String str = this.f39485z;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8);
            sb.append("join\r\n");
            sb.append(str);
            sb.append("\r\n");
            plh.mo23360a(ByteBuffer.wrap(sb.toString().getBytes(ptw.f40213a)));
        } catch (IOException e) {
            throw new pjl("Unable to connect to the relay server");
        }
    }

    /* renamed from: a */
    public final synchronized void mo23304a(String str, byte[] bArr) {
        this.f39485z = str;
        this.f39450B = bArr;
        this.f39449A = true;
    }

    /* renamed from: c */
    public final synchronized boolean mo23308c() {
        return this.f39479t == 2;
    }

    /* renamed from: d */
    public final synchronized boolean mo23309d() {
        return this.f39479t == 1;
    }

    /* renamed from: e */
    public final synchronized boolean mo23310e() {
        return this.f39479t == 3;
    }

    /* renamed from: f */
    public final synchronized boolean mo23311f() {
        return this.f39479t == 0;
    }

    /* renamed from: g */
    public final synchronized int mo23312g() {
        return this.f39479t;
    }

    /* renamed from: h */
    public final synchronized byte[] mo23313h() {
        Certificate[] certificateArr;
        if (this.f39461O) {
            try {
                SSLEngine sSLEngine = this.f39457K;
                if (sSLEngine == null || sSLEngine.getSession() == null) {
                    certificateArr = null;
                } else {
                    certificateArr = this.f39457K.getSession().getPeerCertificates();
                }
                if (certificateArr != null && certificateArr.length > 0) {
                    return certificateArr[0].getEncoded();
                }
            } catch (CertificateEncodingException | SSLPeerUnverifiedException e) {
                this.f39469j.mo23675c("Error getting peer cert: %s", e.getMessage());
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0067, code lost:
        return 0;
     */
    /* renamed from: i */
    public final synchronized int mo23314i() {
        this.f39469j.mo23670a("onConnectable", new Object[0]);
        plh plh = this.f39473n;
        if (plh != null && this.f39479t == 1) {
            try {
                plh.f39587a.finishConnect();
                if (this.f39485z == null) {
                    SSLEngine sSLEngine = this.f39457K;
                    if (sSLEngine == null) {
                        this.f39479t = 2;
                        m30693r();
                    } else if (!this.f39456J) {
                        sSLEngine.beginHandshake();
                        this.f39458L = this.f39457K.getHandshakeStatus();
                        this.f39456J = true;
                    }
                } else {
                    m30694s();
                }
                return -1;
            } catch (SSLException e) {
                this.f39469j.mo23679f("exception in onConnectable", new Object[0]);
                return 4;
            } catch (pjl e2) {
                this.f39469j.mo23679f("exception in onConnectable", new Object[0]);
                return 5;
            } catch (IOException e3) {
                this.f39469j.mo23679f("exception in onConnectable", new Object[0]);
                return 2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0344, code lost:
        r1 = r13.f39474o;
        r6 = r1.f39514d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0348, code lost:
        if (r6 == -1) goto L_0x035b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x034c, code lost:
        if (r1.f39512b == r6) goto L_0x0352;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x034e, code lost:
        r1.f39512b = r6;
        r1.f39515e = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0352, code lost:
        r1.f39514d = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x035c, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03b4, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x021f, code lost:
        throw new java.lang.IllegalArgumentException();
     */
    /* renamed from: j */
    public final synchronized int mo23315j() {
        Long l;
        new Object[1][0] = Integer.valueOf(this.f39479t);
        plh plh = this.f39473n;
        if (plh != null && this.f39479t != 0) {
            try {
                if (this.f39457K == null) {
                    pko pko = this.f39474o;
                    ByteBuffer[] b = pko.mo23332b();
                    if (b != null) {
                        int i = 0;
                        for (ByteBuffer byteBuffer : b) {
                            int read = plh.read(byteBuffer);
                            if (read <= 0) {
                                break;
                            }
                            i += read;
                        }
                        if (i > 0) {
                            pko.mo23331b(i);
                        } else {
                            throw new ClosedChannelException();
                        }
                    }
                } else if (m30690o()) {
                    int read2 = this.f39473n.read(this.f39459M);
                    if (read2 >= 0) {
                        new Object[1][0] = Integer.valueOf(read2);
                        if (read2 > 0) {
                            this.f39459M.flip();
                            if (!this.f39451C) {
                                boolean z = false;
                                while (true) {
                                    if (this.f39459M.remaining() <= 0) {
                                        break;
                                    }
                                    int remaining = this.f39459M.remaining();
                                    ByteBuffer[] b2 = this.f39474o.mo23332b();
                                    if (b2 != null) {
                                        SSLEngineResult unwrap = this.f39457K.unwrap(this.f39459M, b2);
                                        Object[] objArr = {unwrap.getStatus(), unwrap.getHandshakeStatus(), Integer.valueOf(unwrap.bytesConsumed()), Integer.valueOf(unwrap.bytesProduced())};
                                        m30685a(unwrap);
                                        pko pko2 = this.f39474o;
                                        int bytesProduced = unwrap.bytesProduced();
                                        if (bytesProduced >= 0 && bytesProduced <= pko2.f39511a.length) {
                                            if (bytesProduced > 0) {
                                                pko2.mo23331b(bytesProduced);
                                            }
                                            int i2 = pki.f39444b[unwrap.getStatus().ordinal()];
                                            if (i2 == 1) {
                                                this.f39459M.compact();
                                                break;
                                            } else if (i2 == 2) {
                                                throw new IOException("unexpected buffer overflow condition.");
                                            } else if (i2 == 3) {
                                                throw new ClosedChannelException();
                                            } else if (i2 == 4) {
                                                if (remaining == this.f39459M.remaining()) {
                                                    this.f39469j.mo23677d("channelReadBuffer.remaining() is %d but nothing consumed from the buffer.", Integer.valueOf(remaining));
                                                    if (!z) {
                                                        phy phy = this.f39468i;
                                                        phx j = phy.mo23146j();
                                                        String str = this.f39465d;
                                                        String str2 = this.f39463b;
                                                        if (phy.f39152e) {
                                                            bpsy a = phy.mo23102a(0, (String) null, j);
                                                            bxvd da = bpsw.f139028c.mo74144da();
                                                            if (da.f164950c) {
                                                                da.mo74035c();
                                                                da.f164950c = false;
                                                            }
                                                            bpsw bpsw = (bpsw) da.f164949b;
                                                            str2.getClass();
                                                            bpsw.f139030a |= 1;
                                                            bpsw.f139031b = str2;
                                                            bpsw bpsw2 = (bpsw) da.mo74062i();
                                                            if (a.f164950c) {
                                                                a.mo74035c();
                                                                a.f164950c = false;
                                                            }
                                                            bpsz bpsz = bpsz.f139036I;
                                                            ((bpsz) a.f164949b).f139039B = GeneratedMessageLite.m124030de();
                                                            if (a.f164950c) {
                                                                a.mo74035c();
                                                                a.f164950c = false;
                                                            }
                                                            bpsz bpsz2 = (bpsz) a.f164949b;
                                                            bpsw2.getClass();
                                                            if (!bpsz2.f139039B.mo73666a()) {
                                                                bpsz2.f139039B = GeneratedMessageLite.m124021a(bpsz2.f139039B);
                                                            }
                                                            bpsz2.f139039B.add(bpsw2);
                                                            if (a.f164950c) {
                                                                a.mo74035c();
                                                                a.f164950c = false;
                                                            }
                                                            bpsz bpsz3 = (bpsz) a.f164949b;
                                                            str.getClass();
                                                            bpsz3.f139047a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                                                            bpsz3.f139056j = str;
                                                            phy.mo23110a((bpsz) a.mo74062i(), 271);
                                                        }
                                                    }
                                                    if (!ccyh.f180261a.mo6606a().mo77069b()) {
                                                        z = true;
                                                    } else {
                                                        throw new IOException("Nothing consumed from the buffer.");
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        }
                                    } else {
                                        throw new IOException("Trying to read into a full buffer.");
                                    }
                                }
                            } else {
                                byte[] bArr = new byte[this.f39459M.limit()];
                                boolean z2 = false;
                                int i3 = 0;
                                while (true) {
                                    if (!z2) {
                                        if (!this.f39459M.hasRemaining() || i3 >= f39447e) {
                                            break;
                                        }
                                        int i4 = i3 + 1;
                                        bArr[i3] = this.f39459M.get();
                                        String arrays = Arrays.toString(bArr);
                                        String str3 = new String(bArr);
                                        Object[] objArr2 = {str3, arrays};
                                        if ("OK 1\n".equals(str3) || "OK 2\n".equals(str3)) {
                                            z2 = true;
                                        }
                                        i3 = i4;
                                    } else {
                                        break;
                                    }
                                }
                                this.f39469j.mo23675c("OpenCast remaining bytes: %s", Integer.valueOf(this.f39459M.remaining()));
                                this.f39459M.clear();
                                this.f39451C = false;
                                this.f39485z = null;
                                if (!z2) {
                                    throw new pjl("Unable to create a connection to the server.");
                                } else if (!this.f39456J) {
                                    this.f39457K.beginHandshake();
                                    this.f39458L = this.f39457K.getHandshakeStatus();
                                    this.f39456J = true;
                                } else {
                                    this.f39469j.mo23675c("handleRead: SslEngine.beginHandshake was already called.", new Object[0]);
                                }
                            }
                            this.f39459M.clear();
                        }
                        if (this.f39479t == 1) {
                            if (this.f39461O) {
                                this.f39479t = 2;
                                m30693r();
                            }
                        }
                    } else {
                        new Object[1][0] = Integer.valueOf(read2);
                        throw new ClosedChannelException();
                    }
                } else {
                    throw new ClosedChannelException();
                }
                while (true) {
                    pko pko3 = this.f39474o;
                    if (pko3.f39515e) {
                        pko3.f39514d = -1;
                        pko3.f39513c = 0;
                        pko3.f39512b = 0;
                        break;
                    }
                    pko3.f39514d = pko3.f39512b;
                    if (pko3.mo23335e() >= 4) {
                        l = Long.valueOf((((long) (pko3.mo23337g() & 255)) << 24) | (((long) (pko3.mo23337g() & 255)) << 16) | (((long) (pko3.mo23337g() & 255)) << 8) | ((long) (pko3.mo23337g() & 255)));
                    } else {
                        l = null;
                    }
                    if (l == null) {
                        break;
                    } else if (l.longValue() <= ((long) this.f39471l)) {
                        if (((long) this.f39474o.mo23335e()) < l.longValue()) {
                            break;
                        }
                        this.f39476q.f39518a = l.intValue();
                        bxuc bxuc = this.f39475p;
                        bxus c = bxus.m123744c();
                        GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) blsx.f127637k.mo74142c(4);
                        bxxv a2 = bxxm.f165037a.mo74228a(GeneratedMessageLite);
                        a2.mo74220a(GeneratedMessageLite, bxud.m123454a(bxuc), c);
                        a2.mo74225d(GeneratedMessageLite);
                        GeneratedMessageLite.m124027b(GeneratedMessageLite);
                        this.f39467h.execute(new pkh(this, (blsx) GeneratedMessageLite));
                    } else {
                        throw new IOException(String.format(Locale.ROOT, "invalid message size (%d) received.", l));
                    }
                }
            } catch (IOException e) {
                if (!(e.getCause() instanceof bxwf)) {
                    throw new bxwf(e.getMessage());
                }
                throw ((bxwf) e.getCause());
            } catch (RuntimeException e2) {
                if (e2.getCause() instanceof bxwf) {
                    throw ((bxwf) e2.getCause());
                }
                throw e2;
            } catch (ClosedChannelException e3) {
                this.f39469j.mo23670a("ClosedChannelException when state was %d", Integer.valueOf(this.f39479t));
                if (this.f39479t == 3) {
                    try {
                        SSLEngine sSLEngine = this.f39457K;
                        if (sSLEngine != null) {
                            sSLEngine.closeInbound();
                        }
                        return 0;
                    } catch (SSLException e4) {
                        this.f39469j.mo23675c("Error calling SSLEngine.closeInbound(): %s", e4.getMessage());
                        return 1;
                    }
                }
                return 1;
            } catch (pjl e5) {
                this.f39469j.mo23676c(e5, "CastRelayException encountered. Tearing down the socket.", new Object[0]);
                return 5;
            } catch (SSLException e6) {
                this.f39469j.mo23676c(e6, "SSLException encountered. Tearing down the socket.", new Object[0]);
                return 4;
            } catch (IOException e7) {
                this.f39469j.mo23676c(e7, "IOException encountered. Tearing down the socket.", new Object[0]);
                return 2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final synchronized int mo23316k() {
        new Object[1][0] = Integer.valueOf(this.f39479t);
        plh plh = this.f39473n;
        if (plh != null) {
            int i = this.f39479t;
            if (i != 0) {
                try {
                    if (this.f39457K == null) {
                        pko pko = this.f39477r;
                        ByteBuffer[] a = pko.mo23330a();
                        if (a != null) {
                            int write = (int) plh.f39587a.write(a);
                            if (write > 0) {
                                pko.mo23329a(write);
                            } else {
                                throw new ClosedChannelException();
                            }
                        }
                    } else {
                        if (i == 1 && this.f39461O) {
                            this.f39479t = 2;
                            m30693r();
                        }
                        if (m30691p()) {
                            if (this.f39460N.position() <= 0) {
                                while (true) {
                                    ByteBuffer[] a2 = this.f39477r.mo23330a();
                                    if (a2 == null) {
                                        boolean z = this.f39483x;
                                        StringBuilder sb = new StringBuilder(47);
                                        sb.append("There is nothing to write. disconnecting? ");
                                        sb.append(z);
                                        sb.toString();
                                        if (this.f39483x) {
                                            this.f39457K.closeOutbound();
                                            break;
                                        }
                                        a2 = f39448f;
                                    }
                                    SSLEngineResult wrap = this.f39457K.wrap(a2, this.f39460N);
                                    Object[] objArr = {wrap.getStatus(), wrap.getHandshakeStatus(), Integer.valueOf(wrap.bytesConsumed()), Integer.valueOf(wrap.bytesProduced())};
                                    m30685a(wrap);
                                    pko pko2 = this.f39477r;
                                    int bytesConsumed = wrap.bytesConsumed();
                                    if (bytesConsumed >= 0 && bytesConsumed <= pko2.f39511a.length) {
                                        if (bytesConsumed > 0) {
                                            pko2.mo23329a(bytesConsumed);
                                        }
                                        int i2 = pki.f39444b[wrap.getStatus().ordinal()];
                                        if (i2 == 1) {
                                            throw new IOException("unexpected buffer underflow condition.");
                                        } else if (i2 == 2) {
                                            throw new IOException("unexpected buffer overflow condition.");
                                        } else if (i2 != 3) {
                                            if (this.f39460N.position() > 0) {
                                                m30692q();
                                            }
                                            if (this.f39477r.f39515e && this.f39458L != SSLEngineResult.HandshakeStatus.NEED_WRAP) {
                                                break;
                                            }
                                        } else {
                                            throw new ClosedChannelException();
                                        }
                                    }
                                }
                                throw new IllegalArgumentException();
                            }
                            m30692q();
                            if (this.f39479t == 1 && this.f39461O) {
                                this.f39479t = 2;
                                m30693r();
                            }
                        } else {
                            throw new ClosedChannelException();
                        }
                    }
                    pko pko3 = this.f39477r;
                    if (pko3.f39515e && this.f39479t == 3) {
                        return 0;
                    }
                    if (!pko3.mo23336f()) {
                        this.f39462a.mo23259m();
                    }
                    return -1;
                } catch (ClosedChannelException e) {
                    this.f39469j.mo23670a("ClosedChannelException when state was %d", Integer.valueOf(this.f39479t));
                    return 1;
                } catch (SSLException e2) {
                    this.f39469j.mo23679f("SSLException encountered. Tearing down the socket.", new Object[0]);
                    return 4;
                } catch (IOException e3) {
                    this.f39469j.mo23679f("IOException encountered. Tearing down the socket.", new Object[0]);
                    return 2;
                }
            }
        }
        this.f39469j.mo23675c("Trying to write buffer to socket channel but it has already been shut down", new Object[0]);
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final synchronized plh mo23317l() {
        return this.f39473n;
    }

    public final String toString() {
        String str = this.f39463b;
        String str2 = this.f39453E;
        String valueOf = String.valueOf(this.f39452D);
        int i = this.f39454F;
        String a = pks.m30741a(this.f39479t);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 52 + length2 + String.valueOf(valueOf).length() + String.valueOf(a).length());
        sb.append("CastSocket:");
        sb.append(str);
        sb.append(" Name:\"");
        sb.append(str2);
        sb.append("\" Address:");
        sb.append(valueOf);
        sb.append(" Port:");
        sb.append(i);
        sb.append(" State:");
        sb.append(a);
        return sb.toString();
    }

    /* renamed from: b */
    public final synchronized void mo23306b() {
        this.f39469j.mo23861b("disconnect");
        this.f39479t = 3;
        this.f39482w = SystemClock.elapsedRealtime();
        if (this.f39457K != null) {
            this.f39483x = true;
        }
        try {
            this.f39470k.mo23323b();
        } catch (IllegalStateException e) {
            this.f39469j.mo23675c("Unable to wake up the muxer: %s", e.getMessage());
        }
    }

    /* renamed from: a */
    private static void m30684a(Context context, SSLContext sSLContext, X509TrustManager[] x509TrustManagerArr) {
        try {
            int i = Build.VERSION.SDK_INT;
            Log.i("CastSocket", String.format(Locale.ROOT, "%d >= %d. Adding new CastClientAuthKeyManager.", Integer.valueOf(Build.VERSION.SDK_INT), 18));
            sSLContext.init(new KeyManager[]{pij.m30443a(context)}, x509TrustManagerArr, new SecureRandom());
        } catch (KeyManagementException e) {
            Log.e("CastSocket", "Failed SSLContext.init.", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo23307b(int i) {
        boolean z;
        this.f39469j.mo23856a("shutdown with reason=%d", Integer.valueOf(i));
        this.f39457K = null;
        this.f39456J = false;
        plh plh = this.f39473n;
        if (plh != null) {
            shr.m35317b(plh.mo23361a());
            try {
                this.f39473n.mo23361a().shutdownOutput();
                z = true;
            } catch (IOException e) {
                this.f39469j.mo23676c(e, "Failed to shutdown the output stream socket: %s.", this.f39473n);
                phy phy = this.f39468i;
                if (!phy.f39152e || !ccyh.f180261a.mo6606a().mo77070c()) {
                    z = false;
                } else {
                    bpsy i2 = phy.mo23145i();
                    String str = phy.f39158b;
                    if (i2.f164950c) {
                        i2.mo74035c();
                        i2.f164950c = false;
                    }
                    bpsz bpsz = (bpsz) i2.f164949b;
                    bpsz bpsz2 = bpsz.f139036I;
                    str.getClass();
                    bpsz.f139047a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                    bpsz.f139054h = str;
                    phy.mo23110a((bpsz) i2.mo74062i(), 273);
                    z = false;
                }
            }
            if (this.f39472m || z) {
                try {
                    this.f39473n.close();
                } catch (IOException e2) {
                    this.f39469j.mo23676c(e2, "Failed to close the channel for the socket: %s", this.f39473n);
                }
            }
            this.f39473n = null;
        }
        this.f39474o = null;
        this.f39477r = null;
        int i3 = this.f39479t;
        this.f39479t = 0;
        this.f39482w = 0;
        this.f39480u = 0;
        this.f39484y = true;
        if (i3 == 1) {
            this.f39467h.execute(new pkf(this, i));
        } else {
            this.f39467h.execute(new pkg(this, i));
        }
    }

    /* renamed from: a */
    private final void m30685a(SSLEngineResult sSLEngineResult) {
        this.f39458L = sSLEngineResult.getHandshakeStatus();
        int i = pki.f39443a[this.f39458L.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    while (true) {
                        Runnable delegatedTask = this.f39457K.getDelegatedTask();
                        if (delegatedTask != null) {
                            delegatedTask.run();
                        } else {
                            this.f39458L = this.f39457K.getHandshakeStatus();
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        } else if (this.f39450B != null) {
            try {
                SSLEngine sSLEngine = this.f39457K;
                Certificate[] certificateArr = null;
                if (!(sSLEngine == null || sSLEngine.getSession() == null)) {
                    certificateArr = this.f39457K.getSession().getPeerCertificates();
                }
                if (certificateArr == null || certificateArr.length <= 0) {
                    this.f39469j.mo23677d("No peer cert available in SSL handshake", new Object[0]);
                    throw new ClosedChannelException();
                } else if (MessageDigest.isEqual(MessageDigest.getInstance("SHA-256").digest(((X509Certificate) certificateArr[0]).getPublicKey().getEncoded()), this.f39450B)) {
                    this.f39469j.mo23673b("hashes match valid connection", new Object[0]);
                } else {
                    this.f39469j.mo23677d("TLS peer PK hash from server does not match the hash from the TLS channel", new Object[0]);
                    throw new ClosedChannelException();
                }
            } catch (SSLPeerUnverifiedException e) {
                this.f39469j.mo23676c(e, "SSL Unverified exception", new Object[0]);
                throw new ClosedChannelException();
            } catch (NoSuchAlgorithmException e2) {
                this.f39469j.mo23676c(e2, "No algorithm available.", new Object[0]);
                throw new ClosedChannelException();
            }
        } else if (this.f39449A) {
            this.f39469j.mo23677d("No TLS peer hash for this connection", new Object[0]);
            throw new ClosedChannelException();
        }
        this.f39461O = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized int mo23300a(SelectionKey selectionKey, long j) {
        int i = 0;
        if (this.f39484y) {
            this.f39469j.mo23675c("Socket is no longer connected", new Object[0]);
            this.f39484y = false;
            return 0;
        }
        int i2 = this.f39479t;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return 0;
                }
                if (j - this.f39482w >= 2000) {
                    return 0;
                }
                if (this.f39457K != null) {
                    i = m30689n();
                } else if (this.f39477r.f39515e) {
                    return 0;
                } else {
                    i = 4;
                }
            } else if (this.f39457K == null) {
                i = !this.f39474o.mo23336f();
                if (!this.f39477r.f39515e) {
                    i |= 4;
                }
            } else {
                i = m30689n();
            }
        } else if (j - this.f39480u >= this.f39481v) {
            return 3;
        } else {
            if (!this.f39473n.f39587a.isConnected()) {
                i = 8;
            } else if (this.f39457K != null) {
                i = m30689n();
            }
        }
        selectionKey.interestOps(i);
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized plh mo23301a() {
        this.f39469j.mo23861b("startConnect");
        this.f39480u = SystemClock.elapsedRealtime();
        InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f39452D, this.f39454F);
        plh plh = new plh(SocketChannel.open());
        this.f39473n = plh;
        plh.configureBlocking(false);
        this.f39473n.mo23361a().setTcpNoDelay(false);
        this.f39473n.mo23361a().setSoLinger(true, 2);
        shr.m35316b(2304);
        shr.m35314a(this.f39473n.mo23361a());
        shr.m35312a();
        this.f39474o = new pko(this.f39466g);
        pkp pkp = new pkp(this.f39474o);
        this.f39476q = pkp;
        this.f39475p = bxuc.m123416a(pkp);
        this.f39477r = new pko(this.f39466g);
        this.f39478s = bxuk.m123634a(new pkq(this.f39477r));
        int i = Build.VERSION.SDK_INT;
        SSLEngine createSSLEngine = this.f39455I.createSSLEngine(inetSocketAddress.getHostString(), inetSocketAddress.getPort());
        this.f39457K = createSSLEngine;
        createSSLEngine.setUseClientMode(true);
        this.f39456J = false;
        int packetBufferSize = this.f39457K.getSession().getPacketBufferSize();
        this.f39459M = ByteBuffer.allocate(packetBufferSize);
        this.f39460N = ByteBuffer.allocate(packetBufferSize);
        this.f39458L = SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
        this.f39461O = false;
        this.f39483x = false;
        if (this.f39473n.f39587a.connect(inetSocketAddress)) {
            if (this.f39485z == null) {
                SSLEngine sSLEngine = this.f39457K;
                if (sSLEngine == null) {
                    this.f39479t = 2;
                    m30693r();
                } else if (!this.f39456J) {
                    sSLEngine.beginHandshake();
                    this.f39458L = this.f39457K.getHandshakeStatus();
                    this.f39456J = true;
                } else {
                    this.f39469j.mo23675c("startConnect: SslEngine.beginHandshake was already called.", new Object[0]);
                }
            } else {
                m30694s();
            }
        }
        this.f39469j.mo23861b("startConnect done");
        return this.f39473n;
    }

    /* renamed from: a */
    public final synchronized void mo23302a(blsx blsx) {
        int i = this.f39479t;
        if (i != 2) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("not connected; state=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        } else if (blsx != null) {
            int i2 = blsx.f164961ai;
            if (i2 == -1) {
                i2 = bxxm.f165037a.mo74228a(blsx).mo74223b(blsx);
                blsx.f164961ai = i2;
            }
            if (mo23305a(i2)) {
                pko pko = this.f39477r;
                long j = (long) i2;
                if (pko.mo23334d() >= 4) {
                    if (j >= 0) {
                        pko.mo23328a((byte) ((int) ((j >> 24) & 255)));
                        pko.mo23328a((byte) ((int) ((j >> 16) & 255)));
                        pko.mo23328a((byte) ((int) ((j >> 8) & 255)));
                        pko.mo23328a((byte) ((int) (j & 255)));
                    } else {
                        StringBuilder sb2 = new StringBuilder(48);
                        sb2.append(j);
                        sb2.append(" is not a valid uint32 value");
                        throw new IllegalArgumentException(sb2.toString());
                    }
                }
                blsx.mo73644a(this.f39478s);
                this.f39478s.mo73851c();
                this.f39470k.mo23323b();
            } else {
                throw new pii();
            }
        } else {
            throw new IllegalArgumentException("message cannot be null");
        }
    }

    /* renamed from: a */
    public final synchronized void mo23303a(String str, InetAddress inetAddress, int i) {
        this.f39470k.mo23321a();
        this.f39469j.mo23858a("Connecting to %s %s:%d", str, inetAddress, Integer.valueOf(i));
        m30688m();
        this.f39454F = i;
        this.f39452D = inetAddress;
        this.f39453E = str;
        this.f39481v = 5000;
        this.f39479t = 1;
        try {
            this.f39470k.mo23322a(this);
        } catch (IllegalStateException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo23305a(int i) {
        if (!mo23308c()) {
            return false;
        }
        if (i + 4 <= this.f39477r.mo23334d()) {
            return true;
        }
        return false;
    }
}
