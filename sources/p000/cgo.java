package p000;

/* renamed from: cgo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cgo implements cds {

    /* renamed from: a */
    final /* synthetic */ cjp f6816a;

    /* renamed from: b */
    final /* synthetic */ cgp f6817b;

    public cgo(cgp cgp, cjp cjp) {
        this.f6817b = cgp;
        this.f6816a = cjp;
    }

    /* renamed from: a */
    public final void mo3761a(Exception exc) {
        if (this.f6817b.mo3865a(this.f6816a)) {
            cgp cgp = this.f6817b;
            cjp cjp = this.f6816a;
            cfa cfa = cgp.f6819b;
            cey cey = cgp.f6821d;
            cdt cdt = cjp.f6950c;
            cfa.mo3792a(cey, exc, cdt, cdt.mo3755d());
        }
    }

    /* renamed from: a */
    public final void mo3762a(Object obj) {
        if (this.f6817b.mo3865a(this.f6816a)) {
            cgp cgp = this.f6817b;
            cjp cjp = this.f6816a;
            cfn cfn = cgp.f6818a.f6663o;
            if (obj != null && cfn.mo3817a(cjp.f6950c.mo3755d())) {
                cgp.f6820c = obj;
                cgp.f6819b.mo3794c();
                return;
            }
            cfa cfa = cgp.f6819b;
            cdg cdg = cjp.f6948a;
            cdt cdt = cjp.f6950c;
            cfa.mo3793a(cdg, obj, cdt, cdt.mo3755d(), cgp.f6821d);
        }
    }
}
