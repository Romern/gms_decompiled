package p000;

/* renamed from: bcmi */
final /* synthetic */ class bcmi implements bqeh {

    /* renamed from: a */
    private final cbck f104477a;

    public bcmi(cbck cbck) {
        this.f104477a = cbck;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        chtv chtv;
        cbck cbck = this.f104477a;
        cbcg cbcg = (cbcg) obj;
        chqp chqp = cbcg.f190402a;
        chtv chtv2 = cbch.f176652c;
        if (chtv2 == null) {
            synchronized (cbch.class) {
                chtv = cbch.f176652c;
                if (chtv == null) {
                    chts a = chtv.m149565a();
                    a.f189140c = chtu.UNARY;
                    a.f189141d = chtv.m149567a("google.internal.communications.instantmessaging.v1.LighterBlock", "GetBlockedConversations");
                    a.mo85659b();
                    a.f189138a = ciie.m150370a(cbck.f176660d);
                    a.f189139b = ciie.m150370a(cbcl.f176665c);
                    chtv = a.mo85658a();
                    cbch.f176652c = chtv;
                }
            }
            chtv2 = chtv;
        }
        return ciiq.m150392a(chqp.mo70053a(chtv2, cbcg.f190403b), cbck);
    }
}
