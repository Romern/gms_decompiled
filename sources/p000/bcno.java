package p000;

/* renamed from: bcno */
final /* synthetic */ class bcno implements bqeh {

    /* renamed from: a */
    private final cbls f104554a;

    public bcno(cbls cbls) {
        this.f104554a = cbls;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        chtv chtv;
        cbls cbls = this.f104554a;
        cbjd cbjd = (cbjd) obj;
        chqp chqp = cbjd.f190402a;
        chtv chtv2 = cbje.f177320c;
        if (chtv2 == null) {
            synchronized (cbje.class) {
                chtv = cbje.f177320c;
                if (chtv == null) {
                    chts a = chtv.m149565a();
                    a.f189140c = chtu.UNARY;
                    a.f189141d = chtv.m149567a("google.internal.communications.instantmessaging.v1.Registration", "Unregister");
                    a.mo85659b();
                    a.f189138a = ciie.m150370a(cbls.f177558b);
                    a.f189139b = ciie.m150370a(cblt.f177561a);
                    chtv = a.mo85658a();
                    cbje.f177320c = chtv;
                }
            }
            chtv2 = chtv;
        }
        return ciiq.m150392a(chqp.mo70053a(chtv2, cbjd.f190403b), cbls);
    }
}
