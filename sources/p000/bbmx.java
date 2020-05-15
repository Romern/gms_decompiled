package p000;

/* renamed from: bbmx */
final /* synthetic */ class bbmx implements bmxj {

    /* renamed from: a */
    private final bbnn f102935a;

    /* renamed from: b */
    private final Enum f102936b;

    /* renamed from: c */
    private final long f102937c;

    public bbmx(bbnn bbnn, Enum enumR, long j) {
        this.f102935a = bbnn;
        this.f102936b = enumR;
        this.f102937c = j;
    }

    public final Object apply(Object obj) {
        bbnu bbnu;
        bbnn bbnn = this.f102935a;
        Enum enumR = this.f102936b;
        long j = this.f102937c;
        bbnu bbnu2 = (bbnu) obj;
        int a = bbnn.f102961a.mo56228a(enumR);
        int a2 = bbnv.m88245a(bbnu2.f102984b, a);
        if (a2 != -1) {
            bxvd bxvd = (bxvd) bbnu2.mo74142c(5);
            bxvd.mo73625a((bxvk) bbnu2);
            bbnr bbnr = (bbnr) bxvd;
            bbnr.mo56244a(a2, bbnv.m88247a((bbns) bbnu2.f102984b.get(a2)));
            bbnu = (bbnu) bbnr.mo74062i();
        } else {
            bxvd bxvd2 = (bxvd) bbnu2.mo74142c(5);
            bxvd2.mo73625a((bxvk) bbnu2);
            bbnr bbnr2 = (bbnr) bxvd2;
            bbnr2.mo56246a(bbnv.m88246a(a));
            bbnu = (bbnu) bbnr2.mo74062i();
        }
        bxvd bxvd3 = (bxvd) bbnu.mo74142c(5);
        bxvd3.mo73625a((bxvk) bbnu);
        bbnr bbnr3 = (bbnr) bxvd3;
        int b = bbnv.m88251b(bbnu.f102987e, a);
        if (b != -1) {
            bbnr3.mo56245a(b, bbnv.m88249a(bbnr3.mo56248b(b), j));
        } else {
            bbnr3.mo56247a(bbnv.m88248a(a, j, j));
        }
        return (bbnu) bbnr3.mo74062i();
    }
}
