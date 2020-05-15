package p000;

/* renamed from: snz */
final /* synthetic */ class snz implements Runnable {

    /* renamed from: a */
    private final soa f44832a;

    public snz(soa soa) {
        this.f44832a = soa;
    }

    public final void run() {
        bljb a;
        soa soa = this.f44832a;
        soa.f44836e = Thread.currentThread();
        bliy bliy = soa.f44838g;
        if (bliy == null) {
            soa.run();
        } else {
            blkh.m107287a(bliy, blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
            try {
                a = blkh.m107281a("PooledThread");
                soa.run();
                if (a != null) {
                    a.close();
                }
                snc.m35692a(soa.f44838g);
                soa.f44838g = null;
            } catch (Throwable th) {
                snc.m35692a(soa.f44838g);
                soa.f44838g = null;
                throw th;
            }
        }
        soa.f44837f = true;
        soa.f44836e = null;
        return;
        throw th;
    }
}
