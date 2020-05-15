package p000;

/* renamed from: byik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byik extends ciih {
    public byik(chqp chqp, chqo chqo) {
        super(chqp, chqo);
    }

    /* renamed from: a */
    public final bqgg mo74382a(byia byia) {
        chtv chtv;
        chqp chqp = this.f190402a;
        chtv chtv2 = byil.f166570a;
        if (chtv2 == null) {
            synchronized (byil.class) {
                chtv = byil.f166570a;
                if (chtv == null) {
                    chts a = chtv.m149565a();
                    a.f189140c = chtu.UNARY;
                    a.f189141d = chtv.m149567a("search.mdh.MobileDataHubCore", "GetChanges");
                    a.mo85659b();
                    a.f189138a = ciie.m150370a(byia.f166539f);
                    a.f189139b = ciie.m150370a(byid.f166547e);
                    chtv = a.mo85658a();
                    byil.f166570a = chtv;
                }
            }
            chtv2 = chtv;
        }
        return ciiq.m150392a(chqp.mo70053a(chtv2, this.f190403b), byia);
    }

    /* renamed from: a */
    public final bqgg mo74383a(byjy byjy) {
        chtv chtv;
        chqp chqp = this.f190402a;
        chtv chtv2 = byil.f166571b;
        if (chtv2 == null) {
            synchronized (byil.class) {
                chtv = byil.f166571b;
                if (chtv == null) {
                    chts a = chtv.m149565a();
                    a.f189140c = chtu.UNARY;
                    a.f189141d = chtv.m149567a("search.mdh.MobileDataHubCore", "UploadChanges");
                    a.mo85659b();
                    a.f189138a = ciie.m150370a(byjy.f166710h);
                    a.f189139b = ciie.m150370a(bykc.f166732e);
                    chtv = a.mo85658a();
                    byil.f166571b = chtv;
                }
            }
            chtv2 = chtv;
        }
        return ciiq.m150392a(chqp.mo70053a(chtv2, this.f190403b), byjy);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ ciij mo69274a(chqp chqp, chqo chqo) {
        return new byik(chqp, chqo);
    }
}
