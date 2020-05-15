package p000;

/* renamed from: afte */
final /* synthetic */ class afte implements bqeh {

    /* renamed from: a */
    private final afti f64706a;

    /* renamed from: b */
    private final afyf f64707b;

    public afte(afti afti, afyf afyf) {
        this.f64706a = afti;
        this.f64707b = afyf;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        afti afti = this.f64706a;
        afyf afyf = this.f64707b;
        if (!((Boolean) obj).booleanValue()) {
            return bqga.m112775a(bbjq.m88103a());
        }
        int i = 1;
        if (afyf.mo35059b() == afye.ONEOFF && cfhg.m139616b()) {
            i = 2;
        }
        return afti.m53532a(bqdx.m112673a(afti.f64711a.mo56207a(i), aftg.f64709a, bqfb.INSTANCE));
    }
}
