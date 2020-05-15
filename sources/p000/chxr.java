package p000;

import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: chxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chxr extends chqs {

    /* renamed from: a */
    static final long f189474a = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: j */
    private static final Logger f189475j = Logger.getLogger(chxr.class.getName());

    /* renamed from: b */
    public final chtv f189476b;

    /* renamed from: c */
    public final Executor f189477c;

    /* renamed from: d */
    public final chxf f189478d;

    /* renamed from: e */
    public final chrk f189479e;

    /* renamed from: f */
    public chxs f189480f;

    /* renamed from: g */
    public volatile boolean f189481g;

    /* renamed from: h */
    public chrp f189482h = chrp.f189048b;

    /* renamed from: i */
    public chrf f189483i = chrf.f189025a;

    /* renamed from: k */
    private final boolean f189484k;

    /* renamed from: l */
    private final chqo f189485l;

    /* renamed from: m */
    private boolean f189486m;

    /* renamed from: n */
    private boolean f189487n;

    /* renamed from: o */
    private chxq f189488o;

    /* renamed from: p */
    private final ScheduledExecutorService f189489p;

    /* renamed from: q */
    private volatile ScheduledFuture f189490q;

    /* renamed from: r */
    private volatile ScheduledFuture f189491r;

    /* renamed from: s */
    private boolean f189492s;

    /* renamed from: t */
    private final cicd f189493t;

    static {
        "gzip".getBytes(Charset.forName("US-ASCII"));
    }

    public chxr(chtv chtv, Executor executor, chqo chqo, cicd cicd, ScheduledExecutorService scheduledExecutorService, chxf chxf) {
        Executor executor2;
        boolean z = false;
        this.f189492s = false;
        this.f189476b = chtv;
        System.identityHashCode(this);
        if (executor != bqfb.INSTANCE) {
            executor2 = new ciep(executor);
        } else {
            executor2 = new ciel();
        }
        this.f189477c = executor2;
        this.f189478d = chxf;
        this.f189479e = chrk.m149453a();
        this.f189484k = (chtv.f189149a == chtu.UNARY || chtv.f189149a == chtu.SERVER_STREAMING) ? true : z;
        this.f189485l = chqo;
        this.f189493t = cicd;
        this.f189489p = scheduledExecutorService;
        int i = ciix.f190424a;
    }

    /* renamed from: a */
    private final void m149765a(chqr chqr, chuv chuv) {
        this.f189477c.execute(new chxi(this, chqr, chuv));
    }

    /* renamed from: b */
    private final void m149766b(Object obj) {
        boolean z;
        if (this.f189480f != null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, "Not started");
        bmxy.m108601b(!this.f189486m, "call was cancelled");
        bmxy.m108601b(!this.f189487n, "call was half-closed");
        try {
            chxs chxs = this.f189480f;
            if (!(chxs instanceof ciej)) {
                chxs.mo85780a(this.f189476b.f189152d.mo12898a(obj));
                if (!this.f189484k) {
                    this.f189480f.mo85782g();
                    return;
                }
                return;
            }
            ciei ciei = ((ciej) chxs).f189958a;
            throw null;
        } catch (RuntimeException e) {
            this.f189480f.mo85764b(chuv.f189216c.mo85692c(e).mo85687a("Failed to stream message"));
        } catch (Error e2) {
            this.f189480f.mo85764b(chuv.f189216c.mo85687a("Client sendMessage() failed with Error"));
            throw e2;
        }
    }

    /* renamed from: c */
    public final chrm mo85802c() {
        chrm chrm = this.f189485l.f189007b;
        if (chrm != null) {
            return chrm;
        }
        return null;
    }

    public final String toString() {
        bmxt a = bmxu.m108563a(this);
        a.mo66885a("method", this.f189476b);
        return a.toString();
    }

    /* renamed from: a */
    public final void mo85799a() {
        ScheduledFuture scheduledFuture = this.f189491r;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        ScheduledFuture scheduledFuture2 = this.f189490q;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      bmxy.a(java.lang.Object, java.lang.Object):java.lang.Object
      bmxy.a(int, int):void
      bmxy.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo70029a(int i) {
        boolean z;
        int i2 = ciix.f190424a;
        if (this.f189480f != null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, "Not started");
        bmxy.m108589a(true, (Object) "Number requested must be non-negative");
        this.f189480f.mo85765c(i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0180 A[Catch:{ all -> 0x0205 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0181 A[Catch:{ all -> 0x0205 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0190 A[Catch:{ all -> 0x0205 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x019b A[Catch:{ all -> 0x0205 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x019c A[Catch:{ all -> 0x0205 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0201 A[Catch:{ all -> 0x0205 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[Catch:{  }, RETURN, SYNTHETIC] */
    /* renamed from: a */
    public final void mo56351a(chqr chqr, chtr chtr) {
        boolean z;
        chre chre;
        Integer num;
        Integer num2;
        chxv chxv;
        int i = ciix.f190424a;
        if (this.f189480f == null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, "Already started");
        bmxy.m108601b(!this.f189486m, "call was cancelled");
        bmxy.m108582a(chqr, "observer");
        bmxy.m108582a(chtr, "headers");
        String str = this.f189485l.f189010e;
        if (str != null) {
            chre = (chre) this.f189483i.f189026b.get(str);
            if (chre == null) {
                this.f189480f = cidl.f189922a;
                m149765a(chqr, chuv.f189228o.mo85687a(String.format("Unable to find compressor by name %s", str)));
                return;
            }
        } else {
            chre = chrc.f189024a;
        }
        chrp chrp = this.f189482h;
        chtr.mo85655c(ciag.f189645b);
        if (chre != chrc.f189024a) {
            chtr.mo85648a(ciag.f189645b, chre.mo85559a());
        }
        chtr.mo85655c(ciag.f189646c);
        byte[] bArr = chrp.f189050d;
        if (bArr.length != 0) {
            chtr.mo85648a(ciag.f189646c, bArr);
        }
        chtr.mo85655c(ciag.f189647d);
        chtr.mo85655c(ciag.f189648e);
        chrm c = mo85802c();
        if (c != null) {
            if (c.mo85570a()) {
                chuv chuv = chuv.f189219f;
                String valueOf = String.valueOf(c);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
                sb.append("ClientCall started after deadline exceeded: ");
                sb.append(valueOf);
                this.f189480f = new chzr(chuv.mo85687a(sb.toString()));
                num = this.f189485l.f189013h;
                if (num == null) {
                    this.f189480f.mo85763b(num.intValue());
                }
                num2 = this.f189485l.f189014i;
                if (num2 != null) {
                    this.f189480f.mo85757a(num2.intValue());
                }
                if (c == null) {
                    this.f189480f.mo85758a(c);
                }
                this.f189480f.mo85779a(chre);
                this.f189480f.mo85759a(this.f189482h);
                this.f189478d.mo85786a();
                this.f189488o = new chxq(this, chqr);
                this.f189480f.mo85760a(new chxp(this, chqr));
                chxq chxq = this.f189488o;
                bqfb bqfb = bqfb.INSTANCE;
                chrk.m149454a(chxq, "cancellationListener");
                chrk.m149454a(bqfb, "executor");
                if (c != null && !c.equals(null) && this.f189489p != null && !(this.f189480f instanceof chzr)) {
                    long a = c.mo85569a(TimeUnit.NANOSECONDS);
                    this.f189490q = this.f189489p.schedule(new cibq(new chxj(this, a, chqr)), a, TimeUnit.NANOSECONDS);
                }
                if (!this.f189481g) {
                    mo85799a();
                    return;
                }
                return;
            }
        }
        chrm chrm = this.f189485l.f189007b;
        if (f189475j.isLoggable(Level.FINE)) {
            if (c != null && c.equals(null)) {
                StringBuilder sb2 = new StringBuilder(String.format("Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(Math.max(0L, c.mo85569a(TimeUnit.NANOSECONDS)))));
                if (chrm != null) {
                    sb2.append(String.format(" Explicit call timeout was '%d' ns.", Long.valueOf(chrm.mo85569a(TimeUnit.NANOSECONDS))));
                } else {
                    sb2.append(" Explicit call timeout was not set.");
                }
                f189475j.logp(Level.FINE, "io.grpc.internal.ClientCallImpl", "logIfContextNarrowedTimeout", sb2.toString());
            }
        }
        cicd cicd = this.f189493t;
        cidu cidu = new cidu(this.f189476b, chtr, this.f189485l);
        chst chst = cicd.f189760a.f189844s;
        if (cicd.f189760a.f189850y.get()) {
            chxv = cicd.f189760a.f189848w;
        } else if (chst != null) {
            chxv a2 = ciag.m149909a(chst.mo85609a(), cidu.f189932a.mo85549a());
            chxv = a2 == null ? cicd.f189760a.f189848w : a2;
        } else {
            cicd.f189760a.f189837l.execute(new cicc(cicd));
            chxv = cicd.f189760a.f189848w;
        }
        chrk b = this.f189479e.mo85567b();
        try {
            this.f189480f = chxv.mo85744a(this.f189476b, chtr, this.f189485l);
            num = this.f189485l.f189013h;
            if (num == null) {
            }
            num2 = this.f189485l.f189014i;
            if (num2 != null) {
            }
            if (c == null) {
            }
            this.f189480f.mo85779a(chre);
            this.f189480f.mo85759a(this.f189482h);
            this.f189478d.mo85786a();
            this.f189488o = new chxq(this, chqr);
            this.f189480f.mo85760a(new chxp(this, chqr));
            chxq chxq2 = this.f189488o;
            bqfb bqfb2 = bqfb.INSTANCE;
            chrk.m149454a(chxq2, "cancellationListener");
            chrk.m149454a(bqfb2, "executor");
            long a3 = c.mo85569a(TimeUnit.NANOSECONDS);
            this.f189490q = this.f189489p.schedule(new cibq(new chxj(this, a3, chqr)), a3, TimeUnit.NANOSECONDS);
            if (!this.f189481g) {
            }
        } finally {
            this.f189479e.mo85566a(b);
        }
    }

    /* renamed from: b */
    public final void mo70032b() {
        boolean z;
        int i = ciix.f190424a;
        if (this.f189480f != null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, "Not started");
        bmxy.m108601b(!this.f189486m, "call was cancelled");
        bmxy.m108601b(!this.f189487n, "call already half-closed");
        this.f189487n = true;
        this.f189480f.mo85767f();
    }

    /* renamed from: a */
    public final void mo85800a(chqr chqr, chuv chuv, chtr chtr) {
        if (!this.f189492s) {
            this.f189492s = true;
            chqr.mo25570a(chuv, chtr);
        }
    }

    /* renamed from: a */
    public final void mo85801a(chuv chuv, chqr chqr) {
        if (this.f189491r == null) {
            this.f189491r = this.f189489p.schedule(new cibq(new chxk(this, chuv)), f189474a, TimeUnit.NANOSECONDS);
            m149765a(chqr, chuv);
        }
    }

    /* renamed from: a */
    public final void mo70030a(Object obj) {
        int i = ciix.f190424a;
        m149766b(obj);
    }

    /* renamed from: a */
    public final void mo70031a(String str, Throwable th) {
        chuv chuv;
        int i = ciix.f190424a;
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            f189475j.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "cancelInternal", "Cancelling without a message or cause is suboptimal", th);
        }
        if (!this.f189486m) {
            this.f189486m = true;
            try {
                if (this.f189480f != null) {
                    chuv chuv2 = chuv.f189216c;
                    if (str == null) {
                        chuv = chuv2.mo85687a("Call cancelled without message");
                    } else {
                        chuv = chuv2.mo85687a(str);
                    }
                    if (th != null) {
                        chuv = chuv.mo85692c(th);
                    }
                    this.f189480f.mo85764b(chuv);
                }
            } finally {
                mo85799a();
            }
        }
    }
}
