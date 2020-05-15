package p000;

/* renamed from: cbet */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbet extends ciih {
    public cbet(chqp chqp, chqo chqo) {
        super(chqp, chqo);
    }

    /* renamed from: a */
    public final bqgg mo75228a(byeb byeb) {
        chtv chtv;
        chqp chqp = this.f190402a;
        chtv chtv2 = cbeu.f176857a;
        if (chtv2 == null) {
            synchronized (cbeu.class) {
                chtv = cbeu.f176857a;
                if (chtv == null) {
                    chts a = chtv.m149565a();
                    a.f189140c = chtu.UNARY;
                    a.f189141d = chtv.m149567a("google.internal.communications.instantmessaging.v1.LighterFrontend", "SendLighterMessage");
                    a.mo85659b();
                    a.f189138a = ciie.m150370a(byeb.f165885d);
                    a.f189139b = ciie.m150370a(byec.f165890b);
                    chtv = a.mo85658a();
                    cbeu.f176857a = chtv;
                }
            }
            chtv2 = chtv;
        }
        return ciiq.m150392a(chqp.mo70053a(chtv2, this.f190403b), byeb);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ ciij mo69274a(chqp chqp, chqo chqo) {
        return new cbet(chqp, chqo);
    }
}
