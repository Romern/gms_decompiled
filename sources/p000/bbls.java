package p000;

/* renamed from: bbls */
final /* synthetic */ class bbls implements bqeh {

    /* renamed from: a */
    private final bbmm f102879a;

    /* renamed from: b */
    private final bbjt f102880b;

    /* renamed from: c */
    private final btdb f102881c;

    public bbls(bbmm bbmm, bbjt bbjt, btdb btdb) {
        this.f102879a = bbmm;
        this.f102880b = bbjt;
        this.f102881c = btdb;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbmm bbmm = this.f102879a;
        bbjt bbjt = this.f102880b;
        btdb btdb = this.f102881c;
        if (((Boolean) obj).booleanValue()) {
            bley a = bbmo.m88189a(btdb);
            if (a == null) {
                return bqga.m112775a(bbjs.f102776g);
            }
            return bbmm.f102916b.mo56177a(a.f126307c, a.f126309e);
        }
        bbjs bbjs = bbjt.f102788c;
        if (bbjs == null) {
            bbjs = bbjs.f102776g;
        }
        return bqga.m112775a(bbjs);
    }
}
