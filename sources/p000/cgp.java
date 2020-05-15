package p000;

import java.util.Collections;
import java.util.List;

/* renamed from: cgp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cgp implements cfb, cfa {

    /* renamed from: a */
    public final cfc f6818a;

    /* renamed from: b */
    public final cfa f6819b;

    /* renamed from: c */
    public Object f6820c;

    /* renamed from: d */
    public cey f6821d;

    /* renamed from: e */
    private int f6822e;

    /* renamed from: f */
    private cex f6823f;

    /* renamed from: g */
    private volatile cjp f6824g;

    public cgp(cfc cfc, cfa cfa) {
        this.f6818a = cfc;
        this.f6819b = cfa;
    }

    /* renamed from: a */
    public final void mo3792a(cdg cdg, Exception exc, cdt cdt, int i) {
        this.f6819b.mo3792a(cdg, exc, cdt, this.f6824g.f6950c.mo3755d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo3865a(cjp cjp) {
        cjp cjp2 = this.f6824g;
        return cjp2 != null && cjp2 == cjp;
    }

    /* renamed from: b */
    public final void mo3789b() {
        cjp cjp = this.f6824g;
        if (cjp != null) {
            cjp.f6950c.mo3754c();
        }
    }

    /* renamed from: c */
    public final void mo3794c() {
        throw null;
    }

    /* renamed from: a */
    public final void mo3793a(cdg cdg, Object obj, cdt cdt, int i, cdg cdg2) {
        this.f6819b.mo3793a(cdg, obj, cdt, this.f6824g.f6950c.mo3755d(), cdg);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final boolean mo3788a() {
        Object obj = this.f6820c;
        if (obj != null) {
            this.f6820c = null;
            cqw.m7370a();
            try {
                ccv a = this.f6818a.f6651c.f6425c.f6437b.mo8084a(obj.getClass());
                if (a != null) {
                    cez cez = new cez(a, obj, this.f6818a.f6656h);
                    this.f6821d = new cey(this.f6824g.f6948a, this.f6818a.f6661m);
                    this.f6818a.mo3795a().mo3903a(this.f6821d, cez);
                    this.f6824g.f6950c.mo3753b();
                    this.f6823f = new cex(Collections.singletonList(this.f6824g.f6948a), this.f6818a, this);
                } else {
                    throw new cbx(obj.getClass());
                }
            } catch (Throwable th) {
                this.f6824g.f6950c.mo3753b();
                throw th;
            }
        }
        cex cex = this.f6823f;
        if (cex != null && cex.mo3788a()) {
            return true;
        }
        this.f6823f = null;
        this.f6824g = null;
        boolean z = false;
        while (!z && this.f6822e < this.f6818a.mo3801c().size()) {
            List c = this.f6818a.mo3801c();
            int i = this.f6822e;
            this.f6822e = i + 1;
            this.f6824g = (cjp) c.get(i);
            if (this.f6824g != null && (this.f6818a.f6663o.mo3817a(this.f6824g.f6950c.mo3755d()) || this.f6818a.mo3797a(this.f6824g.f6950c.mo3747a()))) {
                this.f6824g.f6950c.mo3751a(this.f6818a.f6662n, new cgo(this, this.f6824g));
                z = true;
            }
        }
        return z;
    }
}
