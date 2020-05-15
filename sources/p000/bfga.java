package p000;

import android.os.SystemClock;

/* renamed from: bfga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfga extends bfgq {

    /* renamed from: a */
    private final boolean f113731a;

    /* renamed from: b */
    private long f113732b;

    /* renamed from: c */
    private bsax f113733c;

    /* renamed from: d */
    private bsax f113734d;

    public bfga(bfew bfew, bhdb bhdb) {
        this(bfew, bhdb, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61567a() {
        this.f113734d = this.f113733c;
        bfew bfew = this.f113796h;
        if (bfew != null) {
            bfew.mo61492a(this.f113734d);
            this.f113796h.mo61498d();
        }
        this.f113733c = null;
    }

    public bfga(bfew bfew, bhdb bhdb, boolean z) {
        super(bfew, bhdb, new bfhd(false));
        this.f113732b = -1;
        this.f113733c = null;
        this.f113734d = null;
        this.f113731a = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo61568a(bsax bsax, bsax bsax2) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f113732b == -1) {
            this.f113732b = elapsedRealtime;
        }
        if (this.f113796h != null) {
            bsax.mo70118b(6, bsax2);
            this.f113796h.mo61488a(bsax2.mo70114b(3), bsax);
        }
        if (!this.f113731a || elapsedRealtime - this.f113732b > 300000) {
            this.f113733c = null;
            return true;
        }
        if (this.f113733c == null) {
            this.f113733c = bfib.m96838a(bsax);
            bsax a = bfib.m96838a(bsax2);
            a.mo70134g(3, 0);
            this.f113733c.mo70118b(6, a);
            return true;
        }
        int j = bsax.mo70138j(4);
        for (int i = 0; i < j; i++) {
            this.f113733c.mo70107a(4, bsax.mo70131f(4, i));
        }
        return true;
    }
}
