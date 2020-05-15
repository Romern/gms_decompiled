package p000;

/* renamed from: bcmt */
public final /* synthetic */ class bcmt implements bmxj {

    /* renamed from: a */
    private final cbkr f104503a;

    /* renamed from: b */
    private final ciiv f104504b;

    public bcmt(cbkr cbkr, ciiv ciiv) {
        this.f104503a = cbkr;
        this.f104504b = ciiv;
    }

    public final Object apply(Object obj) {
        chtv chtv;
        cbkr cbkr = this.f104503a;
        ciiv ciiv = this.f104504b;
        ciif ciif = (ciif) obj;
        chqp chqp = ciif.f190402a;
        chtv chtv2 = cbjb.f177315a;
        if (chtv2 == null) {
            synchronized (cbjb.class) {
                chtv = cbjb.f177315a;
                if (chtv == null) {
                    chts a = chtv.m149565a();
                    a.f189140c = chtu.SERVER_STREAMING;
                    a.f189141d = chtv.m149567a("google.internal.communications.instantmessaging.v1.Messaging", "ReceiveMessages");
                    a.mo85659b();
                    a.f189138a = ciie.m150370a(cbkr.f177440b);
                    a.f189139b = ciie.m150370a(cbkx.f177453c);
                    chtv = a.mo85658a();
                    cbjb.f177315a = chtv;
                }
            }
            chtv2 = chtv;
        }
        ciiq.m150398a(chqp.mo70053a(chtv2, ciif.f190403b), cbkr, ciiv);
        return null;
    }
}
