package p000;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* renamed from: chwm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class chwm extends chws implements chxs, cidi {

    /* renamed from: q */
    public static final Logger f189381q = Logger.getLogger(chwm.class.getName());

    /* renamed from: a */
    private final chzy f189382a;

    /* renamed from: b */
    private chtr f189383b;

    /* renamed from: c */
    private volatile boolean f189384c;

    /* renamed from: r */
    public final cifh f189385r;

    /* renamed from: s */
    public final boolean f189386s;

    protected chwm(cifj cifj, ciez ciez, cifh cifh, chtr chtr, chqo chqo) {
        bmxy.m108582a(chtr, "headers");
        bmxy.m108582a(cifh, "transportTracer");
        this.f189385r = cifh;
        this.f189386s = ciag.m149915a(chqo);
        this.f189382a = new cidj(this, cifj, ciez);
        this.f189383b = chtr;
    }

    /* renamed from: a */
    public final void mo85757a(int i) {
        boolean z;
        cidj cidj = (cidj) this.f189382a;
        if (cidj.f189900a == -1) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, "max size already set");
        cidj.f189900a = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract chwk mo85738b();

    /* renamed from: b */
    public final void mo85763b(int i) {
        ((cidf) mo85740d().f189414j).f189881b = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public /* bridge */ /* synthetic */ chwr mo85739c() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract chwr mo85740d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final chzy mo85766e() {
        return this.f189382a;
    }

    /* renamed from: f */
    public final void mo85767f() {
        if (!mo85740d().f189422r) {
            mo85740d().f189422r = true;
            mo85766e().mo85858c();
        }
    }

    /* renamed from: b */
    public final void mo85764b(chuv chuv) {
        bmxy.m108589a(!chuv.mo85689a(), "Should not cancel with OK status");
        this.f189384c = true;
        mo85738b().mo85729a(chuv);
    }

    /* renamed from: c */
    public final void mo85765c(int i) {
        mo85738b().mo85727a(i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: a */
    public final void mo85758a(chrm chrm) {
        this.f189383b.mo85655c(ciag.f189644a);
        this.f189383b.mo85648a(ciag.f189644a, Long.valueOf(Math.max(0L, chrm.mo85569a(TimeUnit.NANOSECONDS))));
    }

    /* renamed from: a */
    public final void mo85759a(chrp chrp) {
        boolean z;
        chwr d = mo85740d();
        if (d.f189420p == null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, "Already called start");
        bmxy.m108582a(chrp, "decompressorRegistry");
        d.f189421q = chrp;
    }

    /* renamed from: a */
    public final void mo85760a(chxu chxu) {
        boolean z;
        chwr d = mo85740d();
        if (d.f189420p == null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, "Already called setListener");
        bmxy.m108582a(chxu, "listener");
        d.f189420p = chxu;
        mo85738b().mo85728a(this.f189383b);
        this.f189383b = null;
    }

    /* renamed from: a */
    public final void mo85761a(ciao ciao) {
        ciao.mo85876a("remote_addr", mo85735a().mo85534a(chru.f189056a));
    }

    /* renamed from: a */
    public final void mo85762a(cifi cifi, boolean z, boolean z2, int i) {
        boolean z3 = true;
        if (cifi == null && !z) {
            z3 = false;
        }
        bmxy.m108589a(z3, "null frame before EOS");
        mo85738b().mo85730a(cifi, z, z2, i);
    }
}
