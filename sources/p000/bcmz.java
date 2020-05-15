package p000;

/* renamed from: bcmz */
final /* synthetic */ class bcmz implements bqeh {

    /* renamed from: a */
    private final cblf f104513a;

    public bcmz(cblf cblf) {
        this.f104513a = cblf;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        chtv chtv;
        cblf cblf = this.f104513a;
        cbjd cbjd = (cbjd) obj;
        chqp chqp = cbjd.f190402a;
        chtv chtv2 = cbje.f177319b;
        if (chtv2 == null) {
            synchronized (cbje.class) {
                chtv = cbje.f177319b;
                if (chtv == null) {
                    chts a = chtv.m149565a();
                    a.f189140c = chtu.UNARY;
                    a.f189141d = chtv.m149567a("google.internal.communications.instantmessaging.v1.Registration", "RegisterRefresh");
                    a.mo85659b();
                    a.f189138a = ciie.m150370a(cblf.f177482m);
                    a.f189139b = ciie.m150370a(cblg.f177496f);
                    chtv = a.mo85658a();
                    cbje.f177319b = chtv;
                }
            }
            chtv2 = chtv;
        }
        return ciiq.m150392a(chqp.mo70053a(chtv2, cbjd.f190403b), cblf);
    }
}
