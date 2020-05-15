package p000;

/* renamed from: bemg */
final /* synthetic */ class bemg implements Runnable {

    /* renamed from: a */
    private final bqgh f111819a;

    /* renamed from: b */
    private final bens f111820b;

    public bemg(bqgh bqgh, bens bens) {
        this.f111819a = bqgh;
        this.f111820b = bens;
    }

    public final void run() {
        bqgh bqgh = this.f111819a;
        bens bens = this.f111820b;
        if (bqgh.isCancelled()) {
            bens.f111890a.cancel();
        }
    }
}
