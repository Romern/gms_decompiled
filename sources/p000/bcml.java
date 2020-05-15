package p000;

/* renamed from: bcml */
final /* synthetic */ class bcml implements bqeh {

    /* renamed from: a */
    private final cbcr f104482a;

    public bcml(cbcr cbcr) {
        this.f104482a = cbcr;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        chtv chtv;
        cbcr cbcr = this.f104482a;
        cbcp cbcp = (cbcp) obj;
        chqp chqp = cbcp.f190402a;
        chtv chtv2 = cbcq.f176676b;
        if (chtv2 == null) {
            synchronized (cbcq.class) {
                chtv = cbcq.f176676b;
                if (chtv == null) {
                    chts a = chtv.m149565a();
                    a.f189140c = chtu.UNARY;
                    a.f189141d = chtv.m149567a("google.internal.communications.instantmessaging.v1.LighterCapabilities", "GetConversationProperties");
                    a.mo85659b();
                    a.f189138a = ciie.m150370a(cbcr.f176677e);
                    a.f189139b = ciie.m150370a(cbcs.f176683b);
                    chtv = a.mo85658a();
                    cbcq.f176676b = chtv;
                }
            }
            chtv2 = chtv;
        }
        return ciiq.m150392a(chqp.mo70053a(chtv2, cbcp.f190403b), cbcr);
    }
}
