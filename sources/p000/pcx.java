package p000;

/* renamed from: pcx */
final /* synthetic */ class pcx implements Runnable {

    /* renamed from: a */
    private final pdz f38852a;

    public pcx(pdz pdz) {
        this.f38852a = pdz;
    }

    public final void run() {
        pdz pdz = this.f38852a;
        if (pdz.f38936m != null && pdz.mo22961h()) {
            pdz.f38912P.mo22596a();
            pdx pdx = pdz.f38926c;
            if (pdx != null) {
                pdx.mo22937a();
                pdz.f38926c = null;
            }
            pdz.mo22948a(dcm.RFCOMM_RECONNECTING);
            pdz.mo22952a(true);
            return;
        }
        pdz.mo22948a(dcm.RECONNECTION_PREVENTED);
        pdz.f38944u.post(new pde(pdz));
    }
}
