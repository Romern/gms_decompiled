package p000;

/* renamed from: bbtl */
final /* synthetic */ class bbtl implements Runnable {

    /* renamed from: a */
    private final bbub f103346a;

    /* renamed from: b */
    private final bcic f103347b;

    public bbtl(bbub bbub, bcic bcic) {
        this.f103346a = bbub;
        this.f103347b = bcic;
    }

    public final void run() {
        bbub bbub = this.f103346a;
        bcic bcic = this.f103347b;
        bbpl bbpl = bbub.f103388i;
        bcic.mo56876b();
        ((bbwq) bbpl).f103616n.post(new bbvl());
    }
}
