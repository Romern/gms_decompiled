package p000;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: cfz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfz implements cfd, crj {

    /* renamed from: a */
    final cfy f6742a = new cfy(new ArrayList(2));

    /* renamed from: b */
    public final crm f6743b = crm.m7411a();

    /* renamed from: c */
    public cdg f6744c;

    /* renamed from: d */
    public boolean f6745d;

    /* renamed from: e */
    public boolean f6746e;

    /* renamed from: f */
    public cgj f6747f;

    /* renamed from: g */
    public boolean f6748g;

    /* renamed from: h */
    cgd f6749h;

    /* renamed from: i */
    public boolean f6750i;

    /* renamed from: j */
    cgb f6751j;

    /* renamed from: k */
    public volatile boolean f6752k;

    /* renamed from: l */
    int f6753l;

    /* renamed from: m */
    public final cfu f6754m;

    /* renamed from: n */
    public final cfu f6755n;

    /* renamed from: o */
    private final C1241og f6756o;

    /* renamed from: p */
    private final cid f6757p;

    /* renamed from: q */
    private final cid f6758q;

    /* renamed from: r */
    private final cid f6759r;

    /* renamed from: s */
    private final AtomicInteger f6760s = new AtomicInteger();

    /* renamed from: t */
    private boolean f6761t;

    /* renamed from: u */
    private cfi f6762u;

    /* renamed from: d */
    private final cid m4155d() {
        return !this.f6761t ? this.f6758q : this.f6759r;
    }

    /* renamed from: e */
    private final boolean m4156e() {
        return this.f6750i || this.f6748g || this.f6752k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3833a() {
        boolean z;
        cgb cgb;
        synchronized (this) {
            this.f6743b.mo8190b();
            crb.m7386a(m4156e(), "Not yet complete!");
            int decrementAndGet = this.f6760s.decrementAndGet();
            if (decrementAndGet >= 0) {
                z = true;
            } else {
                z = false;
            }
            crb.m7386a(z, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                cgb = this.f6751j;
                mo3839c();
            } else {
                cgb = null;
            }
        }
        if (cgb != null) {
            cgb.mo3846f();
        }
    }

    /* renamed from: a */
    public final synchronized void mo3835a(cdg cdg, boolean z, boolean z2) {
        this.f6744c = cdg;
        this.f6745d = z;
        this.f6761t = z2;
        this.f6746e = false;
    }

    /* renamed from: aQ */
    public final crm mo3811aQ() {
        return this.f6743b;
    }

    /* renamed from: b */
    public final synchronized void mo3838b(cfi cfi) {
        cid cid;
        this.f6762u = cfi;
        int a = cfi.mo3809a(1);
        if (a != 2) {
            if (a != 3) {
                cid = m4155d();
                cid.execute(cfi);
            }
        }
        cid = this.f6757p;
        cid.execute(cfi);
    }

    /* renamed from: c */
    public final synchronized void mo3839c() {
        if (this.f6744c != null) {
            this.f6742a.f6741a.clear();
            this.f6744c = null;
            this.f6751j = null;
            this.f6747f = null;
            this.f6750i = false;
            this.f6752k = false;
            this.f6748g = false;
            cfi cfi = this.f6762u;
            if (cfi.f6680c.mo3808d()) {
                cfi.mo3810a();
            }
            this.f6762u = null;
            this.f6749h = null;
            this.f6753l = 0;
            this.f6756o.mo8189a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public cfz(cid cid, cid cid2, cid cid3, cfu cfu, cfu cfu2, C1241og ogVar) {
        this.f6757p = cid;
        this.f6758q = cid2;
        this.f6759r = cid3;
        this.f6755n = cfu;
        this.f6754m = cfu2;
        this.f6756o = ogVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo3834a(int i) {
        cgb cgb;
        crb.m7386a(m4156e(), "Not yet complete!");
        if (this.f6760s.getAndAdd(i) == 0 && (cgb = this.f6751j) != null) {
            cgb.mo3845e();
        }
    }

    /* renamed from: a */
    public final void mo3803a(cfi cfi) {
        m4155d().execute(cfi);
    }

    /* renamed from: a */
    public final synchronized void mo3836a(cpx cpx) {
        this.f6743b.mo8190b();
        this.f6742a.f6741a.remove(cfy.m4150b(cpx));
        if (this.f6742a.mo3828a()) {
            if (!m4156e()) {
                this.f6752k = true;
                cfi cfi = this.f6762u;
                cfi.f6694q = true;
                cfb cfb = cfi.f6693p;
                if (cfb != null) {
                    cfb.mo3789b();
                }
                this.f6755n.mo3822a(this, this.f6744c);
            }
            if (!this.f6748g) {
                if (!this.f6750i) {
                }
            }
            if (this.f6760s.get() == 0) {
                mo3839c();
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo3837a(cpx cpx, Executor executor) {
        this.f6743b.mo8190b();
        this.f6742a.f6741a.add(new cfx(cpx, executor));
        if (this.f6748g) {
            mo3834a(1);
            executor.execute(new cfw(this, cpx));
        } else if (this.f6750i) {
            mo3834a(1);
            executor.execute(new cfv(this, cpx));
        } else {
            crb.m7386a(!this.f6752k, "Cannot add callbacks to a cancelled EngineJob");
        }
    }
}
