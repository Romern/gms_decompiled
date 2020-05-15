package p000;

/* renamed from: bbxf */
final /* synthetic */ class bbxf implements Runnable {

    /* renamed from: a */
    private final bbxm f103656a;

    /* renamed from: b */
    private final bcoh f103657b;

    public bbxf(bbxm bbxm, bcoh bcoh) {
        this.f103656a = bbxm;
        this.f103657b = bcoh;
    }

    public final void run() {
        bbxm bbxm = this.f103656a;
        bcoh bcoh = this.f103657b;
        synchronized (bbxm.f103681g) {
            bbxm.f103683i.remove(Long.valueOf(bcoh.mo57057a()));
        }
    }
}
