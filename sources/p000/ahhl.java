package p000;

/* renamed from: ahhl */
final /* synthetic */ class ahhl implements Runnable {

    /* renamed from: a */
    private final ahhp f67212a;

    /* renamed from: b */
    private final ahho f67213b;

    /* renamed from: c */
    private final Runnable f67214c;

    public ahhl(ahhp ahhp, ahho ahho, Runnable runnable) {
        this.f67212a = ahhp;
        this.f67213b = ahho;
        this.f67214c = runnable;
    }

    public final void run() {
        ahhp ahhp = this.f67212a;
        ahho ahho = this.f67213b;
        Runnable runnable = this.f67214c;
        bqgy a = ahhp.m55792a(ahhp.f67221a, ahho);
        runnable.run();
        a.mo69138b((Object) null);
    }
}
