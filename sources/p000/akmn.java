package p000;

/* renamed from: akmn */
final /* synthetic */ class akmn implements bmxj {

    /* renamed from: a */
    static final bmxj f72262a = new akmn();

    private akmn() {
    }

    public final Object apply(Object obj) {
        cafg cafg = (cafg) obj;
        cafg a = akmp.m60021a(cafg);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        caff caff = (caff) bxvd;
        int i = Integer.MIN_VALUE;
        for (int i2 = 0; i2 < cafg.f172901e.size(); i2++) {
            if (cafg.f172901e.mo74151b(i2) > i) {
                i = cafg.f172901e.mo74151b(i2);
            }
            caff.mo74637a(i2, i);
        }
        return (cafg) caff.mo74062i();
    }
}
