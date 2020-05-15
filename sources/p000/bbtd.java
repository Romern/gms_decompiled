package p000;

/* renamed from: bbtd */
final /* synthetic */ class bbtd implements bmxj {

    /* renamed from: a */
    private final bbub f103330a;

    /* renamed from: b */
    private final boolean f103331b;

    /* renamed from: c */
    private final bctr f103332c;

    public bbtd(bbub bbub, boolean z, bctr bctr) {
        this.f103330a = bbub;
        this.f103331b = z;
        this.f103332c = bctr;
    }

    public final Object apply(Object obj) {
        bbub bbub = this.f103330a;
        boolean z = this.f103331b;
        bctr bctr = this.f103332c;
        if (!((Boolean) obj).booleanValue() || !z) {
            return bdak.m90446a(bbub.f103384e.mo56608a(bdbd.m90523a(bctr.mo57361c())), bbtn.f103351a);
        }
        bbpf bbpf = bbub.f103385f;
        bcoh bcoh = bbub.f103381b;
        bbrr bbrr = (bbrr) bbpf;
        return new bdah(bqdx.m112673a(bbqt.m88418a(bbqt.m88417a(bbrr.f103234b).f103179u, bbrr.f103235c), new bbro(bbrr, bcoh), bbrr.f103235c), new bbrp(bbrr, bcoh, bctr.mo57361c()), bbrr.f103235c);
    }
}
