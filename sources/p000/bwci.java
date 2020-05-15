package p000;

/* renamed from: bwci */
final /* synthetic */ class bwci implements Runnable {

    /* renamed from: a */
    private final bwcm f158818a;

    public bwci(bwcm bwcm) {
        this.f158818a = bwcm;
    }

    public final void run() {
        bwcm bwcm = this.f158818a;
        synchronized (bwcm.f158833f) {
            bwcm.mo73467c();
        }
    }
}
