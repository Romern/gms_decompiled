package p000;

/* renamed from: mkd */
final /* synthetic */ class mkd implements Runnable {

    /* renamed from: a */
    private final mkj f33876a;

    /* renamed from: b */
    private final mkh f33877b;

    public mkd(mkj mkj, mkh mkh) {
        this.f33876a = mkj;
        this.f33877b = mkh;
    }

    public final void run() {
        try {
            this.f33876a.mo20127b(this.f33877b);
        } catch (InterruptedException e) {
            mkj.f33889a.mo25417e("Reading interrupted: ", e, new Object[0]);
            Thread.currentThread().interrupt();
        }
    }
}
