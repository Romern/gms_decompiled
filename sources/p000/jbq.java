package p000;

/* renamed from: jbq */
public final /* synthetic */ class jbq implements jbt {

    /* renamed from: a */
    private final bqmo f22122a;

    public jbq(bqmo bqmo) {
        this.f22122a = bqmo;
    }

    /* renamed from: a */
    public final Object mo13565a(bqne bqne) {
        chtv chtv;
        bqmo bqmo = this.f22122a;
        chqp chqp = bqne.f190402a;
        chtv chtv2 = bqnf.f141304c;
        if (chtv2 == null) {
            synchronized (bqnf.class) {
                chtv = bqnf.f141304c;
                if (chtv == null) {
                    chts a = chtv.m149565a();
                    a.f189140c = chtu.UNARY;
                    a.f189141d = chtv.m149567a("google.cryptauth.vault.v1.VaultService", "DeleteVaults");
                    a.mo85659b();
                    a.f189138a = ciie.m150370a(bqmo.f141243b);
                    a.f189139b = ciie.m150370a(bxuo.f164865a);
                    chtv = a.mo85658a();
                    bqnf.f141304c = chtv;
                }
            }
            chtv2 = chtv;
        }
        return (bxuo) ciiq.m150394a(chqp, chtv2, bqne.f190403b, bqmo);
    }
}
