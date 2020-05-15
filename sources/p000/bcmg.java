package p000;

/* renamed from: bcmg */
final /* synthetic */ class bcmg implements bqeh {

    /* renamed from: a */
    private final cbdd f104473a;

    public bcmg(cbdd cbdd) {
        this.f104473a = cbdd;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        chtv chtv;
        cbdd cbdd = this.f104473a;
        cbdb cbdb = (cbdb) obj;
        chqp chqp = cbdb.f190402a;
        chtv chtv2 = cbdc.f176717a;
        if (chtv2 == null) {
            synchronized (cbdc.class) {
                chtv = cbdc.f176717a;
                if (chtv == null) {
                    chts a = chtv.m149565a();
                    a.f189140c = chtu.UNARY;
                    a.f189141d = chtv.m149567a("google.internal.communications.instantmessaging.v1.LighterCloudMessageService", "DeleteConversations");
                    a.mo85659b();
                    a.f189138a = ciie.m150370a(cbdd.f176718d);
                    a.f189139b = ciie.m150370a(cbde.f176723b);
                    chtv = a.mo85658a();
                    cbdc.f176717a = chtv;
                }
            }
            chtv2 = chtv;
        }
        return ciiq.m150392a(chqp.mo70053a(chtv2, cbdb.f190403b), cbdd);
    }
}
