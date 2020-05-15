package p000;

/* renamed from: pcz */
final /* synthetic */ class pcz implements Runnable {

    /* renamed from: a */
    private final pdz f38854a;

    public pcz(pdz pdz) {
        this.f38854a = pdz;
    }

    public final void run() {
        pdz pdz = this.f38854a;
        synchronized (pdz.f38925b) {
            for (otc otc : pdz.f38928e) {
                if (pdz.f38901E) {
                    pdz.f38948y.post(new pdd());
                }
            }
        }
    }
}
