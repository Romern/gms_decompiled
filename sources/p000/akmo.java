package p000;

/* renamed from: akmo */
final /* synthetic */ class akmo implements bmxj {

    /* renamed from: a */
    static final bmxj f72263a = new akmo();

    private akmo() {
    }

    public final Object apply(Object obj) {
        cafg cafg = (cafg) obj;
        bmyx bmyx = akmp.f72264a;
        int size = cafg.f172901e.size();
        if (size <= 2) {
            return cafg;
        }
        cafg a = akmp.m60021a(cafg);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        caff caff = (caff) bxvd;
        caff.mo74637a(0, cafg.f172901e.mo74151b(0));
        int i = size - 1;
        caff.mo74637a(i, cafg.f172901e.mo74151b(i));
        int i2 = 1;
        while (i2 < i) {
            int i3 = i2 + 1;
            caff.mo74637a(i2, Math.round(((float) ((cafg.f172901e.mo74151b(i2 - 1) + cafg.f172901e.mo74151b(i2)) + cafg.f172901e.mo74151b(i3))) / 3.0f));
            i2 = i3;
        }
        return (cafg) caff.mo74062i();
    }
}
