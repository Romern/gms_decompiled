package p000;

/* renamed from: jbo */
public final /* synthetic */ class jbo implements jbt {

    /* renamed from: a */
    private final bqmz f22120a;

    public jbo(bqmz bqmz) {
        this.f22120a = bqmz;
    }

    /* renamed from: a */
    public final Object mo13565a(bqne bqne) {
        chtv chtv;
        bqmz bqmz = this.f22120a;
        chqp chqp = bqne.f190402a;
        chtv chtv2 = bqnf.f141302a;
        if (chtv2 == null) {
            synchronized (bqnf.class) {
                chtv = bqnf.f141302a;
                if (chtv == null) {
                    chts a = chtv.m149565a();
                    a.f189140c = chtu.UNARY;
                    a.f189141d = chtv.m149567a("google.cryptauth.vault.v1.VaultService", "UpdateVault");
                    a.mo85659b();
                    a.f189138a = ciie.m150370a(bqmz.f141284d);
                    a.f189139b = ciie.m150370a(bqnb.f141289f);
                    chtv = a.mo85658a();
                    bqnf.f141302a = chtv;
                }
            }
            chtv2 = chtv;
        }
        return (bqnb) ciiq.m150394a(chqp, chtv2, bqne.f190403b, bqmz);
    }
}
