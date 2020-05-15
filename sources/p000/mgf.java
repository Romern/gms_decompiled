package p000;

/* renamed from: mgf */
final /* synthetic */ class mgf implements mjl {

    /* renamed from: a */
    private final mgj f33618a;

    /* renamed from: b */
    private final mkn f33619b;

    public mgf(mgj mgj, mkn mkn) {
        this.f33618a = mgj;
        this.f33619b = mkn;
    }

    /* renamed from: a */
    public final mjo mo19977a(mjn mjn) {
        mgj mgj = this.f33618a;
        mkn mkn = this.f33619b;
        if (cckx.m130276b()) {
            return new mkt(mjn, mkn, mgj.f33625c, mgj.f33636n, mgj.f33630h);
        }
        return new mkt(mjn, mkn, mgj.f33625c, mgj.f33637o, new mgi(mgj), mgj.f33630h);
    }
}
