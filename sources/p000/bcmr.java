package p000;

/* renamed from: bcmr */
final /* synthetic */ class bcmr implements bqeh {

    /* renamed from: a */
    private final cbko f104499a;

    public bcmr(cbko cbko) {
        this.f104499a = cbko;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        chtv chtv;
        cbko cbko = this.f104499a;
        cbja cbja = (cbja) obj;
        chqp chqp = cbja.f190402a;
        chtv chtv2 = cbjb.f177316b;
        if (chtv2 == null) {
            synchronized (cbjb.class) {
                chtv = cbjb.f177316b;
                if (chtv == null) {
                    chts a = chtv.m149565a();
                    a.f189140c = chtu.UNARY;
                    a.f189141d = chtv.m149567a("google.internal.communications.instantmessaging.v1.Messaging", "PullMessages");
                    a.mo85659b();
                    a.f189138a = ciie.m150370a(cbko.f177429b);
                    a.f189139b = ciie.m150370a(cbkp.f177432c);
                    chtv = a.mo85658a();
                    cbjb.f177316b = chtv;
                }
            }
            chtv2 = chtv;
        }
        return ciiq.m150392a(chqp.mo70053a(chtv2, cbja.f190403b), cbko);
    }
}
