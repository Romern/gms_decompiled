package p000;

/* renamed from: bbkv */
final /* synthetic */ class bbkv implements bqeh {

    /* renamed from: a */
    private final bblp f102830a;

    /* renamed from: b */
    private final bbjt f102831b;

    /* renamed from: c */
    private final btdb f102832c;

    public bbkv(bblp bblp, bbjt bbjt, btdb btdb) {
        this.f102830a = bblp;
        this.f102831b = bbjt;
        this.f102832c = btdb;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bblp bblp = this.f102830a;
        bbjt bbjt = this.f102831b;
        btdb btdb = this.f102832c;
        if (((Boolean) obj).booleanValue()) {
            bley a = bbmo.m88189a(btdb);
            if (a == null) {
                return bqga.m112775a(bbjs.f102776g);
            }
            return bblp.f102867b.mo56177a(a.f126307c, a.f126309e);
        }
        bbjs bbjs = bbjt.f102788c;
        if (bbjs == null) {
            bbjs = bbjs.f102776g;
        }
        return bqga.m112775a(bbjs);
    }
}
