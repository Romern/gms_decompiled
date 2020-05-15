package p000;

/* renamed from: bdzs */
final /* synthetic */ class bdzs implements Runnable {

    /* renamed from: a */
    private final Exception f106705a;

    public bdzs(Exception exc) {
        this.f106705a = exc;
    }

    public final void run() {
        throw new RuntimeException(this.f106705a);
    }
}
