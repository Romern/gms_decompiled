package p000;

/* renamed from: bbwc */
final /* synthetic */ class bbwc implements Runnable {

    /* renamed from: a */
    private final bbwq f103568a;

    /* renamed from: b */
    private final bmxv f103569b;

    /* renamed from: c */
    private final bchq f103570c;

    /* renamed from: d */
    private final bcoh f103571d;

    public bbwc(bbwq bbwq, bmxv bmxv, bchq bchq, bcoh bcoh) {
        this.f103568a = bbwq;
        this.f103569b = bmxv;
        this.f103570c = bchq;
        this.f103571d = bcoh;
    }

    public final void run() {
        bbwq bbwq = this.f103568a;
        bmxv bmxv = this.f103569b;
        bchq bchq = this.f103570c;
        bcoh bcoh = this.f103571d;
        int nextInt = bbwq.f103612j.nextInt(((Integer) bbqt.m88417a(bbwq.f103603a).f103178t.mo58455c()).intValue());
        long longValue = ((Long) bbqt.m88417a(bbwq.f103603a).f103177s.mo58455c()).longValue();
        bcsp bcsp = (bcsp) bmxv.mo66814b();
        bcsp a = bbwq.m88518a(bcsp, bchq, ((long) nextInt) + longValue);
        bbwq.mo56473c(bcoh).mo56621a(a);
        if (!bcsp.mo57319c().equals(a.mo57319c()) || !a.mo57320d().mo66813a()) {
            bbwq.mo56468a(bcoh, a);
        }
    }
}
