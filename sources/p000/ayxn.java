package p000;

/* renamed from: ayxn */
final /* synthetic */ class ayxn implements Runnable {

    /* renamed from: a */
    private final ayxq f98683a;

    public ayxn(ayxq ayxq) {
        this.f98683a = ayxq;
    }

    public final void run() {
        ayxq ayxq = this.f98683a;
        ayxq.f98692g = null;
        bljb a = blkh.m107281a("GIL:AutoProcessLogBatch");
        try {
            ayxq.f98686a.mo54457a(new ayxo(ayxq));
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
