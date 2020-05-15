package p000;

/* renamed from: mkq */
final /* synthetic */ class mkq implements Runnable {

    /* renamed from: a */
    private final mkt f33906a;

    /* renamed from: b */
    private final Runnable f33907b;

    public mkq(mkt mkt, Runnable runnable) {
        this.f33906a = mkt;
        this.f33907b = runnable;
    }

    public final void run() {
        mkt mkt = this.f33906a;
        mkt.f33842b.execute(this.f33907b);
    }
}
