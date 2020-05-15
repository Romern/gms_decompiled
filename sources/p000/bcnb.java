package p000;

/* renamed from: bcnb */
final /* synthetic */ class bcnb implements bqeh {

    /* renamed from: a */
    private final cblh f104519a;

    public bcnb(cblh cblh) {
        this.f104519a = cblh;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        chtv chtv;
        cblh cblh = this.f104519a;
        cbjd cbjd = (cbjd) obj;
        chqp chqp = cbjd.f190402a;
        chtv chtv2 = cbje.f177318a;
        if (chtv2 == null) {
            synchronized (cbje.class) {
                chtv = cbje.f177318a;
                if (chtv == null) {
                    chts a = chtv.m149565a();
                    a.f189140c = chtu.UNARY;
                    a.f189141d = chtv.m149567a("google.internal.communications.instantmessaging.v1.Registration", "Register");
                    a.mo85659b();
                    a.f189138a = ciie.m150370a(cblh.f177503d);
                    a.f189139b = ciie.m150370a(cbli.f177508d);
                    chtv = a.mo85658a();
                    cbje.f177318a = chtv;
                }
            }
            chtv2 = chtv;
        }
        return ciiq.m150392a(chqp.mo70053a(chtv2, cbjd.f190403b), cblh);
    }
}
