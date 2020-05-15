package p000;

/* renamed from: bcmn */
final /* synthetic */ class bcmn implements bqeh {

    /* renamed from: a */
    private final bydz f104486a;

    public bcmn(bydz bydz) {
        this.f104486a = bydz;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        chtv chtv;
        bydz bydz = this.f104486a;
        cbet cbet = (cbet) obj;
        chqp chqp = cbet.f190402a;
        chtv chtv2 = cbeu.f176858b;
        if (chtv2 == null) {
            synchronized (cbeu.class) {
                chtv = cbeu.f176858b;
                if (chtv == null) {
                    chts a = chtv.m149565a();
                    a.f189140c = chtu.UNARY;
                    a.f189141d = chtv.m149567a("google.internal.communications.instantmessaging.v1.LighterFrontend", "GetLighterProfile");
                    a.mo85659b();
                    a.f189138a = ciie.m150370a(bydz.f165878c);
                    a.f189139b = ciie.m150370a(byea.f165882b);
                    chtv = a.mo85658a();
                    cbeu.f176858b = chtv;
                }
            }
            chtv2 = chtv;
        }
        return ciiq.m150392a(chqp.mo70053a(chtv2, cbet.f190403b), bydz);
    }
}
