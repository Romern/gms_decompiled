package p000;

/* renamed from: bcnh */
final /* synthetic */ class bcnh implements bqeh {

    /* renamed from: a */
    private final cbln f104538a;

    public bcnh(cbln cbln) {
        this.f104538a = cbln;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        chtv chtv;
        cbln cbln = this.f104538a;
        cbjd cbjd = (cbjd) obj;
        chqp chqp = cbjd.f190402a;
        chtv chtv2 = cbje.f177321d;
        if (chtv2 == null) {
            synchronized (cbje.class) {
                chtv = cbje.f177321d;
                if (chtv == null) {
                    chts a = chtv.m149565a();
                    a.f189140c = chtu.UNARY;
                    a.f189141d = chtv.m149567a("google.internal.communications.instantmessaging.v1.Registration", "SignInGaia");
                    a.mo85659b();
                    a.f189138a = ciie.m150370a(cbln.f177535e);
                    a.f189139b = ciie.m150370a(cblo.f177541c);
                    chtv = a.mo85658a();
                    cbje.f177321d = chtv;
                }
            }
            chtv2 = chtv;
        }
        return ciiq.m150392a(chqp.mo70053a(chtv2, cbjd.f190403b), cbln);
    }
}
