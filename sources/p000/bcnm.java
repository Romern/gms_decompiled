package p000;

/* renamed from: bcnm */
final /* synthetic */ class bcnm implements bqeh {

    /* renamed from: a */
    private final cbcm f104551a;

    public bcnm(cbcm cbcm) {
        this.f104551a = cbcm;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        chtv chtv;
        cbcm cbcm = this.f104551a;
        cbcg cbcg = (cbcg) obj;
        chqp chqp = cbcg.f190402a;
        chtv chtv2 = cbch.f176651b;
        if (chtv2 == null) {
            synchronized (cbch.class) {
                chtv = cbch.f176651b;
                if (chtv == null) {
                    chts a = chtv.m149565a();
                    a.f189140c = chtu.UNARY;
                    a.f189141d = chtv.m149567a("google.internal.communications.instantmessaging.v1.LighterBlock", "UnblockConversation");
                    a.mo85659b();
                    a.f189138a = ciie.m150370a(cbcm.f176669c);
                    a.f189139b = ciie.m150370a(cbcn.f176673a);
                    chtv = a.mo85658a();
                    cbch.f176651b = chtv;
                }
            }
            chtv2 = chtv;
        }
        return ciiq.m150392a(chqp.mo70053a(chtv2, cbcg.f190403b), cbcm);
    }
}
