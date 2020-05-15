package p000;

/* renamed from: bbrw */
final /* synthetic */ class bbrw implements bmxj {

    /* renamed from: a */
    private final bbsc f103256a;

    /* renamed from: b */
    private final bcsj f103257b;

    /* renamed from: c */
    private final bcoh f103258c;

    public bbrw(bbsc bbsc, bcsj bcsj, bcoh bcoh) {
        this.f103256a = bbsc;
        this.f103257b = bcsj;
        this.f103258c = bcoh;
    }

    public final Object apply(Object obj) {
        bbsc bbsc = this.f103256a;
        bcsj bcsj = this.f103257b;
        bcoh bcoh = this.f103258c;
        bcsj bcsj2 = (bcsj) obj;
        if (!bcsj.mo57305d().equals(bcsj2.mo57305d()) || !bcsj2.mo57306e().mo66813a()) {
            bbsc.mo56393a(bcoh, bcsj2);
        }
        return bcsj2;
    }
}
