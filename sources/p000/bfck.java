package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: bfck */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfck {

    /* renamed from: a */
    public final bgmk f113388a;

    /* renamed from: b */
    public final bgns f113389b;

    /* renamed from: c */
    public final bgmo f113390c;

    /* renamed from: d */
    public final bfcu f113391d;

    /* renamed from: e */
    public final bfcn f113392e;

    /* renamed from: f */
    public final bfct f113393f;

    /* renamed from: g */
    public final ArrayList f113394g = new ArrayList();

    /* renamed from: h */
    public boolean f113395h = false;

    /* renamed from: i */
    public bgmj f113396i = null;

    /* renamed from: j */
    public int f113397j = 1;

    public bfck(bgmo bgmo, bgmk bgmk, bgns bgns, bfcu bfcu, bfct bfct, bfcn bfcn) {
        this.f113390c = bgmo;
        this.f113388a = bgmk;
        this.f113389b = bgns;
        this.f113391d = bfcu;
        this.f113393f = bfct;
        this.f113392e = bfcn;
    }

    /* renamed from: c */
    private final void m96343c(boolean z) {
        this.f113391d.mo61422a(this.f113388a.mo62776c(), z);
    }

    /* renamed from: a */
    public final void mo61385a() {
        this.f113397j = 1;
        m96343c(false);
        mo61391e();
        mo61387b();
    }

    /* renamed from: b */
    public final void mo61387b() {
        if (this.f113395h) {
            this.f113389b.mo62925c(bgnq.CACHE_UPDATER);
            this.f113395h = false;
        }
    }

    /* renamed from: d */
    public final void mo61390d() {
        Locale locale = Locale.US;
        new Object[1][0] = Integer.valueOf(this.f113393f.mo61410d());
        m96343c(true);
        mo61391e();
        mo61387b();
    }

    /* renamed from: e */
    public final void mo61391e() {
        long j;
        this.f113394g.clear();
        this.f113397j = 1;
        bfcu bfcu = this.f113391d;
        long j2 = bfcu.f113436a;
        boolean z = bfcu.f113437b;
        double random = Math.random() - 8.0d;
        long j3 = (long) ((random + random) * 600000.0d);
        if (!z) {
            j = 43200000;
        } else {
            j = 86400000;
        }
        long j4 = j2 + j + j3;
        this.f113389b.mo62917a(bgnq.CACHE_UPDATER, j4, this.f113396i);
        StringBuilder sb = new StringBuilder(47);
        sb.append("Cache refresh scheduled at ");
        sb.append(j4);
        sb.toString();
    }

    /* renamed from: b */
    public final boolean mo61388b(boolean z) {
        bsax bsax;
        int i;
        long b = this.f113388a.mo62775b();
        boolean z2 = false;
        if (!this.f113394g.isEmpty()) {
            bsax = new bsax(bgox.f116997Q);
            bsax.mo70118b(1, new bsax(bgox.f116996P));
            bsax.mo70117b(2, b);
            Iterator it = this.f113394g.iterator();
            i = 0;
            while (it.hasNext()) {
                bsax.mo70107a(4, (bsax) it.next());
                it.remove();
                i++;
            }
        } else {
            bsax = null;
            i = 0;
        }
        if (i > 0 || z) {
            bsax bsax2 = new bsax(bgox.f117045al);
            if (i > 0) {
                bsax bsax3 = new bsax(bgox.f117041ah);
                bsax3.mo70118b(1, bsax);
                bsax2.mo70107a(4, bsax3);
                Locale locale = Locale.US;
                new Object[1][0] = Integer.valueOf(i);
            }
            if (z) {
                this.f113392e.mo61399a(bsax2);
            }
            this.f113390c.mo62891a(bsax2);
        }
        if (i > 0) {
            z2 = true;
        } else if (z) {
            z2 = true;
        }
        if (!z2) {
            mo61390d();
        }
        return z2;
    }

    /* renamed from: c */
    public final void mo61389c() {
        if (!this.f113395h) {
            this.f113389b.mo62923b(bgnq.CACHE_UPDATER, 60000, null);
            this.f113395h = true;
        }
    }

    /* renamed from: a */
    public final void mo61386a(boolean z) {
        bfdd bfdd = this.f113391d.f113441f;
        this.f113394g.clear();
        long b = this.f113388a.mo62775b();
        if (bfdd != null) {
            int d = this.f113393f.mo61410d();
            bfdc c = bfdd.mo61459c();
            while (c.hasNext()) {
                c.next();
                if (c.mo61447a() < d) {
                    bsax a = bfmn.m97256a(c.mo61450d());
                    if (a != null) {
                        this.f113394g.add(a);
                    }
                } else {
                    c.f113464b.f113468d[c.f113463a.mo72557g()] = b;
                }
            }
        }
        Locale locale = Locale.US;
        new Object[1][0] = Integer.valueOf(this.f113394g.size());
        if (mo61388b(z)) {
            mo61389c();
            this.f113389b.mo62917a(bgnq.CACHE_UPDATER, this.f113388a.mo62776c() + 10000, this.f113396i);
            this.f113397j = 3;
        }
    }
}
