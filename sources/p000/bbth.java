package p000;

/* renamed from: bbth */
final /* synthetic */ class bbth implements Runnable {

    /* renamed from: a */
    private final bbub f103340a;

    /* renamed from: b */
    private final bchw f103341b;

    public bbth(bbub bbub, bchw bchw) {
        this.f103340a = bbub;
        this.f103341b = bchw;
    }

    public final void run() {
        bbub bbub = this.f103340a;
        bchw bchw = this.f103341b;
        bbpl bbpl = bbub.f103388i;
        bbwq bbwq = (bbwq) bbpl;
        bbwq.f103616n.post(new bbvk(bbwq, bbub.f103381b, bchw.mo56864e()));
    }
}
