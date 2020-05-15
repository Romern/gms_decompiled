package p000;

/* renamed from: jbs */
public final /* synthetic */ class jbs implements jbt {

    /* renamed from: a */
    private final bqms f22124a;

    public jbs(bqms bqms) {
        this.f22124a = bqms;
    }

    /* renamed from: a */
    public final Object mo13565a(bqne bqne) {
        chtv chtv;
        bqms bqms = this.f22124a;
        chqp chqp = bqne.f190402a;
        chtv chtv2 = bqnf.f141306e;
        if (chtv2 == null) {
            synchronized (bqnf.class) {
                chtv = bqnf.f141306e;
                if (chtv == null) {
                    chts a = chtv.m149565a();
                    a.f189140c = chtu.UNARY;
                    a.f189141d = chtv.m149567a("google.cryptauth.vault.v1.VaultService", "ListSecurityDomains");
                    a.mo85659b();
                    a.f189138a = ciie.m150370a(bqms.f141256b);
                    a.f189139b = ciie.m150370a(bqmt.f141259b);
                    chtv = a.mo85658a();
                    bqnf.f141306e = chtv;
                }
            }
            chtv2 = chtv;
        }
        return (bqmt) ciiq.m150394a(chqp, chtv2, bqne.f190403b, bqms);
    }
}
