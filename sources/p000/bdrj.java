package p000;

/* renamed from: bdrj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdrj implements bdqz {

    /* renamed from: a */
    private final bxox f106299a;

    public bdrj(bxox bxox) {
        this.f106299a = bxox;
    }

    /* renamed from: a */
    public final bqgg mo32599a(bxpg bxpg) {
        chtv chtv;
        bxox bxox = this.f106299a;
        chqp chqp = bxox.f190402a;
        chtv chtv2 = bxoy.f164214d;
        if (chtv2 == null) {
            synchronized (bxoy.class) {
                chtv = bxoy.f164214d;
                if (chtv == null) {
                    chts a = chtv.m149565a();
                    a.f189140c = chtu.UNARY;
                    a.f189141d = chtv.m149567a("footprints.oneplatform.FootprintsService", "GetDeletions");
                    a.mo85659b();
                    a.f189138a = ciie.m150370a(bxpg.f164258g);
                    a.f189139b = ciie.m150370a(bxpj.f164274e);
                    chtv = a.mo85658a();
                    bxoy.f164214d = chtv;
                }
            }
            chtv2 = chtv;
        }
        return ciiq.m150392a(chqp.mo70053a(chtv2, bxox.f190403b), bxpg);
    }

    public final void close() {
    }

    /* renamed from: a */
    public final bqgg mo32600a(bxqj bxqj) {
        chtv chtv;
        bxox bxox = this.f106299a;
        chqp chqp = bxox.f190402a;
        chtv chtv2 = bxoy.f164211a;
        if (chtv2 == null) {
            synchronized (bxoy.class) {
                chtv = bxoy.f164211a;
                if (chtv == null) {
                    chts a = chtv.m149565a();
                    a.f189140c = chtu.UNARY;
                    a.f189141d = chtv.m149567a("footprints.oneplatform.FootprintsService", "Write");
                    a.mo85659b();
                    a.f189138a = ciie.m150370a(bxqj.f164389e);
                    a.f189139b = ciie.m150370a(bxqk.f164396a);
                    chtv = a.mo85658a();
                    bxoy.f164211a = chtv;
                }
            }
            chtv2 = chtv;
        }
        return ciiq.m150392a(chqp.mo70053a(chtv2, bxox.f190403b), bxqj);
    }
}
