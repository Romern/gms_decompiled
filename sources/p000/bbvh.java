package p000;

/* renamed from: bbvh */
final /* synthetic */ class bbvh implements Runnable {

    /* renamed from: a */
    private final bbwq f103508a;

    /* renamed from: b */
    private final bcoh f103509b;

    /* renamed from: c */
    private final bctr f103510c;

    public bbvh(bbwq bbwq, bcoh bcoh, bctr bctr) {
        this.f103508a = bbwq;
        this.f103509b = bcoh;
        this.f103510c = bctr;
    }

    public final void run() {
        bbwq bbwq = this.f103508a;
        bcoh bcoh = this.f103509b;
        bctr bctr = this.f103510c;
        bbwq.mo56309a(bcoh, bctr.mo57361c()).mo57832f();
        bbwq.f103617o.mo56305a(bcoh, bctr.mo57360b()).mo57832f();
    }
}
