package p000;

/* renamed from: brvf */
final /* synthetic */ class brvf implements Runnable {

    /* renamed from: a */
    private final brvh f143443a;

    /* renamed from: b */
    private final brvg f143444b;

    public brvf(brvh brvh, brvg brvg) {
        this.f143443a = brvh;
        this.f143444b = brvg;
    }

    public final void run() {
        brvh brvh = this.f143443a;
        brvg brvg = this.f143444b;
        synchronized (brvh.f143447b) {
            brvh.f143447b.remove(brvg);
        }
    }
}
