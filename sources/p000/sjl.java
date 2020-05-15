package p000;

/* renamed from: sjl */
final /* synthetic */ class sjl implements Runnable {

    /* renamed from: a */
    private final sjm f44575a;

    public sjl(sjm sjm) {
        this.f44575a = sjm;
    }

    public final void run() {
        bljb a;
        bljb a2;
        sjm sjm = this.f44575a;
        try {
            a = blkh.m107281a("ServicePostProcessing");
            for (sjv sjv : sjm.f44577b.f44585g) {
                sjv.mo25655b();
            }
            if (a != null) {
                a.close();
            }
            a2 = blkh.m107281a("GlobalPostProcessing");
            for (sjv sjv2 : sjn.f44580b) {
                sjv2.mo25655b();
            }
            if (a2 != null) {
                a2.close();
            }
            sjm.f44577b.f44583e.mo25652a();
            return;
            throw th;
            throw th;
        } catch (Throwable th) {
            sjm.f44577b.f44583e.mo25652a();
            throw th;
        }
    }
}
