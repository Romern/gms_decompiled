package p000;

/* renamed from: bcmx */
final /* synthetic */ class bcmx implements bqeh {

    /* renamed from: a */
    private final cbcu f104510a;

    public bcmx(cbcu cbcu) {
        this.f104510a = cbcu;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        chtv chtv;
        cbcu cbcu = this.f104510a;
        cbcp cbcp = (cbcp) obj;
        chqp chqp = cbcp.f190402a;
        chtv chtv2 = cbcq.f176675a;
        if (chtv2 == null) {
            synchronized (cbcq.class) {
                chtv = cbcq.f176675a;
                if (chtv == null) {
                    chts a = chtv.m149565a();
                    a.f189140c = chtu.UNARY;
                    a.f189141d = chtv.m149567a("google.internal.communications.instantmessaging.v1.LighterCapabilities", "RegisterCapabilities");
                    a.mo85659b();
                    a.f189138a = ciie.m150370a(cbcu.f176689d);
                    a.f189139b = ciie.m150370a(cbcv.f176694a);
                    chtv = a.mo85658a();
                    cbcq.f176675a = chtv;
                }
            }
            chtv2 = chtv;
        }
        return ciiq.m150392a(chqp.mo70053a(chtv2, cbcp.f190403b), cbcu);
    }
}
