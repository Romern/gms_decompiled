package p000;

/* renamed from: hgz */
final /* synthetic */ class hgz implements Runnable {

    /* renamed from: a */
    private final long f19736a;

    /* renamed from: b */
    private final bqgy f19737b;

    public hgz(long j, bqgy bqgy) {
        this.f19736a = j;
        this.f19737b = bqgy;
    }

    public final void run() {
        new hhb(this.f19736a, this.f19737b).start();
    }
}
