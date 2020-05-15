package p000;

/* renamed from: bems */
final /* synthetic */ class bems implements Runnable {

    /* renamed from: a */
    private final bend f111840a;

    public bems(bend bend) {
        this.f111840a = bend;
    }

    public final void run() {
        bend bend = this.f111840a;
        synchronized (bend.f111857k) {
            if (bend.f111860n == 0) {
                bend.mo60809c();
            }
        }
    }
}
