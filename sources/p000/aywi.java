package p000;

/* renamed from: aywi */
final /* synthetic */ class aywi implements bqeh {

    /* renamed from: a */
    private final bxxc f98620a;

    /* renamed from: b */
    private final bmxj f98621b;

    /* renamed from: c */
    private final String f98622c;

    /* renamed from: d */
    private final aywe f98623d;

    public aywi(aywe aywe, bxxc bxxc, bmxj bmxj, String str) {
        this.f98623d = aywe;
        this.f98620a = bxxc;
        this.f98621b = bmxj;
        this.f98622c = str;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        aywe aywe = this.f98623d;
        bxxc bxxc = this.f98620a;
        bmxj bmxj = this.f98621b;
        String str = this.f98622c;
        ayvk ayvk = (ayvk) obj;
        qws a = aywe.mo54477a(ayvk);
        if (a == null) {
            return bqga.m112775a((Object) null);
        }
        qwo a2 = a.mo24335a(bxxc.serializeToBytes());
        bmxj.apply(a2);
        a2.f42320d = str;
        int i = ayvk.f98565b - 1;
        if (i == 0) {
            a2.mo24330c(ayvk.f98564a);
        } else if (i == 1) {
            a2.mo24330c(null);
        }
        rke b = a2.mo24327b();
        bqgy c = bqgy.m112818c();
        b.mo9458a(new ayty(c));
        return bqdx.m112673a(c, bmxm.m108539a(null), bqfb.INSTANCE);
    }
}
