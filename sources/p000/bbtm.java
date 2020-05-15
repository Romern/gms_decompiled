package p000;

/* renamed from: bbtm */
final /* synthetic */ class bbtm implements Runnable {

    /* renamed from: a */
    private final bbub f103348a;

    /* renamed from: b */
    private final bctr f103349b;

    /* renamed from: c */
    private final bcia f103350c;

    public bbtm(bbub bbub, bctr bctr, bcia bcia) {
        this.f103348a = bbub;
        this.f103349b = bctr;
        this.f103350c = bcia;
    }

    public final void run() {
        bbub bbub = this.f103348a;
        bctr bctr = this.f103349b;
        bcia bcia = this.f103350c;
        bbpl bbpl = bbub.f103388i;
        bcoh bcoh = bbub.f103381b;
        boolean b = bcia.mo56869b();
        bbwq bbwq = (bbwq) bbpl;
        bbwq.f103606d.mo25812a(new bbvh(bbwq, bcoh, bctr));
        bbwq.f103616n.post(new bbvi(bbwq, bcoh, bctr, b));
    }
}
