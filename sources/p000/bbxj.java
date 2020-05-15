package p000;

/* renamed from: bbxj */
final /* synthetic */ class bbxj implements bmxj {

    /* renamed from: a */
    private final bbxm f103665a;

    /* renamed from: b */
    private final int f103666b;

    /* renamed from: c */
    private final bcoh f103667c;

    public bbxj(bbxm bbxm, int i, bcoh bcoh) {
        this.f103665a = bbxm;
        this.f103666b = i;
        this.f103667c = bcoh;
    }

    public final Object apply(Object obj) {
        bbxm bbxm = this.f103665a;
        int i = this.f103666b;
        bcoh bcoh = this.f103667c;
        bbyq bbyq = (bbyq) obj;
        if (bbyq.mo56531d() != 2 || !bbyq.mo56528a().mo66813a() || !bbyq.mo56529b().mo66813a()) {
            return null;
        }
        bbxm.mo56488a((bcoh) bbyq.mo56528a().mo66814b(), (bcoz) bbyq.mo56529b().mo66814b());
        bcfx bcfx = bbxm.f103677c;
        bcnr q = bcns.m89409q();
        q.mo57011b(13);
        q.mo57003a(i);
        q.mo57012b(bcoh.mo57058b().mo57074e());
        q.mo57010a(bcoh.mo57059c().mo73781l());
        bcfx.mo56753a(q.mo57002a());
        return null;
    }
}
