package p000;

/* renamed from: jbr */
public final /* synthetic */ class jbr implements jbt {

    /* renamed from: a */
    private final bqmp f22123a;

    public jbr(bqmp bqmp) {
        this.f22123a = bqmp;
    }

    /* renamed from: a */
    public final Object mo13565a(bqne bqne) {
        chtv chtv;
        bqmp bqmp = this.f22123a;
        chqp chqp = bqne.f190402a;
        chtv chtv2 = bqnf.f141305d;
        if (chtv2 == null) {
            synchronized (bqnf.class) {
                chtv = bqnf.f141305d;
                if (chtv == null) {
                    chts a = chtv.m149565a();
                    a.f189140c = chtu.UNARY;
                    a.f189141d = chtv.m149567a("google.cryptauth.vault.v1.VaultService", "JoinSecurityDomains");
                    a.mo85659b();
                    a.f189138a = ciie.m150370a(bqmp.f141246b);
                    a.f189139b = ciie.m150370a(bqmr.f141253b);
                    chtv = a.mo85658a();
                    bqnf.f141305d = chtv;
                }
            }
            chtv2 = chtv;
        }
        return (bqmr) ciiq.m150394a(chqp, chtv2, bqne.f190403b, bqmp);
    }
}
