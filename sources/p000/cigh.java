package p000;

import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: cigh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cigh implements chyc, cifp {

    /* renamed from: F */
    private static final Map f190091F;

    /* renamed from: G */
    private static final cifz[] f190092G = new cifz[0];

    /* renamed from: a */
    public static final Logger f190093a = Logger.getLogger(cigh.class.getName());

    /* renamed from: A */
    public long f190094A;

    /* renamed from: B */
    public final Runnable f190095B;

    /* renamed from: C */
    public final int f190096C;

    /* renamed from: D */
    public final cifh f190097D;

    /* renamed from: E */
    final chrw f190098E;

    /* renamed from: H */
    private final chse f190099H;

    /* renamed from: I */
    private int f190100I;

    /* renamed from: J */
    private final ciep f190101J;

    /* renamed from: K */
    private final int f190102K;

    /* renamed from: L */
    private boolean f190103L;

    /* renamed from: M */
    private boolean f190104M;

    /* renamed from: N */
    private ScheduledExecutorService f190105N;

    /* renamed from: O */
    private final cian f190106O = new ciga(this);

    /* renamed from: b */
    public final InetSocketAddress f190107b;

    /* renamed from: c */
    public final String f190108c;

    /* renamed from: d */
    public final String f190109d;

    /* renamed from: e */
    public final Random f190110e = new Random();

    /* renamed from: f */
    public final int f190111f;

    /* renamed from: g */
    public cida f190112g;

    /* renamed from: h */
    public cifq f190113h;

    /* renamed from: i */
    public cigt f190114i;

    /* renamed from: j */
    public final Object f190115j = new Object();

    /* renamed from: k */
    public final Map f190116k = new HashMap();

    /* renamed from: l */
    public final Executor f190117l;

    /* renamed from: m */
    public int f190118m;

    /* renamed from: n */
    public cigg f190119n;

    /* renamed from: o */
    public chqh f190120o;

    /* renamed from: p */
    public chuv f190121p;

    /* renamed from: q */
    public ciam f190122q;

    /* renamed from: r */
    public boolean f190123r;

    /* renamed from: s */
    public final SocketFactory f190124s;

    /* renamed from: t */
    public SSLSocketFactory f190125t;

    /* renamed from: u */
    public int f190126u = 0;

    /* renamed from: v */
    public final LinkedList f190127v = new LinkedList();

    /* renamed from: w */
    public final cigx f190128w;

    /* renamed from: x */
    public cibp f190129x;

    /* renamed from: y */
    public boolean f190130y;

    /* renamed from: z */
    public long f190131z;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
     arg types: [cihm, chuv]
     candidates:
      MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object */
    static {
        EnumMap enumMap = new EnumMap(cihm.class);
        enumMap.put((Object) cihm.NO_ERROR, (Object) chuv.f189228o.mo85687a("No error: A GRPC status of OK should have been sent"));
        enumMap.put((Object) cihm.PROTOCOL_ERROR, (Object) chuv.f189228o.mo85687a("Protocol error"));
        enumMap.put((Object) cihm.INTERNAL_ERROR, (Object) chuv.f189228o.mo85687a("Internal error"));
        enumMap.put((Object) cihm.FLOW_CONTROL_ERROR, (Object) chuv.f189228o.mo85687a("Flow control error"));
        enumMap.put((Object) cihm.STREAM_CLOSED, (Object) chuv.f189228o.mo85687a("Stream closed"));
        enumMap.put((Object) cihm.FRAME_TOO_LARGE, (Object) chuv.f189228o.mo85687a("Frame too large"));
        enumMap.put((Object) cihm.REFUSED_STREAM, (Object) chuv.f189229p.mo85687a("Refused stream"));
        enumMap.put((Object) cihm.CANCEL, (Object) chuv.f189216c.mo85687a("Cancelled"));
        enumMap.put((Object) cihm.COMPRESSION_ERROR, (Object) chuv.f189228o.mo85687a("Compression error"));
        enumMap.put((Object) cihm.CONNECT_ERROR, (Object) chuv.f189228o.mo85687a("Connect error"));
        enumMap.put((Object) cihm.ENHANCE_YOUR_CALM, (Object) chuv.f189224k.mo85687a("Enhance your calm"));
        enumMap.put((Object) cihm.INADEQUATE_SECURITY, (Object) chuv.f189222i.mo85687a("Inadequate security"));
        f190091F = Collections.unmodifiableMap(enumMap);
    }

    public cigh(InetSocketAddress inetSocketAddress, String str, String str2, chqh chqh, Executor executor, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, cigx cigx, chrw chrw, Runnable runnable, cifh cifh) {
        bmxy.m108582a(inetSocketAddress, "address");
        this.f190107b = inetSocketAddress;
        this.f190108c = str;
        this.f190102K = 4194304;
        this.f190111f = 65535;
        bmxy.m108582a(executor, "executor");
        this.f190117l = executor;
        this.f190101J = new ciep(executor);
        this.f190100I = 3;
        this.f190124s = socketFactory == null ? SocketFactory.getDefault() : socketFactory;
        this.f190125t = sSLSocketFactory;
        bmxy.m108582a(cigx, "connectionSpec");
        this.f190128w = cigx;
        chtn chtn = ciag.f189644a;
        this.f190109d = ciag.m149911a("okhttp", str2);
        this.f190098E = chrw;
        bmxy.m108582a(runnable, "tooManyPingsRunnable");
        this.f190095B = runnable;
        this.f190096C = Integer.MAX_VALUE;
        bmxy.m108581a(cifh);
        this.f190097D = cifh;
        this.f190099H = chse.m149479a(getClass(), inetSocketAddress.toString());
        chqf a = chqh.m149395a();
        a.mo85532a(chzz.f189625b, chqh);
        this.f190120o = a.mo85531a();
        synchronized (this.f190115j) {
            bmxy.m108581a(new cigb());
        }
    }

    /* renamed from: a */
    public static chuv m150218a(cihm cihm) {
        chuv chuv = (chuv) f190091F.get(cihm);
        if (chuv != null) {
            return chuv;
        }
        chuv chuv2 = chuv.f189217d;
        int i = cihm.f190342s;
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown http2 error code: ");
        sb.append(i);
        return chuv2.mo85687a(sb.toString());
    }

    /* renamed from: f */
    private final void m150220f() {
        if (this.f190121p != null && this.f190116k.isEmpty() && this.f190127v.isEmpty() && !this.f190123r) {
            this.f190123r = true;
            cibp cibp = this.f190129x;
            if (cibp != null) {
                cibp.mo85910e();
                ciex.m150142b(ciag.f189656m, this.f190105N);
                this.f190105N = null;
            }
            ciam ciam = this.f190122q;
            if (ciam != null) {
                Throwable e = mo86065e();
                synchronized (ciam) {
                    if (!ciam.f189672d) {
                        ciam.f189672d = true;
                        ciam.f189673e = e;
                        Map map = ciam.f189671c;
                        ciam.f189671c = null;
                        for (Map.Entry entry : map.entrySet()) {
                            ciam.m149930a((cibn) entry.getKey(), (Executor) entry.getValue(), e);
                        }
                    }
                }
                this.f190122q = null;
            }
            if (!this.f190103L) {
                this.f190103L = true;
                this.f190113h.mo86035a(cihm.NO_ERROR, new byte[0]);
            }
            this.f190113h.close();
        }
    }

    /* renamed from: a */
    public final chqh mo85743a() {
        return this.f190120o;
    }

    /* renamed from: b */
    public final chse mo85595b() {
        return this.f190099H;
    }

    /* renamed from: c */
    public final void mo86062c(cifz cifz) {
        if (!this.f190104M) {
            this.f190104M = true;
            cibp cibp = this.f190129x;
            if (cibp != null) {
                cibp.mo85908c();
            }
        }
        if (cifz.f189386s) {
            this.f190106O.mo85871a(cifz, true);
        }
    }

    /* renamed from: d */
    public final cifz[] mo86064d() {
        cifz[] cifzArr;
        synchronized (this.f190115j) {
            cifzArr = (cifz[]) this.f190116k.values().toArray(f190092G);
        }
        return cifzArr;
    }

    /* renamed from: e */
    public final Throwable mo86065e() {
        synchronized (this.f190115j) {
            chuv chuv = this.f190121p;
            if (chuv == null) {
                chuw c = chuv.f189229p.mo85687a("Connection closed").mo85693c();
                return c;
            }
            chuw c2 = chuv.mo85693c();
            return c2;
        }
    }

    public final String toString() {
        bmxt a = bmxu.m108563a(this);
        a.mo66884a("logId", this.f190099H.f189087a);
        a.mo66885a("address", this.f190107b);
        return a.toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    /* renamed from: a */
    public static String m150219a(ciqr ciqr) {
        cipu cipu = new cipu();
        while (ciqr.mo74995c(cipu, 1) != -1) {
            if (cipu.mo86297c(cipu.f191213b - 1) == 10) {
                long a = cipu.mo86281a((byte) 10, 0);
                if (a != -1) {
                    return cipu.mo86309f(a);
                }
                cipu cipu2 = new cipu();
                cipu.mo86291b(cipu2, Math.min(32L, cipu.f191213b));
                long min = Math.min(cipu.f191213b, Long.MAX_VALUE);
                String c = cipu2.mo86322j().mo86342c();
                StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 50);
                sb.append("\\n not found: limit=");
                sb.append(min);
                sb.append(" content=");
                sb.append(c);
                sb.append(8230);
                throw new EOFException(sb.toString());
            }
        }
        String valueOf = String.valueOf(cipu.mo86322j().mo86342c());
        throw new EOFException(valueOf.length() == 0 ? new String("\\n not found: ") : "\\n not found: ".concat(valueOf));
    }

    /* renamed from: b */
    public final cifz mo86060b(int i) {
        cifz cifz;
        synchronized (this.f190115j) {
            cifz = (cifz) this.f190116k.get(Integer.valueOf(i));
        }
        return cifz;
    }

    /* renamed from: b */
    public final void mo85748b(chuv chuv) {
        mo85746a(chuv);
        synchronized (this.f190115j) {
            Iterator it = this.f190116k.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                it.remove();
                ((cifz) entry.getValue()).f190076h.mo85777b(chuv, false, new chtr());
                mo86061b((cifz) entry.getValue());
            }
            Iterator it2 = this.f190127v.iterator();
            while (it2.hasNext()) {
                cifz cifz = (cifz) it2.next();
                cifz.f190076h.mo85777b(chuv, true, new chtr());
                mo86061b(cifz);
            }
            this.f190127v.clear();
            m150220f();
        }
    }

    /* renamed from: c */
    public final boolean mo86063c() {
        boolean z = false;
        while (!this.f190127v.isEmpty() && this.f190116k.size() < this.f190126u) {
            mo86057a((cifz) this.f190127v.poll());
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public final void mo86061b(cifz cifz) {
        if (this.f190104M && this.f190127v.isEmpty() && this.f190116k.isEmpty()) {
            this.f190104M = false;
            cibp cibp = this.f190129x;
            if (cibp != null) {
                cibp.mo85909d();
            }
        }
        if (cifz.f189386s) {
            this.f190106O.mo85871a(cifz, false);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ chxs mo85744a(chtv chtv, chtr chtr, chqo chqo) {
        Object obj;
        bmxy.m108582a(chtv, "method");
        bmxy.m108582a(chtr, "headers");
        ciez a = ciez.m150148a(chqo, this.f190120o);
        Object obj2 = this.f190115j;
        synchronized (obj2) {
            try {
                obj = obj2;
                cifz cifz = new cifz(chtv, chtr, this.f190113h, this, this.f190114i, this.f190115j, this.f190102K, this.f190111f, this.f190108c, this.f190109d, a, this.f190097D, chqo);
                return cifz;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final Runnable mo85745a(cida cida) {
        bmxy.m108582a(cida, "listener");
        this.f190112g = cida;
        if (this.f190130y) {
            this.f190105N = (ScheduledExecutorService) ciex.m150140a(ciag.f189656m);
            cibp cibp = new cibp(new cibo(this), this.f190105N, this.f190131z, this.f190094A);
            this.f190129x = cibp;
            cibp.mo85906a();
        }
        if (this.f190107b != null) {
            cifo cifo = new cifo(this.f190101J, this);
            cihx cihx = new cihx();
            cihw cihw = new cihw(ciqh.m150827a(cifo));
            synchronized (this.f190115j) {
                this.f190113h = new cifq(this, cihw, new cigk(Level.FINE, cigh.class));
                this.f190114i = new cigt(this, this.f190113h);
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            this.f190101J.execute(new cige(this, countDownLatch, cifo, cihx));
            try {
                synchronized (this.f190115j) {
                    cifq cifq = this.f190113h;
                    try {
                        cifq.f190023b.mo86032a();
                    } catch (IOException e) {
                        cifq.f190022a.mo86031a(e);
                    }
                    ciia ciia = new ciia();
                    ciia.mo86131a(7, this.f190111f);
                    cifq cifq2 = this.f190113h;
                    cifq2.f190024c.mo86072a(2, ciia);
                    try {
                        cifq2.f190023b.mo86041b(ciia);
                    } catch (IOException e2) {
                        cifq2.f190022a.mo86031a(e2);
                    }
                }
                countDownLatch.countDown();
                this.f190101J.execute(new cigf(this));
                return null;
            } catch (Throwable th) {
                countDownLatch.countDown();
                throw th;
            }
        } else {
            synchronized (this.f190115j) {
                this.f190113h = new cifq(this, null, null);
                this.f190114i = new cigt(this, this.f190113h);
            }
            this.f190101J.execute(new cigc(this));
            return null;
        }
    }

    /* renamed from: a */
    public final void mo86055a(int i, chuv chuv, chxt chxt, boolean z, cihm cihm, chtr chtr) {
        synchronized (this.f190115j) {
            cifz cifz = (cifz) this.f190116k.remove(Integer.valueOf(i));
            if (cifz != null) {
                if (cihm != null) {
                    this.f190113h.mo86034a(i, cihm.CANCEL);
                }
                if (chuv != null) {
                    cify cify = cifz.f190076h;
                    if (chtr == null) {
                        chtr = new chtr();
                    }
                    cify.mo85773a(chuv, chxt, z, chtr);
                }
                if (!mo86063c()) {
                    m150220f();
                    mo86061b(cifz);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo86056a(int i, cihm cihm, chuv chuv) {
        synchronized (this.f190115j) {
            if (this.f190121p == null) {
                this.f190121p = chuv;
                this.f190112g.mo85892a(chuv);
            }
            if (cihm != null) {
                if (!this.f190103L) {
                    this.f190103L = true;
                    this.f190113h.mo86035a(cihm, new byte[0]);
                }
            }
            Iterator it = this.f190116k.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((Integer) entry.getKey()).intValue() > i) {
                    it.remove();
                    ((cifz) entry.getValue()).f190076h.mo85773a(chuv, chxt.REFUSED, false, new chtr());
                    mo86061b((cifz) entry.getValue());
                }
            }
            Iterator it2 = this.f190127v.iterator();
            while (it2.hasNext()) {
                cifz cifz = (cifz) it2.next();
                cifz.f190076h.mo85773a(chuv, chxt.REFUSED, true, new chtr());
                mo86061b(cifz);
            }
            this.f190127v.clear();
            m150220f();
        }
    }

    /* renamed from: a */
    public final void mo85746a(chuv chuv) {
        synchronized (this.f190115j) {
            if (this.f190121p == null) {
                this.f190121p = chuv;
                this.f190112g.mo85892a(chuv);
                m150220f();
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ciho.a(boolean, int, java.util.List):void
     arg types: [int, int, java.util.List]
     candidates:
      ciho.a(boolean, int, int):void
      ciho.a(boolean, int, java.util.List):void */
    /* renamed from: a */
    public final void mo86057a(cifz cifz) {
        boolean z;
        boolean z2 = true;
        if (cifz.f190075g == -1) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, "StreamId already assigned");
        this.f190116k.put(Integer.valueOf(this.f190100I), cifz);
        mo86062c(cifz);
        cify cify = cifz.f190076h;
        int i = this.f190100I;
        cifz cifz2 = cify.f190065u;
        cipu cipu = cifz.f190069a;
        if (cifz2.f190075g != -1) {
            z2 = false;
        }
        bmxy.m108602b(z2, "the stream has been started with id %s", i);
        cify.f190065u.f190075g = i;
        cify.f190065u.f190076h.mo85731a();
        if (cify.f190064t) {
            cifq cifq = cify.f190061g;
            cifz cifz3 = cify.f190065u;
            boolean z3 = cifz3.f190077i;
            try {
                cifq.f190023b.mo86039a(false, cifz3.f190075g, cify.f190056b);
            } catch (IOException e) {
                cifq.f190022a.mo86031a(e);
            }
            cify.f190065u.f190072d.mo86023a();
            cify.f190056b = null;
            if (cify.f190057c.f191213b > 0) {
                cify.f190062h.mo86086a(cify.f190058d, cify.f190065u.f190075g, cify.f190057c, cify.f190059e);
            }
            cify.f190064t = false;
        }
        if (cifz.mo86050h() == chtu.UNARY || cifz.mo86050h() == chtu.SERVER_STREAMING) {
            boolean z4 = cifz.f190077i;
        } else {
            this.f190113h.mo86040b();
        }
        int i2 = this.f190100I;
        if (i2 >= 2147483645) {
            this.f190100I = Integer.MAX_VALUE;
            mo86056a(Integer.MAX_VALUE, cihm.NO_ERROR, chuv.f189229p.mo85687a("Stream ids exhausted"));
            return;
        }
        this.f190100I = i2 + 2;
    }

    /* renamed from: a */
    public final void mo86058a(cihm cihm, String str) {
        mo86056a(0, cihm, m150218a(cihm).mo85690b(str));
    }

    /* renamed from: a */
    public final void mo86031a(Throwable th) {
        bmxy.m108582a(th, "failureCause");
        mo86056a(0, cihm.INTERNAL_ERROR, chuv.f189229p.mo85692c(th));
    }

    /* renamed from: a */
    public final boolean mo86059a(int i) {
        boolean z;
        synchronized (this.f190115j) {
            z = false;
            if (i < this.f190100I && (i & 1) == 1) {
                z = true;
            }
        }
        return z;
    }
}
