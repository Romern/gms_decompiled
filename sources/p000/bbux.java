package p000;

import java.util.List;

/* renamed from: bbux */
final /* synthetic */ class bbux implements Runnable {

    /* renamed from: a */
    private final bbwq f103478a;

    /* renamed from: b */
    private final bcoh f103479b;

    /* renamed from: c */
    private final List f103480c;

    public bbux(bbwq bbwq, bcoh bcoh, List list) {
        this.f103478a = bbwq;
        this.f103479b = bcoh;
        this.f103480c = list;
    }

    public final void run() {
        bbwq bbwq = this.f103478a;
        bcoh bcoh = this.f103479b;
        bbwq.mo56473c(bcoh).mo56634a(this.f103480c, bctk.f104859b, bctk.f104861d);
    }
}
