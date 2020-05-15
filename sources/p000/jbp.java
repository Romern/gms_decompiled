package p000;

/* renamed from: jbp */
public final /* synthetic */ class jbp implements jbt {

    /* renamed from: a */
    private final bqmu f22121a;

    public jbp(bqmu bqmu) {
        this.f22121a = bqmu;
    }

    /* renamed from: a */
    public final Object mo13565a(bqne bqne) {
        chtv chtv;
        bqmu bqmu = this.f22121a;
        chqp chqp = bqne.f190402a;
        chtv chtv2 = bqnf.f141303b;
        if (chtv2 == null) {
            synchronized (bqnf.class) {
                chtv = bqnf.f141303b;
                if (chtv == null) {
                    chts a = chtv.m149565a();
                    a.f189140c = chtu.UNARY;
                    a.f189141d = chtv.m149567a("google.cryptauth.vault.v1.VaultService", "OpenVault");
                    a.mo85659b();
                    a.f189138a = ciie.m150370a(bqmu.f141262d);
                    a.f189139b = ciie.m150370a(bqmv.f141267d);
                    chtv = a.mo85658a();
                    bqnf.f141303b = chtv;
                }
            }
            chtv2 = chtv;
        }
        return (bqmv) ciiq.m150394a(chqp, chtv2, bqne.f190403b, bqmu);
    }
}
