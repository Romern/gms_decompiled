package p000;

/* renamed from: bclz */
final /* synthetic */ class bclz implements bqeh {

    /* renamed from: a */
    private final cbjk f104456a;

    public bclz(cbjk cbjk) {
        this.f104456a = cbjk;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        chtv chtv;
        cbjk cbjk = this.f104456a;
        cbja cbja = (cbja) obj;
        chqp chqp = cbja.f190402a;
        chtv chtv2 = cbjb.f177317c;
        if (chtv2 == null) {
            synchronized (cbjb.class) {
                chtv = cbjb.f177317c;
                if (chtv == null) {
                    chts a = chtv.m149565a();
                    a.f189140c = chtu.UNARY;
                    a.f189141d = chtv.m149567a("google.internal.communications.instantmessaging.v1.Messaging", "AckMessages");
                    a.mo85659b();
                    a.f189138a = ciie.m150370a(cbjk.f177337c);
                    a.f189139b = ciie.m150370a(cbjl.f177341a);
                    chtv = a.mo85658a();
                    cbjb.f177317c = chtv;
                }
            }
            chtv2 = chtv;
        }
        return ciiq.m150392a(chqp.mo70053a(chtv2, cbja.f190403b), cbjk);
    }
}
