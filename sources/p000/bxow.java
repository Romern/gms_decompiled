package p000;

/* renamed from: bxow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxow extends ciig {
    public bxow(chqp chqp, chqo chqo) {
        super(chqp, chqo);
    }

    /* renamed from: a */
    public final bxpe mo73597a(bxpc bxpc) {
        chtv chtv;
        chqp chqp = this.f190402a;
        chtv chtv2 = bxoy.f164212b;
        if (chtv2 == null) {
            synchronized (bxoy.class) {
                chtv = bxoy.f164212b;
                if (chtv == null) {
                    chts a = chtv.m149565a();
                    a.f189140c = chtu.UNARY;
                    a.f189141d = chtv.m149567a("footprints.oneplatform.FootprintsService", "GetActivityControlsSettings");
                    a.mo85659b();
                    a.f189138a = ciie.m150370a(bxpc.f164232g);
                    a.f189139b = ciie.m150370a(bxpe.f164247d);
                    chtv = a.mo85658a();
                    bxoy.f164212b = chtv;
                }
            }
            chtv2 = chtv;
        }
        return (bxpe) ciiq.m150394a(chqp, chtv2, this.f190403b, bxpc);
    }

    /* renamed from: a */
    public final bxqg mo73598a(bxqf bxqf) {
        chtv chtv;
        chqp chqp = this.f190402a;
        chtv chtv2 = bxoy.f164213c;
        if (chtv2 == null) {
            synchronized (bxoy.class) {
                chtv = bxoy.f164213c;
                if (chtv == null) {
                    chts a = chtv.m149565a();
                    a.f189140c = chtu.UNARY;
                    a.f189141d = chtv.m149567a("footprints.oneplatform.FootprintsService", "UpdateActivityControlsSettings");
                    a.mo85659b();
                    a.f189138a = ciie.m150370a(bxqf.f164373f);
                    a.f189139b = ciie.m150370a(bxqg.f164380b);
                    chtv = a.mo85658a();
                    bxoy.f164213c = chtv;
                }
            }
            chtv2 = chtv;
        }
        return (bxqg) ciiq.m150394a(chqp, chtv2, this.f190403b, bxqf);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ ciij mo69274a(chqp chqp, chqo chqo) {
        return new bxow(chqp, chqo);
    }
}
