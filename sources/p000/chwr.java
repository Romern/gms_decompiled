package p000;

/* renamed from: chwr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class chwr implements cidc {

    /* renamed from: a */
    private boolean f189409a;

    /* renamed from: b */
    private boolean f189410b;

    /* renamed from: c */
    private boolean f189411c;

    /* renamed from: d */
    private Runnable f189412d;

    /* renamed from: e */
    private boolean f189413e;

    /* renamed from: j */
    public final chyg f189414j;

    /* renamed from: k */
    public final Object f189415k = new Object();

    /* renamed from: l */
    public final cifh f189416l;

    /* renamed from: m */
    public int f189417m;

    /* renamed from: n */
    public boolean f189418n;

    /* renamed from: o */
    public final ciez f189419o;

    /* renamed from: p */
    public chxu f189420p;

    /* renamed from: q */
    public chrp f189421q;

    /* renamed from: r */
    public volatile boolean f189422r;

    /* renamed from: s */
    public boolean f189423s;

    /* renamed from: b */
    private final void m149720b() {
        boolean z;
        synchronized (this.f189415k) {
            synchronized (this.f189415k) {
                z = false;
                if (this.f189409a && this.f189417m < 32768 && !this.f189418n) {
                    z = true;
                }
            }
        }
        if (z) {
            this.f189420p.mo85793a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo85731a() {
        boolean z;
        if (this.f189420p != null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108600b(z);
        synchronized (this.f189415k) {
            bmxy.m108601b(!this.f189409a, "Already allocated");
            this.f189409a = true;
        }
        m149720b();
    }

    /* renamed from: c */
    public final void mo85778c(int i) {
        boolean z;
        synchronized (this.f189415k) {
            bmxy.m108601b(this.f189409a, "onStreamAllocated was not called, but it seems the stream is active");
            int i2 = this.f189417m;
            int i3 = i2 - i;
            this.f189417m = i3;
            z = false;
            if (i2 >= 32768) {
                if (i3 < 32768) {
                    z = true;
                }
            }
        }
        if (z) {
            m149720b();
        }
    }

    protected chwr(int i, ciez ciez, cifh cifh) {
        bmxy.m108582a(ciez, "statsTraceCtx");
        bmxy.m108582a(cifh, "transportTracer");
        this.f189416l = cifh;
        this.f189414j = new cidf(this, chrc.f189024a, i, ciez, cifh);
        this.f189421q = chrp.f189048b;
        this.f189411c = false;
        bmxy.m108582a(ciez, "statsTraceCtx");
        this.f189419o = ciez;
    }

    /* renamed from: a */
    public final void mo85772a(chuv chuv, chxt chxt, chtr chtr) {
        if (!this.f189410b) {
            this.f189410b = true;
            ciez ciez = this.f189419o;
            if (ciez.f189994c.compareAndSet(false, true)) {
                for (chuy chuy : ciez.f189993b) {
                    chuy.mo70087a();
                }
            }
            this.f189420p.mo85796a(chuv, chxt, chtr);
            cifh cifh = this.f189416l;
            if (cifh == null) {
                return;
            }
            if (!chuv.mo85689a()) {
                cifh.f190003e++;
            } else {
                cifh.f190002d++;
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      bmxy.a(java.lang.Object, java.lang.Object):java.lang.Object
      bmxy.a(int, int):void
      bmxy.a(boolean, java.lang.Object):void */
    /* renamed from: b */
    public final void mo85776b(int i) {
        try {
            chyg chyg = this.f189414j;
            bmxy.m108589a(true, (Object) "numMessages must be > 0");
            if (!((cidf) chyg).mo85982a()) {
                ((cidf) chyg).f189884e += (long) i;
                ((cidf) chyg).mo85984c();
            }
        } catch (Throwable th) {
            mo85734a(th);
        }
    }

    /* renamed from: a */
    public final void mo85773a(chuv chuv, chxt chxt, boolean z, chtr chtr) {
        bmxy.m108582a(chuv, "status");
        bmxy.m108582a(chtr, "trailers");
        if (!this.f189423s || z) {
            this.f189423s = true;
            this.f189413e = chuv.mo85689a();
            synchronized (this.f189415k) {
                this.f189418n = true;
            }
            if (!this.f189411c) {
                this.f189412d = new chwl(this, chuv, chxt, chtr);
                if (!z) {
                    cidf cidf = (cidf) this.f189414j;
                    if (cidf.mo85982a()) {
                        return;
                    }
                    if (cidf.mo85983b()) {
                        cidf.close();
                    } else {
                        cidf.f189885f = true;
                    }
                } else {
                    this.f189414j.close();
                }
            } else {
                this.f189412d = null;
                mo85772a(chuv, chxt, chtr);
            }
        }
    }

    /* renamed from: b */
    public final void mo85777b(chuv chuv, boolean z, chtr chtr) {
        mo85773a(chuv, chxt.PROCESSED, z, chtr);
    }

    /* renamed from: a */
    public final void mo85774a(cidd cidd) {
        this.f189420p.mo85797a(cidd);
    }

    /* renamed from: a */
    public void mo85775a(boolean z) {
        bmxy.m108601b(this.f189423s, "status should have been reported on deframer closed");
        this.f189411c = true;
        if (this.f189413e && z) {
            mo85777b(chuv.f189228o.mo85687a("Encountered end-of-stream mid-frame"), true, new chtr());
        }
        Runnable runnable = this.f189412d;
        if (runnable != null) {
            runnable.run();
            this.f189412d = null;
        }
    }
}
