package p000;

/* renamed from: xlj */
final /* synthetic */ class xlj implements Runnable {

    /* renamed from: a */
    private final xlm f52661a;

    public xlj(xlm xlm) {
        this.f52661a = xlm;
    }

    public final void run() {
        xlm xlm = this.f52661a;
        try {
            xlm.f52668b.set(xlm.f52667a.mo29945b());
            xlm.f52669c.set(true);
        } catch (xmm e) {
            adbd a = adbe.m50105a();
            a.f61234c = 8;
            a.f61233b = e;
            throw a.mo33301a().mo33303c();
        }
    }
}
