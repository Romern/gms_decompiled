package p000;

/* renamed from: buti */
final /* synthetic */ class buti implements Runnable {

    /* renamed from: a */
    private final long f154848a;

    public buti(long j) {
        this.f154848a = j;
    }

    public final void run() {
        try {
            Thread.sleep(this.f154848a);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }
}
