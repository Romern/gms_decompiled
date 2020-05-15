package p000;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* renamed from: cicv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cicv extends chsz implements chsd {

    /* renamed from: a */
    public static final Logger f189797a = Logger.getLogger(cicv.class.getName());

    /* renamed from: b */
    static final Pattern f189798b = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    /* renamed from: c */
    static final chuv f189799c = chuv.f189229p.mo85687a("Channel shutdownNow invoked");

    /* renamed from: d */
    static final chuv f189800d = chuv.f189229p.mo85687a("Channel shutdown invoked");

    /* renamed from: e */
    static final chuv f189801e = chuv.f189229p.mo85687a("Subchannel shutdown invoked");

    /* renamed from: f */
    public static final cicz f189802f = new cicz(new HashMap(), new HashMap(), null, null);

    /* renamed from: A */
    public volatile boolean f189803A;

    /* renamed from: B */
    public volatile boolean f189804B;

    /* renamed from: C */
    public final chxf f189805C;

    /* renamed from: D */
    public final chxh f189806D;

    /* renamed from: E */
    public final chqq f189807E;

    /* renamed from: F */
    public final chsc f189808F;

    /* renamed from: G */
    public cicz f189809G;

    /* renamed from: H */
    public boolean f189810H;

    /* renamed from: I */
    public final boolean f189811I;

    /* renamed from: J */
    final cian f189812J;

    /* renamed from: K */
    public chvb f189813K;

    /* renamed from: L */
    public int f189814L;

    /* renamed from: M */
    public chzq f189815M;

    /* renamed from: N */
    public final cibv f189816N;

    /* renamed from: O */
    public final cicd f189817O;

    /* renamed from: P */
    private final String f189818P;

    /* renamed from: Q */
    private final chtz f189819Q;

    /* renamed from: R */
    private final chtx f189820R;

    /* renamed from: S */
    private final chxc f189821S;

    /* renamed from: T */
    private final cico f189822T;

    /* renamed from: U */
    private final cidm f189823U;

    /* renamed from: V */
    private final cicg f189824V;

    /* renamed from: W */
    private final long f189825W;

    /* renamed from: X */
    private final cieq f189826X;

    /* renamed from: Y */
    private final chqp f189827Y;

    /* renamed from: Z */
    private chue f189828Z;

    /* renamed from: aa */
    private final CountDownLatch f189829aa;

    /* renamed from: ab */
    private final cida f189830ab;

    /* renamed from: ac */
    private final cieg f189831ac;

    /* renamed from: g */
    public final chse f189832g;

    /* renamed from: h */
    public final chxx f189833h;

    /* renamed from: i */
    public final Executor f189834i;

    /* renamed from: j */
    public final cicg f189835j;

    /* renamed from: k */
    public final cifd f189836k;

    /* renamed from: l */
    public final chvc f189837l = new chvc(new cibt(this));

    /* renamed from: m */
    public final chrp f189838m;

    /* renamed from: n */
    public final chrf f189839n;

    /* renamed from: o */
    public final chye f189840o = new chye();

    /* renamed from: p */
    public final String f189841p;

    /* renamed from: q */
    public boolean f189842q;

    /* renamed from: r */
    public cick f189843r;

    /* renamed from: s */
    public volatile chst f189844s;

    /* renamed from: t */
    public boolean f189845t;

    /* renamed from: u */
    public final Set f189846u = new HashSet(16, 0.75f);

    /* renamed from: v */
    public final Set f189847v;

    /* renamed from: w */
    public final chyn f189848w;

    /* renamed from: x */
    public final cicu f189849x;

    /* renamed from: y */
    public final AtomicBoolean f189850y;

    /* renamed from: z */
    public boolean f189851z;

    public cicv(chwp chwp, chxx chxx, cidm cidm, bmzi bmzi, List list, cifd cifd) {
        chwp chwp2 = chwp;
        cifd cifd2 = cifd;
        boolean z = true;
        this.f189847v = new HashSet(1, 0.75f);
        this.f189849x = new cicu(this);
        this.f189850y = new AtomicBoolean(false);
        this.f189829aa = new CountDownLatch(1);
        this.f189814L = 1;
        this.f189809G = f189802f;
        this.f189810H = false;
        new cieh();
        this.f189830ab = new cicf(this);
        this.f189812J = new cich(this);
        this.f189817O = new cicd(this);
        String str = chwp2.f189401h;
        bmxy.m108582a(str, "target");
        this.f189818P = str;
        this.f189832g = chse.m149480a("Channel", str);
        bmxy.m108582a(cifd2, "timeProvider");
        this.f189836k = cifd2;
        cidm cidm2 = chwp2.f189396c;
        bmxy.m108582a(cidm2, "executorPool");
        this.f189823U = cidm2;
        Executor executor = (Executor) cidm2.mo85846a();
        bmxy.m108582a(executor, "executor");
        this.f189834i = executor;
        this.f189833h = new chxe(chxx, this.f189834i);
        this.f189822T = new cico(this.f189833h.mo85714a());
        chse chse = this.f189832g;
        long a = cifd.mo86026a();
        String str2 = this.f189818P;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 14);
        sb.append("Channel for '");
        sb.append(str2);
        sb.append("'");
        this.f189806D = new chxh(chse, a, sb.toString());
        this.f189807E = new chxg(this.f189806D, cifd2);
        this.f189819Q = chwp2.f189400g;
        chun chun = ciag.f189653j;
        this.f189821S = new chxc(chsy.m149506a(), chwp2.f189403j);
        cidm cidm3 = chwp2.f189397d;
        bmxy.m108582a(cidm3, "offloadExecutorPool");
        this.f189835j = new cicg(cidm3);
        chud chud = new chud(this.f189821S, this.f189807E);
        chtw chtw = new chtw();
        chtw.f189155a = Integer.valueOf(chwp.mo85769c());
        bmxy.m108581a(chun);
        chtw.f189156b = chun;
        chvc chvc = this.f189837l;
        bmxy.m108581a(chvc);
        chtw.f189157c = chvc;
        cico cico = this.f189822T;
        bmxy.m108581a(cico);
        chtw.f189159e = cico;
        bmxy.m108581a(chud);
        chtw.f189158d = chud;
        chqq chqq = this.f189807E;
        bmxy.m108581a(chqq);
        chtw.f189160f = chqq;
        chtw.f189161g = new cicb(this);
        chtx chtx = new chtx(chtw.f189155a, chtw.f189156b, chtw.f189157c, chtw.f189158d, chtw.f189159e, chtw.f189160f, chtw.f189161g);
        this.f189820R = chtx;
        this.f189828Z = m150003a(this.f189818P, this.f189819Q, chtx);
        bmxy.m108582a(cidm, "balancerRpcExecutorPool");
        this.f189824V = new cicg(cidm);
        chyn chyn = new chyn(this.f189834i, this.f189837l);
        this.f189848w = chyn;
        cida cida = this.f189830ab;
        chyn.f189526f = cida;
        chyn.f189523c = new chyh(cida);
        chyn.f189524d = new chyi(cida);
        chyn.f189525e = new chyj(cida);
        this.f189826X = new cieq();
        this.f189811I = true;
        this.f189827Y = chqx.m149438a(chqx.m149439a(new cicn(this, this.f189828Z.mo85675a()), this.f189826X), list);
        bmxy.m108582a(bmzi, "stopwatchSupplier");
        long j = chwp2.f189406m;
        if (j != -1) {
            bmxy.m108593a(j < chwp.f189391b ? false : z, "invalid idleTimeoutMillis %s", chwp2.f189406m);
            this.f189825W = chwp2.f189406m;
        } else {
            this.f189825W = j;
        }
        this.f189831ac = new cieg(new cici(this), this.f189837l, this.f189833h.mo85714a(), bmza.m108656a());
        chrp chrp = chwp2.f189404k;
        bmxy.m108582a(chrp, "decompressorRegistry");
        this.f189838m = chrp;
        chrf chrf = chwp2.f189405l;
        bmxy.m108582a(chrf, "compressorRegistry");
        this.f189839n = chrf;
        this.f189841p = chwp2.f189402i;
        cibv cibv = new cibv(cifd2);
        this.f189816N = cibv;
        this.f189805C = cibv.mo85915a();
        chsc chsc = chwp2.f189407n;
        bmxy.m108581a(chsc);
        this.f189808F = chsc;
        chsc.m149477a(chsc.f189083c, this);
        if (!this.f189811I) {
            mo85963n();
        }
    }

    /* renamed from: a */
    static chue m150003a(String str, chtz chtz, chtx chtx) {
        URI uri;
        chue a;
        StringBuilder sb = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e) {
            sb.append(e.getMessage());
            uri = null;
        }
        if (uri != null && (a = chtz.mo85665a(uri, chtx)) != null) {
            return a;
        }
        String str2 = "";
        if (!f189798b.matcher(str).matches()) {
            try {
                String a2 = chtz.mo85666a();
                String valueOf = String.valueOf(str);
                chue a3 = chtz.mo85665a(new URI(a2, str2, valueOf.length() == 0 ? new String("/") : "/".concat(valueOf), null), chtx);
                if (a3 != null) {
                    return a3;
                }
            } catch (URISyntaxException e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        Object[] objArr = new Object[2];
        objArr[0] = str;
        if (sb.length() > 0) {
            String valueOf2 = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 3);
            sb2.append(" (");
            sb2.append(valueOf2);
            sb2.append(")");
            str2 = sb2.toString();
        }
        objArr[1] = str2;
        throw new IllegalArgumentException(String.format("cannot find a NameResolver for %s%s", objArr));
    }

    /* renamed from: r */
    private final void m150004r() {
        this.f189837l.mo85705b();
        chvb chvb = this.f189813K;
        if (chvb != null) {
            chvb.mo85700a();
            this.f189813K = null;
            this.f189815M = null;
        }
    }

    /* renamed from: b */
    public final chse mo85595b() {
        return this.f189832g;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ chsz mo85624c() {
        mo85965p();
        return this;
    }

    /* renamed from: d */
    public final boolean mo85625d() {
        return this.f189850y.get();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ chsz mo85626e() {
        mo85966q();
        return this;
    }

    /* renamed from: f */
    public final void mo85627f() {
        this.f189837l.execute(new ciby(this));
    }

    /* renamed from: g */
    public final void mo85628g() {
        this.f189837l.execute(new cibx(this));
    }

    /* renamed from: h */
    public final void mo85957h() {
        if (this.f189851z) {
            for (cibi cibi : this.f189846u) {
                chuv chuv = f189799c;
                cibi.mo85898a(chuv);
                cibi.f189714e.execute(new ciax(cibi, chuv));
            }
            Iterator it = this.f189847v.iterator();
            if (it.hasNext()) {
                cidn cidn = (cidn) it.next();
                throw null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo85958i() {
        this.f189837l.mo85705b();
        if (!this.f189850y.get() && !this.f189845t) {
            if (this.f189812J.mo85872a()) {
                mo85956b(false);
            } else {
                mo85960k();
            }
            if (this.f189843r == null) {
                this.f189807E.mo85552a(2, "Exiting idle mode");
                cick cick = new cick(this);
                cick.f189770a = new chwx(this.f189821S, cick);
                this.f189843r = cick;
                this.f189828Z.mo85676a(new chua(this, cick, this.f189828Z));
                this.f189842q = true;
            }
        }
    }

    /* renamed from: j */
    public final void mo85959j() {
        mo85955a(true);
        this.f189848w.mo85821a((chst) null);
        this.f189807E.mo85552a(2, "Entering IDLE state");
        this.f189840o.mo85813a(chrg.IDLE);
        if (this.f189812J.mo85872a()) {
            mo85958i();
        }
    }

    /* renamed from: k */
    public final void mo85960k() {
        long j = this.f189825W;
        if (j != -1) {
            cieg cieg = this.f189831ac;
            long nanos = TimeUnit.MILLISECONDS.toNanos(j);
            long a = cieg.mo86005a() + nanos;
            cieg.f189955e = true;
            if (a - cieg.f189954d < 0 || cieg.f189956f == null) {
                ScheduledFuture scheduledFuture = cieg.f189956f;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                cieg.f189956f = cieg.f189951a.schedule(new cief(cieg), nanos, TimeUnit.NANOSECONDS);
            }
            cieg.f189954d = a;
        }
    }

    /* renamed from: l */
    public final void mo85961l() {
        this.f189837l.mo85705b();
        m150004r();
        mo85962m();
    }

    /* renamed from: m */
    public final void mo85962m() {
        this.f189837l.mo85705b();
        if (this.f189842q) {
            this.f189828Z.mo85678c();
        }
    }

    /* renamed from: n */
    public final void mo85963n() {
        this.f189810H = true;
        cieq cieq = this.f189826X;
        cieq.f189974a.set(this.f189809G);
        cieq.f189975b = true;
    }

    /* renamed from: o */
    public final void mo85964o() {
        if (!this.f189804B && this.f189850y.get() && this.f189846u.isEmpty() && this.f189847v.isEmpty()) {
            this.f189807E.mo85552a(2, "Terminated");
            chsc.m149478b(this.f189808F.f189083c, this);
            this.f189823U.mo85847a(this.f189834i);
            this.f189824V.mo85925b();
            this.f189835j.mo85925b();
            this.f189833h.close();
            this.f189804B = true;
            this.f189829aa.countDown();
        }
    }

    /* renamed from: p */
    public final void mo85965p() {
        this.f189807E.mo85552a(1, "shutdown() called");
        if (this.f189850y.compareAndSet(false, true)) {
            this.f189837l.mo85704a(new cibz(this));
            this.f189849x.mo85952a(f189800d);
            this.f189837l.execute(new cibu(this));
        }
    }

    /* renamed from: q */
    public final void mo85966q() {
        ArrayList arrayList;
        this.f189807E.mo85552a(1, "shutdownNow() called");
        mo85965p();
        cicu cicu = this.f189849x;
        chuv chuv = f189799c;
        cicu.mo85952a(chuv);
        synchronized (cicu.f189793a) {
            arrayList = new ArrayList(cicu.f189794b);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((chxs) arrayList.get(i)).mo85764b(chuv);
        }
        cicu.f189796d.f189848w.mo85748b(chuv);
        this.f189837l.execute(new cica(this));
    }

    public final String toString() {
        bmxt a = bmxu.m108563a(this);
        a.mo66884a("logId", this.f189832g.f189087a);
        a.mo66885a("target", this.f189818P);
        return a.toString();
    }

    /* renamed from: b */
    public final void mo85956b(boolean z) {
        ScheduledFuture scheduledFuture;
        cieg cieg = this.f189831ac;
        cieg.f189955e = false;
        if (z && (scheduledFuture = cieg.f189956f) != null) {
            scheduledFuture.cancel(false);
            cieg.f189956f = null;
        }
    }

    /* renamed from: a */
    public final chqs mo70053a(chtv chtv, chqo chqo) {
        return this.f189827Y.mo70053a(chtv, chqo);
    }

    /* renamed from: a */
    public final String mo70054a() {
        return this.f189827Y.mo70054a();
    }

    /* renamed from: a */
    public final void mo85953a(chst chst) {
        this.f189844s = chst;
        this.f189848w.mo85821a(chst);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.IllegalStateException]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    /* renamed from: a */
    public final void mo85954a(String str) {
        try {
            this.f189837l.mo85705b();
        } catch (IllegalStateException e) {
            f189797a.logp(Level.WARNING, "io.grpc.internal.ManagedChannelImpl", "logWarningIfNotInSyncContext", str.concat(" should be called from SynchronizationContext. This warning will become an exception in a future release. See https://github.com/grpc/grpc-java/issues/5015 for more details"), (Throwable) e);
        }
    }

    /* renamed from: a */
    public final void mo85955a(boolean z) {
        boolean z2;
        this.f189837l.mo85705b();
        if (z) {
            bmxy.m108601b(this.f189842q, "nameResolver is not started");
            if (this.f189843r != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            bmxy.m108601b(z2, "lbHelper is null");
        }
        if (this.f189828Z != null) {
            m150004r();
            this.f189828Z.mo85677b();
            this.f189842q = false;
            if (z) {
                this.f189828Z = m150003a(this.f189818P, this.f189819Q, this.f189820R);
            } else {
                this.f189828Z = null;
            }
        }
        cick cick = this.f189843r;
        if (cick != null) {
            chwx chwx = cick.f189770a;
            chwx.f189431b.mo85610a();
            chwx.f189431b = null;
            this.f189843r = null;
        }
        this.f189844s = null;
    }

    /* renamed from: a */
    public final boolean mo85623a(long j, TimeUnit timeUnit) {
        return this.f189829aa.await(j, timeUnit);
    }
}
