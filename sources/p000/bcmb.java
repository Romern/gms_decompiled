package p000;

/* renamed from: bcmb */
final /* synthetic */ class bcmb implements bqeh {

    /* renamed from: a */
    private final cbci f104459a;

    public bcmb(cbci cbci) {
        this.f104459a = cbci;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        chtv chtv;
        cbci cbci = this.f104459a;
        cbcg cbcg = (cbcg) obj;
        chqp chqp = cbcg.f190402a;
        chtv chtv2 = cbch.f176650a;
        if (chtv2 == null) {
            synchronized (cbch.class) {
                chtv = cbch.f176650a;
                if (chtv == null) {
                    chts a = chtv.m149565a();
                    a.f189140c = chtu.UNARY;
                    a.f189141d = chtv.m149567a("google.internal.communications.instantmessaging.v1.LighterBlock", "BlockConversation");
                    a.mo85659b();
                    a.f189138a = ciie.m150370a(cbci.f176653d);
                    a.f189139b = ciie.m150370a(cbcj.f176658a);
                    chtv = a.mo85658a();
                    cbch.f176650a = chtv;
                }
            }
            chtv2 = chtv;
        }
        return ciiq.m150392a(chqp.mo70053a(chtv2, cbcg.f190403b), cbci);
    }
}
